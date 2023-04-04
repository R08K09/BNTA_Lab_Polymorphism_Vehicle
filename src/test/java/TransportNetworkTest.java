import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class TransportNetworkTest {

    TransportNetwork transportnetwork;

    @BeforeEach
    public void setUp(){
        transportnetwork = new TransportNetwork();
    }

    @Test
    public void canCountVehicles(){
        assertThat(transportnetwork.countVehicles()).isEqualTo(0);
    }

    @Test
    public void canAddVehicles(){
        Car car = new Car("Ford", "Blue", false, 5, 180,
                false, "metallic", 4);
        Plane plane = new Plane("Airbus A380", "White", true, 500,
                1185, true, "commercial");
        SpeedBoat speedboat = new SpeedBoat("Aquaholic", "Red", false,
                6, 120, false, "planing" );

        transportnetwork.addVehicle(car);
        transportnetwork.addVehicle(plane);
        transportnetwork.addVehicle(speedboat);
        assertThat(transportnetwork.countVehicles()).isEqualTo(3);
    }


}
