package some_classes.Comparator;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Random;
//Est klass Primer_1_S_List. Esli nam nado kakto otsortirovat konteiner gde lezzat nashi Messages
//mozzno naverno poiti raznimi pytiami, no v List est metod sort kotorii prinimaet ob`ekt
//ot klassa comparator.
//Sozdadim klass kotorii bydet realizovivat interfeis comparator, interfeis dolzzen bit
// tipizirovan tem klassom na kotorom mi xotim ego ispolzovat t.e. <Primer_1_S_List>,
// mozzno ispolzovat bezimian-nii klass kak v primere. V pereopredelennom metode idet
// sravnenie int-ovix polei, ispolzyetsia metod compareTo opredelenni v Integer.
//Posle sozdaniia klassa kotorii realizyet interfeis Comparator, i pereopredeleniia metoda
//compare v etom klasse. V main sozdat ob`ekt dannogo klassa (zdes comparator) i peredat
//danni comparator v parametri metoda sort, vizvannogo na List-e.

//V obschem kogda nado kak-to po osobomy/originalnomy otsortirovat kakoito konteiner
//mozzno sozdat comparator
public class Primer_1_S_List {
    private String message;
    private int id;

    public Primer_1_S_List(String message) {
        this.message = message;
        this.id = new Random().nextInt(1000);
    }
    public String getMessage() {
        return message;
    }
    public Integer getId() {
        return id;
    }
    public String toString() {
        return "[" + id + "] " + message;
    }

    public static void main(String[] args) {
        List<Primer_1_S_List> messages = new ArrayList();
        messages.add(new Primer_1_S_List("Hello, World!"));
        messages.add(new Primer_1_S_List("Hello, Sun!"));
        messages.add(new Primer_1_S_List("Privet komparator!"));
        messages.add(new Primer_1_S_List("Privet vsem"));
        System.out.println(messages);

        Comparator<Primer_1_S_List> comparator = new Comparator<Primer_1_S_List>(){
            public int compare(Primer_1_S_List o1, Primer_1_S_List o2) {
                return o1.getId().compareTo(o2.getId());
            }
        };
        messages.sort(comparator);
        System.out.println(messages);

    }
}
