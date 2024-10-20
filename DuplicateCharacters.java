 class DuplicateCharacters {    
     public static void main(String[] args) {    
        String s = "Great responsibility";    
        int count;    
            
        char string[] = s.toCharArray();    
            
        System.out.println("Duplicate characters in a given string: ");    
        for(int i = 0; i <string.length; i++) {    
            count = 1;    
            for(int j = i+1; j <string.length; j++) {    
                if(s[i] == s[j] && s[i] != ' ') {    
                    count++;    
                    s[j] = '0';    
                }    
            }    
            if(count > 1 && s[i] != '0')    
                System.out.println(s[i]);    
        }    
    }    
}