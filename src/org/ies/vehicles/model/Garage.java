package org.ies.vehicles.model;

import java.util.Arrays;
import java.util.Objects;

public class Garage {
    private String name;
    private String address;
    private Vehicle[] vehicle;

    public Garage(String name, String address, org.ies.vehicles.model.Vehicle[] vehicle) {
        this.name = name;
        this.address = address;
        this.vehicle = vehicle;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public org.ies.vehicles.model.Vehicle[] getVehicle() {
        return vehicle;
    }

    public void setVehicle(org.ies.vehicles.model.Vehicle[] vehicle) {
        this.vehicle = vehicle;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Garage garage = (Garage) o;
        return Objects.equals(name, garage.name) && Objects.equals(address, garage.address) && Objects.deepEquals(vehicle, garage.vehicle);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, address, Arrays.hashCode(vehicle));
    }

    @Override
    public String toString() {
        return "Garage{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", Vehicle=" + Arrays.toString(vehicle) +
                '}';
    }
}
