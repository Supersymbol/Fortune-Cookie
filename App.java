/* Menu Script {ART 3} */public class App {
    public static void main(String[] args) throws Exception {
        /*Linking Variables from Fortune and Person*/
        Person person = new Person();
        Fortune fortune = new Fortune();
        person.setFirstName();
        person.getLastName();
        person._age();
        person._birthMonth();
        person._siblings();
        person._favColor();

        /*Calling Out My Variables */
        int age = fortune._age(person._age);
        int birthMonth = fortune._birthMonth(person._birthMonth);
        int retire = fortune._retirementYRs;
        String firstName = fortune._firstName(person._firstName);
        String lastName = fortune._lastName(person._lastName);
        String vacationHome = fortune.vacationHome;
        String transportationType = fortune.transportationType;
        double Balance = fortune.Banlance;

        /*User's Fortune Results */
        System.out.println(firstName + lastName + " will retire in " + retire +
                " years, with $" + Balance + " in the bank, a vacation home in " +
                vacationHome + ", and travel by " + transportationType + ".");
    }
}
