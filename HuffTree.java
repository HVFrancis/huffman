
/**
 * A HuffTree object contains a Huffman tree which is used to decode a message
 * encoded with its corresponding Huffman code
 * 
 * @author Howard Francis 
 * @version 2016.11.02
 */
public class HuffTree
{
    private Node top;

    /**
     * Constructor for objects of class HuffTree. It builds the tree
     * which will be used to decode messages
     */
    public HuffTree()
    {
        makeTree();
    }

    /**
     * This tree is based on the one provided in 
     * http://www.mathmaniacs.org/lessons/02-textcomp/gethuffy.html
     * 
     * (there might be a better way to do this)
     */
    private void makeTree()
    {
        // create letter/symbol nodes
        Node a = new Node("A");
        Node b = new Node("B");
        Node c = new Node("C");
        Node d = new Node("D");
        Node e = new Node("E");
        Node f = new Node("F");
        Node g = new Node("G");
        Node h = new Node("H");
        Node i = new Node("I");
        Node j = new Node("J");
        Node k = new Node("K");
        Node l = new Node("L");
        Node m = new Node("M");
        Node n = new Node("N");
        Node o = new Node("O");
        Node p = new Node("P");
        Node q = new Node("Q");
        Node r = new Node("R");
        Node s = new Node("S");
        Node t = new Node("T");
        Node u = new Node("U");
        Node v = new Node("V");
        Node w = new Node("W");
        Node x = new Node("X");
        Node y = new Node("Y");
        Node z = new Node("Z");
        Node period = new Node(".");
        Node space = new Node(" ");

        //create tree nodes

        Node n25 = new Node(x, q);
        Node n24 = new Node(z, j);
        Node n23 = new Node(n24, n25);
        Node n22 = new Node(n23, v);
        Node n21 = new Node(y, c);
        Node n20 = new Node(f, m);
        Node n19 = new Node(b, p);
        Node n18 = new Node(k, n22);
        Node n17 = new Node(l, d);
        Node n16 = new Node(n20, n21);
        Node n15 = new Node(u, space);
        Node n14 = new Node(w, n19);
        Node n13 = new Node(g, n18);
        Node n12 = new Node(a, n17);
        Node n11 = new Node(o, n16);
        Node n10 = new Node(h, i);
        Node n9 = new Node(n, n15);
        Node n8 = new Node(n14, s);
        Node n7 = new Node(n13, r);
        Node n6 = new Node(n11, n12);
        Node n5 = new Node(n9, n10);
        Node n4 = new Node(n8, e);
        Node n3 = new Node(n7, t);
        Node n2 = new Node(n5, n6);
        Node n1 = new Node(n3, n4);
        Node n0 = new Node(n1, n2);

        
        //set top of tree
        top = n0;

    }

    /**
     * This method is used to take a string of 1s and 0s created by encoding
     * a message with a Huffman code and decoding it.
     * 
     * @param h a string of 1s and 0s, a message encoded with this Huffman code
     * @return the decoded message
     * @throws IllegalArgumentException if the string is not a properly encoded message
     */

    public String decodeHuffman(String h)
    {
        Node current = top;
        String msg ="";

        for (int i = 0; i < h.length(); i++) {
            if (h.charAt(i) == '0') {
                current = current.getLeft();
            }
            else if (h.charAt(i) == '1') {
                current = current.getRight();
            }
            if(current.getChar() != null) {
                msg = msg + current.getChar();
                current = top;
            }
            else {
                throw new IllegalArgumentException("input string not proper huffman encoding");
            }
        }
        return msg;

        
        
    }
}
