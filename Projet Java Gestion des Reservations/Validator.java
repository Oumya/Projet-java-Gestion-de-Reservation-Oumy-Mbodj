
//package gatobooking.src.main.java.glrs2b.validator;
//import java.util.regex.Matcher;
import java.util.regex.Pattern; 

public final class Validator {
    private final int FORMAT = 4;
    private static int nref;
    /**
     * Validate email
     * Validate nom 
     * Validate tel
     * Validate nci  
     */
// Java program to check if an email address
// is valid using Regex.
    public static boolean isValidMail(String email)
    {
        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\." + "[a-zA-Z0-9_+&-]+)@" + "(?:[a-zA-Z0-9-]+\\.)+[a-z"
                + "A-Z]{2,7}$";

        Pattern pat = Pattern.compile(emailRegex);
        if (email == null || email == "")
            return false;
        return pat.matcher(email).matches();
    }
    
    public static boolean estVide(String champ) {
        if (champ != "" || champ != " ")
        {
            return false;
        }
        return true;
    }

    public static boolean isValidNci(String nci)
    {
        String nciRegex = "(^[1|2])([0-9]{3})(19[4-9]\\d|20[0-1]\\d|2020|2021)([0-9]{5})";

        Pattern pat = Pattern.compile(nciRegex);
        if (nci == null || nci == "")
            return false;
        
        return pat.matcher(nci).matches();
    }
    public static float isTaux (int tauxLoc){
        return tauxLoc;
    }
    
    public static boolean isValidTel(String tel)
    {
        String telRegex = "^(\\+|00)(221)(70|76|77|78|33)([0-9]{7})";

        Pattern pat = Pattern.compile(telRegex);
        if (tel == null || tel == "")
            return false;
        return pat.matcher(tel).matches();
    }

    public String generateRef(){
        String nbref=String.valueOf(++nref);
        String nbreZero="";
        for(int i=1; i<=(FORMAT-nbref.length());i++){
            nbreZero +="0";
        }
        return"REF" + nbreZero + nbref;
    }
    
   
    
}


