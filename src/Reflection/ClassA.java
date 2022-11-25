package Reflection;

public class ClassA {
   private int number;
   private String str = "default";

   private ClassA (int value){
      number=value;
   }


   private ClassA(){

   }

   private ClassA( String name) {
       this.str = name;
   }

   public int getNumber() {
      return number;
   }

   public void setNumber(int number) {
      this.number = number;
   }

   private void printDate(){

      System.out.println(number + " " + str);
   }

   public void setName(String name) {
      this.str = name;
   }
   /*
   *
    */
   @Override
   public String toString(){
      return this.number+" "+this.str;
   }
   /*
   *
    */
   private void doSumsing(){
      System.out.println("doingSumsingInClassA");
   }


}
