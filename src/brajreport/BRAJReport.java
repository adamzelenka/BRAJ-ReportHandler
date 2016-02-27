/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package brajreport;
import java.util.*;

/**
 *
 * @author Adam
 */
public class BRAJReport {

    private static ArrayList<Report> reportList = new ArrayList<Report>();
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        int traffic = scan.nextInt();
        int waitTime = scan.nextInt();
        String timeStamp = scan.next();
        String eatery = scan.next();
        
        reportList.add(new Report(timeStamp, eatery, traffic, waitTime));
        
    }
    
}
