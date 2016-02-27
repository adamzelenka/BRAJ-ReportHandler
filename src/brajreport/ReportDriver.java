/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package brajreport;

/**
 *
 * @author Adam
 */
public class ReportDriver 
{
    public static void main(String[] args)
    {
        ReportHandler handler = new ReportHandler();
        /*handler.addReport(new Report());
        System.out.println(handler.getReportAt(0).toString());
        handler.getReportAt(0).setEatery("Cutting Edge");
        handler.getReportAt(0).setDiningHall("West End");
        handler.getReportAt(0).setTraffic(71);
        handler.getReportAt(0).setWaitTime(10);
        handler.getReportAt(0).setTimeOfDay(13.0);
        System.out.println(handler.getReportAt(0).toString());
        handler.addReport(new Report("Wrap World", "West End", 50, 6, 15.5));
        
        handler.addReport(new Report("Wrap World", "West End", 45, 5, 16));
        System.out.println(handler.toString());
        handler.removeReport(new Report("Cutting Edge", "West End", 71, 10, 13.0));
        System.out.println(handler.toString());
        handler.removeReport(new Report("Flips", "Owens", 100, 19, 11.5));
        System.out.println(handler.toString());
        handler.removeReport(handler.getReportAt(0));
        System.out.println(handler.toString());
        handler.removeReport(handler.getReportAt(0));
        System.out.println(handler.toString());
        handler.removeReport(handler.getReportAt(0));
        System.out.println(handler.toString());
        
        for (int i = 0; i < 49; i++)
        {
            handler.addReport(new Report("Wrap World", "West End", 45, 5, 16));
        }
        for (int i = 0; i < 49; i++)
        {
            System.out.println(i + " " + handler.getReportAt(i).getEatery() + "\n");
        }
        handler.addReport(new Report("JP's Chop House", "West End", 45, 5, 16));
        for(int i = 0; i < 49; i++)
        {
            System.out.println(i + " " + handler.getReportAt(i).getEatery() + "\n");
        }
        
        handler.clear();
        System.out.println(handler.size());*/
        
        handler.addReport(new Report("Wrap World", "West End", 10, 1, 16.0));
        handler.addReport(new Report("Wrap World", "West End", 15, 2, 16.0));
        handler.addReport(new Report("Wrap World", "West End", 20, 3, 16.0));
        handler.addReport(new Report("Wrap World", "West End", 25, 4, 16.0));
        handler.addReport(new Report("Wrap World", "West End", 30, 5, 16.0));
        int traffic = 45;
        double wait = handler.calculateWait(traffic);
        System.out.println(wait);
    }
    
}
