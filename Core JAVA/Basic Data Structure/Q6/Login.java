package assignment.six;

public class Login {
	
	String userId = "Ajay",password = "password";
    public String loginUser(String user, String pass) {
    if(user.equals(userId) && pass.equals(password)) {
    return "Welcome Ajay";
    }else {
    if(Assignment1Q6.count < 3) {
    System.out.println("You have entered wrong credentials ,please enter the right credentials.");
    Assignment1Q6.count++;
    }else if(Assignment1Q6.count == 3) {
    return "You have entered wrong credentials 3 times\r\n"
    + "\r\n"
    + "Contact Admin";
    }
   
    return Assignment1Q6.doAgain();
    }
    }

}
