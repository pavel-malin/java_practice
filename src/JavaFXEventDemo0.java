import javafx.application.Application;
import javafx.application.Platform;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class JavaFXEventDemo0 extends Application {
    Label response;

    public static void main(String[] args) {
        launch(args);
    }

    public void start(Stage myStage) {
        myStage.setTitle("Using the platform.exit() method");
        FlowPane rootNode = new FlowPane(10, 10);
        rootNode.setAlignment(Pos.CENTER);
        Scene myScene = new Scene(rootNode, 300, 100);
        myStage.setScene(myScene);
        response = new Label("Press button");
        Button btnRun = new Button("Run");
        Button btnExit = new Button("Exit");
        btnRun.setOnAction((ae) ->
                response.setText("You clicked execute"));
        btnExit.setOnAction((ae) -> Platform.exit());
        rootNode.getChildren().addAll(btnRun, btnExit, response);
        myStage.show();
    }
}
