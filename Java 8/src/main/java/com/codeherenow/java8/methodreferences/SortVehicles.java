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

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * @author Ragunath Jawahar <www.codeherenow.com>
 */
public class SortVehicles {

    public static void main(String[] args) {
        Vehicle renaultDuster = new Vehicle(
                "Renault Duster", 5, 111.84, 0.18);
        Vehicle airbusA320 = new Vehicle(
                "Airbus A320", 150, 541.21, 11.3);
        Vehicle volvo9400 = new Vehicle(
                "Volvo 9400", 40, 86.99, 0.85);

        // Add vehicles to a list
        List<Vehicle> vehicles = Arrays.asList(
                airbusA320, volvo9400, renaultDuster);

        // Sort by seating capacity
        System.out.println("--- Seating Capacity ---");
        vehicles.sort(new Comparator<Vehicle>() {

            @Override
            public int compare(Vehicle vehicleA, Vehicle vehicleB) {
                // ... blah blah blah
                return 0;
            }
        });
        printVehicles(vehicles);

        // Sort by top speed
        System.out.println("--- Top Speed ---");
        vehicles.sort(new Comparator<Vehicle>() {

            @Override
            public int compare(Vehicle vehicleA, Vehicle vehicleB) {
                // ... blah blah blah
                return 0;
            }
        });
        printVehicles(vehicles);

        // Sort by cost per passenger mile
        System.out.println("--- Cost per Passenger Mile ---");
        vehicles.sort(new Comparator<Vehicle>() {

            @Override
            public int compare(Vehicle vehicleA, Vehicle vehicleB) {
                // ... blah blah blah
                return 0;
            }
        });
        printVehicles(vehicles);
    }

    private static void printVehicles(List<Vehicle> vehicles) {
        for (Vehicle vehicle : vehicles) {
            System.out.println(vehicle.getName());
        }
        System.out.println();
    }
}
