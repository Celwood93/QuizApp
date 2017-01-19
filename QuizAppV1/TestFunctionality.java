import java.util.*;
import java.io.*;
import java.util.regex.*;

public class TestFunctionality{
	
	public static Info[] createFileInput(String fileName) throws FileNotFoundException{
		Scanner console;
		File file;
		Pattern regexN = Pattern.compile("((?:.+(?:\\r\\n)?)+)");
		Pattern r = Pattern.compile("(?:K: )([^\\r\\n]*)\\r?\\n(?:D: )([^\\r\\n]*)\\r?\\n(?:Q: )([^\\r\\n]*)\\r?\\n(?:A: )([^\\r\\n]*)\\r?\\n(?:S: )([^\\r\\n]*)\\r?\\n(?:M: )([^\\r\\n]*)");
		console = new Scanner(file = new File(fileName));
		console.useDelimiter("\\r?\\n\\r?\\n");
		String here = console.next(regexN);
		int n = Integer.parseInt(here);
		Info [] stuff = new Info[n];
		
		for(int i = 0; i < n; i ++){
			here = console.next(regexN);
			Matcher m = r.matcher(here);
			if(!m.find()){
				System.out.println("Error with data at " + here);
				stuff[i] = new Info();
				continue;
			}
			stuff[i] = new Info(m.group(1).split(" ?, ?| "), m.group(2), m.group(3), m.group(4), m.group(5), m.group(6).split(" ?, ?| "));
		}
		return stuff;
		
	}
	public static void createLatexFile(String fileName) throws FileNotFoundException{
		Info [] stats = createFileInput(fileName);
		String start = "";
	}
	
	
}