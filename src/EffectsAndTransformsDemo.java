import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.effect.BoxBlur;
import javafx.scene.effect.Reflection;
import javafx.scene.layout.FlowPane;
import javafx.scene.transform.Rotate;
import javafx.scene.transform.Scale;
import javafx.stage.Stage;

public class EffectsAndTransformsDemo extends Application {
    double angle = 0.0;
    double scaleFactor = 0.4;
    double blurVal = 1.0;
    Reflection reflection = new Reflection();
    BoxBlur blur = new BoxBlur(1.0, 1.0,1);
    Rotate rotate = new Rotate();
    Scale scale = new Scale(scaleFactor, scaleFactor);
    Button btnRotate = new Button("Turn");
    Button btnBlur = new Button("Blur");
    Button btnScale = new Button("Scale");
    Label reflect = new Label("Reflection adds visual sheen.");

    public static void main(String[] args) {
        launch(args);
    }

    public void start(Stage myStage) {
        myStage.setTitle("Demonstration of effects and transformations");
        FlowPane rootNode = new FlowPane(20, 20);
        rootNode.setAlignment(Pos.CENTER);
        Scene myScene = new Scene(rootNode, 300, 100);
        myStage.setScene(myScene);
        btnRotate.getTransforms().add(rotate);
        btnScale.getTransforms().add(scale);
        reflection.setTopOpacity(0.7);
        reflection.setBottomOpacity(0.3);
        reflect.setEffect(reflection);
        btnRotate.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent ae) {
                angle += 15.0;
                rotate.setAngle(angle);
                rotate.setPivotX(btnRotate.getWidth()/2);
                rotate.setPivotY(btnRotate.getHeight()/2);
            }
        });

        btnScale.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent ae) {
                scaleFactor += 0.1;
                if (scaleFactor > 2.0)
                    scaleFactor = 0.4;
                scale.setX(scaleFactor);
                scale.setY(scaleFactor);
            }
        });

        btnBlur.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent ae) {
                if (blurVal == 10.0) {
                    blurVal = 1.0;
                    btnBlur.setEffect(null);
                    btnBlur.setText("Undo blur ");
                }
                else {
                    blurVal++;
                    btnBlur.setEffect(blur);
                    btnBlur.setText("Add blur ");
                }
                blur.setWidth(blurVal);
                blur.setHeight(blurVal);
            }
        });

        rootNode.getChildren().addAll(btnRotate, btnScale, btnBlur, reflect);
        myStage.show();
    }
}
