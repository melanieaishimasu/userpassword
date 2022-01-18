import java.util.Scanner;
import java.text.SimpleDateFormat;  
import java.util.Date;  

public class userPassword {

      public static void main(String[] args) {
          Scanner input = new Scanner(System.in);
              SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");  
              Date date = new Date(); 

    String username;
    String password;

    System.out.println("Employee Login Portal");
    System.out.println("Please enter your username: ");
    username = input.next();

    System.out.println("Please enter your password: ");
    password = input.next();

    //users check = new users(username, password);

    if(username.equals(username) && password.equals(password)) 
        System.out.println("You have been logged in. Your clock in time is ");
        System.out.println(formatter.format(date));



}

}