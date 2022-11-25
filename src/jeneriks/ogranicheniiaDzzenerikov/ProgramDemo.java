package jeneriks.ogranicheniiaDzzenerikov;

public class ProgramDemo {
    public static void main(String[] args) {
        ForJeneriks obj = new ForJeneriks(2.2, 10);//mozzno podstavit lyboi tip bez opredeleniia
        // v <...> dzzenerikax. xochesh String ili Integer, double ...
        ///////////////////////////***********************//////////////////////////////////////////////////

        // A MOZZNO I STROGO TIPIZIROVAT, KAK POKAZANO NIZZE
//                  String
        ForJeneriks<String> forJen =new ForJeneriks<String>("privet",11);

/////////////////////////////////////////////////////////////////////////////////////////////////////////////

        ForOgranichenii obj1=new ForOgranichenii(2,20);
        ForOgranichenii obj2=new ForOgranichenii("2",20);
        String str="opa";

//////////////////////////////////////////////////////////////////////////////////////////////////////////////
//ob`ekt klassa OneMore mozzno sozdavat tolko s pomosch`y ob`ektov klassa ForJeneriks ili ego naslednikov

        OneMore oneMore=new OneMore(obj);
        oneMore.doMethod();
        OneMore oneMore1=new OneMore(obj2);
        oneMore1.doMethod();
//        OneMore oneMore2=new OneMore(str); MOZZNO SOZDAT TOLKO S OB`EKTAMI PROPISANNIMI V KONSTRYKTORE
//        KLASSA OneMore T.E. <T extends ForJeneriks>.
    }
}