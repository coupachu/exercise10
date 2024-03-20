// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
    Contact contact1 = new Contact("john", "john@johnmail.john");
    Contact contact2 = new Contact("johnny", "johnny@johnmail.john");
    Assortment contactList = new Assortment();
    contactList.addContact(contact1);
    contactList.addContact(contact2);

    for(Contact a: contactList){
        System.out.println(a);
    }
    }
}