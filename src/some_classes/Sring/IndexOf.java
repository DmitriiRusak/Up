package some_classes.Sring;
//indexOf(char a); vozvraschaet index(poriadkovii nomer nachenayschiisia s 0) dannogo simvola.
//lastIndexOf(char a); vozvraschaet index(poriadkovii nomer nachenayschiisia s 0) dannogo simvola poslednii raz vstrechayschego v dannoi stroke.
//esli simvolov tolko 1 to vernetsia imenno ego index
public class IndexOf {
    public static void main(String[] args) {
        String str ="Privetstvie";
        System.out.println(str.indexOf('p')); //vernet -1 Tak-kak takogo simvola v str net
        System.out.println(str.indexOf('a')); //vernet -1 Tak-kak takogo simvola v str net
        System.out.println(str.indexOf('t')); //vernet 5 , eto index pod kotorim raspolozzen dannii simvol
        System.out.println(str.indexOf('v')); //vernet 3 , eto index pod kotorim raspolozzen dannii simvol. No takix simvolov dva.
                                            // indexOf(); vernet index pervogo vstretivshegosia simvola esli takix neskolko.
                                            // na etom vipolnenie metoda zavershaetsia.

        System.out.println(str.lastIndexOf('v'));// vernet 8 tak-kak lastIndexOf vozvraschaet poslednii index gde vstrechaetsia
                                                // simvol v dannoi stroke.
        System.out.println(str.lastIndexOf('r'));// vernet 1. Esli simvolov tolko 1 to vernetsia index etogo simvola.

    }
}
