package com.example.module6;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class StudentController {
    @FXML
    private TableView<Student> studentTable;

    @FXML
    private TableColumn<Student, String> studentIdCol;

    @FXML
    private TableColumn<Student, String> nameCol;

    @FXML
    public void initialize() {
        studentIdCol.setCellValueFactory(new PropertyValueFactory<>("student"));
        nameCol.setCellValueFactory(new PropertyValueFactory<>("name"));

        ObservableList<Student> studentList = FXCollections.observableArrayList(
                new Student(1, "2510817310012", "Samsul"),
                new Student(2, "2510817310213", "Rolan"),
                new Student(3, "2510817313456", "Yayaadi"),
                new Student(4, "2510817112333", "Salman"),
                new Student(5, "2510817333333", "Yofi"),
                new Student(6, "2510817234567", "Hafidz"),
                new Student(7, "2510817325567", "Anshari"),
                new Student(8, "2510817128547", "Cimeng"),
                new Student(9, "2510817247373", "Sutoyo"),
                new Student(10, "2510817242646", "Esteem")
                );

        studentTable.setItems(studentList);
    }
}