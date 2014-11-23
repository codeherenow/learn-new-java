package com.codeherenow.java8.repeatableannotations.annotations;

import com.codeherenow.java8.repeatableannotations.model.Sighting;

import java.lang.annotation.*;

/**
 * @author Ragunath Jawahar <www.codeherenow.com>
 */
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface Parrot {
    Sighting alert();
}
