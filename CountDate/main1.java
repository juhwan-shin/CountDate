package p1;

import java.io.*;
import java.util.*;

public class main1{
	public static void main(String[] args) throws FileNotFoundException {
		Scanner in = new Scanner(new File("input1"));
		PrintWriter out = new PrintWriter("out1");
		CountDate setDate = new CountDate();
		CountDate beforeDate = new CountDate();
			while(in.hasNextInt()) {
				beforeDate = new Date(in.nextInt(), in.nextInt(), in.nextInt());
				setDate = new Date(in.nextInt(), in.nextInt(), in.nextInt());
				
				out.write(beforeDate.toString());
				if(setDate.compareTo(beforeDate)==1) {
					out.write("< ");
				}
				else if(setDate.compareTo(beforeDate)==-1) {
					out.write("> ");
				}
				else out.write("= ");
				
				
				out.write(setDate.toString()+'\n');
			}
		in.close();
		out.close();
	}
}
