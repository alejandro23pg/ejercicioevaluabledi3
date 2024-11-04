package com.example.ejercicioevaluable3;

import com.example.ejercicioevaluable3.models.Usuario;
import com.example.ejercicioevaluable3.models.UsuarioUtil;
import javafx.beans.property.SimpleStringProperty;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

import java.io.Serializable;
import java.net.URL;
import java.util.ResourceBundle;

public class HelloController implements Serializable {

    @FXML
    private CheckBox cbAdministrador;
    @FXML
    private Label lblAddUser;
    @FXML
    private TableColumn cHora;
    @FXML
    private TextField txtCorreo;
    @FXML
    private TableColumn cPlataforma;
    @FXML
    private Label lblPlataforma;
    @FXML
    private Label lblCorreo;
    @FXML
    private Button btnAdd;
    @FXML
    private TableColumn cCorreo;
    @FXML
    private TableColumn cVersion;
    @FXML
    private Label lblVersion;
    @FXML
    private TableColumn cAdministrador;
    @FXML
    private Spinner spnVersion;
    @FXML
    private TableView table;
    @FXML
    private ChoiceBox cboPlataforma;

    @FXML
    protected void onHelloButtonClick() {

    }

    private Usuario usuarioSeleted = null;
    private Integer userSelected = null;

    public void initialize(URL url, ResourceBundle resourceBundle) {

        /*cCorreo.setCellValueFactory((fila)->{
            Usuario usuario = fila.getValue();
            String correo = usuario.getCorreo();
            return new SimpleStringProperty(correo);
        });

        cboPlataforma.setCellValueFactory((fila)->{
            return new SimpleStringProperty(fila.getValue().getPlataforma());
        });

        cbAdministrador.setCellValueFactory((fila)->{
            return new SimpleStringProperty(fila.getValue().getDescription());
        });

        spnVersion.setValueFactory(cVersion) -> {
            return; new SimpleStringProperty(cVersion.getTableView());
        }*/
    };


    @FXML
    public void update(ActionEvent actionEvent) {
        if (userSelected == null) return;

        /*UsuarioUtil.usuarioList.get(userSelected).setCorreo(txtCorreo.getText());
        UsuarioUtil.usuarioList.get(userSelected).setPlataforma((String) cboPlataforma.getValue());
        UsuarioUtil.usuarioList.get(userSelected).setVersion(spnVersion.getValueFactory());
        UsuarioUtil.usuarioList.get(userSelected).setAdministrador(cbAdministrador.getText());
        UsuarioUtil.usuarioList.get(userSelected).setVersion(spnVersion.getValue());

        table.getItems().clear();
        table.getItems().addAll(UsuarioUtil.usuarioList);

        txtCorreo.setText("");
        cboPlataforma.setValue("");
        spnVersion.setValueFactory().setValue("Windows");
        cbAdministrador.setText("Sí");
        userSelected = null;
        table.getSelectionModel().clearSelection();*/
    }
}