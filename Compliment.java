import java.util.Random;

public class Compliment {
    
    private Random r = new Random();
    private String contents;
    private int option;
    private final static String[] COMPLIMENTS = {
        "You look beautiful today.",
        "It gets better.",
        "You've successfully lived through every other day of your life. You can do it again.",
        "This may be a sad chapter, but you are not a sad story.",
        "You can do it. We believe in you.",
        "Everything will be okay.",
        "You're important.",
        "This is a lucky pencil \u2710, it'll bring you good luck.",
        "We're sending positive thoughts your way.",
        "You are more than your mistakes or setbacks.",
        "\uD83D\uDC08 Riceball the Cat is here to protect you from bad spirits and thoughts.",
        "Treat Yo'Self.",
        "You are a good person, and you treat yourself unfairly.",
        "Love yourself.",
        "You're the main character of your own Disney movie and this is just the sad"
            + " part of the film. You'll be okay.",
        "If you were a dragon you'd hoard our hearts. \uD83D\uDC09",
        "\uD83D\uDC27 Just look at this penguin.",
        "\uD83D\uDC51 We made you this crown because you rule your life.",
        "The lucky dollar bill foreshadows money in your future. \uD83D\uDCB5",
        "May your face be clear and your wifi signal be strong. \uD83D\uDCF6",
        "You're on point."};
        
    public Compliment() {
        option = r.nextInt(21);
        contents = COMPLIMENTS[option];
    }
    
    public String getCompliment() {
        return "\n>" + contents;
    }
    
}