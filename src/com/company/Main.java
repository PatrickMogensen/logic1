package com.company;

public class Main {

    public static void main(String[] args) {


        //string 1 helloname
        public String helloName(String name) {
            return "Hello " + name + "!";
        }

        //string 1 makeoutword

        public String makeOutWord(String out, String word) {
            String str1 = out.substring(0,2);
            String str2 = out.substring(2,4);
            String str3 = str1 + word + str2;

            return str3;
        }

        //string1 extraend
        public String extraEnd(String str) {
            int strlength = str.length();

            String str2 = str.substring(strlength -2, strlength);

            return str2 + str2 + str2;
        }

        //string1 exrtafont
        public String extraFront(String str) {
            if (str.length() >= 2){
                String str2 = str.substring(0,2);
                return str2 + str2 + str2;
            } else{
                return str + str + str;
            }
        }

        //logic 1 cigarParty
        public boolean cigarParty(int cigars, boolean isWeekend) {
            if (cigars >= 40 && cigars <=60){
                return true;
            }

            if (isWeekend == true && cigars >= 40) {
                return true;
            }

            return false;
        }

        // logic1 dateFashion
        public int dateFashion(int you, int date) {
            if (you <=2 || date <=2 ){
                return 0;
            }
            if (you >=8 || date >=8 ){
                return 2;
            }

            return 1;
        }

        //1squirrelPlay
        public boolean squirrelPlay(int temp, boolean isSummer) {
            if ( isSummer == true && temp >= 60 && temp <=100 ||  temp >= 60 && temp <=90 ) {
                return true;
            }

            return false;

        }

        //logic 1 sortASum
        public int sortaSum(int a, int b) {
            int result = a + b;

            if (result >= 10 && result <=19){
                return 20;
            }

            return result;
        }




    }
}
