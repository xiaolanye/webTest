package com.web.test;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

import com.web.entity.User;

public class Test {

	public static void main(String[] args) throws IllegalArgumentException, IllegalAccessException {
		Object obj1 = new Object();
		Object obj2 = new Object();
		Map<String, Object> map = new HashMap<>();
		map.put("obj1", obj1);
		map.put("obj2", obj2);
		for (Map.Entry<String, Object> entry : map.entrySet()) {
			entry.getKey();
			entry.getValue();
		}
		User user = new User();
		Class<User> userCls = User.class;
		Field[] fields = userCls.getDeclaredFields();
		for (Field field : fields) {
			System.out.println(field.getName());
		}
		
		System.out.println(obj1.hashCode());
		System.out.println(obj2.hashCode());
		System.out.println(obj1.toString());
		System.out.println(obj2.toString());
		System.out.println(obj1.equals(obj2));
	}

}
