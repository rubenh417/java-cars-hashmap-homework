package hashmap;

import java.util.HashMap;
import java.util.Map;
 
public class hashmap {
 
    public static void main(String[] args) {
        Map<String, Integer> vehicles = new HashMap<>();
 
        
        vehicles.put("Kia",6);
        vehicles.put("Chevrolet", 7);
        vehicles.put("Audi", 0);
        vehicles.put("Fiat", 10);
 
        System.out.println("Total vehicles: " + vehicles.size());
 
    
        for (String key : vehicles.keySet())
            System.out.println(key + " - " + vehicles.get(key));
        System.out.println();
 
        String searchKey = "Fiat";
        if (vehicles.containsKey(searchKey))
            System.out.println("We don't have Audi, but we have " + vehicles.get(searchKey) + " " + searchKey + " cars!\n");
 
    
        vehicles.clear();
       
    }
}