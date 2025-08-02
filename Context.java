public class Context {
    private TextFormatter format;
    
    public Context(TextFormatter format) {
        this.format = format;
    }
    
    public String executeStrategy(String input) {
        return format.format(input);
    }
}