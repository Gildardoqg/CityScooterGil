package rentingscooter.services;

import rentingscooter.domain.Scooter;

import java.util.ArrayList;

public class ScooterServiceImp implements ScooterService{


    @Override
    public Scooter createScooter(Scooter scooter) {
        return scooter;
    }
    public void printScooter(Scooter scooter){
        System.out.println("Id del Scooter es: "+scooter.getIdVehicle());
    }

    @Override
    public ArrayList<Scooter> getAllScooters() {
        return null;
    }

    @Override
    public Scooter getScooterById(int id) {
        return null;
    }

    @Override
    public Scooter updateScooter(Scooter scooter) {
        return null;
    }

    @Override
    public void deleteScooter(int id) {

    }
}
