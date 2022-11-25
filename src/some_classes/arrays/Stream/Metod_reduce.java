package some_classes.arrays.Stream;

import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Optional;
import java.util.stream.Stream;
//Метод reduce принимает  лямбда-выражение известное как аккумулятор (Accumulator),
// которое служит для сворачивания данных в одну "кучу". Est 3 varianta reduce, zdes 2.

//  reduce(T identity, BinaryOperator<T> accumulator);
//  identity — элемент, который является начальным значением операции и результатом по умолчанию, если поток пуст.
//  Accumulator – a function that takes two parameters: a partial result of the reduction operation and the next element of the stream
//  Accumulator- t.e. provoditsia ykazannaia operaciia mezzdy pervim elementom i vtorim, polychennii rezyltat ychastvyet v dalneishei operacii
//               s tretim elementom.
//
//
//
//  Optional<T> reduce(BinaryOperator<T> accumulator); Accumulator – a function that takes two parameters: a partial result of the reduction
// operation and the next element of the stream
// Poxody on provodit operaciyy ykazannyy posle '->' i delaet operaciy snachala s pervim elementom i vtorim, polychenni rezyltat
// provodim s tretim elementom i t.d.




public class Metod_reduce {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
        int resulti = numbers
                .stream()
                //.reduce(100, (subtotal, element) -> subtotal + element);  //V etom primere esli isxodnie dannie bydet == 0, verenetsia 100
                .reduce(0, (subtotal, element) -> subtotal + element);  //V etom primere esli resilti bydet == 0, verenetsia 0
        System.out.println("proverka slozzeniia: 1+2+3+4+5+6 ="+resulti);
System.out.println("////////////////////////////////////////////////////////////////////////////////");

        List<Integer> numbers1 = Arrays.asList(4, 2, 3, 5);
        Optional<Integer> sum = numbers1.stream().reduce((left, right) -> left - right);//zdes skladivaem 1-i element i 2-oi, polychennyy symmy s 3-im elementom.
        System.out.println("proverka vichitanie: 4-2-3-5 ="+sum);
        sum.ifPresent(System.out::println); //sum eto ob`ekt ot Optional.

System.out.println("////////////////////////////////////////////////////////////////////////");
        Stream<Integer> numbersStream = Stream.of(1, 2, 3, 4, 5, 6);
        Optional<Integer> result = numbersStream.reduce((x, y) -> x * y);
        System.out.println("proverka ymnozzeniia: 1*2*3*4*5*6= "+result.get()); // 720

System.out.println("////////////////////////////////////////////////////////////////////////");
        List<String> letters = Arrays.asList("a", "b", "c", "d", "e");
        String resul = letters                                      //zdes takzze est identity,i v slychae pystogo konteinera dannix bydet vozvrascheno "";
                .stream()
                .reduce("", (partialString, element) -> partialString + element);
        System.out.println("proverka slozeniia String: a+b+c+d+e ="+resul);  //proisxodit skleivanie strok 'abcde'

System.out.println("////////////////////////////////////////////////////////////////////////");
        String resuLt = letters //ispolzyem predidyschii list
                .stream()       //kazzdii strim ispolzyetsia tolko raz
                .reduce(
                        "", (partialString, element) -> partialString.toUpperCase() + element.toLowerCase());
        System.out.println("proverka izmeneniia shrifta:\"a\", \"b\", \"c\", \"d\", \"e\" ="+resuLt);

System.out.println("////////////////////////////////////////////////////////////////////////");
            long n=5323;
            int times = 0;
            while (n >= 10) {
                n = Long.toString(n).chars().reduce(1, (r, i) -> r * (i - '0'));
                times++;
            }

    }
}