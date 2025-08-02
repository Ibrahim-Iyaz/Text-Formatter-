public class TitlecaseFormatter implements TextFormatter{
   public String format(String text) {
        String result = "";
        int i = 0;
        
        while (i < text.length()) {
           
            if (text.charAt(i) == ' ') {
                result += text.charAt(i);
                i++;
            } else {
               
                result += Character.toUpperCase(text.charAt(i));
                i++;
               
                while (i < text.length() && text.charAt(i) != ' ') {
                    result += Character.toLowerCase(text.charAt(i));
                    i++;
                }
            }
        }
        
        return result;
    }
}    

