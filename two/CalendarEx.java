package com.two;

import java.util.Calendar;

public class CalendarEx {
	public static void printCalendar(String msg, Calendar cal) {
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH)+1;
		int day = cal.get(Calendar.DAY_OF_MONTH);
		int dayofweek = cal.get(Calendar.DAY_OF_WEEK);
		int hour = cal.get(Calendar.HOUR);
		int hourofday = cal.get(Calendar.HOUR_OF_DAY);
		int ampm = cal.get(Calendar.AM_PM);
		int minute = cal.get(Calendar.MINUTE);
		int second = cal.get(Calendar.SECOND);
		int millisecond = cal.get(Calendar.MILLISECOND);
		System.out.print(msg+year+"/"+month+"/"+day+"/");
		
		switch (dayofweek) {
		case Calendar.SUNDAY : System.out.print("�Ͽ���"); break;
		case Calendar.MONDAY : System.out.print("������"); break;
		case Calendar.TUESDAY : System.out.print("ȭ����"); break;
		case Calendar.WEDNESDAY : System.out.print("������"); break;
		case Calendar.THURSDAY : System.out.print("�����"); break;
		case Calendar.FRIDAY : System.out.print("�ݿ���"); break;
		case Calendar.SATURDAY : System.out.print("�����"); break;
		}
		System.out.print("("+hourofday+"��)");
		if(ampm == Calendar.AM)
			System.out.print("����");	
		else
		System.out.print("����");
		
	System.out.println(hour + "��"+minute+"��"+second+
			"��"+millisecond+"�и���");	
}
	public static void main(String[] args) {
		Calendar now = Calendar.getInstance();
		printCalendar("���� : ", now);
		
		Calendar firstdate = Calendar.getInstance();
		int year = firstdate.get(Calendar.YEAR);
		int month = firstdate.get(Calendar.MONTH)+1;
		int day = firstdate.get(Calendar.DAY_OF_MONTH);
		System.out.println("b:"+year);
		System.out.println("b:"+month);
		System.out.println("b:"+day);
		firstdate.clear();
		year = firstdate.get(Calendar.YEAR);
		month = firstdate.get(Calendar.MONTH)+1;
		day = firstdate.get(Calendar.DAY_OF_MONTH);
		System.out.println("a:"+year);
		System.out.println("a:"+month);
		System.out.println("a:"+day);
		firstdate.set(2016, 11, 25);
		firstdate.set(Calendar.HOUR_OF_DAY, 20);
		firstdate.set(Calendar.MINUTE, 30);
		printCalendar("ó�� ����Ʈ �� �� : ", firstdate);
	}
}
