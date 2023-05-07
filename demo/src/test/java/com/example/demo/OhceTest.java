package com.example.demo;

import java.util.Calendar;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class OhceTest {

    @Test
    public void testOhceGreetings(){
             
        Calendar calendar = Calendar.getInstance();

        int currenthour = calendar.get(Calendar.HOUR_OF_DAY);

        Ohce ohce = new Ohce("Davide");

        if (currenthour >= 20 || currenthour < 6) {
            Assertions.assertEquals("¡Buenas noches Davide!",ohce.greet()); // Testing von Uhrzeit und Begrüssung
        } else if (currenthour >= 6 && currenthour < 12){
            Assertions.assertEquals("¡Buenas días Davide!",ohce.greet());
        } else {
            Assertions.assertEquals("¡Buenas tardes Davide!",ohce.greet());
        }
    }

    @Test
    public void testOhceWord1() {
        Ohce ohce = new Ohce("Davide");
        Assertions.assertEquals("olleh", ohce.revertInput("hello")); // Testing normales Wort 
    }

    @Test
    public void testOhceWord2() {
        Ohce ohce = new Ohce("Davide");
        Assertions.assertEquals("olleH", ohce.revertInput("Hello")); // Tesing von Gross- Kleinschreibung 
    }

    @Test
    public void testOhceWord3() {
        Ohce ohce = new Ohce("Davide");
        Assertions.assertEquals("321", ohce.revertInput("123")); // Eingaben von Zahlen 
    }

    @Test
    public void testOhceWord4() {
        Ohce ohce = new Ohce("Davide");
        Assertions.assertNotEquals("???!!!", ohce.revertInput("???!!!")); // Eingabe von Sonderzeichen 
    }

    @Test
    public void testOhcePalindrom1() {
        Ohce ohce = new Ohce("Davide");
        Assertions.assertEquals("anna ¡Bonita palabra!", ohce.revertInput("anna")); // Eingaben von Palindrom 
    }

    @Test
    public void testOhcePalindrom2() {
        Ohce ohce = new Ohce("Davide");
        Assertions.assertEquals("annA ¡Bonita palabra!", ohce.revertInput("Anna")); // Eingabe von Palindrom mit uppercase
    }

    @Test
    public void testOhcenoinput() {
        Ohce ohce = new Ohce("Davide");
        Assertions.assertEquals("", ohce.revertInput("")); // Was passiert bei gar keinem Input? Erwarter: Programm crashed nicht
    }

    @Test
    public void testOhceSpacebar() {
        Ohce ohce = new Ohce("Davide");
        Assertions.assertEquals(" ", ohce.revertInput(" ")); // Was passiert bei einem Leehrschlag ? 
    }

    @Test
    public void testStop(){
        Ohce ohce = new Ohce("Davide");
        Assertions.assertEquals("Adios Davide", ohce.stop()); // Stop testen mit Name
    }
    
}
