package zadachi.naString;
//napisat metod ydalenia simvola iz stroki
public class CharakterKiller {

    static String killThatGai(char character,String str){

        StringBuilder stringBuilder=new StringBuilder();
        for(int a=0;a<=str.length()-1;a++){
            if(str.charAt(a)==character){
                continue;
            }
            else {
                stringBuilder.append(str.charAt(a));
            }
        }
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        String proba="privet privet prokaznik medved";
        String result=CharakterKiller.killThatGai('p',proba);
        System.out.println(result);



    }
}
