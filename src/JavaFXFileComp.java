import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

import java.io.FileInputStream;
import java.io.IOException;

public class JavaFXFileComp extends Application {
    TextField tfFirst;
    TextField tfSecond;
    Button btnComp;
    Label labFirst;
    Label labSecond;
    Label  labResult;
    public static void main(String[] args) {
        launch(args);
    }

    public void start(Stage myStage) {
        myStage.setTitle("Compare files");
        FlowPane rootNode = new FlowPane(10, 10);
        rootNode.setAlignment(Pos.CENTER);
        Scene myScene = new Scene(rootNode, 180, 180);
        myStage.setScene(myScene);

        tfFirst = new TextField();
        tfSecond = new TextField();

        tfFirst.setPrefColumnCount(12);
        tfSecond.setPrefColumnCount(12);

        tfFirst.setPromptText("Enter file name.");
        tfSecond.setPromptText("Enter file name");
        btnComp = new Button("Compare");

        labFirst = new Label("First files");
        labSecond = new Label("Second files");
        labResult = new Label("");

        tfFirst.setOnAction((ae) -> btnComp.fire());
        tfSecond.setOnAction((ae) -> btnComp.fire());
        btnComp.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent ae) {
                int i=0, j=0;

                if (tfFirst.getText().equals("")) {
                    labResult.setText("Missing first file name");
                    return;
                }

                if (tfSecond.getText().equals("")) {
                    labResult.setText("Missing second file name");
                    return;
                }
                try (FileInputStream f1 = new FileInputStream(tfFirst.getText());
                     FileInputStream f2 = new FileInputStream(tfSecond.getText())) {
                    do {
                        i = f1.read();
                        j = f2.read();
                    }
                    while (i !=-1 && j != -1);
                    if (i != j)
                        labResult.setText("Files are different.");
                    else
                        labResult.setText("Files are the same.");
                }
                catch (IOException exc) {
                    labResult.setText("Error files");
                }
            }
        });
        rootNode.getChildren().addAll(labFirst, tfFirst, labSecond, tfSecond, btnComp, labResult);
        myStage.show();
    }
}
