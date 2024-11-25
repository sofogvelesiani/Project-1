package org.example;

public class Length {
    String text = "me mikvars avtomatizacia";

    public void setAge() {
        int sigrdze = text.length();

        if (sigrdze % 2 == 0) {
            System.out.println("სტრიქონის სიგრძე არის ლუწი");
        } else {
            System.out.println("სტრიქონის სიგრძე არის კენტი");
        }
    }
}
