package core;

import java.io.Console;
import java.util.Arrays;

public class Input_Console_Pass {

	public static void main(String[] args) {
		Console c = System.console();
		if(c==null){
			System.err.println("Console is not avialible!!!");
			System.exit(0);
		}
		char [] password = c.readPassword("Password: ");
		char [] password2 = c.readPassword("Confirm Password: ");
		boolean isMatch = Arrays.equals(password, password2);
		System.out.println(isMatch ? "Password is OK" : "Password don`t mach");
		System.out.println("Password: "+String.valueOf(password));
		System.out.println("Confirm Password: "+String.valueOf(password2));

	}

}
