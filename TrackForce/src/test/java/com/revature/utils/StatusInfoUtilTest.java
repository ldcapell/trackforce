package com.revature.utils;

import java.lang.reflect.Method;
import java.util.List;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class StatusInfoUtilTest {

	Method getStageBasedOnStatusInfosAndStatusIDMethod;

	@BeforeClass
	public void beforeClass() {
		StatusInfoUtil.class.getDeclaredMethods();
		try {
			getStageBasedOnStatusInfosAndStatusIDMethod = StatusInfoUtil.class
					.getDeclaredMethod("getStageBasedOnStatusInfosAndStatusID", List.class, int.class);
		} catch (NoSuchMethodException | SecurityException e) {
			e.printStackTrace();
		}
		getStageBasedOnStatusInfosAndStatusIDMethod.setAccessible(true);
	}

	@Test
	public void getStageBasedOnStatusInfosAndStatusIDTest() {
		System.out.println("The method: ");
		System.out.println(getStageBasedOnStatusInfosAndStatusIDMethod.getName());
	}
}
