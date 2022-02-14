package com.stepchange.atf.utilities;

import java.util.Date;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.LogRecord;

public class HTMLLogFormatter extends java.util.logging.Formatter {
	public String format(LogRecord record) {
		String bgColour;
		if(record.getLevel().equals(Level.SEVERE)) {
			bgColour = "#F70D1A";
		}else {
			bgColour = "#57E964";
		}
		
		return ("<tr style=\"background-color:" + bgColour + "\"><td>" + (new Date(record.getMillis())).toString() + "</td><td>"
				+ record.getLevel() + "</td><td>"
				+ record.getMessage() + "</td><tr>\n");
	}
	
	public String getHead(Handler h) {
		return ("<html>\n  <body>\n" + "<Table border>\n<tr style=\"background-color:#43BFC7\"><td>Time</td><td>Log Level</td><td>Log Message</td></tr>\n");
	}
	
	public String getTrail(Handler h) {
		return ("</table>\n</body>\n</html>");
	}
		
}
