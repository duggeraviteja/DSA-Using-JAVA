public class RemoveConsonants {

    static void removeElements(String str){
        String res = "";
        String regex = "([^aeiouAEIOU0-9\\W]+)";
         String op = str.replaceAll(regex, "");

        res =  str.replaceAll("[BCDFGHJKLMNPQRSTVXZbcdfghjklmnpqrstvxz]", "");

    System.out.println(res);
    System.out.println(op);
    }

   static void checkStringContiansOnlyAlpha(String str) {
       String regex = "(^[a-zA_Z]*$)";
    //    String res = str.replaceAll(regex, "");
        System.out.println(str.matches(regex));
    }

    public static void main(String[] args) {

        String s = "Lets check The rEsult";
        RemoveConsonants.removeElements(s);

    RemoveConsonants.checkStringContiansOnlyAlpha("tejs");

    }
}
