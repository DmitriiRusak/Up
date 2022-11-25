package prototipi;

public class Qdemo {
    public static void main ( String args[] ) {
        Queue bigQ = new Queue(100);
        Queue smallQ=new Queue(4);
        char ch;
        int i;
        System.out.println("Pomeschenie bykvennix simvolov v bigQ");
        for(i=0;i<26;i++){
            bigQ.put((char) ('A'+i));
        }
        System.out.println("Soderzzimoe bigQ");
        for(i=0;i<27;i++){
            ch=bigQ.get();  //xitro opisan gettor v samom klasse, index ne nado peredovat
            if(ch!=(char) 0){
                System.out.print(ch+" ");
            }
            else {
                System.out.println("int nylia "+(int)ch);
            }
        }

        System.out.println();

//dlinna smallQ==4; v cikle 5 iteracii:0,1,2,3,4; kogda peremennaia ekzempliara putlog
//ravna dlinne massiva ekzempliara metod put(char ch); zavershaetsia instrykciei return
//logika takova chto maksimalno dopystimoe dlia soderzzaniia kolichestvo elementov v
//ocheredi dostignyto.
        for(i=0;i<5;i++){
            System.out.print("Popitka soxraneniia "+(char) ('Z'-i));
            smallQ.put((char) ('Z'-i));
            System.out.println();
        }
//tak-kak mi zapolnili ochered i dlia etogo ispolzovali peremennyy ekzempliara putlog to
//sootvetstvenno putlog==kolichestvy elementov v ocheredi. Sootvetsvenno kogda mi izvlek-
//aem soderzzimoe to peremennaia getlog inkrementiryetsia kazdyy iteraciy cikla pri iz-
//vlechenii i kogda ona bydet ravna putlog cikl dolzzen zavershitsia.
        for(i=0;i<5;i++){
            ch=smallQ.get();
            if(ch!=(char)0){
                System.out.print(ch+" ");
            }
        }

//ny i samii ny OOOOOchen interestnii moment, posle 1 goda razbora ia vrode ponial.
        //  for(int i=0;i<26;i++){
        //    System.out.print( ('A'+i)+" ");
        //		}
        //polychaem: 65 66 67 68 69 70 71 72 73 74 75 76 77 78 79 80 81 82 83 84 85 86 87 88 89 90
        //
        //Na pervoi iteracii cikla
        // vivoditsia int chislo sootvetstvyyschie simvoly 'A' v unicode.
        // k nemy mi dobovliaem i ('A'+i) polychaem na pervoi iteracii vivoditsia
        //tolko 'A' tak-kak i=0; zatem na sledyyschei iteracii cikla i=1, polychaem A+1 i t.d.
        //NO esli zdelat prividenie tipov k (char)('A'+i) to na kazzdoi iteracii cikla do-
        //bovliaetsia k i+1 polychaem chto k int chisly sootvetstvyyschemy 'A' mi ciklicheski
        //dobovliaem +1 chto sootvetstvyet drygomy simvoly (t.e.='B' zatem 'C' i.t.d.).
        // Poditozzim: znaia s kakogo chisla kodiryetsia alfavit (ili ykazat 'A')
        // i pokakoe (v nashem slychae eto +26 k chisly kodiryyschemy 'A'), mi mozzem vivesti alfavit.


    }
}
