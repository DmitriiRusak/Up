package inner_classes.innerClasses.AnonymousClass;
//V dannom primere programmi est interfais i v main sozdaytsia 3 anonimnix classa
//primer dostatochno prost no otrozaet syt syschestvovaniia anonimnix classov.
//Esli est interfeis i prosto nyzno sozdat gryppy ob`ektov (i klassov sootvetstvenno)
// s odnim povedeniem to ne obiazatelno sozdovat novii fail i v nem class.
//Osobenno esli interfeis fynkcionalnii (tolko s odnim metodom)
// Gorazdo ydobnei vospolzovatsia sintaksisom sozdaniia ob`ektov bezimiannix klassov.
//A zatem vizivat metod y togo ili inogo ob`ekta v zavisimosti ot nadobnosti.
// Если каждому(lybomy) из наших анонимных классов понадобится какое-то отличающееся поведение,
// свои специфические методы, которых нет у других, мы легко можем дописать их
//В документации Oracle приведена хорошая рекомендация: «Применяйте анонимные классы, если вам
// нужен локальный класс для одноразового использования».
//
public class PrimerAnonimnogoClassaVMain {
    private static int staticInt=124;

    interface letnii{
        public void letat();
    }

    public static void main(String[] args) {


        letnii samalet=new letnii(){
            @Override
            public void letat(){
                System.out.println("Samolet letaet");
            }
            /*
            *
             */
            public void specifikMethod(){               //esli nado dopolnitelnie metodi, ix mozzno dobavit...
                System.out.println("samolet vzletaet");
            }
        };

        letnii ptica =new letnii() {
            @Override
            public void letat() {
                System.out.println("Ptica letaet");
                System.out.println(staticInt);      //est dostyp
            }
        };

        letnii oblako=new letnii() {
            @Override
            public void letat() {
                System.out.println("Oblako letit");
            }
        };

        samalet.letat();
        ptica.letat();
        oblako.letat();
    }
}
