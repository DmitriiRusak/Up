package some_classes.Sring;//Zdes vpervie ia stolknylsia s oshibkoi iz-za otsytstvia importa, konkretno
// error: cannot find symbol. Vse banalno prosto, nyzzno ykazivat import takzze kak i 
// pri rabote s IDE...

//import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets; //etogo importa nebilo.

public class MethodGetBytesWithCharSetName {
    public static void main(String[] args) {
		String Str1 = new String("Java - lider interneta й !");
		String Str2 = new String(Str1.getBytes(StandardCharsets.UTF_8)); //<--polychaem stroky zakodirovannyy s utf_8
		System.out.println("UTF_8");
		for(int i=0;i<Str2.length();i++){
			System.out.print((char) Str2.charAt(i)+" ");
		}
			System.out.println("\nISO_8859_1");
		Str2 = new String (Str1.getBytes(StandardCharsets.ISO_8859_1)); //<--polychaem stroky zakodirovannyy s ISO_8859_1
		 for(int i=0;i<Str2.length();i++){
			System.out.print((char) Str2.charAt(i)+" ");
		}
    }
}
//str1-zapisana v latinskom iazike(simvoli s English), zatem sozdaem esche odny stroky
//kotoraia bydet zakodirovanna v UTF_8; ispolzyia metod getBytes(java.nio.charset.Charset)
//t.e. est klass StandardCharsets (imenno s nim i bila problema importa) y etogo klassa
//est konstanti kotorie opredeliayt ty ili inyy kodirovky kotoryy mozzno podstavit v argymenti
//.getBytes(vot syda); Tak Str2 kodiryetsia v UTF_8 s takim zze naborom simvolov
//chto i Str1. A zatem sozdaetsia opiat novii ob`ekt String s takoi zze peremennoi Str2 
// i dannii ob`ekt kodiryetsia yzze v ISO_8859_1.
//