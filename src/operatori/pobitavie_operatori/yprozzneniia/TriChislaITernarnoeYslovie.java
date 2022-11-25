package operatori.pobitavie_operatori.yprozzneniia;
import java.io.IOException;
import java.util.Scanner;
public class TriChislaITernarnoeYslovie {
	//cozdat programmy kotoraia bydet vivodit menshee po modyly iz 3 vvedennix polzovatelem veschestvennix chisel.
	//Dlia vichisleniia modylia ispolzovat ternarnyy yslovnyy operaciy. (yslovie? esli true : esli false;)
	static int getTheModyl(Scanner scanner){
		System.out.print("Enter the number: ");
		int x=scanner.nextInt();
		int rezult=x<0?-x : x;
		return rezult;
	}

	public static void main(String[] args) throws IOException {

 		Scanner scanner=new Scanner(System.in);
		int a=getTheModyl(scanner);
		int b=getTheModyl(scanner);
		int smollestNumber=a<b?a : b;
		int c=getTheModyl(scanner);
		smollestNumber=smollestNumber<c? smollestNumber :c;
		System.out.println("naimenshee chislo = "+smollestNumber);

	}

}