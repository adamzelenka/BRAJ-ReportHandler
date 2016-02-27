package brajreport;
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
    
    public BRAJMathTest() {
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
