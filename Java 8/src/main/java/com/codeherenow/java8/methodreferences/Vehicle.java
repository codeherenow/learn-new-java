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

package com.codeherenow.java8.methodreferences;

/**
 * @author Ragunath Jawahar <www.codeherenow.com>
 */
public class Vehicle {

    private String name;
    private int capacity;
    private double topSpeedMph;
    private double costPerPassengerMile;

    public Vehicle(String name, int capacity,
                   double topSpeedMph, double costPerPassengerMile) {
        this.name = name;
        this.capacity = capacity;
        this.topSpeedMph = topSpeedMph;
        this.costPerPassengerMile = costPerPassengerMile;
    }

    public static int compareByCapacity(
            Vehicle vehicleA, Vehicle vehicleB) {

        return compare(vehicleA.getCapacity(),
                vehicleB.getCapacity());
    }

    public static int compareByTopSpeed(
            Vehicle vehicleA, Vehicle vehicleB) {

        return compare(vehicleA.getTopSpeedMph(),
                vehicleB.getTopSpeedMph());
    }

    public static int compareByPassengerMile(
            Vehicle vehicleA, Vehicle vehicleB) {

        return compare(vehicleA.getCostPerPassengerMile(),
                vehicleB.getCostPerPassengerMile());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public double getTopSpeedMph() {
        return topSpeedMph;
    }

    public void setTopSpeedMph(double topSpeedMph) {
        this.topSpeedMph = topSpeedMph;
    }

    public double getCostPerPassengerMile() {
        return costPerPassengerMile;
    }

    public void setCostPerPassengerMile(double costPerPassengerMile) {
        this.costPerPassengerMile = costPerPassengerMile;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "name='" + name + '\'' +
                ", capacity=" + capacity +
                ", topSpeedMph=" + topSpeedMph +
                ", costPerPassengerMile=" + costPerPassengerMile +
                '}';
    }

    private static int compare(double quantityA, double quantityB) {
        return quantityA > quantityB
                ? 1
                : quantityB > quantityA ? -1 : 0;
    }

}
