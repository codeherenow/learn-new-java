package com.codeherenow.java8.repeatableannotations.annotations;

import com.codeherenow.java8.repeatableannotations.model.Sighting;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author Ragunath Jawahar <www.codeherenow.com>
 */
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface Parrot {
    Sighting alert();
}
