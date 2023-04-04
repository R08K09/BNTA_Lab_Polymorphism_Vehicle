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

    
}
