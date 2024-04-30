package co.edu.uniquindio.parcial2.viewController;

import co.edu.uniquindio.parcial2.controller.ObjetoController;
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

import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;

public class ObjetoViewController {
    ObjetoController objetoController;
    Objeto objetoSeleccinado;
    ObservableList<Objeto> listaObjetos = FXCollections.observableArrayList();
    @FXML
    void initialize() {
        objetoController =  new ObjetoController();
        initTable();
        initSearch();
    }

    private void initTable() {
        initDataBinding();
        obtenerObjetos();
        tbObjeto.getItems().clear();
        tbObjeto.setItems(listaObjetos);
//        listenerSelection();
    }
    private void initSearch(){
        FilteredList<Objeto> filteredData = new FilteredList<>(listaObjetos, b->true);
        txtSearchC.textProperty().addListener((ObservableList,oldValue,newValue)->{
            filteredData.setPredicate(objetoSeleccinado ->{
                if (newValue == null || newValue.isEmpty()) {
                    return true;
                }
                String loweCaseFilter = newValue.toLowerCase();
                if(objetoSeleccinado.getCodigoObjeto().toLowerCase().contains(loweCaseFilter)) {
                    return true;
                }else{
                    return false;
                }
            });
        });
        SortedList<Objeto> sortedData = new SortedList<>(filteredData);

        sortedData.comparatorProperty().bind(tbObjeto.comparatorProperty());
        tbObjeto.setItems(sortedData);
    }

    private void obtenerObjetos() {
        listaObjetos.clear();
        listaObjetos.addAll(objetoController.obtenerObjetos());
    }
    private void initDataBinding() {
        colNombre.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getNombreObjeto()));
        colCodigo.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getCodigoObjeto()));
        colDisponibilidad.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getPrestamoAsociado() == null ? "Disponible" : "No Disponible"));
    }

    @FXML
    void onObtenerObjetos(ActionEvent event) {
        listaObjetos.clear();
        listaObjetos.addAll(objetoController.obtenerObjetosRango(Integer.parseInt(txtRango.getText())));
    }
    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button btnRango;

    @FXML
    private TableView<Objeto> tbObjeto;

    @FXML
    private TextField txtRango;

    @FXML
    private TableColumn<Objeto, String> colNombre;

    @FXML
    private TableColumn<Objeto, String> colCodigo;

    @FXML
    private TableColumn<Objeto, String> colDisponibilidad;


    @FXML
    private TextField txtSearchC;


}

