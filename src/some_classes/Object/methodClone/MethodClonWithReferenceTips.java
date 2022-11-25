package some_classes.Object.methodClone;

//V Book EST OB`EKT OT Autor DLIA CLONIRIVANIIA OB`EKTA Book PEREOPREDELIAEM V NEM METOD CLONE + REALIZYEM
//Clonable INTERFACE (tak-kak POLZYEMSIA REALIZACIEI PO YMOLCHANIY OT some_classes.Object ), TAKZZE NADO PEREOPREDELIT
// METOD Clone(); V Autor TAK KAK OB`EKT Autor VXODIT V SOSTAV (KOMPOZICIIA) OB`EKTA Book. ESLI ETOGO NE ZDELAT
//TO OB`EKT Book I EGO CLON Book1 BYDYT IMET PO ODNOI SSILKE NA ODIN I TOTZZE OB`EKT Autor.
// REALIZACIIA OBRATNO-ZZE PO YMOLCHANIY NEZABIVAEM PRO Cloneable

public class MethodClonWithReferenceTips {
    public static void main(String[] args) throws CloneNotSupportedException{
        //Autor autor=new Autor("Geroi nashego vremeni");
        Book book=new Book(929,"Geroi nashego vremeni");
        System.out.println(book.hashCode());
        Book book1=book.clone();
        System.out.println(book1.hashCode());

        System.out.println("XESH- KOD avtora ot book "+book.getAutor().hashCode());
        System.out.println("XESH-KOD avtora ot book1 "+book1.getAutor().hashCode());

    }
}



class Book implements Cloneable{
    int numberOfPages;
    Autor autor;

    public Book(int a, String name) {
        this.numberOfPages = a;
        this.autor = new Autor(name);
    }

    /*
    *
    *
     */

    public Book clone() throws CloneNotSupportedException {
        Book book=(Book)super.clone();
//                                mozzno tak sozdat ob`ekt Autor
        //book.autor= autor.clone();       //<- eto sintaksis po obrascheniy k .clone ssilochnogo tipa Autor
        //                     esli v ob`ekte est esche ob`ekti to eti ob`ekti toze nado po ocheredi clonirovat
        //                       a mozzno i tak sozdat ob`ekt Autor
        Autor autor1=this.getAutor().clone();
        book.setAutor(autor1);

        return book;

    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }
}






class Autor implements Cloneable{
    String name;

    public Autor(String name) {

        this.name = name;
    }
    /*
    *
    *
     */
    @Override

    protected Autor clone() throws CloneNotSupportedException {
        Autor autor=(Autor) super.clone();
        return autor;
    }
}