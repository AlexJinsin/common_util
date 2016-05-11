package com.alex.utils;


public class Common {

	public Common() {
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * @description:用于 设置请求 中空值 的默认值
	 * @param req
	 * @param parameter 一个参数
	 * @param defaultValue
	 * @return:
	 * @time: 下午6:00:47
	 * @author: alex
	 */
	public static String setDefaultVale(final String parameter,final String defaultValue) {
		
		return (org.apache.commons.lang3.StringUtils.isBlank(parameter)) ? defaultValue: parameter;
    }

}
