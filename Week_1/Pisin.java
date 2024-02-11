import java.util.Objects;

public class Pisin {
    public static void main(String[] args) {
        String longest = "";
        if (args.length== 0) {
            System.out.println("Ei komentoriviparametreja");
            System.exit(0);
        } else if (args.length == 1) {
            System.out.println("Vain yksi parametri\nPisin parametri: " + args[0]);
        } else {
            for (String param : args) {
                if(Objects.equals(param, args[0])){
                    longest = param;
                } else {
                    if (param.length() > longest.length()) {
                        longest = param;
                    }
                }
            }
        } 
        
    }
}