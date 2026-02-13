package rentingscooter.view;

import rentingscooter.domain.Scooter;
import rentingscooter.services.ScooterServiceImp;

import java.util.Scanner;

public class ScooterView {


    private final ScooterServiceImp scooterService;
    private final Scooter scooter;
    Scanner sc=new Scanner(System.in);

    public ScooterView(ScooterServiceImp scooterService, Scooter scooter){
        this.scooterService = scooterService;
        this.scooter = scooter;
    }

    public void createScooterView(){

        System.out.println("Ingrese el id del Scooter");
        int id=sc.nextInt();
        scooter.setIdVehicle(id);

        scooterService.createScooter(scooter);
    }


}
