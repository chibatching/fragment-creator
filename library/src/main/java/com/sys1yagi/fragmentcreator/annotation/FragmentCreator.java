package com.sys1yagi.fragmentcreator.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

// workaround for kapt
// @Retention(RetentionPolicy.SOURCE)
@Retention(RetentionPolicy.CLASS)
@Target(ElementType.TYPE)
public @interface FragmentCreator {

}
