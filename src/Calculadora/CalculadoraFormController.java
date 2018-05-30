/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Calculadora;

import Calculadora.operações.exponecial;
import Calculadora.operações.negativo;
import Calculadora.operações.fatorial;
import Calculadora.operações.porcentagem;
import Calculadora.operações.multiplicação;
import Calculadora.operações.subtração;
import Calculadora.operações.soma;
import Calculadora.operações.divisão;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import static javafx.scene.input.KeyCode.ENTER;
import javafx.scene.input.KeyEvent;
import javax.swing.JOptionPane;

/**
 * FXML Controller class
 *
 * @author Fabricio Junior
 */
public class CalculadoraFormController implements Initializable {

    @FXML
    private TextField num1Text;
    @FXML
    private TextField num2Text;
    @FXML
    private TextField resultadoText;
    @FXML
    private ComboBox operaçãoBox;
    @FXML
    private Button calcularBtn;
    @FXML
    private Button usarBtn;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        ArrayList<IOperações> ioperações = new ArrayList<IOperações>();
        ioperações.add(new soma());
        ioperações.add(new subtração());
        ioperações.add(new divisão());
        ioperações.add(new multiplicação());
        ioperações.add(new exponecial());
        ioperações.add(new fatorial());
        ioperações.add(new porcentagem());
        ioperações.add(new negativo());
       
        operaçãoBox.getItems().addAll(ioperações);
        operaçãoBox.getSelectionModel().selectedItemProperty().addListener((obs, ant, nov) -> {
            IOperações selecionada = (IOperações) operaçãoBox.getSelectionModel().getSelectedItem();
            num2Text.disableProperty().set(!selecionada.binaria());
        });
        operaçãoBox.getSelectionModel().selectFirst();
    }

    public void calcularBtn_Clicked() {

        IOperações selecionada = (IOperações) operaçãoBox.getSelectionModel().getSelectedItem();
        if (selecionada.binaria()) {
            resultadoText.setText(selecionada.operação(num1Text.getText(), num2Text.getText()));
        } else {
            resultadoText.setText(selecionada.operação(num1Text.getText()));
        }
    }

    public void usarBtn_Clicked() {
        if (resultadoText.getText() != null) {
            num1Text.setText(resultadoText.getText());
        }
    }

    public void usarBtn_KeyPressed(KeyEvent key) {
        if (key.getCode() == ENTER) {
            usarBtn_Clicked();
        }
    }

    public void calcularBtn_KeyPressed(KeyEvent key) {

        if (key.getCode() == ENTER) {
            calcularBtn_Clicked();
        }
    }
}
