/*
 * Copyright 2014, Ragunath Jawahar (www.codeherenow.com)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.codeherenow.java8.repeatableannotations.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Containing annotations should have a 'value' attribute that is always a single dimensional array
 * of the {@link java.lang.annotation.Annotation} it is going to contain. Also make sure that the
 * {@link java.lang.annotation.Target} and {@link java.lang.annotation.Retention} annotations have
 * the same values as that of its counterpart.
 */
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface Parrots {
    Parrot[] value();
}
