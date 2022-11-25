package arena;

import java.util.Arrays;

public class Arena4 {
    public static void main(String[] args) {
        int customers[]={ 10,2,3,3};  // 2,3,10-2=12; 10,2,3,3-2=10
        int numberOfTills=3;
        int rezult=0;
        int countElementsFromCustomers=numberOfTills;
        int array[]=new int[numberOfTills];
        boolean booleanPermition=true;
        int onePoint=1;
        int countNumbers=0;


        for(int i=0;i<numberOfTills; i++){
            array[i]=customers[i];
        }

        for(int a = 0; booleanPermition; a++) {
            for (int i = 0; i < array.length; i++) {
                if (array[i]!= 0 ) {
                    array[i]-=onePoint;
                }else if(countElementsFromCustomers<customers.length){
                    array[i]=customers[countElementsFromCustomers]-1;
                    countElementsFromCustomers++;
                }
            }
            rezult += 1;
            for(int q=0;q<array.length;q++){
                if(array[q]>0)countNumbers++;
            }
            if(countNumbers==1 && countElementsFromCustomers==customers.length){
                booleanPermition=false;
                break;
            }
            countNumbers=0;
        }
        rezult+= Arrays.stream(array).sum();
        System.out.println(rezult);
    }
}
