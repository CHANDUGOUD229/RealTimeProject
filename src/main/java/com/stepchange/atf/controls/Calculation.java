package com.stepchange.atf.controls;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;

/**
 * Calculation objects for checking on settlement screens
 *
 */
public class Calculation extends Control {
	private By selector;
	private List<By> fields = new ArrayList<>();
	private List<By> negativeFields = new ArrayList<>();
	
	public By getSelector() { return selector; }
	public List<By> getFields() { return fields ; }
	public List<By> getNegativeFields() { return negativeFields ; }
	public Calculation(By selector) { this.selector = selector ; }
	
	}


