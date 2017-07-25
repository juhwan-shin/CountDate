package p1;

import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;
import java.io.IOException;
import java.io.*;

class CountDate {
	private int year;
	private int month;
	private int day;
	public Date(int year, int month, int day) {
		this.year = year;
		this.month = month;
		this.day = day;
	}
	public Date() {
		this(0, 0, 0);
	}
	
	public String toString() {
		return year + "/" + month + "/" + day + " ";
	}
	///////////////  구현해야 할 메소드 //////////
	// 주어진 날짜와 비교할 날짜 newDate를 비교하여 주어진 날짜가 앞서면 -1, 
// 뒤서면 1, 같으면 0를 반환한다.
	public int compareTo(Date newDate) {
		int y = newDate.year;
		int d = newDate.day;
		int m = newDate.month;
		if(y < year) {
			return  1;
		}
		else if(y > year) {
			return -1;
		}
		if(m<month) {
			return 1;
		}
		else if(m>month) {
			return -1;
		}
		if(d<day) {
			return 1;
		}
		else if(d>day) {
			return -1;

		}
		else return 0;
	}
	// 주어진 날짜를 하루 증가시킨다.
	public void advance() {
		day++;
	}
	public boolean leapYear() {
		if(year%400==0)
			return true;
		else if(year%4==0 && year%100!=0)
			return true;
		return false;
	}
	public int countDays() {
		switch(month) {
			case 1 : case 3 : case 5 : case 7 : case 8 : case 10 : case 12 :
				return 31;
			case 4 : case 6 : case 9 : case 11 :
				return 30;
			case 2 :
				if(leapYear())
					return 29;
				return 28;
		}
		return 0;
		
	}
////////////////////////////////////////////////////	
	public String plusDate(Date date, int count) {
		Date tempDate = date;
		count = count + tempDate.day;
		while(count>tempDate.countDays()) {
			count = count - tempDate.countDays();
			tempDate.month++;
				if(tempDate.month>12) {
					month = 1;
					tempDate.year++;
				}
		}
			tempDate.day = count;
			return tempDate.toString();
	}
		
}

