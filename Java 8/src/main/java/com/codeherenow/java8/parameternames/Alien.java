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

package com.codeherenow.java8.parameternames;

/**
 * @author Ragunath Jawahar <www.codeherenow.com>
 */
public class Alien {
    private String alias;
    private Galaxy galaxy;
    private double ageInEarthYears;

    public Alien(String alias, Galaxy galaxy, double ageInEarthYears) {
        this.alias = alias;
        this.galaxy = galaxy;
        this.ageInEarthYears = ageInEarthYears;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public Galaxy getGalaxy() {
        return galaxy;
    }

    public void setGalaxy(Galaxy galaxy) {
        this.galaxy = galaxy;
    }

    public double getAgeInEarthYears() {
        return ageInEarthYears;
    }

    public void setAgeInEarthYears(double ageInEarthYears) {
        this.ageInEarthYears = ageInEarthYears;
    }

    @Override
    public String toString() {
        return "Alien{" +
                "alias='" + alias + '\'' +
                ", galaxy=" + galaxy +
                ", ageInEarthYears=" + ageInEarthYears +
                '}';
    }
}
