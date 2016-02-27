package brajreport;
import java.util.ArrayList;
/**
 * BRAJMath.java
 *
 * Handles aggregate computations on database of user reports
 *
 * @author Robert Schofield
 * @author James McCray
 * @author Adam Zelenka
 * @author Brady Reisch
 * @version February 27, 2016: pre-alpha
 */
public class BRAJMath {
    
    private static double[] waitTimeData; //the values of wait times
    private static double[] trafficData;  //the values of traffic
    private ArrayList<Report> reportList; //the reports
    
    
    
    /**
     * Constructor for BRAJMath object. Instantiates the report list and 
     * parses data 
     * @param reportList the list of reports, taken from report handler
     */
    public BRAJMath(ArrayList<Report> reportList)
    {
        this.reportList = reportList;
        int size = reportList.size();
        this.waitTimeData = new double[size];
        this.trafficData = new double[size];
        for (int i = 0; i < size; i++)
        {
            this.waitTimeData[i] = (double)reportList.get(i).getWaitTime();
            this.trafficData[i] = (double)reportList.get(i).getTraffic();
        }
    }
    
    /**
     * Gives an estimated wait time for the eatery based on the current number
     * of people in the dining hall
     * @param traffic the number of people in the dining hall
     * @return the estimated wait time
     */
    public double getEstimate(int traffic)
    {
        return traffic * findSlope();
    }
    /**
     * Computes a slope of a linear regression of wait times scattered 
     * against dining hall traffic data
     * @return the slope of the linear regression
     */
    private double findSlope()
    {
        double num = dotProduct(waitTimeData, trafficData);
        double den = dotProduct(waitTimeData, waitTimeData);
        return num / den;
    }
    
    /**
     * Computes the dot product of two arrays of doubles
     * 
     * pre: arrays are of the same length
     * @param x the first array
     * @param y the second array
     * @return the dot product
     */
    private double dotProduct(double[] x, double[] y)
    {
        double sum = 0;
        for (int i = 0; i < x.length; i++)
        {
            sum += (x[i] * y[i]);
        }
        return sum;
    }
    
    
    
}
