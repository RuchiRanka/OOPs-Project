import java.awt.*;

public class Tree {
    private double heightFt;
    private double trunkDiameterInches;
    private TreeType treeType;
    
    protected static Color trunk_color = new Color(102, 51, 0);
    
    public Tree(double heightFt, double trunkDiameterInches, TreeType treeType) {
        this.heightFt = heightFt;
        this.trunkDiameterInches = trunkDiameterInches;
        this.treeType = treeType;
    }

    public double getHeightFt() {
        return heightFt;
    }
    
    public double getTrunkDiameterInches() {
        return trunkDiameterInches;
    }
    
    public TreeType getTreeType() {
        return treeType;
    }

    public void setTrunkDiameterInches(double trunkDiameterInches) {
        this.trunkDiameterInches = trunkDiameterInches;
    }

    public void grow() {
        this.heightFt += 10;
        this.trunkDiameterInches += 1;
        System.out.println(this.heightFt);
    }

    public static void announceTree() {
        System.out.println("Look out for that " + Tree.trunk_color + " tree!");
    }

    public void announceTallTree() {
        if(this.heightFt > 100) {
            System.out.println("That's a tall " + this.treeType + " tree!");
        }
    }
}
