/**
 * 
 */

/**
 * @author choudhuryIqbal
 *
 */

package com.facebook.cucumber_project.framework.configreader;

import com.facebook.cucumber_project.framework.Configuration.browser.BrowserType;


public interface ConfigReader {
	public String getUserName();
	public String getPassword();
	public String getWebsite();
	public int getPageLoadTimeOut();
	public int getImplicitWait();
	public int getExplicitWait();
	public BrowserType getBrowser();
}