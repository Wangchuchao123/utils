package com.wcc.util.utils;

import java.util.Date;
/**
 * 
 * @ClassName: DateUtil 
 * @Description: ���ڹ�����
 * @author: 61466
 * @date: 2020��3��27�� ����9:06:42
 */
public class DateUtil {
	public static Date randomDate(Date startDate,Date endDate) {
		long t1 = startDate.getTime();
		long t2 = endDate.getTime();
		if(t2<t1) throw new RuntimeException("�����쳣����ʼ���ڲ��ܴ��ڽ�������");
		long t=(long) (Math.random()*(t2-t1)+t1);
		return new Date(t);
	}
}
