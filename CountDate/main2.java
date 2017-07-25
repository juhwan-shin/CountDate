package p1;

import java.io.*;
import java.util.*;

public class main2 {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner in = new Scanner(new File("input2"));
		PrintWriter out = new PrintWriter("out2");
		CountDate setDate;
		int count;
		while(in.hasNext()) {
			setDate = new CountDate(in.nextInt(), in.nextInt(), in.nextInt());
			count = in.nextInt();
			out.write(setDate.toString() + count +"ÀÏ ÈÄ  ==> ");
			out.write(setDate.plusDate(setDate, count) + '\n');
		}
		in.close();
		out.close();
	}
}
