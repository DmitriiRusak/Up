package algoritms.Algoritms;
//Бинарный поиск - это алгоритм на входе получает отсортированный список элементов
//С бинарным поиском вы каждый раз proveriaete число в середине диапазона и ис'КЛючаете половину
// оставшихся чисел.Какое бы число я ни задумал ot 0-100 вы гарантированно сможете угадать его
// не более чем за 7 popitok потому что с каждой попыткой исключается половина оставшихся чисел!<--sviazano s logorifmami


//Danni sposob tesno zviazan s logorifmomi. Chtobi poniat chto algoritm binarnogo poiska rabotaet korrektno
//nado yznat skolko potrebyetsia iteracii dlia naxozzdeniia nyzznogo elementa. Dlia etogo vozmem dlinny
//massiva eta bydet chislo v virazzenii logorifma, naprimer 11. Teper nado naiti logorifm (pokozatel stepeni,
// t.e. v kakyy stepen nado vozvesti chislo kotoroe stoit v osnovanii, a v osnovanii y nas, pri ispolzovanii
// dannogo algoritma vsegda 2, tak-kak vsegda delim po polovine). Zapisvaetsia eto vse v sledyyschem poriadke.
//log2 11 <--gde: 2-eto chislo v osnovanii, 11-eto chislo v virazzenii logorifma. Chtobi naiti logorifm 11 nado
//2*2*2... poka ne polychim 11 ili chislo vishe chem 11. Rezyltat zdes = 4. (2*1=2; 2*2=4; 4*2=8; 8*2=16).
//Polychaetsia chto danni algoritm s dlinnoi massiva 11 dolzzen naiti rezyltat maksimym za 4 iteracii.
//Prikolno, tolko chto proveril-vse tak i est. Logorifmi sila!!!
// Obschaia formyla log2 n; <--2-vsegda odinakovo v etom algoritme, n-eto chislo v virazzenii

// Если угадивать число поочереди, то на массив из к примеру 100 элементов уёдёт 100 попиток,  Таким образом,
// максимальное количество попыток совпадает с размером списка. Такое время выполнения называется линейным.
//ili slozznost vipolneniia algoritma lineinaia. “Линейная” означает, что при увеличении объема данных время на их
// передачу/obrabotky вырастет примерно пропорционально. Если данных станет в 2 раза больше, и времени на их передачу
// понадобится в 2 раза больше. Если данных станет больше в 10 раз, и время передачи увеличится в 10 раз.
// сложность нашего алгоритма определяется как O(n).<--!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
//О(n) означает, что вы по одному разу обращаетесь к каждому элементу списка.
// сложность алгоритма линейно растет с увеличением входного массива.

// Бинарный поиск выполняется за логарифмическое время. Cложность нашего алгоритма определяется как O(log n)


//Ooo prikolnii moment, mozzno chislo v virazzenii logorifma (dlinna massiva) delit na 2(tak-kak mi vsegda delim na poloviny)
// do tex por poka ne stanet 0 ili menshe, i skolko takix delenii bydet i bydet otvetom - za skolko raz mi ygodaem iskomoe
//chislo
import java.util.Arrays;

public class Binarnii_Poisk {

//   static int binariSerch(int arr[], int elementToSearch) {
//        int firstIndex = 0;
//        int lastIndex = arr.length - 1;
//
//        // условие прекращения (элемент не представлен)
//        while (firstIndex <= lastIndex) {
//            int middleIndex = (firstIndex + lastIndex) / 2;
//            // если средний элемент - целевой элемент, вернуть его индекс
//            if (arr[middleIndex] == elementToSearch) {
//                return middleIndex;
//            }
//
//            // если средний элемент меньше
//            // направляем наш индекс в middle+1, убирая первую часть из рассмотрения
//            else if (arr[middleIndex] < elementToSearch)
//                firstIndex = middleIndex + 1;
//
//                // если средний элемент больше
//                // направляем наш индекс в middle-1, убирая вторую часть из рассмотрения
//            else if (arr[middleIndex] > elementToSearch)
//                lastIndex = middleIndex - 1;
//        }
//        return -1;
//    }

// Realizaciia iteraciy
//count - dlia proverki kolichestva iteracii.
    static int binariSerch(int array[], int number) {
        int left=0;
        int right=array.length-1;
        int middle=array[0];
        int count=0;
        while(left<=right){
            count++;
            middle=(left + right)/2;
            if(array[middle]==number){
                System.out.println(count);
                return middle;
            }
            else if(array[middle] < number)left=middle+1;
            else if(array[middle] > number)right=middle-1;
        }
        System.out.println(count);
        return -1;
    }

//Realizaciia cherez rekyrsiy
static int binariSerchRekyrsivnaiaVersiia(int array[], int number,int left,int right) {

        while (left <= right) {
            int middle = (left + right) / 2;
            if (array[middle] == number) {
                return middle;
            }
            else if(array[middle]>number){
                binariSerchRekyrsivnaiaVersiia(array,number,left,middle-1);
                break;
            }
            else if(array[middle]<number){
                binariSerchRekyrsivnaiaVersiia(array,number,middle+1,right);
                break;
            }
        }
        return -1;
    }








    public static void main(String[] args) {
        int index[]={89, 57, 91, 47, 95, 3, 27, 22, 68, 99, 67};
        Arrays.sort(index);
        System.out.println(Arrays.toString(index));
        System.out.println(Binarnii_Poisk.binariSerch(index,99));


    }
}
