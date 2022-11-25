package some_classes.stringBuffer;

public class Metodi{
    public String toString(){
       return " OPANKI";
    }
    public static void main(String[] args) {
        StringBuffer sb=new StringBuffer("privet");
        // System.out.println(sb.charAt(0)); return: character

        // System.out.println(sb.codePointAt(0)); return: unicode of character

        //sb.setCharAt(0,'x');  etogo net v String. zameniaet character pod vibrannim indeksom
        //System.out.println(sb);

//        Metodi metodi=new Metodi();
//        sb.append(metodi);// eto toze samoe kak - sb.append(metodi.toString());
//        System.out.println(sb);

        //System.out.println(sb.append(" medved")); dobovliaet k koncy sb String

//        StringBuffer sb1=new StringBuffer(" +sb1)))");
//        System.out.println(sb.append(sb1)); DOBAVLIAET sb1 k sb

//        Metodi metodi=new Metodi();
//        System.out.println(sb.append(metodi.toString(),0,4));DOBAVLIAET IZ metodi,toString k sb
        // 0 <-ot kakogo indeksa nachat dobavlenie; 4 <-po kakoi indeks dobavliat

        //System.out.println(sb.delete(3,sb.length()));//ydaliaet iz sb s indeksa i po indeks.

        System.out.println(sb.reverse());// prikolno a y String tokoi fetcher net)))
    }


}
