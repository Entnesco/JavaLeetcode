package org.example;

class Solution {
    public boolean isValid(String s) {
        StringBuilder builder = new StringBuilder(s);
        boolean isValid = true;
        int length = builder.length();

        for(int i = 0; i<length;i++){
            for(int j = 0; j<builder.length()-1; j++){
                if ((builder.charAt(j) =='(' && builder.charAt(j+1) == ')')
                        || (builder.charAt(j) =='[' && builder.charAt(j+1) == ']')
                        || (builder.charAt(j) =='{' && builder.charAt(j+1) == '}') ){
                    builder.deleteCharAt(j+1);
                    builder.deleteCharAt(j);
                    break;
                }
            }
        }

        if(!builder.isEmpty()) isValid = false;

        return isValid;
    }
}
