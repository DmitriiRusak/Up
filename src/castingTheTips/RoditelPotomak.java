package castingTheTips;

import exceptions.B;

class Bag implements interfaceProba{
    int e;
    int r=99;
    public void shows(){
        System.out.println("Bag");
    }
    public static void main(String[] args) {
//        Bag bag=new HandBag();      //sozdavaia ssilky ot Roditelia na OB`EKT potomka. Polychaem vozmozznost
//        bag.shows();                //privedenia ssilki k potomky i sootvetstvenno k ego chlenam klassa
//        ((HandBag)bag).show();
//************************************************************************************************************************
//        some_classes.Object b=new HandBag();
//        int array []={1,3,2};
//        b=array;                             // lyboi ob`ekt privodim k tipy some_classes.Object (v tom chisle i massiv);
//        System.out.println(((int[]) b)[1]);
//************************************************************************************************************************
//        Bag bag=new HandBag();       //vozmozzno takzze privedenie k tipy interface, esli klass ego realizyet
//        ((interfaceProba)bag).interfMetod();
//************************************************************************************************************************
//        Bag bag=new Bayl.StaticnesteedClass(); //privedenie k static nesteed class takzze rabotaet no
//        bag.shows();                          //takzze nyzzna ierrarxiia nasledovaniia
//        ((Bayl)bag).showt();//    bag(superClass)->Bayl(child of Bag)->StaticnesteedClass (child of Bayl)
//        ((Bayl.StaticnesteedClass)bag).showStatic();

    }

}
/*
*
 */
class HandBag extends Bag{
    public void show(){
        System.out.println("HandBag");
    }
}
/*
 *
 */
class Bayl extends Bag{

    public void showt(){
        System.out.println("bayl");
    }
    static class StaticnesteedClass extends Bayl{
        private int a=100;

        public void showStatic(){
            System.out.println("+++Static nesteed class+++");
        }
    }
}
/*
*
 */
interface interfaceProba{
    default void interfMetod(){
        System.out.println("interface");
    }
}