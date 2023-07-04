
public class Fortune {
    /* Calling Out My Variables */
    Person person = new Person();
    String transportationType = "";
    String color = person._favColor;
    String vacationHome;
    int _retirementYRs;
    int age = person._age;
    int birthMonth = person._birthMonth;
    int siblings = person._siblings;
    double Banlance;

    // Years until retirement
    public void setretire(int retire) {

        if (age % 2 == 0) {
            retire = 12;
        } else if(age % 1 ==0){
            retire = 14;
        } else {
        this._retirementYRs = retire;
        }
        


        // Vacation Home Location
        if (siblings == 0) {
            vacationHome = "Boca Raton, FL";
        } else if (siblings == 1) {
            vacationHome = "Nassau, Bahamas";
        } else if (siblings == 2) {
            vacationHome = "Ponta Negra, Brazil";
        } else if (siblings == 3) {
            vacationHome = "Portland, Oregon";
        } else if (siblings > 3) {
            vacationHome = "Baton Rouge, Louisiana";
        } else {
            vacationHome = "Chernobyl, Ukraine";
        }

 // Mode of Transportation
        if (color.equalsIgnoreCase("Red")) {
            transportationType = "Maserati";
        } else if (color.equalsIgnoreCase("Orange")) {
            transportationType = "Stallion";
        } else if (color.equalsIgnoreCase("Yellow")) {
            transportationType = "Chariot";
        } else if (color.equalsIgnoreCase("Green")) {
            transportationType = "Taxi";
        } else if (color.equalsIgnoreCase("Blue")) {
            transportationType = "Rickshaw";
        } else if (color.equalsIgnoreCase("Indigo")) {
            transportationType = "Motor Scooter";
        } else if (color.equalsIgnoreCase("Violet")) {
            transportationType = "Flying Saucer";
        }


        //BalanceBy B-Day Month
    if(birthMonth>0||birthMonth<=4)
    {
        Banlance = 256000.76;
    }else if(birthMonth>=5||birthMonth<=8)
    {
        Banlance = 3687105.42;
    }else if(birthMonth>=9||birthMonth<=12)
    {
        Banlance = 86.23;
    }else
    {
        Banlance = 0.00;
}
}
}
