public class ConcatDemo
{
    public static void main(String[] args)
    {
        String animal1 = "quick brown fox";
        String animal2 = "lazy dog";
        String article = "the";
        String action = "jumps over";
        String message = article + " " + animal1 + " " + action + " " + article + " " + animal2;
        System.out.println(message);
    }
}

public class TrimIt
{
    public static void main(String[] args)
    {
        String sentence1 = "      abc  ";
        String sentence2 = "  def";
        String sentence3 = "ghi         ";
        String message = sentence1 + sentence2 + sentence3;
        System.out.println(message);
    }
}