package jmol.jasper.test.data.miscellaneous;

import jmol.jasper.main.data.boardspaces.Street;
import jmol.jasper.main.data.miscellaneous.MonopolyBoardData;
import jmol.jasper.test.data.boardspaces.TestStreet;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class MonopolyBoardDataTest {
    private final List<Street> ARHNEM = Arrays.asList(
            (Street) MonopolyBoardData.MONOPOLYBOARD[MonopolyBoardData.SPACENR_STEENSTRAAT],
            (Street) MonopolyBoardData.MONOPOLYBOARD[MonopolyBoardData.SPACENR_KETELSTRAAT],
            (Street) MonopolyBoardData.MONOPOLYBOARD[MonopolyBoardData.SPACENR_VELPERPLEIN]);
    @Test
    void testGetCity() {
        // GIVEN a street of the type Arhnem:
        TestStreet street = new TestStreet(MonopolyBoardData.BoardspaceType.STREET_ARNHEM);

        // WHEN we want to get all other streets of the same type:
        List<Street> city = MonopolyBoardData.getCity(street);

        // THEN the city should contain the same values as Arnhem:
        assertTrue(city.containsAll(ARHNEM));
    }
}
