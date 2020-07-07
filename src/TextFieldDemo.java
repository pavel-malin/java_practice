import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Separator;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class TextFieldDemo extends Application {
    TextField tf;
    Label response;
    Button btnGetText;

    public static void main(String[] args) {
        launch(args);
    }

    public void start(Stage myStage) {
        myStage.setTitle("Text box demo ");
        FlowPane rootNode = new FlowPane(10, 10);
        rootNode.setAlignment(Pos.CENTER);
        Scene myScene = new Scene(rootNode, 230, 140);
        myStage.setScene(myScene);

        response = new Label("Get name: ");
        tf = new TextField();
        tf.setPromptText("Enter your name: ");
        tf.setPrefColumnCount(15);
        tf.setOnAction((ae) -> response.setText("Name entered: " + tf.getText()));
        btnGetText.setOnAction((ae) -> response.setText("The button is pressed. Name " + tf.getText()));
        Separator separator = new Separator();
        separator.setPrefWidth(180);
        rootNode.getChildren().addAll(tf, btnGetText, separator, response);
        myStage.show();
    }
}
