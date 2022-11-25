package all_about_methods.metodi_s_peremennim_chislom_argymentov;
// metod s peremennim chislom argymentov (parametrov).
// sintaksis: public void nazvanieMetoda(int ... someVariable){...}
// v takoi metod mozzno peredovat: odny peremennyy, neskolko peremennix, ispolzovat metod bez argymentov(bez peremennix)
// v tele metoda obrabativat takie parametri sledyet kak massiv elementov zadannogo tipa.
// pri ispolzovanii v metode parametrov peremennoi dlinni ix mozzno kombinirovat s drygimi parametrami (obichnimi), glavnoe
// yslovie, chtobi parametri peremennoi dlinni stoiali poslednimi. Naprimer: public void metod(int a, int ... val);
// ili (String str, int a, int ...val);
// Takzze dannogo roda metodi mozzno peregryzzat, ispolzyia pri etom obichnii sintaksis iazika. No est odin moment,
// Dopystim est metod(int ...a); i metod(boolean ... a); dannie metodi peregryzzeni korrektno NO pri vizove dannogo
// metoda bez parametrov koompiliator vidast oshibky. Tak-kak oba metoda modxodiat po ysloviy i ne poniatno kakoi vizivat ??? )
//переменное количество аргументов допускает и полное их отсутствие, так что в этом отношении все нормально. Однако приведенный
// выше вызов не может быть однозначно интерпретирован , поскольку ему соответствуют обе перегруженные версии метода
// V sledyyschem primere tak-zze bydet neopredelennost
// metod(int i, int ... a);  metod(int ...a);
// esli vizvat takoi metod bez parametrov koompiliator ne poimet kakoi nado ispolniat.Blia ia proveril i vse rabotaet korektno
// esli podymat to kogda vizivaesh metod bez porametrov to dolzzen vizvatsia tot y kotorogo tolko parametri s peremennoi dlinnoi
// ved tolko ego mozzno vizivat bez parametrov, a y drygogo est dobavochnaia peremennaia int i. Vidno primer iz knigi ystarel xz.
// Blia, chitat nado vnimatelnei, nerazberixa bydet pri vizove dannogo metoda vot tak --> metod(1);
// Proveril, deistvitelno v takom slychae koompiliator vidaet oshibky, ny da, neponiatno kakoi metod vizivat, oba podxodiat.
public class MultiPorametr {

    public void method(int ... variable){

        if(variable.length==0){
            System.out.println("v peremennoi parametra net elementov");
        }
        else if(variable.length>0){
            System.out.print("v peremennoi "+variable.length+" elementov: ");
            for (int i=0;i<variable.length;i++){
                System.out.print(variable[i]+", ");
            }
        }
        System.out.println();
    }
    /*
    *
     */
    public void method(String str, int ... variable){
        //  peregryzzka s drygimi parametrami...
    }
    class NeopredelennostPriPeregryzkeMetodov{

        public void metod(int...a){
            System.out.println("vizov metoda s parametrom int");
            //...
        }
        /*
        *
         */
        public void metod(boolean...booleans){
            System.out.println("vizov metoda s parametrom boolean");
            //...
        }
    }
}
class RunnerMultiPorametr{
    public static void main(String[] args) {
        int array[]={1,5,7,34,};
        MultiPorametr multiPorametr=new MultiPorametr();
        multiPorametr.method(123);
        multiPorametr.method(array);

        MultiPorametr.NeopredelennostPriPeregryzkeMetodov innerClass=multiPorametr.new NeopredelennostPriPeregryzkeMetodov();
        //innerClass.metod();       //vizvat danni metod bez parametrov neydastsia tak-kak ysloviy sootvetstvyyt oba metoda. Oshibka.
    }
}
