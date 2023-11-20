package com.example.demo.utils;

public class CommonUtil {

	public static String getMaskedPan(String pan) {
		/*
		 * pan = pan.replaceAll(pan, "*******"); return pan;
		 */
		// put your masking logic here
		StringBuilder sb = new StringBuilder(pan);
		for (int i = 0; i < sb.length() - 4; i++)

		{
			sb.setCharAt(i, 'X');
		}
		return sb.toString();
	}

	/*
	 * private String createMask(String accountNumber) { //put your masking logic
	 * here StringBuilder sb=new StringBuilder(accountNumber); for(int
	 * i=0;i<sb.length()-4;i++)
	 * 
	 * { sb.setCharAt(i,'X'); } return sb.toString(); }
	 */

}