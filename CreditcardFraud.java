package org.ml;

import java.io.IOException;

import tech.tablesaw.api.Table;

public class CreditcardFraud {
	public static void main(String args[]) {
		System.out.println("Data Analysis");
		try {
			Table df=Table.read().csv("C:\\Users\\HP\\Documents\\eclipse\\org.ml\\src\\main\\java\\org\\ml\\credit_fraud.csv");
			System.out.println(df.shape());
			System.out.println(df.structure());
			System.out.println(df.summary());
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
