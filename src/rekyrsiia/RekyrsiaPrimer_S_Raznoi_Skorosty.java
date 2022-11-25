package rekyrsiia;

import java.util.Arrays;
//Danni primer pokazivaet skorost vipolneniia rekyrsivnogo vizova metodov s raznim postroeniem no s odinakovim
//povedeniem. Algoritmicheskii podxod samii bistri no imeet ogranichennoe kolichestvo steka vizovov t.e. esli
//kolichestvo elementov ochen bolshoe to bydet stack_Overflow.

//Primenenie strategii razdeliai i vlastvyi zaklychaetsia v tom chto kazzdi novii rekyrsivni vizov ymenshaet
//postavlennyy zadachy (задача должна сокращаться.)
//СОВЕТ
//Когда вы пишете рекурсивную функцию, в которой задействован массив, базовым случаем часто оказывается пустой массив или массив из одного элемента.
public class RekyrsiaPrimer_S_Raznoi_Skorosty {
    static int rekyrsionAlgoritmikSolution(int array[], int korektion){
        int rezult=array[korektion];
        if(korektion!=array.length-1){
            rezult+=rekyrsionAlgoritmikSolution(array, ++korektion);
        }
        return rezult;
    }
    /*
     *
     *
     *
     *
     */
    static int rekyrsionArrayApi(int array[]){
        int rezult=array[0];
        if(array.length!=1){
            rezult+=rekyrsionArrayApi(Arrays.copyOfRange(array,1,array.length));
        }
        return rezult;
    }
    /*
     *
     *
     *
     *
     */

    static int rekyrsionSumWithLoop(int[] array) {
        int rezult=array[0];
        if(array.length!=1){
            int temp[]=new int[array.length-1];
            for(int i=1, count=0;count<temp.length;i++,count++){
                temp[count]=array[i];
            }
            rezult+=rekyrsionSumWithLoop(temp);
        }
        return rezult;
    }
    /*
     *
     *
     *
     *
     */
    public static void main(String[] args) {

        int[] array = new int[11090];
        for(int i=0; i<array.length; i++){
            array[i]=i;
        }

        long time = System.currentTimeMillis();
        System.out.println(rekyrsionSumWithLoop(array));
        System.out.print("Vremia vipolneniia rekyrsii s ciklom - ");
        System.out.println(System.currentTimeMillis()-time);

        long tim = System.currentTimeMillis();
        System.out.println(rekyrsionArrayApi(array));
        System.out.print("Vremia vipolneniia rekyrsii s API - ");
        System.out.println(System.currentTimeMillis()-tim);

        long time1 = System.currentTimeMillis();
        System.out.println(rekyrsionAlgoritmikSolution(array,0));
        System.out.print("Vremia vipolneniia rekyrsii algoritmicheski - ");
        System.out.println(System.currentTimeMillis()-time1);


    }

}
