import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class CheckBoxDemo extends Application {
    CheckBox cbSmartphone;
    CheckBox cbTablet;
    CheckBox cbNoteBook;
    CheckBox cbDesktop;
    Label respose;
    Label selected;
    String computers;

    public static void main(String[] args) {
        launch(args);
    }

    public void start(Stage myStage) {
        myStage.setTitle("Flags Show");
        FlowPane rootNode = new FlowPane(Orientation.VERTICAL, 10, 10);
        rootNode.setAlignment(Pos.CENTER);
        Scene myScene = new Scene(rootNode, 230, 200);
        myStage.setScene(myScene);
        Label heading = new Label("What devices do you have?");
        respose= new Label("");
        selected = new Label("");

        cbSmartphone = new CheckBox("Smartphone");
        cbTablet = new CheckBox("Tablet");
        cbNoteBook = new CheckBox("Notebook");
        cbDesktop = new CheckBox("Desktop");

        cbSmartphone.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event) {
                if (cbSmartphone.isSelected())
                    respose.setText("Smartphone has been selected ");
                else
                    respose.setText("Smartphone selection canceled ");
                showAll();
            }
        });

        cbTablet.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event) {
                if (cbTablet.isSelected())
                    respose.setText("Tablet has been selected ");
                else
                    respose.setText("Tablet selection canceled ");
                showAll();
            }
        });

        cbNoteBook.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event) {
                if (cbNoteBook.isSelected())
                    respose.setText("Laptop was selected ");
                else
                    respose.setText("Notebook selection canceled ");
                showAll();
            }
        });

        cbDesktop.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event) {
                if (cbDesktop.isSelected())
                    respose.setText("PC was selected ");
                else
                    respose.setText("PC selection canceled ");
                showAll();
            }
        });
        rootNode.getChildren().addAll(heading, cbSmartphone, cbTablet, cbNoteBook, cbDesktop, respose, selected);

        myStage.show();
        showAll();
    }

    void showAll() {
        computers = "";
        if (cbSmartphone.isSelected())
            computers = "Smartphone";
        if (cbTablet.isSelected())
            computers = "Tablet";
        if (cbNoteBook.isSelected())
            computers = "Notebook";
        if (cbDesktop.isSelected())
            computers = "PC";
        selected.setText("Devices selected: " + computers);
    }
}
