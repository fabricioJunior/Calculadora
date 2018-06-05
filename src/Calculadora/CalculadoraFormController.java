/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Calculadora;

import Calculadora.operações.Exponecial;
import Calculadora.operações.Negativo;
import Calculadora.operações.Fatorial;
import Calculadora.operações.Porcentagem;
import Calculadora.operações.Multiplicação;
import Calculadora.operações.Subtração;
import Calculadora.operações.Soma;
import Calculadora.operações.Divisão;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
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
        ioperações.add(new Soma());
        ioperações.add(new Subtração());
        ioperações.add(new Divisão());
        ioperações.add(new Multiplicação());
        ioperações.add(new Exponecial());
        ioperações.add(new Fatorial());
        ioperações.add(new Porcentagem());
        ioperações.add(new Negativo());

        operaçãoBox.getItems().addAll(ioperações);
        operaçãoBox.getSelectionModel().selectedItemProperty().addListener((obs, ant, nov) -> {
            IOperações selecionada = (IOperações) operaçãoBox.getSelectionModel().getSelectedItem();
            num2Text.disableProperty().set(!selecionada.binaria());
        });
        operaçãoBox.getSelectionModel().selectFirst();
    }

    public void calcularBtn_Clicked() {

        num1Text.setText(Filtro(num1Text.getText()));
        // recupero  a classe selecionada pelo usuário no comboBox  
        IOperações selecionada = (IOperações) operaçãoBox.getSelectionModel().getSelectedItem();
        if (num1Text.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Digite um valor na primeira área de texto", "Informação", JOptionPane.INFORMATION_MESSAGE);
        } else {
            if (selecionada.binaria()) {
                if (num2Text.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Digite um valor na segunda área de texto", "Informação", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    num2Text.setText(Filtro(num2Text.getText()));
                    if (ContemLetrasNum1() == false && ContemLetrasNum2() == false) {
                        resultadoText.setText(selecionada.operação(num1Text.getText(), num2Text.getText()));
                    }
                }
            } else {
                if (!ContemLetrasNum1()) {
                    resultadoText.setText(selecionada.operação(num1Text.getText()));
                }
            }
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

    private String Filtro(String digitado) {
        char[] palavra = digitado.toCharArray();
        int qtd = palavra.length;
        for (int x = 0; x < palavra.length; x++) {
            if (palavra[x] == ',') {
                palavra[x] = '.';
            }
        }
        return String.valueOf(palavra);
    }

    private boolean ContemLetrasNum1() {
        float valor;
        if (num1Text.getText().length() != 0) {
            try {
                valor = Float.parseFloat(num1Text.getText());
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, "Digite um valor válido na primeira área de texto", "Informação", JOptionPane.INFORMATION_MESSAGE);

                return true;
            }
        }
        return false;
    }

    private boolean ContemLetrasNum2() {
        float valor;
        if (num2Text.getText().length() != 0) {
            try {
                valor = Float.parseFloat(num2Text.getText());
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, "Digite um valor válido na segunda área de texto", "Informação", JOptionPane.INFORMATION_MESSAGE);

                return true;
            }
        }
        return false;
    }
}
