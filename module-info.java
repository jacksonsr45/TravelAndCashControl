module TravelAndCashControl {
    requires javafx.fxml;
    requires javafx.graphics;
    requires javafx.controls;

    exports jacksonsr45;
    exports jacksonsr45.main.user_interface.controller;
    opens jacksonsr45.main.user_interface.controller to javafx.fxml;
}