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

import com.codeherenow.java8.repeatableannotations.model.Sighting;

import java.lang.annotation.*;

/**
 * To make an annotation repeatable, you need to specify a containing class using the
 * {@link java.lang.annotation.Repeatable} annotation that is available from Java 8. The containing class
 * name is usually (best practice, not mandatory) the pluralized form of the existing annotation.
 *
 * @author Ragunath Jawahar <www.codeherenow.com>
 */
@Repeatable(Parrots.class)
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface Parrot {
    Sighting alert();
}
