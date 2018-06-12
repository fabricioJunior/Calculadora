package Calculadora;

/**
 * Classe príncipal do programa
 *
 * @author Fabricio Junior
 */
public class Calculadora {

    /**
     * Classe de inicializaçao do JVM
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ///Instanciando classe responsável pela interface gráfica 
        Gui start = new Gui();
        ///Exibindo a interface gráfica 
        start.Show();
    }

}
