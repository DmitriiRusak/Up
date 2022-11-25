package operatori.pobitavie_operatori.yprozzneniia;

//Naznachenie: vivodit bait kod lybogo chisla tipa ---int---
//no, ia dymay chto mozzno peredelat pod tip ---long--- i t.d.

public class ShowBaitCodeOfAnyNamber {
    int numberOfBits;

    public ShowBaitCodeOfAnyNamber(int numberOfBits) {
        this.numberOfBits = numberOfBits;
    }

    public void showBaitCodeOf(int numberToShowBait_KOD) {
        int mask = 1;
        int spacer1 = (8 - ((this.numberOfBits + 1) % 8)) == 8 ? 0 : 8 - ((this.numberOfBits + 1) % 8);//poiasnenie nizze
        mask <<= this.numberOfBits;
       // System.out.println("mask " + mask + " = " + Integer.toBinaryString(mask));
        //System.out.println("numberToShowBait_KOD " + numberToShowBait_KOD + " =      " + Integer.toBinaryString(numberToShowBait_KOD));
        for (int i = 0; i <= this.numberOfBits; i++) {
            String str = (mask & numberToShowBait_KOD) == 0 ? "0" : "1";
            System.out.print(str);
            mask >>>= 1;
            spacer1++;
            if (spacer1 >= 8) {
                System.out.print(" ");
                spacer1 = 0;
            }

        }

    }

    public static void main(String[] args) {
        ShowBaitCodeOfAnyNamber trenia = new ShowBaitCodeOfAnyNamber(31);
        trenia.showBaitCodeOf(10);
        System.out.println("\n**********************************");
        ShowBaitCodeOfAnyNamber trenia1 = new ShowBaitCodeOfAnyNamber(8);
        trenia1.showBaitCodeOf(10);
    }
}




//esli tip znacheniia int to on raven 32 bitam. esli zdelat vot-tak '1'<<32 to iznachalno
//1 = 00000000 00000000 00000000 00000001 t.e. odin bit (mladshii) yzze zaniat 1 edinicei,
//svobodno 31 bita. Pri sdvige << 32 mi kakbi vixodim za razmer otvedenni na danni tip dannix (int),
// pri etom vse biti kakbi obnyliaytsia i mi zanovo popodaiaem na samii mladshii razriad,
// kogda nashe chislo = 1
// 1<<32=1  ili 1<<64=1
//Dalshe stoit instrykciia >>>1. predstavim chto mi smestili chislo '1' <<32=1 togda posle instrykcii >>>1 chislo '1' bydet ravno=0
//      t.e. 1=00000000 00000000 00000000 00000001
//  >>>1
//             00000000 00000000 00000000 00000000  <--eto rezyltat. Nash bit "spriatalsia" v pravo
// esli zdelat 1>>>32 to polychim snova 1, no 1>>>33=0 !!!
//***********************************************************************************************************************************
//Rubrika, chto ponravilos v kode:
// Vo pervix prikolno chto est peremennaia 'spacer' ona pozvoliaet krasivee vivodit na ekran biti chisla
//1) --- Ochen interestnaia zadymka s otobrazzeniem togo kolichestva bit kotoroe xochesh yvidet.
//T.e. v metode Integer.toBinaryString(); vivod vsegda ogranichivaetsia starshim bitom gde est edinica '1'.
// Integer.toBinaryString(10); vernet = 1010; t.e. otobrazzenie nachenaetsia so starshego bita vklychayschego edinicy.
//V dannom prilozzenii mozzno samomy (dlia bolshei nagliadnosti) vibrat skolko bit bydet pokazano
//k primery chislo '10' mozzno vivesti v vide vsex bit: 00000000 00000000 00000000 00001010.
//Dannoe povedenie dostigaetsia za schet int peremennoi ekzempliara 'numberOfBits' v classe, kotoraia inicializiryetsia
//pri sozdanii ob`ekta, i imeetsia v kazzdom ob`ekte ynikalnaia. Otsyda kazzdi ob`ekt sam mozzet vibirat skolko
//on otobrazzaet bit. V metod showBaitCodeOf peredaetsia to int chislo, bait-kod kotorogo xotim yvidet.
// Ochen vazznoi peremennoi iavliaetsia int mask=1 ona vipolniaet rol proveriayschego, v kombinacii s '&' eta pirimennaia
//otobrozzaet tot-zze (v takoi zze ocherednosti) bit proveriaemogo chisla, na protiv kotorogo stoit edinica v chisle 1
//(poslednii bit kotorii raven = 00000001).

//int chislo 10 = 00000000_00000000_00000000_00001010
// &
//int chislo 1  = 00000000_00000000_00000000_00000001
//----------------------------------------------------
//                                                  0		<--Etim sposobom mi yznaem znak bita.

//V metode showBaitCodeOf peremennoi ekzempliara (numberOfBits) i operatora pobitovogo sdviga v levo '<<' mi zdvigaem poslednii
// bit edinicy v levo na ykazannoe v numberOfBits kolichestvo razriadov.(pri etom mask ne bydet soderzzat '1', chislo pomeniaetsia)
//numberOfBits=5;
//mask=1 		     	= 00000000_00000000_00000000_00000001;
//mask<<numberOfBits 	= 00000000_00000000_00000000_00100000;	<--rezyltat!


//zatm opredeliaem znacheniia tekyschego bita s pomosch`y '&'
//int chislo 10 = 00000000_00000000_00000000_00001010
// &
//int chislo 1  = 00000000_00000000_00000000_00100000
//---------------------------------------------------
//                                             0	<--rezyltat nashego opredeleniia bita=0


//esli mi povtorim v cikle ety zze operaciy to rezyltat bydet obsolytno takimzze. Tak kak bit v mask naxoditsia na svoem
//prezznem meste. Chtobi yznat znacheniia vsex drygix (ostavshixsia) bit v chisle 10 nado sdvinyt bit (kotorii raven '1') v
//peremennoi mask v pravo na razriad. Eto delaetsia s pomosch`y '>>>' operator kotorii sdvigaet biti v pravo dobovliaia '0'
//v levyy chast mask. Ili est variant razdelit chislo mask na 2 (mask/2), ved posle togo kak mi sdvinyli mask<<5, peremennaia
//mask ne soderzzit '1', chislo v nei drygoe. I podeliv ego na 2 mi vipolnim sdvig na odin bit v pravo.
//Posle sdviga bita v pravo nado opiat 'yznat' znacheniia bita provedia instrykciy mask & chislo, zatem opiat sdvig i
//opiat opredelenie bita i tak do poslednego bita.
//

//poiasnenie stroki:    int spacer1=(8-((this.numberOfBits+1)%8))==8?0:8-((this.numberOfBits+1)%8);
//sozdaem peremennyy spacer1 dlia korrektnogo vivoda probelov.
// Berem cifry 8 (po kolichestvy bit v baite) ot nee otnimaem rezyltat virazzeniia (numberOfBits+1 % 8) Vozmem k primery numberOfBits=8;
//8 - 1=7.
//Vopros: otkyda vzialas cifra +1 ? V peremennoi mask, kotoraia ravna 1, yzze odin bit zaniat (samii krainii s prava),
//        pochemy % 8 ? V baite 8 bit, nam nyzzno yznat ostatok, i zatem 8 - ostatok. esli eto virazzenie daet 8, to mi priravnivaem ego
// k 0, eto govorit o tom chto polzovatel vvel chislo kotoroe bez ostatkov delitsia na 8
// i vivod na ekran bydet: 00000000 00000000 00000000 00000000
// a ne                  : 0 0000000 00000000 00000000 0000000
