package org.amazon.pom;

import org.openqa.selenium.WebDriver;

public class Amazon_BestSeller_PomMgr {
	public WebDriver driver;
	private Amazon_BestSeller_Pom best;
	
	public Amazon_BestSeller_Pom getBest() {
		if(best==null)
		{
			best=new Amazon_BestSeller_Pom(driver);
		}
		return best;
	}
	public Amazon_BestSeller_PomMgr(WebDriver driver)
	{
		this.driver=driver;
	}
	

}
