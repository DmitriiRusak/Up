package myLibrary.deistvia;
//Помимо того, что инкремент увеличивает значение переменной, он также и возвращает значение,
// которое тоже можно записать в переменную, и вот тут уже есть разница. Постинкримент сначала
// возвращает значение переменной, а потом увеличивает его, а прединкремент наоборот.
public class Inkrement {
    public static void main(String[] args) {
        int a = 10;
        int b = 15;

        //a++; //Постинкримент ili postfiksnii inkrement.
        //++b; // прединкремент ili prefiksnii inkrement
        System.out.println(a++);// ogo vivedet 10, a ne 11, prikol,
        System.out.println(a);  //a seichas 11 ))) klassno
        System.out.println(++b);//o a tak srazy 16 )))




    }
}
