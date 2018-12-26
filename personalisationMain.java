package application;

import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.Toggle;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class personalisationMain extends Application {		
	
	@Override
	public void start(Stage stage) throws Exception {
		
		mainHotel mh = new mainHotel();
		mainAttraction ma = new mainAttraction();
		mainRestaurant mr = new mainRestaurant();
		
		RadioButton rest = new RadioButton("Restaurant");
		RadioButton attr = new RadioButton("Attraction");
		RadioButton hotel = new RadioButton("Hotel");
		
		final ToggleGroup group = new ToggleGroup();
		
		rest.setToggleGroup(group);
		attr.setToggleGroup(group);
		hotel.setToggleGroup(group);
		
		Button ok = new Button("OK");
		
		ok.setOnAction(value -> {
			try {
				if(group.getSelectedToggle() == rest) {
					//mainRestaurant.launch(mainRestaurant.class);
					
						mr.start(stage);
					
				}
				else if (group.getSelectedToggle() == attr) {
					
						ma.start(stage);
					
				} else {
					
						mh.start(stage);
				}
			
					} catch (NullPointerException e) {
						
						e.printStackTrace();
					} catch (RuntimeException e) {
						
						e.printStackTrace();
					} catch (Exception e) {
						e.printStackTrace();
					}
				
			
		});
			
		
		
		
		
		VBox vb = new VBox();
		vb.getChildren().addAll(new Label("Choose one"), rest, attr, hotel, ok);
		vb.setAlignment(Pos.CENTER);
		Scene scene = new Scene(vb, 200, 200);
		stage.setTitle("Personalisation");
		stage.setScene(scene);
		stage.show();
		
		}
	
	public static void main(String[] args) {
		launch(args);
	}
	
	}

