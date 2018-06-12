package Calculadora;

import Calculadora.operações.*;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import static javafx.scene.input.KeyCode.ENTER;
import javafx.scene.input.KeyEvent;
import javax.swing.JOptionPane;

/**
 * FXML Controller class
 * Para melhor entendimento acesse
 * @link 
 * @author Fabricio Junior
 */
public class CalculadoraFormController implements Initializable {

    /**
     * Váriavel responsável pela área de texto 1
     */
    @FXML
    private TextField num1Text;
    /**
     * Váriavel responsável pela área de texto 2
     */
    @FXML
    private TextField num2Text;
    /**
     * Váriavel responsável pela área de texto que exibira o resultado das
     * operaões da calculadora
     */
    @FXML
    private TextField resultadoText;
    /**
     * Váriavel responsável pelo comboBox que responsável pelas escolha da
     * operação a ser realizada
     */
    @FXML
    private ComboBox operaçãoBox;

    /**
     * Sobrescrendo o método padrão initialize do pacote FX para definir alguns
     * atributos para alguns objetos gráficos do pacote
     *
     * @param url
     * @param rb
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        ///Declarando array  da interface IOperações
        ArrayList<IOperações> ioperações = new ArrayList<>();
        ///Adicionando operações utilizando recurso de poliforfismo de interface 
        ioperações.add(new Soma());
        ioperações.add(new Subtração());
        ioperações.add(new Divisão());
        ioperações.add(new Multiplicação());
        ioperações.add(new Exponecial());
        ioperações.add(new Fatorial());
        ioperações.add(new Porcentagem());
        ioperações.add(new Negativo());
        ///Adicionando array com operações no comboBox 
        operaçãoBox.getItems().addAll(ioperações);
        ///Definindo escuta para modificação da segundo  objeto Text Field para definilo como ativo ou desativado 
        operaçãoBox.getSelectionModel().selectedItemProperty().addListener((obs, ant, nov) -> {
            IOperações selecionada = (IOperações) operaçãoBox.getSelectionModel().getSelectedItem();
            num2Text.disableProperty().set(!selecionada.binaria());
        });
        //Definindo como padrão no comboBox a primeira operação da coleção de intens 
        operaçãoBox.getSelectionModel().selectFirst();
    }

    /**
     * Evento de click no botão de cadastro
     */
    public void calcularBtn_Clicked() {

        num1Text.setText(Filtro(num1Text.getText()));
        //Recuperando a classe selecionada pelo usuário no comboBox  
        IOperações selecionada = (IOperações) operaçãoBox.getSelectionModel().getSelectedItem();
        //Verificando se existe algum valor digitado na primeira área de texto(num1Text)
        if (num1Text.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Digite um valor na primeira área de texto", "Informação", JOptionPane.INFORMATION_MESSAGE);
        } else {
            //Se a operação for binaria   
            if (selecionada.binaria()) {
                //Verifica se existe algum valor digitado na segunda área de texto(num2Text)
                if (num2Text.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Digite um valor na segunda área de texto", "Informação", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    //Relizando o filtro de caracteres comuns indesejados 
                    num2Text.setText(Filtro(num2Text.getText()));
                    //Verifica se existe algum caractere estranho nas áreas de texto que estão destinadas a recebe números 
                    if (ContemLetrasNum1() == false && ContemLetrasNum2() == false) {
                        //Passando o resultado das operações para área de texto para resultados(resultadoText)
                        resultadoText.setText(selecionada.operação(num1Text.getText(), num2Text.getText()));
                    }
                }
            } else {
                //Verifica se existe algum caractere estranho nas áreas de texto que está destinada a numero
                if (!ContemLetrasNum1()) {
                    //Passando o resultado das operações para área de texto para resultados(resultadoText)
                    resultadoText.setText(selecionada.operação(num1Text.getText()));
                }
            }
        }
    }

    /**
     * Evento click no botão de usar o resultado de uma operação para uma nova
     * operação
     */
    public void usarBtn_Clicked() {
        ///Verifica se o valor não é nulo 
        if (resultadoText.getText() != null) {
            num1Text.setText(resultadoText.getText());
        }
    }

    /**
     * Evento de tecla precionada enquanto o foco está no botão usar
     *
     * key é objeto que carrega as informações a tecla precionada
     *
     * @param key
     *
     */
    public void usarBtn_KeyPressed(KeyEvent key) {
        if (key.getCode() == ENTER) {
            usarBtn_Clicked();
        }
    }

    /**
     * Evento de tecla precionada enquanto o foco está no botão calcular
     *
     * @param key é um objeto que carrega as informações da tecla precionada
     */
    public void calcularBtn_KeyPressed(KeyEvent key) {

        if (key.getCode() == ENTER) {
            calcularBtn_Clicked();
        }
    }

    /**
     * Função que retira vírgulas( , ) na String passada e substitui por pontos(
     * . )
     *
     * @param digitado Recebe String que deseja fazer o filtro do caractere de
     * vírgula
     * @return uma String sem vírgulas onde estes estarão substituidos por
     * pontos
     */
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

    /**
     * Função que verifica se o TextField num1Text destinada ao prímeiro número
     * não contem nenhuma letra ou caractere diferente de números e imprime na
     * tela uma menssagem para usuário informando o erro
     *
     * @return true se contem uma letra ou caractere diferente de números
     *
     */
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

    /**
     * Função que verifica se no TextField num2Text destinada ao segundo número
     * não contem nenhuma letra ou caractere diferente de números e imprime na
     * tela uma menssagem para usuário informando o erro
     *
     * @return true se contem uma letra ou caractere diferente de números
     */
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
