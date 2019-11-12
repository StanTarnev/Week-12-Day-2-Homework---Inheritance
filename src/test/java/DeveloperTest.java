import TechStaff.Developer;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class DeveloperTest {
    Developer developer;

    @Before
    public void before(){
        developer = new Developer("Pete", "AB1234CE", 40000);
    }

    @Test
    public void canGetName(){
        assertEquals("Pete", developer.getName());
    }

    @Test
    public void canGetNINumber(){
        assertEquals("AB1234CE", developer.getNINumber());
    }

    @Test
    public void canGetSalary(){
        assertEquals(40000.00, developer.getSalary());
    }

    @Test
    public void canRaiseSalary(){
        developer.raiseSalary(0.20);
        assertEquals(48000.00, developer.getSalary());
    }

    @Test
    public void canPayBonus(){
        assertEquals(400.00, developer.payBonus());
    }

    @Test
    public void canSetName__notNull(){
        developer.setName("Pierre");
        assertEquals("Pierre", developer.getName());
    }

    @Test
    public void canSetName__null(){
        developer.setName(null);
        assertEquals("Pete", developer.getName());
    }
}
