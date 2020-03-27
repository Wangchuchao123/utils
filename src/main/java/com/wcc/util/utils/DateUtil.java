package com.wcc.util.utils;

import java.util.Date;
/**
 * 
 * @ClassName: DateUtil 
 * @Description: 日期工具类
 * @author: 61466
 * @date: 2020年3月27日 上午9:06:42
 */
public class DateUtil {
	public static Date randomDate(Date startDate,Date endDate) {
		long t1 = startDate.getTime();
		long t2 = endDate.getTime();
		if(t2<t1) throw new RuntimeException("参数异常：开始日期不能大于结束日期");
		long t=(long) (Math.random()*(t2-t1)+t1);
		return new Date(t);
	}
}
