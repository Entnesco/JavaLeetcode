package org.example;

class Solution {
    int ite;

    public int strStr(String haystack, String needle) {

        int needleLen = needle.length();
        int haystackLen = haystack.length();

        if(needleLen > haystackLen) return -1;

        for(int i = 0; i < haystack.length() - needle.length()+1; i++){
            ite = 0;

            while(haystack.charAt(ite+i) == needle.charAt(ite)){
                ite++;
                if(ite > needle.length()-1) break;
            }


            if(ite == needle.length()){
                return i;
            }
        }

        return -1;
    }
}
