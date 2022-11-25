package algoritms;

public class BistraiaSortirovkaTrenia {


        static void qsort(int items[]) {

            recyrsivniiMetod(items, 0, items.length - 1);
        }


        private static void recyrsivniiMetod ( int array[], int left, int right ) {
            System.out.println(1);
            int lefti = left;
            int righti = right;
            int midleOfArray = array[(left + right )  /2 ];
            do {
                while ((array[lefti] <midleOfArray) &&(lefti < right) ){       //perebiraem levyy poloviny ot nachala do seredini (t.e. do midlOfArray)
                    lefti++;                                             //esli levoe znachenie menshe chem seredina massiva to sravnivaem sledyyschee
                }                                                       //poocheredi levoe znachenie s seredinoi
                while((midleOfArray < array[righti]) && (righti > left)) {
                    righti --;
                }
// v lefti samoe malenkoe znachenie v massive ot o do seredini, a v righti bolshee chem v lefti.
                if (lefti <= righti) {                              //////
                    int temp = array[lefti];                           //
                    array[lefti] = array[righti];                       //
                    array[righti] = temp;                               //  meniaetsia mestami
                    lefti++;                                            //
                    righti--;                                           //
                }                                                   //////
            }while (lefti <= righti) ;
            if (left < righti) recyrsivniiMetod(array, left, righti);//chtobi ydostoveritsia chto mi 'proshli massiv s prava na levo. t.e poka lefti ne doidet do 0-go indeksa
            if (lefti < right) recyrsivniiMetod(array, lefti, right);//chtobi ydostoveritsia chto mi 'proshli' massiv s leva na pravo

        }

        public static void main(String[] args) {
            //int a []={6,1,22,9,5,20,8,3,7};
            int a []={4,9,14,44,2,19,0,4,34,2,60,41,35,4,6,547,86,345,7458,345,757,37,5,423,426,237,24678,4363};
            int i;
            System.out.print ( "Иcxoдный массив : " ) ;
            for ( i=0 ; i < a . length; i ++)
                System.out.print ( a[i] );

            System . out . println ( ) ;

            BistraiaSortirovkaTrenia.qsort (a) ;

            System.out.print ( " Oт copтиpoвaнный массив : " ) ;

            for ( i=0 ; i < a . length; i++ )
                System . out . print (a[i] );
        }

    }
// recyrsivniiMetod prinimaet massiv i opredeliaet ego serediny, levyy peremennyy i pravyy. Zatem sravnivaet
// levyy peremennyy (lp) s seredinoi (mid), esli lp menshe,to lp++, poka lp ne bydet bolshe mid. V takom
// slychae zapominaetsia indeks lp. Zatem sravnivaetsia pravaia peremennaia (pp) s mid esli mid<pp to pp++.
// Poka pp ne bydet menshe chem mid, kogda naideni oba znacheniia oni meniaytsia mestami.Sravnenie prodolzzaetsia
// esli pp pereshagnyla lp to peremena simvolov ne osyschestvliaetsia. proisxodit rekyrsivnii vizov etogo-zze
// metoda no dlinna massiva ogranichivaetsia 0-pp
//-----------------------------------------------------------------------------------------------------------------
// Dannaia sortirivka ob`iasniaetsia principom razdeliai i vlastvyi,
//snachala y nas est vsia dlinna massiva iz kotoroi mi videliaem 'opornii element', krainii levii i krainii pravii.
//provodim sravneniia kraine levogo elementa s opornim, esli levii element bolshe chem opornii-zapominaem indeks
//levogo elementa, i prodelivaem to-zze samoe s kraine pravim elemento sravnivaia ego s opornim, esli oporni element
//bolshe chem pravii - zapominaem indeks pravogo elementa.Zatem meniaem mestami dannie elementi. Tak proisxodit
//poka karainii levii element ne stanovitsia bolshe kraine pravogo, posle etoga proisxodit rekyrsivnii vizov,
//no dlinna massiva ot 0 do indeksa gde ostonovilas iteraciia 'kraine pravogo elementa'
//
//Esli opornii element vibrat ne srednii a pervii to olgoritm stanet rabotat medlennee, tak-kak pri etom yvelichetsia
//stek vizovov
// Среднее время выполнения быстрой сортировки составляет О(п log п)!
//
//
//
//
//
//
//
