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
    
    private double[] waitTimeData;
    private double[] trafficData;
    private ArrayList<Report> reportList;
    
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
     * Computes a slope of a linear regression of wait times scattered 
     * against dining hall traffic data
     * @return the slope of the linear regression
     */
    public double findSlope()
    {
        double num = this.dotProduct(waitTimeData, trafficData);
        double den = this.dotProduct(waitTimeData, waitTimeData);
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
