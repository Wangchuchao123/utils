package com.wcc.util.utils;

import java.util.Collection;
import java.util.List;

public class CollectionUtil {
	public static boolean hasValue(Collection<?> collection) {
		return collection == null || collection.isEmpty();
	}
}
