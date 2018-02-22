package com.automation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

//First we have to create a annotation

@Retention(RetentionPolicy.RUNTIME)
public @interface ReRunFailedTestCases {
	int value() default 0;
}
