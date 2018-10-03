import java.util.*;

public class recbracket {

	private static final Scanner sc = new Scanner(System.in);
	private static String open = "({[<";
	private static String close = ")}]>";

	private static boolean brackets(String s, int start, int end) {

		if (start > end)
			return true;
		if (end == 1 || close.contains(Character.toString(s.charAt(0))))
			return false;
		String bracket = Character.toString(s.charAt(start));

		if (open.contains(bracket)) {
			int check = open.indexOf(bracket);
			String bracket_in_close = Character.toString(close.charAt(check));
			if (!s.contains(bracket_in_close))
				return false;
		}

		if (close.contains(bracket)) {
			int temp = start-1;
			int check = close.indexOf(bracket);
			String bracket_in_string = Character.toString(s.charAt(temp));
			String bracket_in_open = Character.toString(open.charAt(check));

			while (!open.contains(bracket_in_string)) {
				temp--;
				bracket_in_string = Character.toString(s.charAt(temp));
			}


			if (!bracket_in_string.equals(bracket_in_open))
				return false;
			else
				return true;
		}

		return brackets(s,++start,end);
	}
	public static void main(String[] args) {
		System.out.print("Enter a string : ");
		String s = sc.nextLine();
		System.out.println("balanced : "+brackets(s,0,s.length()));
	}

}