package brajreport;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * ReportTest.java
 *
 * JUnit test suite for Report class
 *
 * @author Robert Schofield
 * @author James McCray
 * @author Adam Zelenka
 * @author Brady Reisch
 * @version February 27, 2016: pre-alpha
 */
public class ReportTest {
    
    public ReportTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getEatery method, of class Report.
     */
    @Test
    public void testGetEatery() {
        System.out.println("getEatery");
        Report instance = new Report();
        String expResult = "";
        String result = instance.getEatery();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    //Add testGetDiningHall() method!!!!!!!!!!!!!!!!!!!!!!!!!!!
    
    /**
     * Test of getTraffic method, of class Report.
     */
    @Test
    public void testGetTraffic() {
        System.out.println("getTraffic");
        Report instance = new Report();
        int expResult = 0;
        int result = instance.getTraffic();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getWaitTime method, of class Report.
     */
    @Test
    public void testGetWaitTime() {
        System.out.println("getWaitTime");
        Report instance = new Report();
        int expResult = 0;
        int result = instance.getWaitTime();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTimeOfDay method, of class Report.
     */
    @Test
    public void testGetTimeOfDay() {
        System.out.println("getTimeOfDay");
        Report instance = new Report();
        double expResult = 0.0;
        double result = instance.getTimeOfDay();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEatery method, of class Report.
     */
    @Test
    public void testSetEatery() {
        System.out.println("setEatery");
        String eat = "";
        Report instance = new Report();
        instance.setEatery(eat);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTraffic method, of class Report.
     */
    @Test
    public void testSetTraffic() {
        System.out.println("setTraffic");
        int traf = 0;
        Report instance = new Report();
        instance.setTraffic(traf);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setWaitTime method, of class Report.
     */
    @Test
    public void testSetWaitTime() {
        System.out.println("setWaitTime");
        int wait = 0;
        Report instance = new Report();
        instance.setWaitTime(wait);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTimeOfDay method, of class Report.
     */
    @Test
    public void testSetTimeOfDay() {
        System.out.println("setTimeOfDay");
        double time = 0.0;
        Report instance = new Report();
        instance.setTimeOfDay(time);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Report.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Report instance = new Report();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of equals method, of class Report.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object o = null;
        Report instance = new Report();
        boolean expResult = false;
        boolean result = instance.equals(o);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
