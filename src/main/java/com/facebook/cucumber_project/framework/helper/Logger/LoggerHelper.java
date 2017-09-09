package com.facebook.cucumber_project.framework.helper.Logger;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;


@SuppressWarnings("rawtypes")
public class LoggerHelper {

	private static boolean root = false;

	public static Logger getLogger(Class clas){
		if (root) {
			return Logger.getLogger(clas);
		}
		PropertyConfigurator.configure(com.facebook.cucumber_project.framework.util.ResourceHelper.getResourcePath("/src/main/resources/configfile/log4j.properties"));
		root = true;
		return Logger.getLogger(clas);
	}
}