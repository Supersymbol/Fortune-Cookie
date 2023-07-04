import java.util.Scanner;

public class Person {
    /* TheseAre My call-Out Variables */
    private String _firstName;
    private String _lastName;
    public String _favColor;
    int _age;
    int _birthMonth;
    int _siblings;

    public String getFirstName() {
        return _firstName;
    }

    public void setFirstName(String firstName) {
        /*
         * Restricting The 1st Name Char by 50; name cannot be longer than 50 Char long
         */
        if (firstName == null || firstName.length() >= 50) {
            System.out.println("First name can not be greater 50 char or null");
        } else {
            this._firstName = firstName;
        }
    }

    public String getLastName() {
        return _lastName;
    }

    public void setLastName(String lastName) {
        /*
         * Restricting The 1st Name Char by 50; name cannot be longer than 50 Char long
         */
        if (lastName == null || lastName.length() >= 50) {
            System.out.println("Last name can not be greater 50 char or null");
        } else {
            this._lastName = lastName;
        }
    }

    /* Trying to call out the age int */
    public void setageString(int ageString) {
        /* Limiting the age range from 0 to 150 */
        if (ageString <= 150 || ageString > 0) {
            System.out.println("How Old Are You?: ");
        } else {
            this._age = ageString;
        }
    }

    /* Trying to call out the Birth Month as integer */
    public void setBirthMonth(int birthMonth) {
        /* Limiting the Month Numb range from 0 to 12 */
        if (birthMonth <= 12 || birthMonth > 0) {
            System.out.println("What Month Were You Born?: ");
        } else {
            this._birthMonth = birthMonth;
        }
    }

    /* Trying to call out the Numb of siblings as integer */
    public void setsiblings(int siblings) {
        /* Limiting the Month Numb range from 0 to 12 */
        if (siblings <= 13 || siblings >= 0) {
            System.out.println("How Many Siblings Do You Have?: ");
        } else {
            this._siblings = siblings;
        }
    }

    public void setFavColor(String color) {
        /* Asking the User For their Fav-Color based on ROYGBIV */
        System.out.println("What Is Your Favorite ROYGBIV Color?: ");
        /* Using A While TO Verify Each Response */
        boolean exitLoop = false;
        while (!exitLoop) {
            Scanner scanner = new Scanner(System.in);
            color = scanner.nextLine();

            /* If/Else Statement based on the response */
            if (color == "Red") {
                this._favColor = color;
            } else if (color == "Orange") {
                this._favColor = color;
            } else if (color == "Yellow") {
                this._favColor = color;
            } else if (color == "Green") {
                this._favColor = color;
            } else if (color == "Blue") {
                this._favColor = color;
            } else if (color == "Indigo") {
                this._favColor = color;
            } else if (color == "Violet") {
                this._favColor = color;
                /*
                 * If user Doesn't Know what ROYGBIV Is they Can Always Type Help To Get A Minor
                 * Understanding Of The Abbreviation
                 */
            } else if (color == "Help") {

                System.out.println(
                        "ROYGBIV Are The 7 Colors Of The Rainbow; Which Stands for Red, Orange, Yellow, Green, Blue, Indigo, Violet."
                                + "\n" + "So What Is Your Fav-Color: ");
                this._favColor = color;
                System.out.println("You Choose" + color + "As Favorite Color");

                scanner.close();
                exitLoop = true;
            }
        }
    }
}