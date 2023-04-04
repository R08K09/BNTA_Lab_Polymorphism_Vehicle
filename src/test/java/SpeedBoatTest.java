import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class SpeedBoatTest {

    SpeedBoat speedboat;

    @BeforeEach
    public void setUp(){
        speedboat = new SpeedBoat("Aquaholic", "Red", false,
                6, 120, false, "planing");
    }

    @Test
    public void canDiveUnderwater(){
        assertThat(speedboat.canDiveUnderwater()).isEqualTo(false);
    }

    @Test
    public void getHullType(){
        assertThat(speedboat.getHullType()).isEqualTo("planing");
    }

    @Test
    public void canSetHullType(){
        speedboat.setHullType("Flat-Bottom");
        assertThat(speedboat.getHullType()).isEqualTo("Flat-Bottom");
    }

    @Test
    public void isUsedForPublicTravel(){
        assertThat(speedboat.isForPublicTravel()).isEqualTo(false);
    }

    @Test
    public void makeForPublicTravel(){
        speedboat.setIfSuitableForPublicTravel(true);
        assertThat(speedboat.isForPublicTravel()).isEqualTo(true);
    }

}
