import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
// harshalargade
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class hello extends Application {

        @Override
    public void start(Stage primaryStage) {
        Button c_btn = new Button();
        c_btn.setText("Say 'Hello Harshal'");
        c_btn.setOnAction(new EventHandler<ActionEvent>() {
    
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Hello Harshal");
            }
        });
        StackPane c_root = new StackPane();
        c_root.getChildren().add(c_btn);
    Scene c_scene = new Scene(c_root, 300, 250);
        primaryStage.setTitle("Hello Harshal");
        primaryStage.setScene(c_scene);
        primaryStage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }
}