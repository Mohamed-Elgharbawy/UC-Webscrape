package com.company;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.Map;

public class Statistics {
    public static final String USER_AGENT = "Mozilla/5.0 (Windows NT 6.1; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/45.0.2454.101 Safari/537.36";

    public static void printRates(String ucString) throws IOException {

        UcLinks ul = new UcLinks();
        Map<String, String> ulMap = ul.returnLink();

        final Document doc = Jsoup.connect(ulMap.get(ucString)).userAgent(USER_AGENT).get();

        //Traverse the results
        Elements result = doc.select("table");
        Elements context = doc.select("p:nth-child(1)");
        String snapshot = context.text();
        String rates = result.text();

        if(snapshot.toLowerCase().contains("freshman")){
            String admitRate = rates.substring(0, rates.indexOf("%") + 1);
            String admits = rates.substring(rates.indexOf("%") + 2, rates.indexOf("Applicants"));
            String applicants = rates.substring(rates.indexOf("Applicants"), rates.indexOf("Cal"));
            String caliResidents = rates.substring(rates.indexOf("Cal"), rates.indexOf("GPA"));
            String gpaScoreHeader = rates.substring(rates.indexOf("GPA"), rates.indexOf("High"));
            String hsGpa = rates.substring(rates.indexOf("High"), rates.indexOf("ACT Composite"));
            String actCompScore = rates.substring(rates.indexOf("ACT Composite"), rates.indexOf("ACT English Language Arts"));
            String actEla = rates.substring(rates.indexOf("ACT English Language Arts"), rates.indexOf("SAT Evidence Based Reading & Writing"));
            String satEbrw = rates.substring(rates.indexOf("SAT Evidence Based Reading & Writing"), rates.indexOf("SAT Mathematics"));
            String satMath = rates.substring(rates.indexOf("SAT Mathematics"), rates.indexOf("SAT Essay"));
            String satEssay = rates.substring(rates.indexOf("SAT Essay"));

            System.out.println("\n" + snapshot);
            System.out.println("\n" + admitRate + "\n");
            System.out.println(admits + "\n");
            System.out.println(applicants + "\n");
            System.out.println(caliResidents + "\n");
            System.out.println(gpaScoreHeader + "\n");
            System.out.println(hsGpa + "\n");
            System.out.println(actCompScore + "\n");
            System.out.println(actEla + "\n");
            System.out.println(satEbrw + "\n");
            System.out.println(satMath + "\n");
            System.out.println(satEssay);
        }else{
            String applicants = rates.substring(rates.indexOf("Applicants"), rates.indexOf("Admitted"));
            String admitted = rates.substring(rates.indexOf("Admitted"), rates.indexOf("Admit rate"));
            String admitRate = rates.substring(rates.indexOf("Admit rate"));

            System.out.println("\n" + snapshot);
            System.out.println("\n" + applicants);
            System.out.println("\n" + admitted);
            System.out.println("\n" + admitRate);
        }
    }
}
