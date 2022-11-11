import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {

	public  void  valid(String firstName){
		Pattern pattern = Pattern.compile("^[A-Za-z0-9+_.-]+@(.+)$");
		Matcher check = pattern.matcher(firstName);
		if(check.matches()){
			System.out.println("email is Valid");
		}
		else {
			System.out.println("email not Valid ! please Enter valid");
		}
	}

	public static void main(String[] args) {
		UserRegistration user =new UserRegistration();
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter email :");
		String email =sc.nextLine();
		user.valid(email);

	}

}
