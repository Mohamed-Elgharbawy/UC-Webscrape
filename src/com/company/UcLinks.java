package com.company;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class UcLinks {
    Map<String, String> fLinks = new HashMap<String, String>()
    {{
        put("berkeley", "http://admission.universityofcalifornia.edu/campuses/berkeley/freshman-profile/index.html");
        put("davis", "http://admission.universityofcalifornia.edu/campuses/davis/freshman-profile/index.html");
        put("irvine", "http://admission.universityofcalifornia.edu/campuses/irvine/freshman-profile/index.html");
        put("los angeles", "http://admission.universityofcalifornia.edu/campuses/ucla/freshman-profile/index.html");
        put("merced", "http://admission.universityofcalifornia.edu/campuses/merced/freshman-profile/index.html");
        put("riverside", "http://admission.universityofcalifornia.edu/campuses/riverside/freshman-profile/index.html");
        put("san diego", "http://admission.universityofcalifornia.edu/campuses/san-diego/freshman-profile/index.html");
        put("santa barbara", "http://admission.universityofcalifornia.edu/campuses/santa-barbara/freshman-profile/index.html");
        put("santa cruz", "http://admission.universityofcalifornia.edu/campuses/santa-cruz/freshman-profile/index.html");
    }};
    Map<String, String> tLinks = new HashMap<String, String>()
    {{
        put("berkeley", "http://admission.universityofcalifornia.edu/campuses/berkeley/transfer-profile/index.html");
        put("davis", "http://admission.universityofcalifornia.edu/campuses/davis/transfer-profile/index.html");
        put("irvine", "http://admission.universityofcalifornia.edu/campuses/irvine/transfer-profile/index.html");
        put("los angeles", "http://admission.universityofcalifornia.edu/campuses/ucla/transfer-profile/index.html");
        put("merced", "http://admission.universityofcalifornia.edu/campuses/merced/transfer-profile/index.html");
        put("riverside", "http://admission.universityofcalifornia.edu/campuses/riverside/transfer-profile/index.html");
        put("san diego", "http://admission.universityofcalifornia.edu/campuses/san-diego/transfer-profile/index.html");
        put("santa barbara", "http://admission.universityofcalifornia.edu/campuses/santa-barbara/transfer-profile/index.html");
        put("santa cruz", "http://admission.universityofcalifornia.edu/campuses/santa-cruz/transfer-profile/index.html");
    }};
    public Map returnLink(){
        System.out.println("Freshman statistics or transfer statistics?");
        Scanner linkReader = new Scanner(System.in);
        String linkDecision = linkReader.nextLine();
        linkDecision = linkDecision.toLowerCase();
        if(linkDecision.equals("freshman statistics") || linkDecision.equals("freshman") || linkDecision.equals("freshman stats")){
            return fLinks;
        }else if(linkDecision.equals("transfer statistics") ||linkDecision.equals("transfer") || linkDecision.equals("transfer stats")){
            return tLinks;
        }else{
            System.out.println("Enter a valid option");
            return null;
        }
    }
}
