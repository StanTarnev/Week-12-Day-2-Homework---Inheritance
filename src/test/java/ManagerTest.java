import Management.Manager;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class ManagerTest {
    Manager manager;

    @Before
    public void before(){
        manager = new Manager("Joe", "AB1234CD", 50000, "Sales");
    }

    @Test
    public void canGetName(){
        assertEquals("Joe", manager.getName());
    }

    @Test
    public void canGetNINumber(){
        assertEquals("AB1234CD", manager.getNINumber());
    }

    @Test
    public void canGetSalary(){
        assertEquals(50000.00, manager.getSalary());
    }

    @Test
    public void canRaiseSalary(){
        manager.raiseSalary(-0.10);
        assertEquals(55000.00, manager.getSalary());
    }

    @Test
    public void canPayBonus(){
        assertEquals(500.00, manager.payBonus());
    }

    @Test
    public void canGetDeptName(){
        assertEquals("Sales", manager.getDeptName());
    }

    @Test
    public void canSetName__notNull(){
        manager.setName("Josephe");
        assertEquals("Josephe", manager.getName());
    }

    @Test
    public void canSetName__null(){
        manager.setName(null);
        assertEquals("Joe", manager.getName());
    }
}
