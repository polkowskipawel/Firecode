//Find the first non-duplicate character in a string. Return null if no unique character is found.
//firstNonRepeatedCharacter( "abcdcd" ) --> 'a'
//firstNonRepeatedCharacter( "cbcd" ) --> 'b'
//firstNonRepeatedCharacter( "cdcd" ) --> null

public static Character firstNonRepeatedCharacter(String str) {

       
        int licz = 0, i = 0,j =0;
        char pom;
     
        char[] actualCharArray = str.toCharArray();
        
        for(i = 0;i<=str.length()-1;i++){
            pom = actualCharArray[i];
            licz=0;
            for (j = str.length() - 1; j >= 0; j--) {
                if ((pom == actualCharArray[j]) && (j!=i)) {
                    licz++;
                }
            }  if (licz == 0) {
                System.out.println("firstNonRepeatedCharacter = " + actualCharArray[i]);
                return actualCharArray[i];
            }
        }
    return null;
    }
