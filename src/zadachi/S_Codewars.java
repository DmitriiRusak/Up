package zadachi;
import sun.rmi.transport.proxy.CGIHandler;

import java.math.RoundingMode;
import java.util.*;

import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class S_Codewars {
    public static String[] stringToArray(String s) {
        char arrayChar[] = s.toCharArray();
        int sumOfSpace = 0;

        for (int i = 0; i < arrayChar.length; i++) {
            if (arrayChar[i] == ' ') sumOfSpace++;
        }

        String stringArray[] = new String[sumOfSpace + 1];
        int stringArrayCount = 0;
        String singleWord = "";

        for (int i = 0; i < arrayChar.length; i++) {
            if (arrayChar[i] != ' ') {
                singleWord += arrayChar[i];
            } else if (arrayChar[i] == ' ') {
                stringArray[stringArrayCount] = singleWord;
                stringArrayCount++;
                singleWord = "";
            }
            stringArray[stringArrayCount] = singleWord;
        }
        return stringArray;
    }

    public static String convert(boolean b) {
        if (true) {
            return "true";
        } else {
            return "false";
        }
        //return String.valueOf(b);   <-- tozze samoe chto i kod vishe
    }

    public String dnaToRna(String dna) {

        char arrayTemp[] = dna.toCharArray();
        dna = "";
        for (int i = 0; i < arrayTemp.length; i++) {
            dna += arrayTemp[i] == 'T' ? 'U' : arrayTemp[i];
        }
        return dna;
        //        return dna.replace("T", "U");   pizdec vot eto reshenie
    }

    public static int sum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i] < 0 ? 0 : arr[i];
        }
        return sum;
        //        return Arrays.stream(arr).filter(v -> v > 0).sum();  <- chto eto ?
    }

    public static String fakeBin(String numberString) {
        String temp = numberString;
        numberString = "";
        for (int i = 0; i < temp.length(); i++) {
            numberString += (Character.digit(temp.charAt(i), 10)) < 5 ? "0" : "1";
        }
        return numberString;
    }

    public static double find_average(int[] array) {
        return Arrays.stream(array).average().orElse(0);

    }

    public static int simpleMultiplication(int n) {
//This kata is about multiplying a given number by eight if it is an even number and by nine otherwise.
        return n % 2 == 0 ? n * 8 : n * 9;
    }

    public static boolean getXO(String str) {
//Check to see if a string has the same amount of 'x's and 'o's. The method must return a boolean
// and case insensitive. The string can contain any char.
        int xCount = 0;
        int oCount = 0;
        char charArray[] = str.toCharArray();
        for (int i = 0; i < str.length(); i++) {
            if (charArray[i] == 'X' || charArray[i] == 'x') xCount++;
            else if (charArray[i] == 'O' || charArray[i] == 'o') oCount++;
        }
        if (xCount == oCount) return true;
        else if (xCount == 0 && oCount == 0) return true;
        else return false;

    }

    public static String printerError(String s) {

        return String.valueOf(s.length() - s.replaceAll("[n-z]", "").length()) + "/" + s.length();

    }

    public static Integer basicMath(String op, int v1, int v2) {
//Your task is to create a function that does four basic mathematical operations.
//The function should take three arguments - operation(string/char), value1(number), value2(number).
//The function should return result of numbers after applying the chosen operation.
        switch (op) {
            case "+":
                return v1 + v2;
            case "-":
                return v1 - v2;
            case "*":
                return v1 * v2;
            case "/":
                return v1 / v2;
            default:
                throw new IllegalArgumentException("Unknown operation: " + op);
        }
    }

    public int Liters(double time) {
//Because Nathan knows it is important to stay hydrated, he drinks 0.5 litres of water per hour of cycling.
//You get given the time in hours and you need to return the number of litres Nathan will drink, rounded to the smallest value

        return (int) (0.5 * time);

    }

    public static int century(int number) {
//The first century spans from the year 1 up to and including the year 100, the second century - from the year 101 up
// to and including the year 200, etc.
//Task
//Given a year, return the century it is in.
        return (number % 100) == 0 ? number / 100 : number / 100 + 1;
        //    return (number + 99) / 100;  <--int okrygliaet v bolshyy storony, poetomy i rabotaet korrektno.
    }

    public String toJadenCase(String phrase) {
//public String toJadenCase(String phrase) {
//    if(phrase == null || phrase.equals("")) return null;
//
//    char[] array = phrase.toCharArray();
//
//    for(int x = 0; x < array.length; x++) {
//      if(x == 0 || array[x-1] == ' ') {
//        array[x] = Character.toUpperCase(array[x]);
//      }
//    }
//    return new String(array);
//  }
        if (phrase == null || phrase.isEmpty()) return null;

        String rezalt = "";
        String stringArray[] = phrase.split(" ");
        for (int i = 0; i < stringArray.length; i++) {
            char tempArray[] = stringArray[i].toCharArray();
            tempArray[0] = (char) (tempArray[0] & 95);
            //mozno i tak
            //tempArray[0]=Character.toUpperCase(tempArray[0]);
            stringArray[i] = String.valueOf(tempArray);
            if (i < stringArray.length - 1) {
                rezalt += stringArray[i] + " ";
            } else rezalt += stringArray[i];

        }
        return rezalt;
    }

    public static int sortDesc(final int num) {
//public static int sortDesc(final int num) {
//        String[] array = String.valueOf(num).split("");
//        Arrays.sort(array, Collections.reverseOrder());
//        return Integer.valueOf(String.join("", array));
//    }
        char charArray[] = String.valueOf(num).toCharArray();
        int array[] = new int[charArray.length];
        for (int i = 0; i < array.length; i++) {
            array[i] = Character.getNumericValue(charArray[i]);
        }

        for (int i = 0; i < array.length - 1; i++) {
            for (int a = 0; a < array.length - 1; a++) {
                if (array[a] < array[a + 1]) {
                    int temp = array[a];
                    array[a] = array[a + 1];
                    array[a + 1] = temp;
                }
            }
        }
        String rezult = "";
        for (int i = 0; i < array.length; i++) {
            rezult += String.valueOf(array[i]);
        }
        int zavershenie = Integer.valueOf(rezult);
        return zavershenie;
    }

    public static String abbrevName(String name) {
//Write a function to convert a name into initials. This kata strictly takes two words with one space in between them.
//The output should be two capital letters with a dot separating them.
        String array[] = name.split(" ");
        String temp[] = new String[array.length];
        for (int i = 0; i < array.length; i++) {
            temp[i] = String.valueOf(array[i].charAt(0));
            temp[i] = temp[i].toUpperCase();
        }

        return new String(String.join(".", temp));

//         ne moe reshenie
//        public static String abbrevName(String name) {
//            String[] init = name.split(" ");
//            return init[0].substring(0, 1).toUpperCase().concat("."+ init[1].substring(0, 1).toUpperCase());
    }

    public static int[] reverse(int n) {
//Build a function that returns an array of integers from n to 1 where n>0.
//
//Example : n=5 --> [5,4,3,2,1]

        int array[] = new int[n];
        for (int i = 0; n > 0; i++, n--) {
            array[i] = n;

        }
        return array;
    }

    public static String boolToWord(boolean b) {
        return (b) ? "Yes" : "No";
    }

    public static boolean isLove(final int flower1, final int flower2) {
//Timmy & Sarah think they are in love, but around where they live, they will only know once they pick a flower each.
// If one of the flowers has an even number of petals and the other has an odd number of petals it means they are in love.

//Write a function that will take the number of petals of each flower and return true if they are in love and false if they aren't.
        return (flower1 + flower2) % 2 != 0;
    }

    public static int findSmallestInt(int[] args) {
//Given an array of integers your solution should find the smallest integer.
        int min = args[0];
        for (int i = 0; i < args.length; i++) {
            min = (args[i] < min) ? args[i] : min;
        }
        return min;
    }

    public static int rowSumOddNumbers(int n) {
//Given the triangle of consecutive odd numbers:
//
//             1
//          3     5
//       7     9    11
//   13    15    17    19
//21    23    25    27    29
//Calculate the sum of the numbers in the nth row of this triangle (starting at index 1)
//1 -->  1
//2 --> 3 + 5 = 8
//Zadacha chisto na smekalky, ves algoritm s vlozzennimi ciklami rabotaet ispravno, no ego mozzno zamenit 1 strokoi.
// v obschem eto vozvedenie v stepen, a konkretno v 3 stepen
        int array[] = new int[41];
        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }
        int numberOfRaw = 1;
        int sum = 0;
        int count = 0;        //schitaet vse proxodki po array
        int autput = 1;       //kolichestvo strok kotoroe nado otobrazit z proxodkt vnytrennego cikla
        int control = 0;      //skolko strok yzze otobrazzeno.
        for (int a = 0; count < array.length - 1; a++) {
            for (int i = 0; (control < autput && count < array.length - 1); i++) {
                if (array[count] % 2 != 0) {
                    System.out.print(array[count] + " ");
                    control++;
                    if (numberOfRaw == n) sum += array[count];
                    count++;        //chtob schital v kazzdom riady ne s '1'
                } else count++;
            }
            System.out.println();
            control = 0;
            autput++;
            numberOfRaw++;
        }
        return sum;
        //        return n*n*n;         <--ili vse reshenie svoditsia k etomy
        //        Math.pow(n,3);        <-- ili metod iz Math, naxodit stepen chisla,
    }

    public static int ConvertBinaryArrayToInt(List<Integer> binary) {
        int intArray[] = new int[binary.size()];
        int sum = 0;
        int razriad = 1;
        for (int i = 0; i < binary.size(); i++) {           //zapisal massiv intov.
            intArray[i] = binary.get(i);
        }
        for (int i = intArray.length - 1; i >= 0; i--) {
            sum += intArray[i] == 1 ? razriad : 0;
            razriad *= 2;
        }
        return sum;
    }

    public static String reverseWords(final String original) {
//Complete the function that accepts a string parameter, and reverses each word in the string.
// All spaces in the string should be retained.(t.e. chtob mozzno bilo podovat v parametrax
//stroky s 2-mia probelami.

        String arrayString[] = original.split(" ");
        if (arrayString.length == 0) {
            return original;
        }

        for (int i = 0; i < arrayString.length; i++) {
            arrayString[i] = String.valueOf(new StringBuilder(arrayString[i]).reverse());

        }

//eto moia chast ona gramozdka no rabotaet. Reshenie chela odnoznachno lytshe..., no blia obidno chto
//stolko vremia potratil i nepolychilos. Vse taki napisannie metodi i klassi eto to chto nado znat,
// zdes bez kompromisov. Ia ne progromist, a cheli progrommisti.
//        if(original.length()-1 == 0) {
//            return original;
//        }
//                    System.out.println(original.contains("  "));
//        String newString="";
//        String slovo="";
//        int space_counter=0;
//        for(int i=0;i<original.length();i++){
//            if(original.charAt(i)!=' '){
//                slovo+=String.valueOf(original.charAt(i));
//            }
//            else if(original.charAt(i)==' '&& original.charAt(i+1)==' ') {
//                for(int a=slovo.length()-1; a>=0; a--){
//                    newString+=slovo.charAt(a);
//                }
//                slovo="";
//                newString+="  ";
//                i++;
//            }
//            else if( (original.charAt(i)==' ' && original.charAt(i+1)!=' ') || original.length()==i){
//                for(int a=slovo.length()-1; a>=0; a--){
//                    newString+=slovo.charAt(a);
//                }
//                slovo="";
//                newString+=" ";
//            }
//        }
//        for(int i=slovo.length()-1;i>=0;i--){
//            newString+=slovo.charAt(i);
//        }
//        return newString;


        return String.join(" ", arrayString);
    }

    public static String greet(String name) {

        return "Hello," + name + "how are you doing today? ";
    }

    public int sum(List<?> mixed) {
//poschitat symmy ob`ektov v mixed.Ob`ekti eto libo String libo int.
        int sumInt = 0;
        for (int i = 0; i < mixed.size(); i++) {
            if (mixed.get(i) instanceof Integer) {
                sumInt += Integer.valueOf((int) mixed.get(i));
            } else if (mixed.get(i) instanceof String) {
                sumInt += Integer.valueOf((String) mixed.get(i));
            }
        }
        return sumInt;

        // Tak konechno kryche
        //int x = 0;
        //    for(Object s: mixed){
        //            x+=Integer.parseInt(s.toString());
        //    }
    }

    public static boolean feast(String beast, String dish) {
//Nyzzno sravnit pervyy bykvy i poslednyy iz pervoi String s pervoi bykvoi i poslednei bykvoi iz vtoroi String
        return (beast.startsWith(String.valueOf(dish.charAt(0))) && beast.endsWith(String.valueOf(dish.charAt(dish.length() - 1))));
    }

    public static int squareSum(int[] n) {
//Complete the square sum function so that it squares each number passed into it and then
// sums the results together.
//For example, for [1, 2, 2] it should return 9 because 1^2 + 2^2 + 2^2 = 9.
//v primere avtor pitaetsia pystit lozznim pytem, primeniaia pobitovii operator '^'
//
        int sum = 0;
        for (int i = 0; i < n.length; i++) {
            sum += Math.pow(n[i], 2);
        }
        return sum;
    }

    public static double sum(double[] numbers) {
//Write a function that takes an array of numbers and returns the sum of the numbers. The
// numbers can be negative or non-integer. If the array does not contain any numbers
// then you should return 0.
        if (numbers.length == 0) return 0;
        double sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        return sum;
//    return Arrays.stream(numbers).sum();
    }

    public static int[] countBy(int x, int n) {
//Create a function with two arguments that will return an array of the first n multiples of x.
//
//Assume both the given number and the number of times to count will be positive numbers greater than 0.
//
//Return the results as an array or list ( depending on language ).
        //primer:
//countBy(1,10)  // should return  {1,2,3,4,5,6,7,8,9,10}
//countBy(2,5)  // should return {2,4,6,8,10}
        // moe reshenie:
//        int[] array =new int[n];
//         for(int i=0, f=1; i<=n-1; i++,f++){
//            array[i]=x*f;
//        }
//            return array;

        return IntStream.rangeClosed(1, n)
                .map(i -> i * x)
                .toArray();
    }

    public static int[] map(int[] arr) {
//Given an array of integers, return a new array with each value doubled.
//
//For example:
//
//[1, 2, 3] --> [2, 4, 6]
        return Arrays.stream(arr).map(i -> i * 2).toArray();
    }

    public static int persistence(long n) {
//Write a function, persistence, that takes in a positive parameter num and returns its
// multiplicative persistence, which is the number of times you must multiply the digits
// in num until you reach a single digit.
//
//39 --> 3 (because 3*9 = 27, 2*7 = 14, 1*4 = 4 and 4 has only one digit)
//999 --> 4 (because 9*9*9 = 729, 7*2*9 = 126, 1*2*6 = 12, and finally 1*2 = 2)
//4 --> 0 (because 4 is already a one-digit number)
        class Inner {
            public List doIt(long n) {
                String str = String.valueOf(n);
                List<Integer> list = new ArrayList<>();
                for (int i = 0; i < str.length(); i++) {
                    list.add(i, Integer.parseInt(String.valueOf(str.charAt(i))));
                }
                return list;
            }
        }

        Inner inner = new Inner();
        List<Integer> list = inner.doIt(n);
        int count = 0;
        if (list.size() > 1) {
            do {
                do {
                    list.set(0, list.get(0) * list.get(0 + 1));
                    list.remove(0 + 1);
                } while (list.size() > 1);
                count++;
                if (list.get(0) > 9) list = inner.doIt(list.get(0));
            } while (list.size() > 1);
            return count;
        } else return 0;
//--------------------------------------------------------------------------------------------------------------------------------------------------------
        //reshenie chela #1:
//public int maltiplicatinOfElements(int num){
//    int replacementOfNumber=num;
//    int multiplicator=1;
//
//    if(replacementOfNumber/10==0)return 0;
//
//    for( ;replacementOfNumber>0;replacementOfNumber/=10){ // esli podelit lybyy cifry <10 to polychim 0. Oznachaet chto y nas tolko 1 cifra,ona po ysloviy
//        multiplicator*=replacementOfNumber%10;      //zadachi nas ne interesyet.
//    }
//    return maltiplicatinOfElements(multiplicator)+1;//snachala vipolniaetsia vizov rekyrsivnogo metoda, zatem, kogda samii poslednii vizov zavershitsia
//    //vixodom iz rekyrsii, kazdii vizvonni metod v steke takzze poocheredi bydet zavershatsia vozvraschaia
//    //+1 kazdii, tem samim mi polychaem chislo skolko raz bil vizvan metod. T.e. metod reshaet odny
//    //"progonky" (odin raz peremnozzaet vse elementri) a zatem idet na rekyrsiy.
//}---------------------------------------------------------------------------------------------------------------------------------------------------------
//      reshenie chela #2 ochen kryto s ispolzovanie stream-ov, smotri primer v 'Osobennosti_Ispolzovaniia_Reduce' !!!
//public static int persistence(long n) {
//    int times = 0;
//    while (n >= 10) {
//      n = Long.toString(n).chars().reduce(1, (r, i) -> r * (i - '0'));
//      times++;
//    }
//    return times;
//  }
    }

    public static String order(String words) {

//Your task is to sort a given string. Each word in the string will contain a single number.
// This number is the position the word should have in the result.
//
//Note: Numbers can be from 1 to 9. So 1 will be the first word (not 0).
//
//If the input string is empty, return an empty string. The words in the input String will only contain valid consecutive numbers.
//Examples
//"is2 Thi1s T4est 3a"  -->  "Thi1s is2 3a T4est"
//"4of Fo1r pe6ople g3ood th5e the2"  -->  "Fo1r the2 g3ood 4of th5e pe6ople"
//""  -->  ""
        if (words.isEmpty()) return words;
        String arrayString[] = words.split(" ");
        String rezult[] = new String[arrayString.length];
        for (int i = 0; i < arrayString.length; i++) {
            for (int a = 0; a < arrayString[i].length(); a++) {
                int temp = i + 1;
                if (Character.isDigit(arrayString[i].charAt(a))) {
                    rezult[arrayString[i].charAt(a)-'1'] = arrayString[i];
                }
            }
        }
        return String.join(" ",rezult);


//            return Arrays.stream(words.split(" "))
//                    .sorted(Comparator.comparing(s -> Integer.valueOf(s.replaceAll("\\D", ""))))
//                    .reduce((a, b) -> a + " " + b).get();


    }

    public static List<Object> filterList(final List<Object> list) {
//create a function that takes a list of non-negative integers and strings and returns a new list with the strings filtered out.
//Example:
//Kata.filterList(List.of(1, 2, "a", "b")) => List.of(1,2)
        List finalDigitList=new ArrayList<>();
        for(int i=0;i<list.size();i++){
            if(list.get(i) instanceof Integer)finalDigitList.add(((Integer) list.get(i)));
        }
        return finalDigitList;
    }

    public static int duplicateCount(String text) {
//Count the number of Duplicates
//Write a function that will return the count of distinct case-insensitive alphabetic characters and numeric digits that occur more than
// once in the input string. The input string can be assumed to contain only alphabets (both uppercase and lowercase) and numeric digits.
//
//Example
//"abcde" -> 0 # no characters repeats more than once
//"aabbcde" -> 2 # 'a' and 'b'
//"aabBcde" -> 2 # 'a' occurs twice and 'b' twice (`b` and `B`)
//"indivisibility" -> 1 # 'i' occurs six times
//"Indivisibilities" -> 2 # 'i' occurs seven times and 's' occurs twice
//"aA11" -> 2 # 'a' and '1'
//"ABBA" -> 2 # 'A' and 'B' each occur twice
        text=text.toLowerCase();
        String rezult="";
        Map <String, Integer> map=new HashMap();
        for(int i=0; i<text.length();i++){
            if(!rezult.contains(String.valueOf(text.charAt(i)))) {
                rezult+=text.charAt(i);
            }
            else {
                    if(map.containsKey(String.valueOf(text.charAt(i)))) {
                        map.compute(String.valueOf(text.charAt(i)),(k,v)-> v = v + 1);
                    }
                    else map.put(String.valueOf(text.charAt(i)),2);
            }
        }
        return map.size();
//---------------------------------------------------------------------------------------------------
// reshenie chela # 1
//public static int duplicateCount(String text) {
//      HashMap<Character, Integer> map = new HashMap<>();
//        for (char c : text.toLowerCase().toCharArray()) {
//            map.put(c, map.containsKey(c) ? 1 : 0);
//        }
//      return (int) map.values().stream().filter(e -> e > 0).count();
//    }
// vse zalivaet v map.
// esli simvol tam est to stavit '1', esli net stavit'0', olgaritm ne schitaet kolichestvo elementov
// syt v tom - esli element vstrechaetsia > 1-go raza to znachenie v map bydet=1, esli tolko 1 raz to znachenie=0.
// Dalee znacheniia iz map perevodiatsia v stream, i filtryytsia/schitaytsia, no te chto bolshe 0.
//
//
//-----------------------------------------------------------------------------------------------------------------------
//      reshenie chela # 2;
//         List<String> list = Arrays.asList(text.toLowerCase().split(""));
//        return (int) list.stream().filter(s -> Collections.frequency(list, s) > 1).distinct().count();
//
//
//
//
//
    }

    public static boolean isValid(char[] walk) {
//You live in the city of Cartesia where all roads are laid out in a perfect grid. You arrived ten minutes
// too early to an appointment, so you decided to take the opportunity to go for a short walk. The city provides
// its citizens with a Walk Generating App on their phones -- everytime you press the button it sends you an array
// of one-letter strings representing directions to walk (eg. ['n', 's', 'w', 'e']). You always walk only a single
// block for each letter (direction) and you know it takes you one minute to traverse one city block, so create a
// function that will return true if the walk the app gives you will take you exactly ten minutes (you don't want
// to be early or late!) and will, of course, return you to your starting point. Return false otherwise.

        // moe reshenie #1
//        if(walk.length!=10)return false;
//        String str=String.valueOf(walk);
//        int n = (int) Stream.of(str.split("")).filter(e -> e.equals(String.valueOf('n'))).count();
//        int s = (int) Stream.of(str.split("")).filter(e -> e.equals(String.valueOf('s'))).count();
//        int w = (int) Stream.of(str.split("")).filter(e -> e.equals(String.valueOf('w'))).count();
//        int e = (int) Stream.of(str.split("")).filter(x -> x.equals(String.valueOf('e'))).count();
//        return (n==s && n+s==str.length())
//                || (w==e && w+e==str.length())
//                || ( (  (n==s)&&(n+s)%2==0) && (  (w==e)&&(w+e)%2==0 ) ) ;
//88888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888
        // moe reshenie #2
//            if(walk.length!=10)return false;
//            int northSouth=0;
//            int westEast=0;
//            for(int i=0;i<walk.length;i++) {
//                switch (walk[i]) {
//                    case 'n':
//                        northSouth++;
//                        break;
//                    case 's':
//                        northSouth--;
//                        break;
//                    case 'w':
//                        westEast++;
//                        break;
//                    case 'e':
//                        westEast--;
//                        break;
//                }
//            }
//            if (northSouth==0 && westEast==0){
//                return true;
//            }else return false;
//88888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888
        //moe reshenie #3
//nedostatok v tom chto proxodit 5 raz po String
//dostoinstvo v lakonichnosti
    String str=new String (walk);
   return  str.chars().filter(e->e=='n').count() == str.chars().filter(e->e=='s').count()
           &&
           str.chars().filter(e->e=='w').count() == str.chars().filter(e->e=='e').count()
           &&
           str.chars().count()==10;


    }

    public static String longestConsec(String[] strarr, int k) {
//You are given an array(list) strarr of strings and an integer k. Your task is to return the
// first longest string consisting of k consecutive strings taken in the array.
        if (strarr.length==0 || (k > strarr.length) || (k <= 0)) return "";
        List<StringBuilder>stringList=new ArrayList<>();
        String temp="";
        for(int i=0;i<strarr.length-(k-1);i++){
            StringBuilder stringBuilder =new StringBuilder(strarr[i]);
            for(int countLength=1; countLength<k; countLength++){
                stringBuilder.append(strarr[i+countLength]);
            }
            stringList.add(stringBuilder);
            temp=stringBuilder.length()>temp.length()? String.valueOf(stringBuilder) :temp;
        }
        return temp;
    }

    public static String smash(String... words) {
//Write a function that takes an array of words and smashes them together into a sentence and returns the sentence.
// You can ignore any need to sanitize words or add punctuation, but you should add spaces between each word.
// Be careful, there shouldn't be a space at the beginning or the end of the sentence!
        return String.join(" ",words);
    }

    public boolean check(String sentence){
//A pangram is a sentence that contains every single letter of the alphabet at least once. For example,
// the sentence "The quick brown fox jumps over the lazy dog" is a pangram, because it uses the
// letters A-Z at least once (case is irrelevant).
//Given a string, detect whether or not it is a pangram. Return True if it is, False if not. Ignore
// numbers and punctuation.
        // moe reshenie!
//        char chArray[]=new char[26];             // create alfabit
//        sentence=sentence.toLowerCase();
//        int countRezult=0;
//        for(int i=0; i<chArray.length;i++){
//            chArray[i]=(char)('a'+i);
//            countRezult+=sentence.contains(String.valueOf(chArray[i]))? 1 : 0;
//        }
//        return countRezult==chArray.length;


//--------------------------------- Reshenie chela #1 -----------------------------------------------------------------------
//        for(char ch='a';ch<='z'; ch++){
//            if(!sentence.toLowerCase().contains(""+ch)); //<--Vot zdes ooochen krytoi moment, esli napisat prosto ch
//                 return false;                          //to vidast oshibky, a ""+ch <- eto yzze kak-bi stroka!!!
//        }
//        return true;

//--------------------------------- Reshenie chela #2-----------------------------------------------------------------------
        return sentence.chars().map(Character::toLowerCase).filter(Character::isAlphabetic).distinct().count() == 26;
    }

    public static String numberToString(int num) {
//We need a function that can transform a number (integer) into a string.
//What ways of achieving this do you know?

        String str=String.valueOf(num);
        return str;

        //  ili return Integer.toString(num);
        // ogo a tak mozzno bilo ??? -->    return ""+num;   polychaetsia k pystoi stroke plysyem int ...       kryto
        //tozze samoe i num+"";
        // ili return String.format("%d",num);
    }

    public int cockroachSpeed(double x){
//The cockroach is one of the fastest insects. Write a function which takes its speed in km per hour and returns it in cm per second,
// rounded down to the integer (= floored).
        return (int)Math.floor((x*1000)/60*100/60);


    }

    public static List<Long> sumDigPow(long a, long b) {
//napisat metod kotorii ischet takie chisla v range(promezzytok): a-b;
//89 = 8^1 + 9^2
//135 = 1^1 + 3^2 + 5^3
//Tak ia poprobyy esce raz!
// v obschem tyt nado-bilo vozvesti v stepen kazzdyy cifry chisla (a pobitovii znak syschestvyet chtobi
// zapytat menia !!! vot zze syki, pochti odoleli menia), pervaia cifra dolzzna bit vsegda v pervoi stepeni,
//vtoraia v 2-stepeni, 3-ia v 3-ei i t.d. A v symme dolzzna bit vxodiaschaia cifra.
//chto bydy delat:
//1)-
        List list=new ArrayList();
        for(long i=a; i<b; i++){
            char charArray[]=String.valueOf(i).toCharArray();
            int sum=0;
            int power=1;
            for(int c=0;c<charArray.length;c++,power++){
                sum+=Math.pow(Character.digit(charArray[c],10),power);
            }
            if(i==sum)list.add(i);
        }
        return list;
    }

    public static boolean setAlarm(boolean employed, boolean vacation) {
        if(employed==true && vacation==false)return true;
        if(employed==false && vacation==false)return false;
        if(employed==true && vacation==true)return false;
        if(employed==false && vacation==false)return false;
        return false;

//reshenie chela     return employed && !vacation;
    }

    public static long findNb(long m) {
//Your task is to construct a building which will be a pile of n cubes. The cube at the bottom will have a volume of n3
// the cube above will have volume of (n−1)3 and so on until the top which will have a volume of 1 V tret`ei stepeni
//You are given the total volume m of the building. Being given m can you find the number n of cubes you will have to build?

//---------------------------------MOE RESHENIE------------------------------------------
//        long count=0;
//        for(long i =1; m>0;i++ ){
//            long someInt=(long) Math.pow(i,3);
//            count++;
//            m=m-someInt;
//        }
//        return m==0? count:-1;
//------------------------------------RESHENIE CHELA-------------------------------------
        long mm = 0, n = 0;
        while (mm < m) mm += ++n * n * n;   //VOT ZDES KLASSNO: ++n <--tak-kak iznachalno n=0; a ia ispolzoval i=1;
        return mm == m ? n : -1;
    }

    public static int opposite(int number) {
//Very simple, given an integer or a floating-point number, find its opposite.
        return ~number + 1;    //reshenie chelov eto: return-number; prikolno tem chto menshe gemora.

    }

    static String greet(String name, String owner) {
        return name.equals(owner)? "Hello boss" : "Hello guest";
    }

    public static String expandedForm(int num) {
//You will be given a number and you will need to return it as a string in Expanded Form. For example:
//70304 = "70000 + 300 + 4";

        int delitel=10;
        String rezult="";
        for(int i=num;i>0;delitel*=10){
            if(i%delitel==0)continue;
            int temp =i%delitel;
            i -= temp;
            rezult = rezult == "" ? temp + "" : temp + " + " + rezult;//new rezult+rezult but not rezult+ new rezult
        }
        return rezult;
    }

    public static int enough(int cap, int on, int wait){
//write a simple program telling him if he will be able to fit all the passengers.
        cap=cap-on;
        if(wait>cap)return wait-cap;
        else return 0;

    }

    public static boolean checkForFactor(int base, int factor) {
        return (base % factor==0);
    }

    public static char getGrade(int s1, int s2, int s3) {
// Trebyetsia poshitat srednee iz vxodiaschix argymentov i v zavisimostri ot rezyltata vivesti sootvetstvyyschii char:
//90 <= score <= 100 'A'    t.e esli rezyltat <100 i rezyltat >=90 vivesti 'A';
//80 <= score < 90	 'B'    i t.d.
//70 <= score < 80	 'C'
//60 <= score < 70	 'D'
//0 <= score < 60	 'F'

//Moe reshenie:----------------------------------------------------------------------------------------------------
//        int rezult=(s1+s2+s3)/3;
//        return rezult>90?'A':
//                rezult<90 && rezult>=80? 'B':
//                        rezult<80 && rezult>=70?'C':
//                            rezult<70 && rezult>=60?'D':'F';

//Reshenie chela #1------------------------------------------------------------------------------------------------
        int rezult=(s1+s2+s3)/3;
        return rezult >= 90 ? 'A':rezult >= 80 ? 'B':rezult >= 70 ? 'C':rezult >= 60 ? 'D':'F';//mozzno zapisat pokoroche.

    }

    public static boolean betterThanAverage(int[] classPoints, int yourPoints) {
//You receive an array,calculate the average and compare with your score! Return True if you're better, else False!
//For calculating the average point you may add your point to the given array!
//---------------------------------------moe reshenie----------------------------------------------------
//        int classAVG=0;
//        for(int i=0;i<classPoints.length;i++){
//            classAVG+=classPoints[i];
//        }
//        classAVG=(classAVG+yourPoints)/(classPoints.length+1);
//        return yourPoints>classAVG;
//--------------------------------------reshenie chela #1 --------------------------------------------------
//ispolzovanie s Stream
//        return Arrays.stream(classPoints).average().orElse(0)<yourPoints;
//--------------------------------------reshenie chela #2 -------------------------------------------------
// mozzno okazivaetsia i v ruchnyy poschitat AVG, stranno chto chel znaet metod sum() no neznaet average().
//mozzet ne znal kak dostat polychennoe znachenie v rezyltate raboti metoda average();
//V obschem tyt vse zdelano v rykopashnyy. Tak tozze mozzno.
//        return IntStream.of(classPoints).sum()/classPoints.length < yourPoints;

//--------------------------------------reshenie chela #3 --------------------------------------------------
        return java.util.stream.IntStream.of(classPoints).average().getAsDouble() < yourPoints;
    }

    public static String seriesSum(int n) {
//write a function which returns the sum of following series upto nth term(n).
//Series: 1 + 1/4 + 1/7 + 1/10 + 1/13 + 1/16 +...
//You need to round the answer to 2 decimal places and return it as String.
        double rezult=1.00d;
        final int delimoe=1;
        for(int i=1,count=4;i<n;i++,count+=3){
            rezult+=(double) delimoe/count;
        }
        return String.format("%.2f",rezult);
    }

    public static String doubleChar(String s){
//Given a string, you have to return a string in which each character (case-sensitive) is repeated once.
//* "String"      -> "SSttrriinngg"
//* "Hello World" -> "HHeelllloo  WWoorrlldd"
//* "1234!_ "     -> "11223344!!__  "

        StringBuilder output= new StringBuilder();
        for(int a=0;a<s.length();a++){
            for(int i=0; i<2; i++){
                output.append(s.charAt(a));
            }
        }
        return String.valueOf(output);

//reshenie chela:      return s.replaceAll(".", "$0$0");            Kryto, ne?
//reshenie chela 2:    return s.chars().mapToObj(c -> (char) c + "" + (char) c).collect(joining());
    }

    public static int solveSuperMarketQueue(int[] customers, int n) {
//Your task is write a function to calculate the total time required for all the customers to check out!

//  Moe reshenie osnovivolos na vichetanii. Ia sozdaval massiv s vmestimost`y soglassno kolichestvy kass 'n'
// v massiv ia poocheredi zapisival elementi iz customers. Takim obrazom y menia polychalsia massiv k primery s dlinnoi
// 2 gde lezzali znacheniia pervix dvyx elementov iz customers. Dalee za odny progonky cikla ia otnimal edinicy
// y kazzdogo elementa, a posle cikla zapisival +1 k rezyltaty, dalee ia proverial ne iavliaetsia li kakoi-libo
// iz elementov massiva ravnim 0. I esli element bil raven 0, ia zamenial ego na sledyyschii po schety iz customers.Kogda
// v konce elementov dlia dobovlenia nebilo i odin iz elementov v massive stanovilsia nylem ia zakanchival cikl i
// delal podschet rezyltat + to chto ostalos v cikle (ne nol).Algotitm ne proshol proverky po vremeni vipolneniia,
// iavliaetsia dlinnim i trydno chitaemim, ne iziaschnii.

//        int rezult=0;
//        int countElementsFromCustomers=n;
//        int array[]=new int[n];
//        boolean booleanPermition=true;
//        int onePoint=1;
//        int countNumbers=0;
//
//        for(int i=0;i<n; i++){
//            array[i]=customers[i];
//        }
//
//        for(int a = 0; booleanPermition; a++) {
//            for (int i = 0; i < array.length; i++) {
//                if (array[i]!= 0 ) {
//                    array[i]-=onePoint;
//                }else if(countElementsFromCustomers<customers.length){
//                    array[i]=customers[countElementsFromCustomers]-1;
//                    countElementsFromCustomers++;
//                }
//            }
//            rezult += 1;
//            for(int q=0;q<array.length;q++){
//                if(array[q]>0)countNumbers++;
//            }
//            if(countNumbers==1 && countElementsFromCustomers==customers.length){
//                booleanPermition=false;
//                break;
//            }
//            countNumbers=0;
//        }
//        rezult+= Arrays.stream(array).sum();
//        System.out.println(rezult);
//        return rezult;
//        return 0;


// Reshenie chela------------------------------------------------------------------------------------------------------
// sozdaetsia massiv dlinnoy v kolichestvo kass, tyda zapisivaytsia znacheniia iz customers.No znacheniia zapisivaetsia
//poodnomy i srazy posle zapisi v massiv proizvoditsia sortirovka ot menshego k bolshemy. Pri etom zapis v massiv
//vsegda proizvoditsia pytem dobovleniia novogo znachenia k yzze syschestvyyschemy znacheniy pod indeksom [0],a zatem
//sortirovka:bolshee znachenie polychaetsia sprava, menshee sleva.
        int[] result = new int[n];
        for(int i = 0; i < customers.length; i++){
            result[0] += customers[i];
            Arrays.sort(result);
        }
        return result[n-1];
    }

    public static int[] arrayDiff(int[] a, int[] b) {
//vernyt massiv s temi elementami massiva 'a' kotorie ne povtoriytsia v 'b', kotorix net v b
//Primer: a={12,3,55}, b={12,55}; returen new int[]{3}

        if(a.length==0 || b.length==0)return a;
        List <Integer>list=new LinkedList<>();
        for(int i=0;i<a.length;i++){
            if(binariSerch(b,a[i])==-1){
                list.add(a[i]);
            }
        }
        return list.stream().mapToInt(i -> i).toArray();

//reshenie chela- ochen elegantno!!!
//        List<Integer> listA = Arrays.stream(a).boxed().collect(Collectors.toList());
//        List<Integer> listB = Arrays.stream(b).boxed().collect(Collectors.toList());
//        listA.removeAll(listB);
//        return listA.stream().mapToInt(e -> e).toArray();
    }

    private static int binariSerch(int array[], int serchedNumber) {
        int left=0;
        int right=array.length-1;
        int middle=array[0];
        while(left<=right){
            middle=(left + right)/2;
            if(array[middle]==serchedNumber){
                return middle;
            }
            else if(array[middle] < serchedNumber)left=middle+1;
            else if(array[middle] > serchedNumber)right=middle-1;
        }
        return -1;
    }

    public static int howOld(final String herOld) {
//Write a program that returns the girl's age (0-9) as an integer.
//Assume the test input string is always a valid string. For example, the test input may be "1 year old" or "5 years old".
// The first character in the string is always a number.
        return Character.digit(herOld.charAt(0),10);
       // Character.getNumericValue(herOld.charAt(0));

    }

    public static int nbYear(int p0, double percent, int aug, int p) {

        double temp=p0;
        int yersCount;
        for( yersCount=0; p0<p;yersCount++){
            p0= (int) (p0 +(p0*(double)percent/100)+aug);

        }


        return yersCount;
    }



    public static void main(String[] args) {
        System.out.println(S_Codewars.nbYear(1000 ,2,50,1200));


    }

}

