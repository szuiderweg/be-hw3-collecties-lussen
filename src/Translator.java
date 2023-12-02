import java.util.HashMap;
import java.util.Map;

public class Translator
{
    private HashMap<Integer,String> numericAlpha;

    public Translator(Integer[] numeric, String[] alphabetic)
    {
        this.numericAlpha = new HashMap<Integer,String>();

        for(int n = 0; n < numeric.length; n++)
        {
            numericAlpha.put(numeric[n],alphabetic[n]);
        }
        this.numericAlpha = numericAlpha;
    }

    public String translate(Integer number)
    {
        return numericAlpha.get(number);
    }
}
