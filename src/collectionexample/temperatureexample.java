/*package collectionexample;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class temperatureexample {

	public static void main(String[] args) {
		HashMap<String,Integer> temperature= new HashMap<String,Integer>();
		temperature.put("hyd" , 32);
		temperature.put("bng" , 16);
		temperature.put("kdp" , 50);
		temperature.put("mum" , 32);
		temperature.put("goa" , 23);
		temperature.put("ker" , 32);
		//count of repeated temperature

		Map<Integer, Set<String>> temploca = new HashMap<>();

        for (Map.Entry<String, Integer> entry : temploca.entrySet()) {
            String location = entry.getKey();
            int temp = entry.getValue();

            if (!temploca.containsKey(temperature)) {
                temploca.put(temperature, new HashSet<>());
            }

            	temploca.get(temperature).add(location);
        }

        // Print locations with the same temperature
        for (Map.Entry<Integer, Set<String>> entry : temploca.entrySet()) {
            int temp = entry.getKey();
            Set<String> locations = entry.getValue();

            if (locations.size() > 1) {
                System.out.println("Locations with temperature " + temp + "°C: " + temperature);
            }
        }
	}

}*/
