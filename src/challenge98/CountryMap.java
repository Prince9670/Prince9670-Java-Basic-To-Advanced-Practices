package challenge98;

import java.util.*;

public class CountryMap {

    public static void main(String[] args) {
        Map<String, String> countryMap = new HashMap<>();
        countryMap.put("Bharat", "New Delhi");
        countryMap.put("china", "Beijing");
        countryMap.put("Pakistan", "Islamabad");
        countryMap.put("Bangladesh", "Dhaka");

        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the country name : ");
        String country = sc.next();
        if(countryMap.containsKey(country)){
            System.out.printf("Capital of %s", country, countryMap.get(country));
        }else {
            System.out.printf("Sorry We don't know the capital");
        }
    }

}
