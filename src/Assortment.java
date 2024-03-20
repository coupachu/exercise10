import java.util.ArrayList;
import java.util.Iterator;

public class Assortment implements Iterable<Contact>{
    public ArrayList<Contact> myList = new ArrayList<>();

    public Assortment() {
    }

    @Override
    public String toString() {
        return "Assortment{" +
                "myList=" + myList +
                '}';
    }
    public void addContact(Contact a){
        myList.add(a);
    }

    @Override
    public Iterator<Contact> iterator() {
        return myList.iterator();
    }
}
