package com.company;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

import java.io.IOException;

public class Questions {
    public static final String USER_AGENT = "Mozilla/5.0 (Windows NT 6.1; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/45.0.2454.101 Safari/537.36";

    public static void printQuestions() throws IOException {

        final Document doc = Jsoup.connect("http://admission.universityofcalifornia.edu/how-to-apply/personal-questions/freshman/index.html").userAgent(USER_AGENT).get();

        int count = 1;

        System.out.println("Common application questions:\n");
        for (Element result : doc.select("strong")) {
            if (count < 9) {
                if(count == 6) {
                    String questions = result.text();

                    System.out.println(questions.replaceFirst("\\s", "") + "\n");

                    count++;
                }else{
                    String questions = result.text();
                    System.out.println(questions + "\n");
                    count++;
                }
            }
        }
    }

}
