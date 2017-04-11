package com.test.util;

import java.util.UUID;

public class UserUtil {
	/**
	 * 利用UUID生成主键值
	 */
		public static String createId(){
			String id=UUID.randomUUID().toString();
			
			return id.replace("-","");
		}
}
