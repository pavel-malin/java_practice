import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class JavaFXEventDemo extends Application {
    Label response;
    public static void main(String[] args) {
        launch(args);
    }

    public void start(Stage myStage) {
        myStage.setTitle("Using JavaFX buttons and events");
        FlowPane rootNode = new FlowPane(10, 10);
        rootNode.setAlignment(Pos.CENTER);
        Scene myScene = new Scene(rootNode, 300, 100);
        myStage.setScene(myScene);
        response = new Label("Press button");
        Button btnUp = new Button("Up");
        Button btnDown = new Button("Down");

        btnUp.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent ae) {
                response.setText("You pressed up");
            }
        });

        rootNode.getChildren().addAll(btnUp, btnDown, response);
        myStage.show();
    }
}
