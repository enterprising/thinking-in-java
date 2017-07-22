package aa_exercise.chapter13_strings;//: strings/Receipt.java

import java.util.Formatter;

public class Receipt {
    private double total = 0;
    private Formatter f = new Formatter(System.out);
    private static final int W1 = 15;
    private static final int W2 = 5;
    private static final int W3 = 10;
    private String s1 = "%-" + W1 + "s %" + W2 + "s %" + W3 + "s\n";
    private String s2 = "%-" + W1 + ".15s %" + W2 + "d %" + W3 + ".2f\n";
    private String s3 = "%-" + W1 + "s %" + W2 + "s %" + W3 + ".2f\n";

    public void printTitle() {
        f.format(s1, "Item", "Qty", "Price");
        f.format(s1, "----", "---", "-----");
    }

    public void print(String name, int qty, double price) {
        f.format(s2, name, qty, price);
        total += price;
    }

    public void printTotal() {
        f.format(s3, "Tax", "", total * 0.06);
        f.format(s1, "", "", "-----");
        f.format(s3, "Total", "",
                total * 1.06);
    }

    public static void main(String[] args) {
        Receipt receipt = new Receipt();
        receipt.printTitle();
        receipt.print("Jack's Magic Beans", 4, 4.25);
        receipt.print("Princess Peas", 3, 5.1);
        receipt.print("Three Bears Porridge", 1, 14.29);
        receipt.printTotal();
    }
} /* Output:
Item              Qty      Price
----              ---      -----
Jack's Magic Be     4       4.25
Princess Peas       3       5.10
Three Bears Por     1      14.29
Tax                         1.42
                           -----
Total                      25.06
*///:~
