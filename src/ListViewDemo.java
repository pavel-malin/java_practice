import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.MultipleSelectionModel;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class ListViewDemo extends Application {
    Label response;

    public static void main(String[] args) {
        launch(args);
    }

    public void start(Stage myStage) {
        myStage.setTitle("List demonstration");
        FlowPane rootNode = new FlowPane(10, 10);
        rootNode.setAlignment(Pos.CENTER);
        Scene myScene = new Scene(rootNode, 200, 120);
        myStage.setScene(myScene);
        response = new Label("Select device type ");
        ObservableList<String> computerTypes =
                FXCollections.observableArrayList("Smartphone", "Tablet", "Notebook", "PC");
        ListView<String> lvComputer =
                new ListView<String>(computerTypes);
        lvComputer.setPrefSize(100, 70);
        MultipleSelectionModel<String> lvSelModel =
                lvComputer.getSelectionModel();
        lvSelModel.selectedItemProperty().addListener( {
                new ChangeListener<String>() {
                    public void changed() {
                        changed(lvComputer);// ?????????????
                    }

                    public void changed(ObservableValue<? extends String>
                                                changed, String oldVal, String newVal) {
                        response.setText("Device selected: " + newVal);
                    }
                }
        });
        rootNode.getChildren().addAll(lvComputer,response);
        myStage.show();
    }
}
