import java.util.ArrayList;
import java.util.List;

public class Contest1 {

	public static List<String> splitString(String str, char esc) {
		List<String> a = new ArrayList<String>();

		// Your Logic goes here

		String c = "";
		for(char ch: str.toCharArray()) {
			if(ch == esc) {
				a.add(c);
				c = "";
				continue;
			}
			c += ch;
		}

		if(!(c.equals(""))) {
			result.add(c);
		}

		return a;
	}

	public static void main(String[] args) {
		String str = "My name is 'Ashok Kumar Gowda' I have 12+ years of experience I work for 'IBM India Pvt Ltd' ";

		List<String> result = splitString(str, '\'');

		for (String a : a) {
			System.out.println(a);
		}
	}
}
