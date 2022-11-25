package some_classes.Sring;
//metod vozvraschaet novuy String.
// V pervom parametre nado ykazat index ot kyda nado
//nachenat formirovat novyy stroky, v vtorom parametre index na kotorom formirovanie
//novoi stroki zakanchivaetsia. No po fakty okonchanie zavershitsia na -1 index men-
//she.
public class Metod_Substring {
    public static void main(String[] args) {
        String str="Katyshka";
        int a=0;
        for(int i=1;i<=str.length();i++,a++){
            System.out.print(str.substring(a,i)+" ");
        }
        System.out.println();
//Naprimer nado vivesti odin simvol 't', logichno bilo bi ykazat index nyzznogo simvola '2',
//kak nachala novoi String i etot-zze index '2' v kachestve poslednego simvola v novoi stroke.Nam ved nado tolko 1 simvol.
//No po fakty snachala ykazivaem index zzelaemogo simvola a vtoroi parametr
//otvechayschii za poslednii simvol novoi stroki mi ykazivaem na 1 bolshe. Tak rabotaet metod, vnytri on otnimaet -1.ot
//vtorogo parametra.
        System.out.println(str.substring(2,3));

    }
}
