module com.example.first_git_project {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.first_git_project to javafx.fxml;
    exports com.example.first_git_project;
}