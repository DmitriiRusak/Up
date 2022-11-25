package myLibrary.deistvia;

public class Iz_Chara_V_Int_Iz_Int_V_Char {
    public static void main(String[] args) {
        int a=5;
        char s=(char) a;//<-xochy zapisat 5 v s, no polychaem s=kvakoziabri A pochemy? Potomy chto: 5 v ASCII eto kvakaziabri, i imenno ix i vidaet char. A ne znachenie v ASCII
        System.out.println(s);//s=kvakoziabri. Chtobi polychit 5, nado zdelat a-'0' i zapisat rezyltat v int-ovyy peremennyy;
        int q = a-'0';// 0 =48, sootvetstvenno berem 'a'-ono ravno 5 - 48 = -43...O chet-to ne tyda, davai splysyem
        q=a+'0';    //polychaem 53. Taaak esli seichas zdelat privedenie k char to polychim '5' kak char. probyem
        System.out.println("ozidaem '5'= "+(char) q);// polychaem '5'. A kak polychit int 5 ? Mozzet privesti k int? probyem
        System.out.println((int)q);// nee, polychaem 53. OOO nado q-'0' t.e. q=53-'0'=48 ->53-48=5. probyem...
        System.out.println("oziday 5= "+(q-'0')); // Da polychaem 5 kak int.
        //Kogda int perevodish v char to zapisivaetsia v char simvol iz ASCII kotoromy sootvetstvyet int. Esli xotim zapisat v char k primery 5
        // to nado znat chemy sootvetstvyet '5', v ASCII eto 53. Znachit esli xochesh zapisat 5 v char to int nado chtob bil = 53. naprimer
        //int w=53;
        //char ch=(char)w;
        //System.out.println("ozidaem 5 cherez 53= "+ch); //5    <--vse vereno

        char ch1='5';
        int p=ch1-'0';
        System.out.println(p);
    }
}
