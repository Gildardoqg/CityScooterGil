package rentingscooter;

import rentingscooter.domain.Scooter;
import rentingscooter.services.ScooterServiceImp;
import rentingscooter.view.ScooterView;

public class ScooterCityMain {
    public static void main(String[] args){
        ScooterServiceImp scooterService = new ScooterServiceImp();
        Scooter scooter=new Scooter();
        ScooterView scooterView=new ScooterView(scooterService, scooter);

        scooterView.createScooterView();
        scooterService.printScooter(scooter);

    }
}
