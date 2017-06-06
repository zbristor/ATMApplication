import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ATMApp {
public static void main(String[] args) {
ATM atm = new ATM();
Account a= atm.retrieve(atm.sInput(), atm.pinInput());
/*
if(!(atm.pinInput().equals(a.getPin())))
	{
		atm.check(a);
	}
else
	atm.next(a);
	*/


}
}
