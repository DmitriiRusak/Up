package algoritms;

public class SortirovkaBistraia {

    static void qsortChar(char items[]) {

        qs(items, 0, items.length - 1);
    }


    private static void qs ( char array[], int left, int right ) {

        int lefti = left;
        int righti = right;
        char midleOfArray = array[(left + right )  /2 ];
        do {
            while ((array[lefti] <midleOfArray) &&(lefti < right) ){       //perebiraem levyy poloviny ot nachala do seredini (t.e. do midlOfArray)
                lefti++;                                             //esli levoe znachenie menshe chem seredina massiva to sravnivaem sledyyschee
            }                                                       //poocheredi levoe znachenie s seredinoi
            while((midleOfArray < array[righti]) && (righti > left)) {
                righti --;
            }
// v lefti samoe malenkoe znachenie v massive ot o do seredini, a v righti bolshee chem v lefti.
                if (lefti <= righti) {                              //////
                    char temp = array[lefti];                           //
                    array[lefti] = array[righti];                       //
                    array[righti] = temp;                               //  meniaetsia mestami
                    lefti++;                                            //
                    righti--;                                           //
                }                                                   //////
        }while (lefti <= righti) ;
        if (left < righti)qs(array, left, righti);//chtobi ydostoveritsia chto mi 'proshli massiv s prava na levo. t.e poka lefti ne doidet do 0-go indeksa
        if (lefti < right) qs(array, lefti, right);//chtobi ydostoveritsia chto mi 'proshli' massiv s leva na pravo

        }

    public static void main(String[] args) {
        char a []={'d','a','r','p','s','c'};
            int i;
            System.out.print ( "Иcxoдный массив : " ) ;
            for ( i=0 ; i < a . length; i ++)
                System.out.print ( a[i] );

            System . out . println ( ) ;

        SortirovkaBistraia.qsortChar (a) ;

            System.out.print ( " Oт copтиpoвaнный массив : " ) ;

            for ( i=0 ; i < a . length; i++ )
                System . out . print (a[i] );
        }
    }
// int lefti=left; t.e.=0
// int righti=right; t.e.=dlinna massiva-1);
//char middleOfArray=array[(left + right )  /2 ]; <--delit massiv na poloviny! eto vazzno
//V cikle do {} while (); stoiat 2 cikla while.

//                                              PERVAIA PROXODKA DO WHILE, PERVOGO VIZOVA METODA!

// while ((array[lefti] <midleOfArray) &&(lefti < right) ){
//                lefti++;
//            }
//Naznachenie: poocheredno, s leva na pravo proveriaet chto menshe (simvol pod nomerom 'lefti' ili pod nomerom 'middleOfArray').

//Y nas vibrano yslovnaia seredina massiva, ona zapisana v peremennyy middleOfArray i ravna v danni moment 'r';
//tak-kak lefti=0, to berem simvol pod nylevim indexom, on raven='d';, esli 'd' < 'r' i lefti(0) < right(5) to inkrementiryem
//lefti++;. 'd' menshe chem 'r' i lefti menshe chem right t.e. eto govorit o tom chto dannie simvoli stoiat korrektno,
// t.e. v poriadke vozrastaniia. Dalee (tak-kak eti simvoli stoiat korektno i meniat ix ne nado) inkrementiryem peremennyy lefti++;
//I sravnivaem yzze array[1] on raven='a' s middleOfArray = 'r', rezyltat=true, tak-kak a<r, znachit ostavliaem ix na svoix mestax
//i inkrementiryem lefti++; Dalee (lefti=2) opiat zze berem array[lefti]='r' i sravnivaem s middleOfArray='r'.
// Ochevidno chto dannae yslovie vernet nam false tak-kak 'r' ne menshe chem 'r', inkrementaciia lefti na etom shage ne proisxodit.
//lefti = 2='r', middleOfArray='r';


//Dalee stoit sledyyschii cikl while
//  while((midleOfArray < array[righti]) && (righti > left)) {
//         righti --;
//   }
//Naznachenie: proveriaem middleOfArray menshe array[righti] ? poocheredno, s pravo na levo
//
//midleOfArray = 'r', array[righti]='c'.  r<c ? net, 'r' bolshe chem 'c', poetomy dekrimentaciia righti ne vipolniaetsia.
//  fakticheski teper y nas est array[lefti]='r' i est array[righty]='c'
// i mi znaem chto array[lefti], on zze middleOfArray > array[righti]. T.e. mi nashli 2 elementa kotorie neobxodimo pomeniat
//mestami, eto mi i delaem No cherez if (lefti <= righti) { ...meniaem mestami, i inkrementiryem lefti++, righti--. A Pochemy? Tak kak danni
// index massiva otrabotan dlia obeix peremennix to net smisla snova ix sravnivat.
// V danni moment lefti=3, righti=4;
//Yslovie tekyschego cikla while (lefti <= righti) vozvraschaet true i programma idet na esche odny proxodky cikla

//                              VTORAIA PROXODKA DO WHILE , PERVOGO VIZOVA METODA!

//while ((array[lefti] <midleOfArray) &&(lefti < right) ){
//                lefti++;
//            }
// array[lefti]='p', midleOfArray= vse te-zze 'r'. p<r? da p menshe chem r i poetomy lefti++(4).
//array[lefti]='s', midleOfArray= vse te-zze 'r'. s<r? net s bolshe chem r i poetomy lefti ne inkrementiryem. lefti=4='s'

//dalshe instrykciia opiat-zze cikl while.
//  while((midleOfArray < array[righti]) && (righti > left)) {
//         righti --;
//   }

// V danni moment lefti=4, righti=4;

// midleOfArray='r' < array[righti]='s'. r<s? da, poetomy righti--(3)
// midleOfArray='r' < array[righti]='p'. r<p? net, poetomy righti-- ne vipolniaetsia (righti=3)
//Itak y nas snova est 2 znacheniia array[lefti(4)]='s' i array[righti(3)]='p'
//sledyyschaia instrykciia  if (lefti <= righti) {... meniaem mestami.  No lefti=4 righti=3, yslovie vernet false.
//sledyyschaia instrykciia }while (lefti <= righti); chto takzze vernet false.
//Na etom metod zakanchivaetsia,
// Itog dannogo vipolneniia metoda: Vtoryy proxodky mozzno bilo ne delat. Po fakty mi proveli tolko odno izmenenie
// simvolov i eto bilo pered okonchaniem pervoi proxodki. Vozmozzno poetomy i stoit dannoe yslovie
// if (lefti <= righti) {  No ved posle vtoroi proxodki v peremennaia array[lefti]='s' a array[righty]='p' t.e.s>p
// i nado-bi ix pomeniat mestami!!! Ne poniatno. Vozmozzno avtor/algoritm nacelen tolko na odno izmenenie simvolov
// za odin vizov metoda ???
//
//                                 ********* VIZOV DANNOGO METODA 2-OI RAZ **********

// sledyyschiaa rekyrsivnaia instrykciia obratno vizivaet danni metod.
//if (left < righti)qs(array, left, righti);
//Tak-kak left=0; righti=3 to vizivaetsia etot-zze metod s parametrami(array,0,3) <--dlinna massiva ogranichivaetsia
// peremennoi righti. A POCHEMY ??? mozzet potomy chto mi kak-bi pomeniali mestami 2 simvola. Tipa bila dlinna massiva=5
// 2 simvola pomeniali = 3. Neponiatno.
//int lefti=0;
//int righti=3;
//char middleOfArray='a'
// while ((array[lefti] <midleOfArray) &&(lefti < right) ){
//                lefti++;
//            }
//array[lefti]='d', midleOfArray='a' virazzenie vernet false i inkrementaciia lefti ne vipolnitsia. array[lefti]='d';

// while((midleOfArray < array[righti]) && (righti > left)) {
//                righti --;
//            }
// midleOfArray v etom vizove metoda ='a', array[righti]='p'; a<p? da, znachit delaem rifgti--. (righti=2);
// 'a' < array[righti]='c', a<c? da znachit delaem rifgti--. (righti=1);
//'a' < array[righti]='a'. a<a? net znachit righti-- ne vipolniaem (righti=1='a');

//  if (lefti <= righti) {   //lefti=0=d; righti=1=a vernet nam try i vipolnitsia perestanovka dannix
// simvolov, a tak-zze lefti++; righti--
// lefti=1;  righti-0;
// massiv teper vigliadit vot tak array[a, d, c, p, s, r]
//  }while (lefti <= righti); vernet false
// if ( left (0)< righti(0) )qs(array, left, righti); vernet false.
//  if (lefti < right) qs(array, lefti, right); vernet true
//
//                                ********* VIZOV DANNOGO METODA 3-iI RAZ **********
//array=[a, d, c, p, s, r]
// int lefti= 1;
// int righti=3;
// middleOfArray= 'c'
//  while ((array[lefti] <midleOfArray) &&(lefti < right) ){
//                lefti++;
//            }
// array[lefti]='d', midleOfArray='c'. d<c? net. lefti++ ne vipolniaem. array[lefti]='d'

// while((midleOfArray < array[righti]) && (righti > left)) {
//                righti --;
//            }
// midleOfArray='c' < array[righti]=p. c<p? da. delaem righti-- (righti=2)
// midleOfArray='c' < array[righti]=c. c<c? net. dekrementaciy righti ne delaem (righti=2='c')
// if ( lefti(1) <= righti(2) ) { vernet true, znachit meniaem mestami array[lefti]='d' i array[righti]='c'
// lefti++; righti--;
// }while (lefti <= righti); vernet false;
//  if (left < righti)qs(array, left, righti); vernet false;
//  if (lefti < right) qs(array, lefti, right); vernet true;
//
//                                 ********* VIZOV DANNOGO METODA 4-iI RAZ **********
// array={a,c,d,p,s,r};
// int lefti=2;
// int righti=3;
// middleOfArray='d'
//
// while ((array[lefti] <midleOfArray) &&(lefti < right) ){
//                lefti++;
//            }
//array[lefti]='d' < midleOfArray='d' d<d? net array[lefti]='d';
//
// while((midleOfArray < array[righti]) && (righti > left)) {
//        righti --;
//        }
//midleOfArray='d' < array[righti]='p'. d<p? Da righti--
//midleOfArray='d' < array[righti]='d'. d<d? Net array[righti]='d'
//if (lefti <= righti) { true        znachenie peremennix teper = (lefti=2='d'; righti=2'd')
//meniaem mestami. No po syti izmenenii ne proisxodit tak-kak rech idet ob odnom i tom-zze elemente.
//vizov metoda zavershen
// if (left < righti) qs (array, left, righti); vernet false
// if (lefti < right) qs (array, lefti, right); vernet false