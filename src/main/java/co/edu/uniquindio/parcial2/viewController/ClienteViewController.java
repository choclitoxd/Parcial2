package co.edu.uniquindio.parcial2.viewController;
import java.net.URL;
import java.util.ResourceBundle;

import co.edu.uniquindio.parcial2.controller.ClienteController;
import co.edu.uniquindio.parcial2.model.Cliente;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class ClienteViewController {
    ClienteController clienteController;
    @FXML
    void initialize() {
        clienteController =  new ClienteController();
    }
    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button btnClientePorCedula;

    @FXML
    private Button btnEmpleadoConMasPrestamos;

    @FXML
    private Button btnEntreDosFechas;

    @FXML
    private Button btnObjetosMenosPrestados;

    @FXML
    private Button btnPrestamosDesdeFecha;

    @FXML
    private TextField txtClientePorCedula;

    @FXML
    private TextField txtEmpleadoConMasPrestamos;

    @FXML
    private TextField txtFechaFinal;

    @FXML
    private TextField txtFechaInicial;

    @FXML
    private TextField txtObjetoMenosPrestado;

    @FXML
    private TextField txtPrestamosDesdeFecha;

    @FXML
    private TextArea txtResultadoBusqueda;
    @FXML
    void onClientePorCedula(ActionEvent event) {
        if(!txtClientePorCedula.getText().isEmpty()) {
            txtResultadoBusqueda.setText(clienteController.obtenerClientePorCedula(txtClientePorCedula.getText()));
        }
    }

    @FXML
    void onEmpleadoConMasPrestamos(ActionEvent event) {
        if(!txtEmpleadoConMasPrestamos.getText().isEmpty()) {
            txtResultadoBusqueda.setText(clienteController.obtenerEmpleadoConMasPrestamos(txtEmpleadoConMasPrestamos.getText()));
        }
    }

    @FXML
    void onObjetosMenosPrestados(ActionEvent event) {
        if(!txtObjetoMenosPrestado.getText().isEmpty()) {
            txtResultadoBusqueda.setText(clienteController.obtenerObjetosRango(Integer.parseInt(txtObjetoMenosPrestado.getText())));
        }
    }

    @FXML
    void onPrestamosDesdeFecha(ActionEvent event) {
        if(!txtPrestamosDesdeFecha.getText().isEmpty()) {
            txtResultadoBusqueda.setText(clienteController.obtenerPrestamosFecha(txtPrestamosDesdeFecha.getText()));
        }
    }

    @FXML
    void onEntreDosFechas(ActionEvent event) {
        if(!txtFechaInicial.getText().isEmpty() && !txtFechaFinal.getText().isEmpty()) {
            txtResultadoBusqueda.setText(clienteController.EntreDosFechas(txtFechaInicial.getText(), txtFechaFinal.getText()));
        }
    }

}