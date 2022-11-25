package myLibrary;

public class MyMath {


    public void quickSort(int intArray[]){

        qS(intArray, 0, intArray.length - 1);
    }
    /*
    *
    *
     */
    private void qS(int [] ar, int left, int right){

        int lefti=left;
        int righti=right;
        int middleOfArray=ar[ (left+right) / 2 ];

        do{
            while((ar[lefti] < middleOfArray) && (lefti<right)){
                lefti++;
            }
            while((middleOfArray < ar[righti]) && (righti > left)){
                righti--;
            }
            if(lefti <= righti) {
                int temp = ar[lefti];
                ar[lefti] = ar[righti];
                ar[righti] = temp;
                lefti++;
                righti--;
            }
            } while (lefti <= righti);
        if(left < righti)qS(ar,left,righti);
        if(lefti < right)qS(ar,lefti, right);
    }
    /*
    *
    *
    *
     */
    public void bubbleSort(int array[]){
        for(int i=0;i<array.length-1;i++){          //tak-kak sravnivaem s array[i+1] to dlinny ogranichim -1
            for(int a=0; a<array.length-1; a++){    //tak-kak sravnivaem s array[i+1] to dlinny ogranichim -1
                if(array[a]>array[a+1]){
                    int temp=array[a+1];
                    array[a+1]=array[a];
                    array[a]=temp;
                }
            }
        }
    }
    /*
    *
    *
    *
     */
    public int minValue (int array[]){
        int min=array[0];
        for(int i=1;i< array.length;i++){
            min=array[i]<min?array[i]: min;
        }
        return min;
    }
    /*
    *
    *
     */
    public int maxValue (int array[]){
        int max=array[0];
        for(int i=1;i< array.length;i++){
            max=array[i]>max?array[i]: max;
        }
        return max;
    }
    /*
    *
    *
     */
    public int avarageValue(int array[]){ //naiti avg- eto->slozzit vse elementi i razdelit na ix kolichestvo
        int sum=0;
        int i;
        for(i=0;i<array.length;i++){
            sum+=array[i];
        }
        return sum/i;
    }
    /*
    *
    *
     */
    long factR ( int n) {
        long result;
        if (n == 1) return 1;
        result = factR(n - 1) * n;      //t.e. vizov metoea * n. Snachala vipolniaetsia vizov metoda.
        return result;
    }
    /*
    *
    *
     */
    public void baitCodVSlova(int array[]){     //{0101001, 11010101, 1101000} kazdii element eto neskolko cifr...
        int decimalArray[]=new int[array.length];
        int sum;
        int razriad;

        for (int a = 0; a < array.length; a++) {
            String string=Integer.toString(array[a]);
            razriad=1;
            sum=0;
            char charArray []=string.toCharArray();
            for(int i=charArray.length-1;i>=0;i--){
                int someint=Character.getNumericValue(charArray[i]);
                sum+=someint==1?razriad:0;
                razriad<<=1;
            }
            decimalArray[a]=sum;
        }
        for(int i=0;i<decimalArray.length;i++){
            System.out.print((char)decimalArray[i]);
        }
    }
    /*
    *
    *
     */
    public int [] slovaVBaitCod(String isxodnaiaString){
        char charArray[] = isxodnaiaString.toCharArray();
        int intArray[] = new int[charArray.length];
        int arrayBincode[] = new int[intArray.length];

        for (int i = 0; i < charArray.length; i++) {
            intArray[i] = charArray[i];                 //polychaem massiv int-ov
        }

        for(int i=0; i< intArray.length;i++){
            String str="";
            for(int mask=64; mask>0;mask>>=1 ){         //64 vibrano tak-kak zadeistvovano tolko 7 bit iz 8-mi bitnogo baita. 64=1000000
                str+=(intArray[i]&mask)==0? 0:1;        //takzze nyzzno dvigatsia ot 64 do 0, esli naoborot to string bydet zadom napered
            }
            arrayBincode[i]=Integer.valueOf(str);
        }

        for(Integer a:arrayBincode) {
            System.out.print (a+" ");
        }
        System.out.println();
        return arrayBincode;
    }
    /*
    *
    *
     */
    //razbivaet stroky v massiv strok i vozvraschaet ego.
    public String [] stringToArray(String s) {
        char arrayChar[] =s.toCharArray();
        int sumOfSpace=0;

        for(int i=0;i<arrayChar.length;i++){
            if(arrayChar[i]==' ')sumOfSpace++;
        }

        String stringArray[]=new String[sumOfSpace+1];
        int stringArrayCount=0;
        String singleWord="";

        for(int i=0;i<arrayChar.length;i++){
            if(arrayChar[i] !=' '){
                singleWord+=arrayChar[i];
            }
            else if(arrayChar[i]==' '){
                stringArray[stringArrayCount]=singleWord;
                stringArrayCount++;
                singleWord="";
            }
            stringArray[stringArrayCount]=singleWord;
        }
        return stringArray;
    }

}
