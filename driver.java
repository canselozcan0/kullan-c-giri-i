import java.util.Scanner;

public class driver {
public static void main(String[] args) {
	String username, password;
	
	Scanner input = new Scanner(System.in);
	
	
	System.out.print("Kullanıcı adınız : ");
	username = input.nextLine();
	
	System.out.println("Şifreniz: ");
	password = input.nextLine();
	
	if(username.equals("cans") && password.equals("cannur123")) // stirngler için eşitlik .equal ile bakılır
	{System.out.println("Giriş yaptınız!!");
		
	}else
	{
		System.out.println("Şifrenizi mi unuttunuz?");
		String yes, no;
		yes = input.nextLine();
		no = input.nextLine();
	}
	
	boolean yes,no;
	yes = true;
	no= false;
	
	if(yes) {
		String password2;
		Scanner inp = new Scanner(System.in);
		System.out.println("Yeni şifrenizi oluşturun");
		password2 = inp.nextLine();
		 if(password2.equals("cans123")) {
			System.out.println("Bir önceki şifreniz ile aynı. Tekrar deneyin");
		}else {
			System.out.println("Şifreniz başarı ile değiştirildi");
		}
		
	}
	
}}

