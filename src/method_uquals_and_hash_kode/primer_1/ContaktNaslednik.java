package method_uquals_and_hash_kode.primer_1;

import method_uquals_and_hash_kode.primer_1.Contakt;

import java.util.ArrayList;
import java.util.HashSet;

public class ContaktNaslednik extends Contakt {


    public ContaktNaslednik(int id, String name, String phone) {
        super(id, name, phone);
    }

    public static void testEquals(){
        Contakt contakt=new Contakt(1,"Roma","123456789");
        Contakt contakt1=new Contakt(1,"Roma","123456789");
        System.out.println(contakt.hashCode()+"\n"+contakt1.hashCode());
        System.out.println(contakt.equals(contakt1));
    }
    /*
    *
     */
    public static void testEquals1(){
        Contakt contakt=new Contakt(1,"Roma","123456789");
        Contakt contakt1=new Contakt(1,"Roma","123456789");

        ArrayList<Contakt>contakts=new ArrayList<>();
        //contakts.add(contakt);
        contakts.add(contakt1);
        System.out.println(contakts.contains(contakt));
        contakts.remove(contakt);

        System.out.println(contakts.size());
    }
    /*
    *
     */
    public static void testEquals2(){
        Contakt contakt=new Contakt(1,"Roma","123456789");
        Contakt contakt1=new Contakt(1,"Roma","123456789");

        HashSet<Contakt>contaktH=new HashSet<>();
        contaktH.add(contakt);
        contaktH.add(contakt1);
        System.out.println(contaktH.size());
    }
}
