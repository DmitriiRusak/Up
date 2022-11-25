package zadachi.naString;
//zamenit cifri v string kotorie < 5 na 0 i kotorie >=5 na 1. Vernyt String.
//fakeBin - eto moi metod resheniia
//replaceDigits - eto s primeneniem replaceAll();
public class ZamenaSimvolov {

    public static String fakeBin(String numberString) {
        String temp=numberString;
        numberString="";
        for(int i=0;i<temp.length();i++) {
            numberString += (Character.digit(temp.charAt(i),10)) < 5 ? "0":"1";
        }
        return numberString;
    }

    public String replaceDigits(String numbers){
        String temp;
        temp= numbers.replaceAll("[0-5]","1");
        return temp;
    }

    public static void main(String[] args) {
        String someString="12345210";
        System.out.println(someString);
        ZamenaSimvolov zamenaSimvolov=new ZamenaSimvolov();
        System.out.println(zamenaSimvolov.replaceDigits(someString));
    }
}
