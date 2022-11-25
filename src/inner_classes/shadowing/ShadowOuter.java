package inner_classes.shadowing;

public class ShadowOuter {
    int x=0;//peremennaia vneshnego klassa 'x' shadowed peremennoi inner classa ShadowInner 'x', kotoraia v svoy
    // ochered shadowed peremennoi parametra 'x' v metode show. Sledyet obraschatsia k etim peremennim
    // v sootvetstvii s sintaksisom : x <--peremennaia iz parametra
    //                           this.x <--peremennaia klassa(v nashem slychae ShadowInner classa)
    //               ShadowOuter.this.x <--peremennaia vneshnego classa(v nashem slychae ShadowOuter classa)

    class ShadowInner{
        int x=10;

        public void show(int x){
            System.out.println("v parametrax"+x);
            System.out.println("class ShadowInner member"+this.x);
            System.out.println("class ShadowOuter member"+ShadowOuter.this.x);
        }


    }
}
