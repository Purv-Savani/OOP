import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Practical34 extends Application {

    public void start(Stage stage) {
        GridPane grid = new GridPane();
        grid.setPadding(new Insets(20));
        grid.setHgap(10);
        grid.setVgap(10);

        Label l1 = new Label("Roll No:");
        Label l2 = new Label("Name:");
        Label l3 = new Label("Age:");
        Label l4 = new Label("Email:");

        TextField t1 = new TextField();
        TextField t2 = new TextField();
        TextField t3 = new TextField();
        TextField t4 = new TextField();

        Button btn = new Button("Submit");

        grid.add(l1, 0, 0);
        grid.add(t1, 1, 0);
        grid.add(l2, 0, 1);
        grid.add(t2, 1, 1);
        grid.add(l3, 0, 2);
        grid.add(t3, 1, 2);
        grid.add(l4, 0, 3);
        grid.add(t4, 1, 3);
        grid.add(btn, 1, 4);

        btn.setOnAction(e -> {
            try {
                int roll = Integer.parseInt(t1.getText());
                int age = Integer.parseInt(t3.getText());
                String name = t2.getText();
                String email = t4.getText();

                if (!email.contains("@") || !email.contains(".")) {
                    throw new Exception("Invalid Email");
                }

                BufferedWriter bw = new BufferedWriter(new FileWriter("students.txt", true));
                bw.write(roll + " " + name + " " + age + " " + email);
                bw.newLine();
                bw.close();

                Alert a = new Alert(Alert.AlertType.INFORMATION);
                a.setTitle("Success");
                a.setHeaderText("Registration Successful");
                a.setContentText("Roll: " + roll + "\nName: " + name + "\nAge: " + age + "\nEmail: " + email);
                a.showAndWait();

            } catch (NumberFormatException ex) {
                Alert a = new Alert(Alert.AlertType.ERROR);
                a.setContentText("Roll No and Age must be integers");
                a.showAndWait();
            } catch (Exception ex) {
                Alert a = new Alert(Alert.AlertType.ERROR);
                a.setContentText(ex.getMessage());
                a.showAndWait();
            } catch (IOException ex) {
                Alert a = new Alert(Alert.AlertType.ERROR);
                a.setContentText("File Error");
                a.showAndWait();
            }
        });

        Scene scene = new Scene(grid, 350, 250);
        stage.setScene(scene);
        stage.setTitle("Registration Form");
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
  }
