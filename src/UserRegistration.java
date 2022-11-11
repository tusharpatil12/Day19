import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {

	public  void  valid(String firstName){
		Pattern pattern = Pattern.compile("^[A-Z]+[a-z]{2,}$");
		Matcher check = pattern.matcher(firstName);
		if(check.matches()){
			System.out.println("last Name is Valid");
		}
		else {
			System.out.println("last name not Valid ! please Enter valid Name");
		}
	}

	public static void main(String[] args) {
		UserRegistration user =new UserRegistration();
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter last Name :");
		String firstName =sc.nextLine();
		user.valid(firstName);

	}

}
