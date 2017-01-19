import org.junit.*;
import java.util.*;
import java.io.*;

public class TesterForFunctionality{

	@Test
	public void test1()throws FileNotFoundException{
		String fileName = "testTextFiles\\test1.txt";
		Info [] review = TestFunctionality.createFileInput(fileName);
		String [] arr = {"math", "addition", "basic", "multipleChoice"};
		String [] arr2 = {"1", "2", "3",};
		Info first = new Info(arr, "1", "$1+1 = $", "$2$", "$1+1 = 2$", arr2);
		arr = new String[] {"math", "division", "basic", "multipleChoice"};
		arr2 = new String[] {"4", "3", "2",};
		Info second = new Info(arr, "1", "$\\frac{10}{5} = $", "$2$", "$\\frac{10}{5} \\Rightarrow \\hskip .5em \\frac{2}{1} \\Rightarrow  \\hskip .5em 2$", arr2);
		arr = new String[] {"math", "complex", "algebra"};
		arr2 = new String[] {""};
		Info third = new Info(arr, "2", "$x^2 + 4x + 4 = 0$", "$x = -2$", "Solution:\\\\$x^2 + 4x + 4 = 0$\\\\$\\Rightarrow \\hskip .5em x^2 + 2x + 2x + 4 = 0$\\\\$\\Rightarrow \\hskip .5em x(x + 2) + 2(x + 2) = 0$\\\\$\\Rightarrow \\hskip .5em (x+2)(x+2) = 0$\\\\$\\Rightarrow \\hskip .5em x = -2$", arr2);
		Info [] reviewControl = {first, second, third};
		Assert.assertEquals("", reviewControl[0].compare(review[0]));
		Assert.assertEquals("", reviewControl[1].compare(review[1]));
		Assert.assertEquals("", reviewControl[2].compare(review[2]));
	}
	@Test
	public void test2(){
		String [] arr = {"1"};
		String [] arr2 = {"1"};
		Info first = new Info(arr,"1","1","1","1", arr2);
		Assert.assertEquals(first.getKeyWords()[0], "1");
		Assert.assertEquals(first.getDifficulty(), "1");
		Assert.assertEquals(first.getQuestion(), "1");
		Assert.assertEquals(first.getAnswer(), "1");
		Assert.assertEquals(first.getSolution(), "1");
		arr = new String[] {"2"};
		arr2 = new String[] {"2"};
		Info second = new Info(arr, "2", "2", "2", "2", arr2);
		Assert.assertEquals("Difficulty error, First: 1, Second: 2\n", first.compare(second));
		first.setDifficulty("2");
		Assert.assertEquals("Question error, First: 1, Second: 2\n", first.compare(second));
		first.setQuestion("2");
		Assert.assertEquals("Answer error, First: 1, Second: 2\n", first.compare(second));
		first.setAnswer("2");
		Assert.assertEquals("Solution error, First: 1, Second: 2\n", first.compare(second));
		first.setSolution("2");
		Assert.assertEquals("KeyWord Error, At index 0, the first is: 1 and the second is: 2.\n", first.compare(second));
		first.setKeyWords(arr);
		Assert.assertEquals("MultipleChoice Error, At index 0, the first is: 1 and the second is: 2.\n", first.compare(second));
		first.setMultipleChoice(arr2);
		Assert.assertEquals("", first.compare(second));
	}
	

}