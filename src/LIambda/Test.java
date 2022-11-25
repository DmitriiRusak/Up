package LIambda;

import javax.naming.spi.DirStateFactory;

public class Test {
    public void liambdaExoerement(){
        System.out.println("***EEEYYY IT`S COMING***");

    }
    private static String string="HAPPY NEW YEAR ";


            public void testsMethod (Person p){
                int e=2022;

                CheckPerson obj;   //sozdaem vne liambdi ctob mozzno ispolzovat v tele metoda

                obj = w -> {       //liambda.   zdes mi propisivaem sam metod (realizaciia metoda ykazannogo v interfaise)
                    System.out.println("liambda1");//v liambda nazvanie metoda ne ykazivaetsia, tak kak metod y interfaisa odin
                    return true;                  // k state poetomu mozzet liambda i rabotaet tolko s FUNCTIONAL INTERFACE
                };

                CheckPerson obj1;

                obj1 = w -> {
                    System.out.println("ETO LIAMBDA #2");
                    System.out.println(e+" "+string);
                    liambdaExoerement();
                    return true;
                };
                // realizacii metoda interfaisa mozzer bit skolko xochesh t.e. liambd mozzet bit ne odna
                // (sootvetstvenno i ssilok interfaisnix dolzno bit po odnoi na kazzdyy realizaciy).
                obj.test(p);    //zdes vizivaem metod interfaica s pervoi (ssilka obj) realizaciei
                obj1.test(p);   //zdes vizivaem metod interfaica s vtoroi (ssilka obj17) realizaciei

        }
}

//ves zamyt s liambdami krytitsia vokryg "FANCTIONAL INTERFACE", liambda zatochena pod realizaciy odnogo metoda
//Snachala interfacenyy ssilky zatem = parametr, (takoi zze kak v interfaice i s takim zze kolichestvom),
// operator (->) { block instrykcii.
// esli instrykcia odna mozzno bez {}