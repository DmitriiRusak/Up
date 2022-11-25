package rekyrsiia;
//Write a function, that takes in a positive parameter num and returns its multiplicative persistence, which is the number of times you must
// multiply the digits in num until you reach a single digit.
//For example:
//39 --> 3 (because 3*9 = 27, 2*7 = 14, 1*4 = 4 and 4 has only one digit)
//999 --> 4 (because 9*9*9 = 729, 7*2*9 = 126, 1*2*6 = 12, and finally 1*2 = 2)
//4 --> 0 (because 4 is already a one-digit number)
public class RekyrsiaPrimerTri {
    public int maltiplicatinOfElements(int num){
    int replacementOfNumber=num;
    int multiplicator=1;

    if(replacementOfNumber/10==0)return 0;

    for( ;replacementOfNumber>0;replacementOfNumber/=10){ // esli podelit lybyy cifry <10 to polychim 0. Oznachaet chto y nas tolko 1 cifra,ona po ysloviy
        multiplicator*=replacementOfNumber%10;      //zadachi nas ne interesyet.
    }
    return maltiplicatinOfElements(multiplicator)+1;//snachala vipolniaetsia vizov rekyrsivnogo metoda, zatem, kogda samii poslednii vizov zavershitsia
    //vixodom iz rekyrsii, kazdii vizvonni metod v steke takzze poocheredi bydet zavershatsia vozvraschaia
    //+1 kazdii, tem samim mi polychaem chislo skolko raz bil vizvan metod. T.e. metod reshaet odny
    //"progonky" (odin raz peremnozzaet vse elementri) a zatem idet na rekyrsiy.
}
    public static void main(String[] args) {
        RekyrsiaPrimerTri ob=new RekyrsiaPrimerTri();
        System.out.println(ob.maltiplicatinOfElements(39));
    }
}
