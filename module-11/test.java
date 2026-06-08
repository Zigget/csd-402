import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class LayoutDemo extends Application {

    @Override
    public void start(Stage stage) {

        // ----- VBox Example -----
        VBox vbox = new VBox();
        vbox.setSpacing(10); // space between items
        vbox.setPadding(new Insets(15)); // padding around VBox

        Label vboxTitle = new Label("VBox Example");
        Button btn1 = new Button("Button 1");
        Button btn2 = new Button("Button 2");

        // Add items to VBox
        vbox.getChildren().addAll(vboxTitle, btn1, btn2);


        // ----- BorderPane Example -----
        BorderPane borderPane = new BorderPane();

        Label top = new Label("Top Area");
        Label bottom = new Label("Bottom Area");
        Button left = new Button("Left");
        Button right = new Button("Right");
        Label center = new Label("Center Content");

        // Assign nodes to BorderPane regions
        borderPane.setTop(top);
        borderPane.setBottom(bottom);
        borderPane.setLeft(left);
        borderPane.setRight(right);
        borderPane.setCenter(center);

        // Add padding to BorderPane
        borderPane.setPadding(new Insets(10));


        // ----- Combine Both Layouts -----
        VBox root = new VBox(20); // main container
        root.setPadding(new Insets(20));
        root.getChildren().addAll(vbox, borderPane);

        Scene scene = new Scene(root, 500, 400);
        stage.setTitle("JavaFX VBox & BorderPane Demo");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
