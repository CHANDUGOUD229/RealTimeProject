package com.stepchange.atf.controls;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;

import com.stepchange.atf.utilities.AAssert;
import org.openqa.selenium.WebElement;

/**
 * Need refactoring  to be part if container pattern, Lists deprecated , need deleting in the future
 */
public class Tab extends Control {
    List<TextField> textFiledList = new ArrayList<>();
    List<Datefield> dateFieldList = new ArrayList<>();
    List<Dropdown> dropdownList = new ArrayList<>();
    List<IntegerField> integerFieldList = new ArrayList<>();
    String tabText;
    Screen tabScreen;

    public Screen getTabScreen() {
        return tabScreen;
    }

    public void setTabScreen(Screen tabScreen) {
        this.tabScreen = tabScreen;
    }

/**
 * Deprecated. MOdel this without lists, using the page objects
 * @return
 *//*
@Deprecated
public List<Datefield> getDateFieldList() { return dateFieldList; }
*//**
     *  Deprecated ,Model this without lists using page objects
     *  @retrun
     *//*
@Deprecated
public List<Dropdown> getDropdownList() { return dropdownList; }
*/

    /**
     * Deprecated ,Model this without lists using page objects
     *
     * @retrun
     *//*
@Deprecated
public List<IntegerField> getIntegerFieldList() { return integerFieldList; }*/


    public Tab(By selector, String tabText) {
        this.setSelector(selector);
        this.tabText = tabText;
    }


    public void testTabText() {
        switchToActiveIFrame();
        AAssert.assertEquals(this.getElement().getText(), tabText, "FAIL: Tab Text does not match for" + tabText, " Tab text tedt for " + tabText);
    }

    /**
     * similar funtionality as test tab text , however there is no need to switch an active IFrame in this method
     */

    public void testPortalTabsText() {

        AAssert.assertEquals(this.getElement().getText(), tabText, "FAIL: Tab Text does not match for" + tabText, " Tab text tedt for " + tabText);
    }

    public void setTabText(String tabText) {
        this.tabText = tabText;
    }

    public String getTabText() {
        return tabText;
    }

    public void click() {
        this.getElement().click();
    }

	public void findTabNameAndClickTab() {
		for (WebElement tab : getBrowser().getDriver().findElements(this.getSelector())) {

		}
	}

}
