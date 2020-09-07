import java.util.HashMap;
/**
 * HuffMap stores a Huffman Code and provides a method to take a string and 
 * encode it using that code
 * 
 * @author Howard Francis
 * @version 2016.11.02
 */
public class HuffMap
{
    // instance variables - replace the example below with your own
    private HashMap<String,String> huffMap;

    /**
     * Constructor for objects of class HuffMap
     */
    public HuffMap()
    {
        huffMap = new HashMap<>();
        makeMap();
    }

    /**
     * This makes the map which translates a character to its code
     * 
     * This map is based on the code on
     * http://www.mathmaniacs.org/lessons/02-textcomp/wondercode.html
     */
    private void makeMap()
    {
        huffMap.put("A", "1110");
        huffMap.put("B", "010010");
        huffMap.put("C", "110111");
        huffMap.put("D", "11111");
        huffMap.put("E", "011");
        huffMap.put("F", "110100");
        huffMap.put("G", "00000");
        huffMap.put("H", "1010");
        huffMap.put("I", "1011");
        huffMap.put("J", "000011001");
        huffMap.put("K", "000010");
        huffMap.put("L", "11110");
        huffMap.put("M", "110101");
        huffMap.put("N", "1000");
        huffMap.put("O", "1100");
        huffMap.put("P", "010011");
        huffMap.put("Q", "000011011");
        huffMap.put("R", "0001");
        huffMap.put("S", "0101");
        huffMap.put("T", "001");
        huffMap.put("U", "10010");
        huffMap.put("V", "0000111");
        huffMap.put("W", "01000");
        huffMap.put("X", "000011010");
        huffMap.put("Y", "110110");
        huffMap.put("Z", "000011000");
        huffMap.put(" ", "10011");
    }
    
    public String encodeHuffman(String s)
    {
        String huff = "";
        for (int i = 0; i < s.length(); i++) {
            huff = huff + huffMap.get(s.substring(i,i+1).toUpperCase());
        }
    
        return huff;
    }
    
}
