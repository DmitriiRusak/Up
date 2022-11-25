package interfaces.charSiqenceImplementation;

public class CharsiqenceClass implements CharSequence {
    private String s;

    public CharsiqenceClass (String s){
        this.s=s;
    }

    @Override
    public int length() {
        return s.length();
    }
    /*
    *
     */
    private int fromEnd(int i){//beret dlinny String i otnimaet ot dlinni'i' i vozvraschaet eto chislo
       int a= s.length()-1-i;
        return s.length()-1-i;
    }
    /*
    *
     */

    @Override
    public char charAt(int index) {
        if(index<0||index>s.length()){
            throw new StringIndexOutOfBoundsException(index);
        }
        return s.charAt(fromEnd(index));
    }
    /*
    *
     */

    @Override
    public CharSequence subSequence(int start, int end) {
        if (start < 0) {
            throw new StringIndexOutOfBoundsException(start);
        }
        if (end > s.length()) {
            throw new StringIndexOutOfBoundsException(end);
        }
        if (start > end) {
            throw new StringIndexOutOfBoundsException(start - end);
        }
        StringBuilder sub = new StringBuilder(s.subSequence(fromEnd(end), fromEnd(start)));
        return sub.reverse();
    }
    /*
    *
     */
    public String toString() {
        StringBuilder str= new StringBuilder(this.s);
        return str.reverse().toString();
    }

    public String getS() {
        return s;
    }

    public static void main(String[] args) {
        CharsiqenceClass charsiqenceClass=new CharsiqenceClass(" Your implementation " +
                "should return the some_classes.string backwards");
//        for(int i=0;i<=charsiqenceClass.getS().length()-1;i++){
//            char f=charsiqenceClass.getS().charAt(i);
//            System.out.print(f);
//        }


//        System.out.println();
//        Random random=new Random();
//        int start = random.nextInt(charsiqenceClass.length()-1);
//        int end = random.nextInt(charsiqenceClass.length()-1 - start) + start;
//        System.out.println(charsiqenceClass.subSequence(start, end));

        System.out.println(charsiqenceClass.toString());
    }
}
