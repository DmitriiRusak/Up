package some_classes.Object.methodEquals;

import java.util.HashSet;
import java.util.Set;

//zdes pereopredeleni metodi equals i hashCode, esli ne pereopredelit equals to po ymolchaniy
//on sravnivaet tolko ssilki, a oni vsegda bydyt raznie y dvyx ob`ektov kotorie mogyt bit po svoim poliam
// obsolytno odinakovie. Drygimi slovami metod po ymolchaniy sravnivaet ykazivayt li dve ssilki na odin i
// tot zze ob`ekt. I polychaem po facty chto odinakovie po svoim poliam ob`ekti soglasno nepereopredele-
//nnomy metody eqyals ne ravni!!!. Po logike programmi nyzzno pereopredelit tak chtob takie (odinakovie) ob`ek-
//ti bili ravni. Ok mi pereopredelili.

// A dlia chego pereopredeliat hashCode?

//Po ymolchaniy hashCode vozvraschaet dlia ekzempliara klassa ynikalnoe chislo kotoroe kakto sviazano s
//mestom v pamiati. Est stryktyri dannix (HashSet,HashMap...) kotorie orientiryytsia na kontrakt
// equals-hashCode po ymolchaniy(t.e. esli ob`ekti equals to hashCode y nix odinakovii), no mi pereopredelili
// equals i seichas ob`ekti schitaytsia equals esli y nix odinakovie polia NO eto ne odin i tot zze ob`ekt
// kak bilo po ymolchaniy i sootvetstvenno esli ne pereopredelit hashCode to on bydet vidovat
// odinakovoe znachenie tolko dlia odnogo i togo-zze ob`ekta. A po nashei logike nado chtob hashCode
// bil odinakov y odinakovix ob`ektov inache HeshSet,HashMap... bydyt rabotat ne korektno.

// v HashSet ob`ekti ynikalni (bez dyblikatov) za schet bistroi proverki po hashCode. Po ymolchaniy (bez pere-
//opredeleniia equals(), i hashCode() ) esli polozzit v set odinakovie ob`ekti to set bydet rabotat,dlia nego eto
//raznie ob`ekti, y nix zze raznii hashCode.OK. pereopredelili tolko equals.Seichas nesmotria chto ob`ekti
//iavno odinakovie oni vseravno xraniatsia v set.(raznii hashCode). OK. pereopredelili i hashCode()teper
// odinakovie ob`ekti imeyt i odinakovii hashCode i Set ix vidit (potomy kak smotrit na hashCode
// v pervyy ochered i vidit chto on odinakov,sootvetstvenno ego ne xranim) i xranit tolko ynikalnie


public class MyClass {
    private Integer field;
    private String str;

    public MyClass(Integer field, String str) {
        this.field = field;
        this.str = str;
    }
//Переопределяя метод equals(), обязательно соблюдай эти требования:
//  1-Рефлексивность. Любой объект должен быть equals() самому себе.
//  2-Симметричность.Если a.equals(b) == true, то и b.equals(a) должно возвращать true.
//  3-Транзитивность. Если два объекта равны какому-то третьему объекту, значит, они должны быть
//      равны друг и другу. Если a.equals(b) == true и a.equals(c) == true,
//      значит проверка b.equals(c) тоже должна возвращать true.
//  4-Постоянность. Результаты работы equals() должны меняться только при изменении входящих
//      в него полей. Если данные двух объектов не менялись, результаты проверки на equals()
//      должны быть всегда одинаковыми.
//  5-Неравенство с null. Для любого объекта проверка a.equals(null) должна возвращать false.

    @Override
    public boolean equals(Object obj) {
        if(this==obj){
            return true;
        }
        if(obj==null||obj.getClass()!=this.getClass()){
            return false;
        }
        MyClass myObject=(MyClass) obj;
        return field.equals(myObject.getField())&&str.equals(myObject.getStr());

    }

    @Override
    public int hashCode() {
        int result=field.hashCode();//v klasse-obertke Integer opredelen svoi metod heshCode();
        result=31*result+str.hashCode();//String imeet takzze svoi heshCode.
        return result;
// Pereopredeliaem hashCode() i teper v set NELZIA polozzit 2-a odinakovix ob`ekta, tak-kak nashe pereopredelenie
// (osnovannoe na znacheniiax peremennix ekzempliara ob`ekta i esli znacheniia odinakovi to i hashCode odinakov)
//zatocheno takim obrazom chtob 2 odinakovix ob`ekta imeli odinakovii hashCode. Vse zavisit ot zzelaemogo
// povedeniia. Dlia primera zakomentiryu etot metod i v set 'polozzitsia' dva odinakovix ob`ekta, tak-kak
//hashCode po ymolchaniy y nix raznii. Dlia seta znachit i ob`ekti raznie.
    }

    public Integer getField() {
        return field;
    }

    public void setField(Integer field) {
        this.field = field;
    }

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }

    public static void main(String[] args) {
        MyClass myClass= new MyClass(11,"string");
        MyClass myClass1= new MyClass(11,"string");

        Set<MyClass> set=new HashSet<>();
        set.add(myClass);
        set.add(myClass1);


        System.out.println(set.size());


    }
}
