package application;

import java.io.Serializable;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class attractionData extends restaurantData  {
HashMap<String, List<String>>  attr = new HashMap<String, List<String>>();
	
	{
		attr.put("Petronas Tower", Arrays.asList(new String[] {"family friendly", "night life", "shopping", "fun", "free", "chill"}));
		attr.put("Kuala Lumpur Tower", Arrays.asList(new String[] {"chill", "fun", "night life", "family"}));
		attr.put("Suria Aquaria", Arrays.asList(new String[] {"family", "fun", "chill", "nature", "wild life"}));
		attr.put("Central Market", Arrays.asList(new String[] {"family", "free", "fun", "chill"}));
		attr.put("Furama Bukit Bintang", Arrays.asList(new String[] {"family", "free", "fun", "chill"}));
		attr.put("Merdeka Square", Arrays.asList(new String[] {"family", "free", "fun", "chill", "historical"}));
		attr.put("National Mosque", Arrays.asList(new String[] {"muslim", "free", "religious", "sacred", "mosque", "pray"}));
		attr.put("Petaling Street Market", Arrays.asList(new String[] {"family", "free", "night life", "shopping", "shop"}));
		attr.put("Lake Gardens", Arrays.asList(new String[] {"family", "free", "nature", "wildlife"}));
		attr.put("Sri Mahamariamman Temple", Arrays.asList(new String[] {"free", "sacred", "hindu", "religious"}));
	}
}
