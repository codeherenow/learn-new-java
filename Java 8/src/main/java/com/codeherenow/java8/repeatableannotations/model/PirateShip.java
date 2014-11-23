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

package com.codeherenow.java8.repeatableannotations.model;

import com.codeherenow.java8.repeatableannotations.annotations.Parrot;

/**
 * @author Ragunath Jawahar <www.codeherenow.com>
 */
public class PirateShip {

    @Parrot(alert = Sighting.ICEBERG)
    private Lookout lookout;

    @Parrot(alert = Sighting.NAVY_SHIP)
    @Parrot(alert = Sighting.PIRATE_SHIP)
    private PirateCaptain pirateCaptain;

}
