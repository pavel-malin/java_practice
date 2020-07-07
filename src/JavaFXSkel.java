import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class JavaFXSkel extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    public void init() {
        System.out.println("In the body of the method init()");
    }

    public void start(Stage myStage) {
        System.out.println("In the body of the method start()");

        myStage.setTitle("JavaFx application framework");
        FlowPane rootNode = new FlowPane();
        Scene myScene = new Scene(rootNode, 300, 200);
        myStage.setScene(myScene);
        myStage.show();
    }

    public void stop() {
        System.out.println("In the body of the method stop()");
    }
}
