package rekyrsiia;
// рекурсивные функции в java – это функции, которые вызывают сами себя.
public class RekyrsiiaPrimer {
    int factR ( int n) {
        int result;
        if (n == 1) return 1;
        result = factR(n - 1) * n;      //Snachala vipolniaetsia vizov metoda s parametrami (n-1), kogda rezyltat vozvraschaetsia
        System.out.println(result);     //to mnozzetsia na 2.
        return result;
    }





    public static void main(String[] args) {
       RekyrsiiaPrimer obT=new RekyrsiiaPrimer();
        System.out.println(obT.factR(10));
    }
}

//intrestnii kod
//kogda nachenaetsia vipolnenie metoda mi vstrechaem instrykciy if (n==1) return 1; t.e. esli n=1 vernyt 1; i metod zavershen.
//k primery n=10; znachit dannie yslovie =false i metod vipolniaetsia dalshe.
//result = factR(n-1) * n; Kak vidim zdes virazzenie sostoit iz 2-x chastei:pervaia eto vizov metoda- factR(n-1)
// vtoraia eto ymnizzenie rezyltata (polychennogo v xode vizova metoda) * n;
// zdes v pervyy ochered vipolniiaetsoa pervaia chast virazzeniia: factR(n-1) <--vizov metoda.
// t.e. sledyyschii shag eto: berem 10 otnimaem 1 i snova idem vipolniat etod metod snachala.
//Ochen vazzno ponimat chto predidyschii vizov ne zavershen, a kak-bi preostanovlen do vipolnenie tekyschego proxozzdenie metoda
//pri etom znachenie naxodiascheesia v peremennoi/ix ne ytracheno a zapisano v pamiati kak bi zzdyt. n=10 <--v pamiati
//itak seichas n=9 i mi snova proxodim vipolnenie metoda s nachala
//if(n==1) return 1; opiat daet nam false i mi idem dalshe i opiat vstrechaem
//result = factR(n-1) * n; i tak-zze kak v proshlii raz vipolniaetsia tolko factR(n -1) <--tolko vizov metoda.
//pri etom tekyschee vipolnenie opiat zze ne zakanchivaetsia, a so vsemi peremennimi (n=9) zapominaetsia i stavitsia napayzy,
// no kak bi poverx predidyschego.
// itak y nas yzze 2 "potoka" kotorie vipolniali danni metod stoiat "na payze" pervii (gde n=10) i vtoroi (gde n=9).
// No metod ne zavershen. I prodolzaetsia yze s znacheniem peremennoi n=8. Tak bydet poka n!=1;
// kak tolko n=1; Xod vipolneniia programmi peredaetsia instrykcii return 1; kotoraia zavershaet tekyschee vipolnenie
// metoda i vozvraschaet kyda-to 1, pri etom "potok" kotorii vipolnial metod gde n=1, on zavershen.No y nas ostalsia
// stek s predidyschimi "potokami" dannogo metoda.Dannaia edinica vozvraschaetsia imenno v takoi "potok", kotorii
// stoit s samogo verxa, a eto tot gde n=2. Proisxodit vipolnenie potoka gde n=2;, tak-kak v dannom "potoke" xod
// vipolneniia programmi bil zavershen na instrykcii result= facgR (n-1) * n; a imenno na vichislenii pervoi chasti
// dannogo virazzeniia -factR (n-1), teper dannaia chast vipolnena i nam vernylsia rezyltat, v vide 1.
// Xod vipolneniia programmi vozobnovliaetsia s instrykcii gde polychenni rezyltat ymnozzaetsia na n .
// t.e. result=1*2;
// vipolnenie programmi prodolzzaetsia, i sledyyschaia instrykcia
// return result zavershaet danni potok (gde n ravnialos 2 ). No
// V steke y nas esche kycha ne zavershennix potokov, v chasnosti sledyyschii na ocheredi potok gde n=3 imenno syda popodaet
// nash result kotorii raven 2, vot mi i polychaem dalneishee vipolnenie progeammi yzze v etom (gde n=3) "potoke", t.e.
// result= factR(n-2) * n. eto ravnoznachno: result = 2 * 3; Nash result =6, dalee opiat-zze idet instrykcia return result;
// kotoraia zavershaet metod, no v nashem slychae ona zavershaet "potok" gde n=3 i peredaet result=6 dalshe v stek.
// Sledyyschii na ocheredi potok imeet peremennyy n=4; Vipolniaytsia te-zze instrykcii
// result= factR(n-2) * 4. eto ravnoznachno: result = 6 * 4; polychaem =24, etot result peredaetsia dalshe.
// Kogda "potokov" v ocheredi vipolneniia bolshe ne bydet i bydet zaversheno vipolnenie "potoka" gde n=10 to polychenni
// result bydet vozvrashen v messto  vizova metoda t.e. v main.
//
//стек вызовов – практически неконтролируемый ресурс и при разных условиях вызова одной и той же рекурсивной функции,
// мы можем получить или не получить проблемы, связанные с этим ресурсом.
// A chto takoe stek vizovov?


