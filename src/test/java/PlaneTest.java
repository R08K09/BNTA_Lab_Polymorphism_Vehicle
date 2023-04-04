import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class PlaneTest {

    Plane plane;

    @BeforeEach
    public void setUp(){
        plane = new Plane("Airbus A380", "White", true, 500,
                1185, true, "commercial");
    }

    @Test
    public void isSuitableForInternationalTravel(){
        assertThat(plane.isSuitableForInternationalTravel()).isEqualTo(true);
    }

    @Test
    public void isPrivateOrCommercial(){
        assertThat(plane.isPrivateOrCommercial()).isEqualTo("commercial");
    }

    @Test
    public void getPlaneName(){
        assertThat(plane.getName()).isEqualTo("Airbus A380");
    }

    @Test
    public void canSetPlaneName(){
        plane.setName("Airbus A350");
        assertThat(plane.getName()).isEqualTo("Airbus A350");
    }

    @Test
    public void getPlaneColour(){
        assertThat(plane.getColour()).isEqualTo("White");
    }

    @Test
    public void setPlaneColour(){
        plane.setColour("Yellow");
        assertThat(plane.getColour()).isEqualTo("Yellow");
    }


}
