package co.edu.uniquindio.parcial2.viewController;

import java.net.URL;
import java.util.ResourceBundle;

import co.edu.uniquindio.parcial2.controller.ClienteController;
import co.edu.uniquindio.parcial2.controller.ObjetoController;
import co.edu.uniquindio.parcial2.model.Cliente;
import co.edu.uniquindio.parcial2.model.Objeto;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.collections.transformation.FilteredList;
import javafx.collections.transformation.SortedList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class ClienteViewController {
    ClienteController clienteController;
    Cliente clienteSeleccionado;
    ObservableList<Cliente> listaCliente = FXCollections.observableArrayList();
    @FXML
    void initialize() {
        clienteController =  new ClienteController();
        initTable();
        initSearch();
    }

    private void initTable() {
        initDataBinding();
        obteneCliente();
        tbCliente.getItems().clear();
        tbCliente.setItems(listaCliente);
//        listenerSelection();
    }

    private void obteneCliente() {
        listaCliente.clear();
        listaCliente.addAll(clienteController.obtenerClientes());
    }

    private void initSearch(){
        FilteredList<Cliente> filteredData = new FilteredList<>(listaCliente, b->true);
        txtSearchC.textProperty().addListener((ObservableList,oldValue,newValue)->{
            filteredData.setPredicate(objetoSeleccinado ->{
                if (newValue == null || newValue.isEmpty()) {
                    return true;
                }
                String loweCaseFilter = newValue.toLowerCase();
                if(objetoSeleccinado.getCedula().toLowerCase().contains(loweCaseFilter)) {
                    return true;
                } else if (objetoSeleccinado.getNombre().toLowerCase().contains(loweCaseFilter)) {
                    return true;
                }else {
                    return false;
                }
            });
        });
        SortedList<Cliente> sortedData = new SortedList<>(filteredData);

        sortedData.comparatorProperty().bind(tbCliente.comparatorProperty());
        tbCliente.setItems(sortedData);
    }
    private void initDataBinding() {
        colCedula.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getCedula()));
        colNombre.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getNombre()));
        colApellido.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getApellido()));
        colEdad.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getEdad()));
    }
    @FXML
    void onObtenerObjetos(ActionEvent event) {
        listaCliente.clear();
        listaCliente.addAll(clienteController.clientePrestamoMayor(Integer.parseInt(txtRango.getText())));
    }
    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button btnRango;

    @FXML
    private TableColumn<Cliente, String> colApellido;

    @FXML
    private TableColumn<Cliente, String> colCedula;

    @FXML
    private TableColumn<Cliente, String> colEdad;

    @FXML
    private TableColumn<Cliente, String> colNombre;

    @FXML
    private TableView<Cliente> tbCliente;

    @FXML
    private TextField txtRango;

    @FXML
    private TextField txtSearchC;

}
