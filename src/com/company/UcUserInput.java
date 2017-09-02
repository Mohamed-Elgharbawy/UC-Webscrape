package com.company;

import java.io.IOException;
import java.util.Scanner;

public class UcUserInput {
    public String userInput() throws IOException{
        Scanner reader1 = new Scanner(System.in);
        Scanner reader2 = new Scanner(System.in);
        System.out.println("Common application or UC statistics?");
        String decision = reader1.nextLine();
        decision = decision.toLowerCase();
        if(decision.equals("common application") || decision.equals("common app")){
            Questions q = new Questions();
            q.printQuestions();
            return "";
        }else if(decision.equals("uc statistics") || decision.equals("statistics") || decision.equals("uc stats") || decision.equals("stats")){
            try {
                System.out.println("Enter a UC from the below list: ");
                System.out.println("\"Berkeley\", \"Davis\", \"Irvine\", \"Los Angeles\", \"Merced\", \"Riverside\", \"San Diego\", \"Santa Barbara\", \"Santa Cruz\"");
                String uc = reader2.nextLine();
                uc = uc.toLowerCase();
                Statistics s = new Statistics();
                s.printRates(uc);
                return uc;
            }catch(IllegalArgumentException i){
                System.out.println("Enter a valid UC");
                return "";
            }
        }else{
            System.out.println("Enter a valid option.");
            return "";
        }
    }
}
