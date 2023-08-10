public class Bank {
    public static void main(String[] args) {
        Person person1 = new Person();
        Person person2 = new Person();

        person1.firstName = "Andrzej";
        person1.lastName = "Kowalski";
        person1.pesel = "123456789";

        person2.firstName = "Rafał";
        person2.lastName = "Zagórski";
        person2.pesel = "65031825563";

        Address address1 = new Address();
        Address address2 = new Address();

        address1.addressCity = "Wrocław";
        address1.addressPostCode = "51-121";
        address1.addressStreet = "ul. Ruska";
        address1.addressHouseNo = "12";
        address1.addressFlatNo = "3";

        address2.addressCity = "Warszawa";
        address2.addressPostCode = "01-215";
        address2.addressStreet = "ul. Biała";
        address2.addressHouseNo = "2";
        address2.addressFlatNo = "13";

        person1.registerAddress = address1;
        person1.livingAddress = address1;
        person2.livingAddress = address1;
        person2.registerAddress = address2;






        BankAccount account1 = new BankAccount();
        BankAccount account2 = new BankAccount();

        account1.owner = person1;
        account2.owner = person2;
        account1.balance = 10_000;
        account2.balance = 9_000;

        Credit credit1 = new Credit();
        Credit credit2 = new Credit();

        credit1.borrower = person1;
        credit2.borrower = person2;

        credit1.cashBorrowed = 5_000;
        credit1.cashReturned = 0;
        credit1.termMonths = 12;
        credit1.interestRate = 0.10;

        credit2.cashBorrowed = 0;


        System.out.println("Osoba: " + person1.firstName + " " + person1.lastName + " "
                + person1.pesel + " "
                + " Mieszka w " + address1.addressCity + ","
                + " Stan konta: " + account1.balance + "PLN"
                + " Posiada kredyt na kwotę: " + credit1.cashBorrowed + "PLN" );

        System.out.println("Osoba: " + person2.firstName + " " + person2.lastName + " "
                + person2.pesel + " "
                + " Mieszka w " + address1.addressCity + ","
                + " Stan konta: " + account2.balance + "PLN"
                + " Posiada kredyt na kwotę: " + credit2.cashBorrowed + "PLN" );



    }
}