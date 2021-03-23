package fiit.oop.GUI;

import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;
import javafx.scene.layout.GridPane;

public class ManagerScene {

    Stage window = new Stage();
    GridPane grid = new GridPane();
    // Názov položky v menu
    Menu ordersMenu = new Menu("Objednávky");
    // Main menu bar
    MenuBar menuBar = new MenuBar();
    BorderPane layout = new BorderPane();
    Scene scene = new Scene(layout, 400,400);

    public ManagerScene(){

        window.setTitle("Ste prihlásený ako Manager");

        grid.setPadding(new Insets(10, 10, 10, 10));
        grid.setVgap(8);
        grid.setHgap(10);

        // Menu items
        ordersMenu.getItems().add(new MenuItem("Pridať novú objednávku"));
        ordersMenu.getItems().add(new MenuItem("Otvoriť existujúcu objednávku"));

        menuBar.getMenus().addAll(ordersMenu);

        layout.setTop(menuBar);

        window.setScene(scene);

    }

    public Stage getWindow() {
        return window;
    }

    public void setWindow(Stage window) {
        this.window = window;
    }

    public GridPane getGrid() {
        return grid;
    }

    public void setGrid(GridPane grid) {
        this.grid = grid;
    }

    public Menu getOrdersMenu() {
        return ordersMenu;
    }

    public void setOrdersMenu(Menu ordersMenu) {
        this.ordersMenu = ordersMenu;
    }

    public MenuBar getMenuBar() {
        return menuBar;
    }

    public void setMenuBar(MenuBar menuBar) {
        this.menuBar = menuBar;
    }

    public BorderPane getLayout() {
        return layout;
    }

    public void setLayout(BorderPane layout) {
        this.layout = layout;
    }

    public Scene getScene() {
        return scene;
    }

    public void setScene(Scene scene) {
        this.scene = scene;
    }
}