
/**
 * Node represents a single node in a huffman tree. It can contain either a 
 * letter/symbol or can point to either a left or right node (or both)
 * 
 * @author Howard Francis 
 * @version 2016.11.02
 */
public class Node
{
    private String letter;
    private Node left;
    private Node right;
    
    /**
     * Constructor for a leaf node of the tree
     * 
     * @param c the character to place at this node
     * @throws IllegalStateException if the string is not a single character
     */
    public Node(String c)
    {
        if (c.trim().length() == 1 || c.equals(" ") ){
            letter = c;
            left = null;
            right = null;
        }
        else {
            throw new IllegalStateException("c must be a single character");
        }
    }
    
    
    /**
     * Constructor for an internal node of the tree
     * 
     * @param l the left child node for this node
     * @param r the right child node for this node
     */
    public Node(Node l, Node r)
    {
        letter = null;
        left = l;
        right = r;
    }

    /**
     * Returns the character at a node.
     * 
     * @return the character at this node; null if this is an internal node
     */
    public String getChar()
    {
        return letter;
    }
    /**
     * Returns the left child of this node
     * 
     * @return the left child node of this node; null this it is a leaf node
     */
    public Node getLeft()
    {
        return left;
    }
    
    /**
     * Returns the right child of this node
     * 
     * @return the right child node of this node; null if this is a leaf node
     */
    public Node getRight()
    {
        return right;
    }
}
