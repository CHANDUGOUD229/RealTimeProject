package com.stepchange.atf.utilities;


import java.io.File;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import static org.testng.internal.Utils.log;



public class Utils {
	
	public static String convertDateToDBFormat(Date date) {
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMdd");
		return dateFormat.format(date);
 	}
	
	public static String convertDateToUS(Date date) {
		SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
		return dateFormat.format(date);
	}

	
	public static String convertDateToUS(String dateString) {
		String[] parts = dateString.split("/");
		return parts[1]+"/"+parts[0]+"/"+parts[2];
	}
	
	public static String createRandomNumberString(int length) {
		Random rand = new Random();
		String randString = "";
		int [] numbers = {0,1,2,3,4,5,6,7,8,9};
		
		for(int i=0; i<length; i++) {
			randString += ""+numbers[rand.nextInt(numbers.length)];
		}
		
		return randString;
	}
	
	
	public static void deleteTempFolder() {
		String username = System.getProperty("user.name");
		String tempPath = System.getProperty("user.dir").substring(0, 1) + ": \\Users\\" +username + "\\AppData\\Local\\Temp";
		deleteEverythingInFolder(tempPath);
	}
	
	
	public static void deleteEverythingInFolder(String folder) {
		File dir = new File(folder);
		
		File[] children = dir.listFiles();
		try {
			for(File file: children) {
				if(file.isFile()) {
					try {
						file.delete();
					}catch(Exception e) {
						
					}
				} else if (file.isDirectory()) {
					deleteDir(file);
				}else {
					
				}
			}
		}catch (Exception e) {
			
		}
		
		log("Delete Everything In folder - all files and folders delete from folder[" +folder + "].");
	}
	
	public static void deleteDir(File dir) {
		if(dir.isDirectory()) {
			String[] children = dir.list();
			for (int i=0; i< children.length; i++) {
				deleteDir(new File(dir, children[i]));
			}
		}
		
		dir.delete();
	}
	public static String getLocalisedDate(int year,int month, int day) {
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		Calendar cal = new GregorianCalendar(year, month, day);
		Date date = cal.getTime();
		String dateString = dateFormat.format(date);
		return dateString;

	}

	public static boolean looseStringCompare(String stringA, String stringB) {
		if (stringA.length()!=stringB.length()) {
		return false;}
		boolean result = true;
		for (int i=0; i<stringA.length();i++) {
			char charA = stringA.charAt(i);
			char charB = stringB.charAt(i);
			if(Character.isLetterOrDigit(charA)&&Character.isLetterOrDigit(charB)) {
				result = result && (charA==charB);
			}
		}
		return result;
	}
	/**
	 * This method generates a random wait period in seconds from 1 to 30 seconds
	 *
	 * @return result of calculation
	 */
	public int generateRandomSecondsWait() {

		Random r = new Random();
		int low = 1;
		int high = 60;
		int result = (r.nextInt(high - low) + low);

		return result;
	}
	/**
	 * The Method reformats a Date String to required format
	 *
	 * @param date       Date String
	 * @param formatFrom Format From
	 * @param formatTo   Format Tp
	 * @return Reformatted Date String
	 */
	public static String reformatDateString(String date, String formatFrom, String formatTo) {
		String reformattedString = "";
		Date dateFrom;
		SimpleDateFormat sdf = new SimpleDateFormat(formatTo);
		try {
			dateFrom = new SimpleDateFormat(formatFrom).parse(date);
			reformattedString = sdf.format(dateFrom);
		} catch (ParseException e) {
			AAssert.assertTrue(false, "FAIL: Error parsing date " + date + "'" + e.getMessage() + "'");
		}

		return reformattedString;
	}

	/**
	 * Method to get the last day of the month
	 *
	 * @param date Enables the Date to be passed in via the test method
	 * @return Last Day of Month
	 */
	public static String getLastDayOfTheMonth(String date) {
		int lastDay;
		String returnDate = "";
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		try {
			Date convertedDate = dateFormat.parse(date);
			Calendar c = Calendar.getInstance();
			c.setTime(convertedDate);
			lastDay = c.getActualMaximum(Calendar.DAY_OF_MONTH);
			returnDate = lastDay + date.substring(2);

		} catch (ParseException e) {
			AAssert.assertTrue(false, "FAIL: Error parsing date " + date + "'" + e.getMessage() + "'");
		}
		return returnDate;
	}
}

