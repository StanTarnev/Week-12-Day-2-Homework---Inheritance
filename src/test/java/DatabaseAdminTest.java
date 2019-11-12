import TechStaff.DatabaseAdmin;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class DatabaseAdminTest {
    DatabaseAdmin databaseAdmin;

    @Before
    public void before(){
        databaseAdmin = new DatabaseAdmin("James", "AB1234CF", 30000);
    }

    @Test
    public void canGetName(){
        assertEquals("James", databaseAdmin.getName());
    }

    @Test
    public void canGetNINumber(){
        assertEquals("AB1234CF", databaseAdmin.getNINumber());
    }

    @Test
    public void canGetSalary(){
        assertEquals(30000.00, databaseAdmin.getSalary());
    }

    @Test
    public void canRaiseSalary(){
        databaseAdmin.raiseSalary(0.30);
        assertEquals(39000.00, databaseAdmin.getSalary());
    }

    @Test
    public void canPayBonus(){
        assertEquals(300.00, databaseAdmin.payBonus());
    }

    @Test
    public void canSetName__notNull(){
        databaseAdmin.setName("Jacques");
        assertEquals("Jacques", databaseAdmin.getName());
    }

    @Test
    public void canSetName__null(){
        databaseAdmin.setName(null);
        assertEquals("James", databaseAdmin.getName());
    }
}
