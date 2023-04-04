import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class CarTest {

    Car car;

    @BeforeEach
    public void setUp() {
        car = new Car("Ford", "Blue", false, 5, 180,
                false, "metallic", 4);
    }

    @Test
    public void canGetCarFinish(){
        assertThat(car.getVehicleFinish()).isEqualTo("metallic");
    }

    @Test
    public void canSetCarFinish(){
        car.setVehicleFinish("matte");
        assertThat(car.getVehicleFinish()).isEqualTo("matte");
    }

    @Test
    public void getNumberOfWheels(){
        assertThat(car.getNumberOfWheels()).isEqualTo(4);
    }

    @Test
    public void canSetNumberOfWheels(){
        car.setNumberOfWheels(6);
        assertThat(car.getNumberOfWheels()).isEqualTo(6);
    }

    @Test
    public void getCarMaxSpeed(){
        assertThat(car.getMaxSpeed()).isEqualTo(180);
    }

    @Test
    public void canSetCarMaxSpeed(){
        car.setMaxSpeed(200);
        assertThat(car.getMaxSpeed()).isEqualTo(200);
    }

    @Test
    public void getMaxOccupancy(){
        assertThat(car.getMaxOccupancy()).isEqualTo(5);
    }

    @Test
    public void canSetCarMaxOccupancy(){
        car.setMaxOccupancy(3);
        assertThat(car.getMaxOccupancy()).isEqualTo(3);
    }

}
