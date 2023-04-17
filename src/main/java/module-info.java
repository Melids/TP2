module ClientGUI {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.base;

    opens GUIClient to javafx.graphics;
    opens GUIClient.controllers to javafx.fxml;
    opens GUIClient.models;
    opens GUIClient.views;

    exports GUIClient;
}
