package brajreport_test;
/**
 * BRAJMatTesth.java
 *
 * Tests to see if BRAJMath correctly computes regression for wait time data
 *
 * @author Robert Schofield
 * @author James McCray
 * @author Adam Zelenka
 * @author Brady Reisch
 * @version February 27, 2016: pre-alpha
 */

import java.util.ArrayList;
import brajreport.*;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Adam
 */
public class BRAJMathTest {
    
    public BRAJMathTest() 
    {
        //this constructor does nothing, and it is left empty.
    }
    
    @BeforeClass
    public static void setUpClass() 
    {
        ArrayList<Report> reportList = new ArrayList<Report>();
        reportList.add(new Report("Wrap World", "West End", 50, 6, 15.5));
        reportList.add(new Report("Wrap World", "West End", 50, 6, 15.5));
        reportList.add(new Report("Wrap World", "West End", 50, 6, 15.5));
        reportList.add(new Report("Wrap World", "West End", 50, 6, 15.5));
        reportList.add(new Report("Wrap World", "West End", 50, 6, 15.5));
        BRAJMath math = new BRAJMath(reportList);
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
     * Test of findSlope method, of class BRAJMath.
     */
    @Test
    public void testFindSlope() {
        System.out.println("findSlope");
        BRAJMath instance = null;
        double expResult = 0.0;
        double result = instance.findSlope();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
