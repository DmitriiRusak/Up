package Reflection.SecondTry;
//probyy sozdat ob`ekt klassa ClassA
//import Reflection.ClassA;

import Reflection.ClassA;

import java.lang.reflect.*;

public class ExperimentWithClass {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException,
            IllegalAccessException, InvocationTargetException, InstantiationException, NoSuchMethodException {

          Class aclass=Class.forName("Reflection.ClassA");//NYZZNO YKAZIVAT POLNOE IMIA CLASSA.
 //        //etot metod dlia polycheniia modifikatora dostypa classa.

//        int sumInt=aclass.getModifiers();//v klasse Class est metod getModifiers kotorii vozvraschaet
//        //zakodirovannoe chislo, kotoroe nyzzno dekodirovat s pomosch`y klassa Modifier.
//        if(Modifier.isPublic(sumInt)){//v klasse Modifier est metodi opredeliayschie (dekodiryyschie)
//            System.out.println("public");// modifikator peredanni v parametrax.
//        }
//        else if(Modifier.isPrivate(sumInt)){
//            System.out.println("private");
//        }
//        else if(Modifier.isProtected(sumInt)){
//            System.out.println("protected");
//        }
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//esli konstryktor private to ob`ekt klassa mozzno polychit vot tak. OPACHKI A VOT I NETAK
        //NYZZNO IDTI PYTEM CHEREZ Constructor
        // Class aclass=Class.forName("Reflection.ClassA");//NYZZNO YKAZIVAT POLNOE IMIA CLASSA.
        //        ClassA classA=(ClassA)aclass.newInstance();
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//                           polychenie syperClasssa s pomoschy ob`ekta

//        Class  superClassAclassa =aclass.getSuperclass();
//        System.out.println(superClassAclassa.toString());



///////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        //OOOO eta fishka vozvraschaet kolichestvo konstryktorov i zapisivaet v massiv

        ClassA classA = null;

        Constructor [] constructorElements=aclass.getConstructors();//syda zapisivaetsia kolichestvo konstryktorov
        Class [] sumclass = new Class[0];
        for(Constructor temp:constructorElements){// perebiraem massiv konstryktorov
            sumclass=temp.getParameterTypes();//temp eto odin konstryktor (element) iz constructorElements[]
            //sumclass <-eto massiv kolichestva polei v dannom konstruktore,t.e. v odnom elemente temp
           // System.out.println("number of parametrs in this constryktor"+sumclass.length);
//             for (Class param:sumclass){//perebiraem nash massiv s poliami konstryktora.
//                    System.out.println(param.getName());
//                }
        }
// s pomoschy Constryktor probyy sozdat ekzempliar klassa
   // Constructor constructorsIntom=aclass.getDeclaredConstructors()[2];//mozzno tak!
        Constructor constructorsIntom=aclass.getDeclaredConstructor(String.class);//mozzno tak!
        constructorsIntom.setAccessible(true);
        classA=(ClassA)constructorsIntom.newInstance("2");


// nelzia napriamyy obratitsia k metodam iskomogo klassa,ne smotria na polychennii nami ob`ekt
//classA.nazvanieMetoda(); <-- nea tak ne prokatit, classA vse taki iavno ob`ekt ot klassa Class!

//        System.out.println("kolichestvo konstryktorov "+ constructorElements.length);
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//         polychenie vsex NEprivate polei s pomoschy metoda getFields ob`ekta klassa Class

 //        i zapis ix v massiv s tipom znacheniia Fields

//        Field fields[]=aclass.getFields();
//
//        for(Field field:fields){// metod getType() v klasse Field vozvraschaet tip peremennoi
//            Class fd=field.getType();//ego mozzno zapisat v peremennyy tipa Class
//
//            System.out.println("Class name : " + field.getName()+" "+field.getType());//a mozzno i tak ispolzovat
//        }
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        //    PRISVAENIE private POLIAM OB`EKTA NOVIX ZNACHENII ZA SCHET SREDSTV -=REFLECTION API=-

// sozdaem ob`ekt klassa ClassA pod nazvaniem classA,i izmeniaem znachenie ego private polia str,nevozmozzno
// pomeniat znachenie polia esli net ob`ekta. Eto zze logichno net ob`eta, net i polia i sootvetstvenno esli
//     neskolko ob`ektov to i znacheniia polei y nix raznie. Otsyda i sintaksis, metoda set
//     klassa Field. V parametrax kotorogo
//     nyzzno ykazivat snachala ob`ekt, zatem novoe znachenie, ved nazvanie peremennoi y kazzdogo ob`ekta odina-
//     kovoe i chtob ne perepytat nyzznii ob`ekt sintaksis takoi:set(nazvanie ob`ekta, novoe znachenie peremennoi);


//        ClassA classA=new ClassA(15);
//        System.out.println(classA.toString());
//        Class aClass=classA.getClass();
//        Field fieldVariable=aClass.getDeclaredField("str");//sozdaem peremennyy tipa Field i s pomoschy metoda
//        // klassa Class "getDeclaredField(imia trebyemoi peremennoi)"prisvaevaem ssilky nashei Field peremennoi.
//
//        fieldVariable.setAccessible(true);
//        fieldVariable.set(classA,"Modifikaciia");
//        System.out.println(classA.toString());
//
//
//        //meniaem ssilky na drygyy peremennyy etogo zze ob`ekta
//        fieldVariable=aClass.getDeclaredField("number");//prisvaevaem fieldVariable ssilky peremennoi->number
//                                                             // ob`ekta aClass.ona tozze private i mi xotim ee pomeniat
//        fieldVariable.setAccessible(true);
//        fieldVariable.set(classA,1000);
//        System.out.println(classA.toString());

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//  S pomoschy Klassa Method sozdaem massiv pod nazvaniem methods(tip znacheniia Metod) vsex imeyschixsia metodov,
//  kazzdii element etogo massiva eto kakbi pofacty metod klassa ClassA. S pomoschy classa Class sozdaem massiv elementov
// s tipom znacheniia Class syda mozno polozzit (iz kazzdogo elementa massiva methods primeniv metod klassa Method
// getName() polychit imia kazzdogo metoda a s pomoschy getParameterTypes() polychit parametri kazzdogo metoda
// )V obschem kazzdi element massiva methods(po facty chto-to vrode informacii po otdelnomy metody)
// obladaet poliami opisivayschimi
// imia metoda,tip vozvraschaemogo znacheniia,nalichie i tip paramtrov.


        Method[] methods=aclass.getDeclaredMethods();

        for(Method method:methods){
            System.out.print(method.getName());
//            if (method.getName()=="doSumsing"){
//                method.setAccessible(true);
//                method.invoke(classA,null);
//           }
            Class[]parametrs=method.getParameterTypes();
            for (Class temp:parametrs){
             //   System.out.print(temp.getName());
            }
            System.out.println();
        }


    }
}