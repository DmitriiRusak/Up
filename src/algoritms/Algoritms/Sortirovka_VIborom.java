package algoritms.Algoritms;

import java.util.Arrays;
//Sortirovka viborom, kak ee ponimay ia...)
//Iznachalnii neotsortirovanni massiv yslovno delitsia na sortirovonnyy chast i ne otsortirovannyy. Na nachalnom etape poniatno
//chto ves massiv neotsortirovan. Proxodimsia vneshnim ciklam, soxroniaem v peremennoi pod nazvaniem 'tekyschiiIndeks' znachenie
// iteracionnoi peremennoi , pod etim indeksom  y nas bydet samoe malenkoe chislo nesmotria na to chto mi ne znaem v principe kakoe
// tam chislo, eto i ne nado. V vnytrennem cikle mi nachenaem s vtorogo elementa i sravnivaem znachenie chto menshe chislo pod
// indeksom tekyschiiIndeks iz vneshnego cikla ili chislo pod indeksom iteracionnoi peremennoi vnytrennego cikla i esli poslednee
// menshe to meniaem mestami s pomosch`y metoda swap().Kotorii posyti prosto perepisivaet znacheniia iz odnogo indeksa v drygoi.
//Slozznost olgoritma O(n2) <--? Ne znay. O(n)eto kogda lineinaia slozznost, t.e. vozrostaet proporcionalno kolichestvy elementov
//Zdes kazzdi element kak-bi otrabativaetsia po neskolko raz...
public class Sortirovka_VIborom {
    static void swap(int[] array, int left, int tekyschiiIndeks) {
        int tmp = array[left];
        array[left] = array[tekyschiiIndeks];
        array[tekyschiiIndeks] = tmp;
    }
    public static void main(String[] args) {
        int[] array = {10, 2, 10, 3, 1, 2, 5};
        System.out.println(Arrays.toString(array));
        for (int left = 0; left < array.length-1; left++) {
            int tekyschiiIndeks=left;
            for (int right = left+1; right < array.length; right++) {
                if (array[right] < array[tekyschiiIndeks]) {
                    tekyschiiIndeks = right;
                }
            }
            swap(array, left, tekyschiiIndeks);
        }
        System.out.println(Arrays.toString(array));


    }
}

