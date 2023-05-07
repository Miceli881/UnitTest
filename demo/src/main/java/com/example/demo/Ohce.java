package com.example.demo;
import java.util.Calendar;

public class Ohce {

    public String name;

    public Ohce(String name) {
        this.name = name;
    }

    public String greet(){
       Calendar calendar = Calendar.getInstance();
        //System.out.print(calendar.get(Calendar.HOUR_OF_DAY));
        int currenthour = calendar.get(Calendar.HOUR_OF_DAY);
        if (currenthour >= 20 || currenthour < 6) {
            return "¡Buenas noches " + this.name+"!";
        } else if (currenthour >= 6 && currenthour < 12){
            return "¡Buenos dias " + this.name+"!";
        } else {
            return "¡Buenas tardes " + this.name+"!";
        }
    }

	public String revertInput(String input){
		String reverted ="";
        input = input.trim();
        
        if (input.isEmpty()) {
            return "";
        }

        for (int i = input.length(); i>0; i--) {
            char c = input.charAt(i-1);
            reverted += c;
        }
        if (reverted.equalsIgnoreCase(input)) {
            return reverted + " ¡Bonita palabra!";
        }
        
        return reverted;
        
	}

public String stop() {
        return "Adios " + this.name;
    }
}