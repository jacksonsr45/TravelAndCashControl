package core;

import jacksonsr45.Main;
import javafx.geometry.Rectangle2D;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Screen;

public class Window {
    private static double xOffSet = 0;
    private static double yOffSet = 0;
    private static boolean full_screen = false;

    public static void center() {
        Rectangle2D primScreenBounds = Screen.getPrimary().getVisualBounds();
        Main.stage.setX((primScreenBounds.getWidth() - Main.stage.getWidth()) / 2);
        Main.stage.setY((primScreenBounds.getHeight() - Main.stage.getHeight()) / 2);
    }

    public static void makeStageDraggable(AnchorPane pane) {
        pane.setOnMousePressed((event) -> {
            xOffSet = event.getSceneX();
            yOffSet = event.getSceneY();
        });
        pane.setOnMouseDragged((event) -> {
            Main.stage.setX(event.getScreenX() - xOffSet);
            Main.stage.setY(event.getScreenY() - yOffSet);
            Main.stage.setOpacity(0.8f);
        });
        pane.setOnDragDone((event) -> {
            Main.stage.setOpacity(1.0f);
        });
        pane.setOnMouseReleased((event) -> {
            Main.stage.setOpacity(1.0f);
        });
    }

    public static void handleMaximized() {
        if (Main.stage.isMaximized()) Main.stage.setMaximized(false);
        else Main.stage.setMaximized(true);
    }

}
