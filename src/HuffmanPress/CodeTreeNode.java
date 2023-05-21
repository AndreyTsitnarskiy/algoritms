package HuffmanPress;

public class CodeTreeNode implements Comparable<CodeTreeNode> {

    private Character symbol;
    private int weight;
    private CodeTreeNode left;
    private CodeTreeNode right;

    public CodeTreeNode(Character symbol, int weight) {
        this.symbol = symbol;
        this.weight = weight;
    }

    public CodeTreeNode(Character symbol, int weight, CodeTreeNode left, CodeTreeNode right) {
        this.symbol = symbol;
        this.weight = weight;
        this.left = left;
        this.right = right;
    }

    public Character getSymbol() {
        return symbol;
    }

    public void setSymbol(Character symbol) {
        this.symbol = symbol;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public CodeTreeNode getLeft() {
        return left;
    }

    public void setLeft(CodeTreeNode left) {
        this.left = left;
    }

    public CodeTreeNode getRight() {
        return right;
    }

    public void setRight(CodeTreeNode right) {
        this.right = right;
    }

    public String getCodeForCharacter(Character ch, String code) {
        if(symbol == ch) {
            return code;
        } else {
            if (left != null){
                String path = left.getCodeForCharacter(ch, code + "0");
                if(path != null) {
                    return path;
                }
            }
            if (right != null){
                String path = right.getCodeForCharacter(ch, code + "1");
                if(path != null) {
                    return path;
                }
            }
        }
        return null;
    }

    @Override
    public int compareTo(CodeTreeNode o) {
        return o.weight - weight;
    }
}
