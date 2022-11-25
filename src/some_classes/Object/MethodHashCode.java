package some_classes.Object;
// Esli po logike programmi nado sravnivat ob`ekti i esli polia y ob`ektov odinakovie i nado chtob coompiliator videl
//takie ob`ekti kak odinakovie to nyzzno pereopredelit metod hashCode() takim sposobom chtob on bil osnovan na
//znacheniiax peremennix ekzempliara, t.e. esli polia odinakovi to i ob`ekti odinakovi.
//METOD hashCode() NYZZNO PEREOPREDELIAT V SVOEM KLASSE, ob`ekti kotorogo mi i xotim sravnit.

//hashCode(). Зачем он нужен? для  — сравнения объектов. Но ведь у нас уже есть equals()! Зачем же еще один метод?
// Ответ прост: для повышения производительности.
// В Java метод hashCode() возвращает для любого объекта 32-битное число типа int,для любого объекта.
//Сравнить два числа между собой — гораздо быстрее, чем сравнить два объекта методом equals(),
// особенно если в нем используется много полей
// Если в нашей программе будут сравниваться объекты, гораздо проще сделать это по хэш-коду,
// и только если они равны по hashCode() — переходить к сравнению по equals()..

//И так же, как для equals(), для метода hashCode() есть официальные требования, прописанные в документации Oracle:
//  1-) Если два объекта равны (т.е. метод equals() возвращает true), у них должен быть одинаковый хэш-код.
//  2-) Если метод hashCode() вызывается несколько раз на одном и том же объекте, каждый раз он должен
//      возвращать одно и то же число.
//  3-) Одинаковый хэш-код может быть у двух разных объектов.

//Такая ситуация (совпадение хэш-кодов у двух разных объектов) называется коллизией.
public class MethodHashCode {

    public static void main(String[] args) {
        Ferst ferst = new Ferst(1, "pervii","iz pervix");
        Ferst ferst1=new Ferst(1, "pervii","iz pervix");
        System.out.println(ferst.hashCode()+" "+ferst1.hashCode());
    }
}
class Ferst{

    private int i;
    private String name;

    private String lastName;


    public Ferst(int i,String name,String lastName){
        this.i=i;
        this.name=name;
        this.lastName=lastName;
    }

    @Override
    public int hashCode(){
        //i.hashCode <- takogo nebivaet tak-kak y primitivov net metoda hashCode
        //name.hashCode <-takoi metod pereopredelen v klasse String poetomy vse rabotaet i etim mozz-
        //no polzovatsia pri pereopredelenii svoego hashCode metoda.Naprimer peremnozzat ix ili skla
        //divat-ne vazno, vazzno polychit ynikalnoe znachenie.
        return  i*name.hashCode()+lastName.hashCode();
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Ferst)) return false;
        Ferst ferst = (Ferst) o;
        return i == ferst.i && name.equals(ferst.name) && lastName.equals(ferst.lastName);
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }
}