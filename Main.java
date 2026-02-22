/**
 * Program description.
 * @Santiago Rosas
 */
public class Main
{
	public static void main(String[] args)
	{
		//DECLARATION + INITIALIZATION SECTION
		String surname, givenName, category, cardNum, birthCountry, termsAndConditions;
		char sex;
		Strring birthMonth;
		int uscisNum1, uscisNum2, uscisNum3, birthDay, birthYear, validDay, validMonth, validYear, expireMonth, expireDay, expireYear;
		surname = "ROSAS";
		givenName = "Santiago";
		category = "C09";
		CardNum = "SRC1234567890";
		birthCountry = "United States of America";
		termsAndConditions = "None";
		sex = 'M' // sex is a character so single quotes are requiered
		uscisNum1 = 123;
		uscisNum2 = 456;
		uscisNum3 = 789;
		birthDay = 22;
		birthYear = 2005;
		validDay = 2;
		validMonth = 2;
		validYear = 2027;
		expireMonth = 2;
		expireDay = 2;
		expireYear = 2029;
		//INPUT SECTION
		// N/A
		//CALCULATION SECTION
		//N/A
		//OUTPUT SECTION
		System.out.println("╔══════════════════════════════════════════════════════════════════════");
		System.out.println("║         UNITED STATES OF AMERICA");
		System.out.println("║                                  EMPLOYMENT AUTHORIZATION CARD");
		System.out.println("║                       Surname");
		System.out.println("║                       " + surname + " ");
		System.out.println("║  .----.    .----.     Given Name");
		System.out.println("║ (   ^  \\  /  ^   )    ███████ ");
		System.out.println("║        |  |           USCIS#         Category   Card#");
		System.out.println("║       _/  \\_          ███-███-███    ███        █████████████");
		System.out.println("║      (_    _)         Country of Birth");
		System.out.println("║   ,    `--`    ,      ███████ ");
		System.out.println("║   \\'-.______.-'/      Terms and Conditions");
		System.out.println("║    \\          /       ███████ ");
		System.out.println("║     '.--..--.'        Date of Birth   Sex");
		System.out.println("║       `\"\"\"\"\"`         ██ ███ ████     █");
		System.out.println("║                       Valid From:     ██/██/██");
		System.out.println("║                       Card Expires:   ██/██/██");
		System.out.println("║ ascii art by: jgs     NOT VALID FOR REENTRY TO U.S.");
		System.out.println("╚══════════════════════════════════════════════════════════════════════");
		//ascii art credit: http://www.oocities.org/spunk1111/bodypart.htm
	}
}
