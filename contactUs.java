package application;

import java.io.*;
import java.security.Timestamp;
import java.util.*;
import javafx.scene.*;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import javafx.event.*;
import javafx.application.*;

public class contactUs extends Application {
	
	
@Override
public void start(Stage stage) {
	
	BorderPane bp = new BorderPane();
	BorderPane bp2 = new BorderPane();
	Scanner in = new Scanner(System.in);
	TextArea ta = new TextArea();
	Label lbl = new Label("Contact us for questions or feedbacks!");
	
	String lineToPrint = "";
	String fileName = "contactUs.txt";
	Button submit = new Button("SUBMIT");
	bp.setBottom(submit);
	bp.setTop(lbl);
	bp.setCenter(ta);
	bp2.setCenter(new Label("THANK YOU"));
	bp.setPrefSize(400, 400);
	bp2.setPrefSize(400, 400);
	Scene scene1 = new Scene(bp);
	Scene scene2 = new Scene(bp2);
	
	submit.setOnAction(e->{
	
	
	    java.util.Date date= new java.util.Date();

	    // Initialize variable and store new Timestamp object
	    java.sql.Timestamp timestamp = new java.sql.Timestamp(date.getTime());

	    

	    // Concatenate 
	    printToFile (fileName, timestamp + "\n" + ta.getText());

	    stage.setScene(scene2);
	
	});
	
		stage.setTitle("Contact Us");
		stage.setScene(scene1);
		stage.show();
	}


	 public static void printToFile (String myfileName, String message) {        

	        try {
	            File outfile = new File(myfileName);

	            //if file doesn't exist, then create it

	            if (!outfile.exists()) {
	                System.out.println("No file exists. Writing a new file");
	                outfile.createNewFile();

	            }
	            FileWriter fw = new FileWriter(outfile.getAbsoluteFile(), true);
	            BufferedWriter bw = new BufferedWriter(fw);
	            bw.write(message);
	          
	            
	            bw.flush(); 
	            bw.close();

	            System.out.println("Done");

	            } catch (IOException e) {
	                e.printStackTrace();                    
	        } 
	        
	        
}
	 
	 public static void main(String[] args)
		{
			launch(args);
		}
}


	
	 


