package application;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.stream.Collectors;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
public class mainRestaurant extends Application {
	
	public void start(Stage stage) throws Exception {
		
	//declare restaurantdata as rd
	restaurantData rd = new restaurantData();
	
	//create button
	Button submit = new Button("SUBMIT");
    //create label
	Label l1 = new Label("Write a description of what you are looking for: (example- vegan, malaysian, halal, alcohol, skyview, fastfood etc..)");
   	Label l2 = new Label("");
	//create textfield
	TextField tf = new TextField();
	tf.setMinSize(200, 100);
			
	VBox vb = new VBox();
	vb.setMinWidth(80);
	vb.setMinHeight(100);
	vb.setAlignment(Pos.CENTER);	
	vb.getChildren().add(l2);
	//store keys
	ArrayList<String> listOfKeys = new ArrayList<String>();
	//store characteristics of restaurant that user typed
	ArrayList<String> listOfItems = new ArrayList<String>();
	
	submit.setDefaultButton(true); //can press enter instead of clicking submit
	
	submit.setOnAction(value -> {
	//clear listofkeys and listofitems before starting again
	listOfKeys.clear(); 
	listOfItems.clear();
    l2.setText(null);
	String response = tf.getText();
	
	try {
		File file = new File("unknownRestaurant.txt");
		
		//if file does not exist, create new file
		if(!file.exists()) {
			System.out.print("File does not exist. creating a new one");
			file.createNewFile();
		}
		
		FileWriter fw = new FileWriter(file.getAbsoluteFile(), true);
		BufferedWriter bw = new BufferedWriter(fw);
		
		addTokenFoundInList(listOfItems, response, rd.rest, bw);

			
			
		} catch (IOException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	
	//remove duplicates by putting them into set
	rd.removeDuplicate(listOfItems);
		
		
		for(Map.Entry<String, List<String>> entry : rd.rest.entrySet())
		{	//if entry contains value equal to the arraylist listofitems
			if(entry.getValue().containsAll(listOfItems))
			{
				//store the keys with the values into listofkeys
				listOfKeys.add(entry.getKey());
				
			}
			
			
		}
			//remove duplicates
			rd.removeDuplicate(listOfKeys);	
			
			if(listOfKeys.size() != 10) { //if none of the keys contain the value 
				
				l2.setText(listOfKeys.toString().replace("[", "").replace("]", ""));
				
			
			} else { //if at least 1 of the keys contain the value
			
		
			l2.setText("Not found. Will be updated soon!");
			
		    }
	});
	
		
		VBox vb2 = new VBox();
			
		vb2.setAlignment(Pos.CENTER);
		vb2.getChildren().addAll(l1, tf, vb, submit);
		
		Scene scene = new Scene(vb2, 200, 200);
		stage.setTitle("Restaurant");
		stage.setScene(scene);
		stage.show();
	
		}
	
	
	public static void addTokenFoundInList(ArrayList<String> list, String response, HashMap<String, List<String>> hotel, BufferedWriter bw) throws IOException {
		//separate each word and ignore . and ,
		StringTokenizer st = new StringTokenizer(response, "., ");
		restaurantData rd = new restaurantData();
		ArrayList<String> temporary = new ArrayList<String>();
		while(st.hasMoreTokens()) {
			//move to next word/token
			String t = st.nextToken();
			//iterate through map
			for (Map.Entry<String,List<String> > entry : hotel.entrySet()) 
			{	//if map contains the word found in user's input
				if(entry.getValue().contains(t))
				{
					//store values found in key to arraylist
					list.add(t);
					
				} 
				else {
					
					temporary.add(t);
			
					}
				}
			try {
            //remove duplicates
			rd.removeDuplicate(temporary);
			//write to file
			for (String element : temporary) {
				bw.write(element.toString());
			}
			bw.flush();
			bw.close();
		
			} catch (IOException e) {
				e.printStackTrace();
			} catch (Exception e) {
				e.printStackTrace();
			}

		}
	}}


	




