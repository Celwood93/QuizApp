import java.util.*;
import java.io.*;
import java.util.regex.*;

public class testingShindig{

public static void main(String [] args){
			String here = "K: math addition basic\nD: \nQ: $1+1 = $\nA: $2$\nS: $1+1 = 2$\nM: 4, 3, 2";
			Pattern r = Pattern.compile("((?:K: ([^\\n]*))\\n(?:D: ([^\\n]*))\\n(?:Q: ([^\\n]*))\\n(?:A: ([^\\n]*))\\n(?:S: ([^\\n]*))\\n(?:M: ([^\\n]*)))");
			Matcher m = r.matcher(here);
			if(m.find()){
				System.out.println("true");
			}
			if(m.group(7).equals("")){
				System.out.println(" 7 true");
			}
			System.out.println("String g1: " +m.group(7)+"<");
			System.out.println("String g1: " +m.group(2));
			System.out.println("group 1: " + Arrays.toString(m.group(2).split(" ?, ?| ")));
			System.out.println("group 2: " + m.group(3));
			System.out.println("group 3: " + m.group(4));
			System.out.println("group 4: " + m.group(5));
			System.out.println("group 5: " + m.group(6));
			System.out.println("group 6: " + Arrays.toString(m.group(7).split(" ?, ?| ")));
}


}