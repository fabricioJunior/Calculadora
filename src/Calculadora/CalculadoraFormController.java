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
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
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
    ArrayList<Operações> operações = new ArrayList<Operações>();
    @Override
    public void initialize(URL url, ResourceBundle rb) {
      
        operações.add(new soma());
        operações.add(new subtração());
        operações.add(new divisão());
        operações.add(new multiplicação());
        operações.add(new exponecial());
        operações.add(new fatorial());
        operações.add(new porcentagem());
        operações.add(new negativo());

        operaçãoBox.getItems().addAll(operações);
        operaçãoBox.getSelectionModel().selectedItemProperty().addListener((obs, ant, nov) -> {
            Operações selecionada = (Operações) operaçãoBox.getSelectionModel().getSelectedItem();
            num2Text.disableProperty().set(!selecionada.binaria);
        });
    }

    public void calcularBtn_Clicked() {
          
    }
}
