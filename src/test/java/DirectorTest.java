import Management.Director;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class DirectorTest {
    Director director;

    @Before
    public void before(){
        director = new Director("Ingrid", "AB1234CG", 60000, "Finance", 600000);
    }

    @Test
    public void canGetName(){
        assertEquals("Ingrid", director.getName());
    }

    @Test
    public void canGetNINumber(){
        assertEquals("AB1234CG", director.getNINumber());
    }

    @Test
    public void canGetSalary(){
        assertEquals(60000.00, director.getSalary());
    }

    @Test
    public void canRaiseSalary(){
        director.raiseSalary(-0.10);
        assertEquals(66000.00, director.getSalary());
    }

    @Test
    public void canPayBonus(){
        assertEquals(1200.00, director.payBonus());
    }

    @Test
    public void canGetDeptName(){
        assertEquals("Finance", director.getDeptName());
    }

    @Test
    public void canGetBudget(){
        assertEquals(600000.00, director.getBudget());
    }

    @Test
    public void canSetName__notNull(){
        director.setName("Astrid");
        assertEquals("Astrid", director.getName());
    }

    @Test
    public void canSetName__null(){
        director.setName(null);
        assertEquals("Ingrid", director.getName());
    }
}
