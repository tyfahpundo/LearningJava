package practice;

public class StringPractice {
    /**
     Given a string of odd length, return the middle 3 characters from the string,
     so the string <b>"Monitor"</b> yields <b>"nit"</b>.
     If the string length is less than 3, return the string as is. <br> <br>

     <b>EXPECTATIONS:</b><br>
     middleThree("bunny") <b>---></b> "unn" <br>
     middleThree("peter") <b>---></b> "ete" <br>
     middleThree("Jamaica") <b>---></b>"mai" <br>
     */
    public static void main(String[] args) {
        System.out.println(middleThree("CANDY"));
    }
    public static String middleThree(String str) {
        String result = str;
        //get the middle three characters
        if(str.length()> 3){
            int mid = str.length()/2;
            result = str.substring(mid-1, mid+2);
        }
        return result;
    }
}
