package com.stepchange.atf.controls;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.logging.Level;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;

import com.stepchange.atf.utilities.Utils;

/**
 * Class for defining fate fields for use in screen objects

 *
 */
public class Datefield extends TextField {

	
	/**
	 * LightWeight constructor for Datefield , takes a By
	 * @param selector - Custom By
	 */
	public Datefield (By selector) { super(selector);}
	
	/**
	 * Constructor that sets Bys for selector , label selector and the expected labeltext
	 * @param selector- custom By
	 * @param labelSelector - custom By
	 * @param labelText - Expected Label text
	 */
	
	public Datefield (By selector, By labelSelector , String labelText) {
		this(selector);
		this.setLabelSelector(labelSelector);
		this.setLabelText(labelText);

	}
	
	/**
	 *  Constructor that sets Bys for selector, label selector, expected labeltext and expected error message
	 *  @param selector -Custom By
	 *  @param labelSelector - custom By
	 *  @param labelText - Expected label text
	 *  @param dateErrorMessage - Expected error test
	 */
	
	public Datefield (By selector, By labelSelector, String labelText, String dateErrorMessage) {
		this(selector);
		this.setLabelSelector(labelSelector);
		this.setLabelText(labelText);
		this.setErrorText(dateErrorMessage);
		
	}

	/**
	 *  Enter a date value into the date field
	 *  @param year - number the represents year
	 *  @param month - number that represents month
	 *  @param day - number that represent day
	 
	 */
	
	public void enterDate (int year, int month, int day) {
		String dateString = Utils.getLocalisedDate(year , month , day);
		int iterationCounter = 0;
		scrollElementIntoView();
		while (iterationCounter < getBrowser().getMaxAttempts()) {
			try {
				getBrowser().getElementWhenReady(getSelector()).clear();
				break;
			}
			catch(StaleElementReferenceException e) {
				getBrowser().getLogWriter().log(" Caught StaleElementReferenceException in enterDate method", Level.FINE);
				
			}
			getBrowser().sleep(getBrowser().getTimeout()/ 10);
			}
		enterText(getSelector(),dateString);
	}
	
	/**
	 *  Enter a date value into the date field
	 *  @param date - data objects
	 */
	
	public void enterDate(Date date) {

			SimpleDateFormat entryFormat = new SimpleDateFormat("dd/MM/yyyy");
			this.enterText(entryFormat.format(date));
		}

	/**
	 * Enter date String
	 * @param date -sting 
	 */
	public void enterDate(String date) {
		int iterationCounter = 0;
		while (iterationCounter < getBrowser().getMaxAttempts()) {
			try {
				getBrowser().getElementWhenReady(getSelector()).clear();
				break;
			}
			catch (StaleElementReferenceException e) {
				getBrowser().getLogWriter().log( " Caught StaleElementReferenceException in enterDate method");
				iterationCounter++;
			}
			enterText(getSelector(), date);
			}
		}
	}

