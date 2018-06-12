/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Calculadora;

import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
/**
 *Classe responsável por  fazer a chamada da interface gráfica da calculadora 
 * @author Fabricio Junior
 */
public class Gui extends Application {

    @Override
    public void start(Stage primaryStage) throws IOException {
        AnchorPane root = FXMLLoader.load(
                this.getClass().getResource("CalculadoraForm.fxml") //Criando cena a´partir dos elementos do fxml
        );
        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        ///Definindo posição de inicialização no centro da tela 
        primaryStage.centerOnScreen();
        primaryStage.show();
    }

    public void Show() {
        launch();
    }
    ///Retira exeção 
    public static void main(String[] args) {

    }
}
