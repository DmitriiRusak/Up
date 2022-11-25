package some_classes.Sring;

public class Regular_Expressions {
    public static void main(String[] args) {
        String s="Dvoinie simvoli";
        s=s.replaceAll(".", "$0$0");// ne znay na etom etape chto eto, naznachenie patterna vernyt stroky s ydvoennimi simvolami.
                                                //"." <--eto navernoe oboznachaet 1 simvol v string.
        System.out.println("String s dvoinimi simvolami "+s);
        System.out.println("--------------------------------------------------------------------------------------------------------------------");
    }
}
