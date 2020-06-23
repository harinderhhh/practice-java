package com.harinder.huawei;

public class DuplicateWords { 
	public static void main(String[] args) {
		String string = "Harinder Singh is going to complete all the assessments. "
				+ "The Assessments portal is going to get hanged. Once the portal "
				+ "is hanged, its life will be over. Whom is to blamed for it;"
				+ " Harinder";
		findDuplicateWords(string);
	}
    public static void findDuplicateWords(String str) {  
        int count;
        str = str.toLowerCase();  
          
        String words[] = str.split("\\P{Alnum}+");  
          
        System.out.println("Duplicate words in a given string : ");   
        for(int i = 0; i < words.length; i++) {  
            count = 1;  
            for(int j = i+1; j < words.length; j++) {  
                if(words[i].equals(words[j])) {  
                    count++;  
                    words[j] = "0";
                }  
            }  
              
            if(count > 1 && words[i] != "0")  
                System.out.println(words[i]);  
        }  
    }  
}  