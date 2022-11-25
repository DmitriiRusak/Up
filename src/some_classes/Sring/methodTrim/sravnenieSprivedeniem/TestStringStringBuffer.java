package some_classes.Sring.methodTrim.sravnenieSprivedeniem;

public class TestStringStringBuffer {
    public static void main(String[] args) {
        StringBuffer stringBuffer=new StringBuffer("string");
        String str="string";
        String str1=stringBuffer.toString();
        System.out.println(str.equals(str1));//true

        System.out.println(str.equals((String)stringBuffer.toString()));//tozz true )))
        //System.out.println(str.equals(some_classes.string.stringBuffer)); false, tak-kak nyzzno snachala prividenie
        // tipov

        String someString = "   Privet medved  ";
        String result=someString.trim();//ydaliaet probeli v konce i nachale iz zadannogo stringa i zapisivaet v novii,
        System.out.println(result);//Privet medved <----bez probelov
    }
}