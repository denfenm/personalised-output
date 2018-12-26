package application;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class hotelData extends restaurantData {
	
	HashMap<String, List<String>>  hotel = new HashMap<String, List<String>>();
	
	{
		hotel.put("Shangri-La", Arrays.asList(new String[] {"free wifi", "air conditioning", "aircond", "pool", "pet", "pet friendly", "parking", "close to city", "car park", "5km from city centre"}));//
		hotel.put("Sunway Putra Hotel", Arrays.asList(new String[] {"free wifi", "air conditioning", "aircond", "parking", "car park", "24 hours room service"}));
		hotel.put("Mandarin Oriental Kuala Lumpur", Arrays.asList(new String[] {"free wifi", "aircond", "pool", "24 hours room service", "near city", "close to city"}));
		hotel.put("Impiana KLCC Hotel", Arrays.asList(new String[] {"free wifi", "pool", "24 hours room service", "near city", "close to city"}));//
		hotel.put("Furama Bukit Bintang", Arrays.asList(new String[] {"free wifi", "aircond", "air conditioning", "near city", "close to city"}));//
		hotel.put("Arenaa Star Hotel", Arrays.asList(new String[] {"free wifi", "air conditioning", "car park", "near city", "close to city"}));
		hotel.put("Starpoints Hotel Kuala Lumpur", Arrays.asList(new String[] {"free wifi", "aircond", "parking", "car park", "near city", "close to city"}));
		hotel.put("Hotel Capitol Kuala Lumpur", Arrays.asList(new String[] {"free wifi", "aircond", "pool", "pet friendly", "parking", "car park", "24 hours room service", "near city", "close to city"}));//
		hotel.put("My Hotel", Arrays.asList(new String[] {"free wifi", "aircond", "air conditioning", "pet", "24 hours room service", "parking"}));//
	}

}
