package com.educandoweb.course;

import com.educandoweb.course.entities.enums.OrderStatus;

public class Main {

	public static void main(String[] args) {
		OrderStatus s = OrderStatus.PAID;
		System.out.println(s.ordinal());
	}
}
