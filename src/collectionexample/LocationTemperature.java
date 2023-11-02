package collectionexample;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class LocationTemperature {

    public static void main(String[] args) {
        Map<String, Integer> locationTemperatures = new HashMap<>();

        // Add locations and their temperatures to the HashMap
        locationTemperatures.put("Location1", 25);
        locationTemperatures.put("Location2", 30);
        locationTemperatures.put("Location3", 25);
        locationTemperatures.put("Location4", 20);
        locationTemperatures.put("Location5", 30);

        // Find locations with the same temperature
        Map<Integer, Set<String>> temperatureToLocations = new HashMap<>();

        for (Map.Entry<String, Integer> entry : locationTemperatures.entrySet()) {
            String location = entry.getKey();
            int temperature = entry.getValue();

            if (!temperatureToLocations.containsKey(temperature)) {
                temperatureToLocations.put(temperature, new HashSet<>());
            }

            temperatureToLocations.get(temperature).add(location);
        }

        // Print locations with the same temperature
        for (Map.Entry<Integer, Set<String>> entry : temperatureToLocations.entrySet()) {
            int temperature = entry.getKey();
            Set<String> locations = entry.getValue();

            if (locations.size() > 1) {
                System.out.println("Locations with temperature " + temperature + "°C: " + locations);
            }
        }
    }
}
