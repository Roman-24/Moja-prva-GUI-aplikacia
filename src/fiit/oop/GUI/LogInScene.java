package fiit.oop.GUI;

import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class LogInScene {

    private Stage window;
    private Scene scene;
    private GridPane grid = new GridPane();
    private Label userNameLabel = new Label("ID používateľa: ");
    private TextField nameInput = new TextField();
    private Label passLabel = new Label("Heslo: ");
    private TextField passInput = new PasswordField();
    private Button loginButton = new Button("Prihlásiť sa");
    private Button exitButton = new Button("Ukončiť program");

    public LogInScene(Stage primaryStage) {

        this.window = primaryStage;
        window.setTitle("Prihlásenie");

        grid.setPadding(new Insets(10, 10, 10, 10));
        grid.setVgap(10);
        grid.setHgap(10);

        // nastavenie rozmiestnenia popiskov a inputov
        GridPane.setConstraints(userNameLabel, 0, 0);
        GridPane.setConstraints(nameInput, 1, 0);
        GridPane.setConstraints(passLabel, 0, 1);
        GridPane.setConstraints(passInput, 1, 1);
        GridPane.setConstraints(loginButton, 1, 2);
        GridPane.setConstraints(exitButton, 1, 3);

        // nastavenie objektov do gridPane
        grid.getChildren().addAll(userNameLabel, nameInput, passLabel, passInput, loginButton, exitButton);

        // nastavenie scény
        scene = new Scene(grid, 400, 400);
        window.setScene(scene);
        window.show();

    }

    public Stage getWindow() {
        return window;
    }

    public void setWindow(Stage window) {
        this.window = window;
    }

    public Scene getScene() {
        return scene;
    }

    public void setScene(Scene scene) {
        this.scene = scene;
    }

    public GridPane getGrid() {
        return grid;
    }

    public void setGrid(GridPane grid) {
        this.grid = grid;
    }

    public Label getUserNameLabel() {
        return userNameLabel;
    }

    public void setUserNameLabel(Label userNameLabel) {
        this.userNameLabel = userNameLabel;
    }

    public TextField getNameInput() {
        return nameInput;
    }

    public void setNameInput(TextField nameInput) {
        this.nameInput = nameInput;
    }

    public Label getPassLabel() {
        return passLabel;
    }

    public void setPassLabel(Label passLabel) {
        this.passLabel = passLabel;
    }

    public TextField getPassInput() {
        return passInput;
    }

    public void setPassInput(TextField passInput) {
        this.passInput = passInput;
    }

    public Button getLoginButton() {
        return loginButton;
    }

    public void setLoginButton(Button loginButton) {
        this.loginButton = loginButton;
    }

    public Button getExitButton() {
        return exitButton;
    }

    public void setExitButton(Button exitButton) {
        this.exitButton = exitButton;
    }
}