package org.ies.vehicles.components;

import org.ies.vehicles.model.Garage;
import org.ies.vehicles.model.Vehicle;

import java.util.Scanner;

public class GarageReader {
    private final Scanner scanner;
    private final VehicleReader vehicleReader;

    public GarageReader(Scanner scanner, VehicleReader vehicleReader) {
        this.scanner = scanner;
        this.vehicleReader = vehicleReader;
    }

    public Garage read(){
        System.out.println("Nombre del garaje: ");
        String name = scanner.nextLine();

        System.out.println("Dirección: ");
        String address = scanner.nextLine();

        System.out.println("¿Cúantos vehiculos hay en el garaje?");
        int howManyCars = scanner.nextInt();

        Vehicle[] vehicles = new Vehicle[howManyCars];

        for (int i = 0; i < vehicles.length; i++) {
            vehicles[i] = vehicleReader.read();
        }

        return new Garage(
                name,
                address,
                vehicles
        );
    }
}
