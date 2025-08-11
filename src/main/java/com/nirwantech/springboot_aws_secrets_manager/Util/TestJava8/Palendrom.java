package com.nirwantech.springboot_aws_secrets_manager.Util.TestJava8;

public class Palendrom {

	public static void main(String[] args) {

		String actStr = "Madam";
		String ftStr = "";
		for (int i = 0; i < actStr.length(); i++) {
			ftStr = actStr.charAt(i) + ftStr;
		}
		if (actStr.equalsIgnoreCase(ftStr)) {
			System.out.println("Given String is Palendrom!");
		} else
			System.out.println("Given String is Not  Palendrom!");

		StringBuffer sb = new StringBuffer();
		sb.append(actStr);
		String str = sb.reverse().toString();

		if (str.equalsIgnoreCase(actStr)) {
			System.out.println("Given Reverse String is  Palendrom");
		} else
			System.out.println("Given String is Not  Palendrom");

	}

}
