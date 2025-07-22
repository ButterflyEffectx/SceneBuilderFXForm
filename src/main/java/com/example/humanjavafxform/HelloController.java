package com.example.humanjavafxform;

import Personnel.Student;
import Personnel.StudentPool;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {
    @FXML
    private Label welcomeText;
    @FXML
    private TextField txtID;
    @FXML
    private TextField txtName;
    @FXML
    private TextField txtScore;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
    StudentPool sPool = new StudentPool();
    @FXML
    protected void onBtnRegisterClick() {

        Student s = new Student();
        s.setID(txtID.getText());
        s.setName(txtName.getText());
        s.setScore(Integer.parseInt(txtScore.getText()));

        sPool.addStudents(s);

        welcomeText.setText("Insert successful");
    }
}