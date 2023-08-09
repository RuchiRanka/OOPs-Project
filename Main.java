import java.awt.Color;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Tree myFavOakTree = new Tree(120, 5, TreeType.OAK);
        // myFavOakTree.grow();

        // Tree myFavMapleTree = new Tree(90, 30, TreeType.MAPLE);

        // myFavOakTree.announceTallTree();
        // myFavMapleTree.announceTallTree();

        // // static members
        // System.out.println(Tree.trunk_color);
        // Tree.announceTree();

        // Color myTrunkColor = Tree.trunk_color;
        // Color myDefaultWhite = Color.white;
        // Color myDefaultBlue = Color.blue;
        // Color brighterBlue = myDefaultBlue.brighter();

        // Employee emp1 = new Employee("Ruchi Ranka", 20, 25000, "Pune");
        // Employee emp2 = new Employee("Ritik Bohra", 21, 20000, "Chennai");

        // emp2.raiseSalary(20000);

        // System.out.println(emp1.salary);
        // System.out.println(emp2.salary);

        // BankAccount bnkacc = new BankAccount("Ruchi Ranka", 5000);
        // bnkacc.withdraw(1000);
        // System.out.println(bnkacc.getBalance());

        // Stack<Character> charStack = new Stack<>();
        // charStack.push('c');
        // charStack.push('a');
        // charStack.push('t');
        // System.out.println(charStack.pop());
        // System.out.println(charStack.pop());
        // System.out.println(charStack.pop());

        ModArrayList listy = new ModArrayList();
        listy.add(0);
        listy.add(10);
        listy.add(20);
        listy.add(30);

        System.out.println(listy.getUsingMod(7));
        System.out.println(listy.getUsingMod(-2));
        System.out.println(listy.getUsingMod(1));
    }
}
