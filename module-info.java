module TravelAndCashControl {
    requires javafx.fxml;
    requires javafx.graphics;
    requires javafx.controls;
    requires com.jfoenix;
    requires de.jensd.fx.glyphs.fontawesome;

    exports jacksonsr45;
    exports jacksonsr45.main.user_interface.controller;

    opens jacksonsr45.main.user_interface.controller to javafx.controls, javafx.graphics, javafx.fxml;
}