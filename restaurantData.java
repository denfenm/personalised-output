package application;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.StringTokenizer;

public class restaurantData implements Serializable {

HashMap<String, List<String>> rest = new HashMap<String, List<String>>();
	
{
rest.put("McDonald KL Sentral", Arrays.asList(new String[] {"fastfood", "halal", "vegan"}));//
rest.put("Vin's Restaurant and Bar", Arrays.asList(new String[] {"asian", "alcohol", "western"}));
rest.put("Dining in the Dark", Arrays.asList(new String[] {"asian", "vegan", "western", "malaysian"}));
rest.put("Sitka Restaurant", Arrays.asList(new String[] {"asian", "halal", "vegan", "malaysian"}));//
rest.put("The Owl's Cafe", Arrays.asList(new String[] {"western", "halal", "vegan", "malaysian"}));//
rest.put("Cantaloupe at Tropika Sky Dining", Arrays.asList(new String[] {"alcohol", "vegan", "western", "skyview", "malaysian"}));
rest.put("El Cerdo Restaurant", Arrays.asList(new String[] {"asian", "vegan"}));
rest.put("Marble 8 On 56", Arrays.asList(new String[] {"alcohol", "western", "halal", "vegan", "sky view"}));//
rest.put("Fuel Shack", Arrays.asList(new String[] {"fastfood", "western", "halal"}));//
rest.put("Marini's on 57", Arrays.asList(new String[] {"asian", "western", "vegan", "sky view"}));
}


public HashMap<String, List<String>> getRest() {
	return rest;
}

//remove duplicates
public void removeDuplicate(ArrayList<String> list) {
	//store list into temp
	Set<String> temp = new HashSet<>();
	temp.addAll(list);
	list.clear();
	list.addAll(temp);
	
}

public void addTokenFoundInList(ArrayList<String> list, String input, HashMap<String, List<String>> rest) {
	//separate each word and ignore . and ,
		StringTokenizer st = new StringTokenizer(input, "., ");
		while(st.hasMoreTokens()) {
			//move to next word/token
			String t = st.nextToken();
			//iterate through map
			for (Map.Entry<String,List<String> > entry : rest.entrySet()) 
			{	//if map contains the word found in user's input
				if(entry.getValue().contains(t))
				{
					//store values found in key to arraylist
					list.add(t);
					
				} 
			
			
		}
	}
		
}


}

