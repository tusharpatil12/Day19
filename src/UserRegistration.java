import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {

	public  void  validPassword(String Password){
		Pattern pattern = Pattern.compile("^[a-z0-9]{6,}[A-Z]{1,}[@#%*]+$");
		Matcher check = pattern.matcher(Password);
		if(check.matches()){
			System.out.println(" Password is Valid");
		}
		else {
			System.out.println(" Password  not Valid ! please Enter valid Name");
		}

	}

	public static void main(String[] args) {
		UserRegistration user =new UserRegistration();
		Scanner sc =new Scanner(System.in);
		System.out.println("Password  mobile :");
		String Password =sc.nextLine();
		user.validPassword(Password);
	}

}
