package com.vinsguru.saga;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.HashSet;

@SpringBootApplication
public class OrchestratorApplication {

    public static void main(String[] args) {
        SpringApplication.run(OrchestratorApplication.class, args);
    }

    public boolean isAnagram(String s, String t) {
        HashSet E=new HashSet<>();
        int m=s.length();
        int n=t.length();
        for (int i = 0; i < s.length(); i++) {
            E.add(s.charAt(i));

        }
        for (int j = 0; j < t.length(); j++) {
            if(E.contains(t.charAt(j))){
                E.remove(t.charAt(j));
            }
            else{
                return false;
            }

        }
if(E.isEmpty()){
    return true;
}
return false;

    }
}
