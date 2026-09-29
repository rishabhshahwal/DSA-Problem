class Solution {
    public boolean isPalindrome(String s) {

         // all string are converted into lower case
         String str1 = s.toLowerCase(); 

         //to removing all non-alphanumeric characters fromula
         str1 = str1.replaceAll("[^a-zA-Z0-9]","");
        
         int i=0;
         int j=str1.length()-1;

        while(i<=j)      //iterate to check pallindrome
        {
            if(str1.charAt(i) != str1.charAt(j))
            {
                return false;
            }
             i++;
             j--;
        }
              return true;
    }
}