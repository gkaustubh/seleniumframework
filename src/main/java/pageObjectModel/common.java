package pageObjectModel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import Resources.project1;

public class common extends project1 {
	
	public static void commonselect(WebElement dropdownElement,int optiontext) {
		
	Select dropdown=new Select(dropdownElement);
	dropdown.selectByIndex(optiontext);
		
		
	}
	

}
