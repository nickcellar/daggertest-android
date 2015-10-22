package com.nicholasworkshop.library.sdk;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;

import javax.inject.Qualifier;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * Created by nickwph on 10/21/15.
 */
@Qualifier
@Documented
@Retention(RUNTIME)
public @interface SdkNamed {
}
