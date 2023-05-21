package HuffmanPress;

import java.util.ArrayList;
import java.util.Collections;
import java.util.TreeMap;

public class HuffmanAlgorithm {
    public static void main(String[] args) {

        String test = "Huffman algorithm, is common in all programming languages";
        TreeMap<Character, Integer> treeMap = contFactory(test);
        ArrayList<CodeTreeNode> list = new ArrayList<>();

        for (Character c : treeMap.keySet()) {
            list.add(new CodeTreeNode(c, treeMap.get(c)));
        }

        CodeTreeNode root = buildTree(list);

        TreeMap<Character, String> codes = new TreeMap<>();
        for (Character c : treeMap.keySet()) {
            codes.put(c, root.getCodeForCharacter(c, ""));
        }
        System.out.println(codes);

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < test.length(); i++) {
            sb.append(codes.get(test.charAt(i)));
        }
        System.out.println(test.getBytes().length * 8 + " bits");
        System.out.println(sb.length() + " bits");
        System.out.println(sb);
        System.out.println("------------------------------------------------------");
        System.out.println(decoder(sb.toString(), root));

    }

    private static CodeTreeNode buildTree(ArrayList<CodeTreeNode> list) {
        while (list.size() > 1) {
            Collections.sort(list);
            CodeTreeNode left = list.remove(list.size() - 1);
            CodeTreeNode right = list.remove(list.size() - 1);
            CodeTreeNode parent = new CodeTreeNode(null, left.getWeight() + right.getWeight(), left, right);
            list.add(parent);
        }
        return list.get(0);
    }

    private static String decoder(String st, CodeTreeNode root) {
        StringBuilder result = new StringBuilder();
        CodeTreeNode node = root;
        for (int i = 0; i < st.length(); i++) {
            node = st.charAt(i) == '0' ? node.getLeft() : node.getRight();
            if (node.getSymbol() != null) {
                result.append(node.getSymbol());
                node = root;
            }
        }
        return result.toString();
    }

    private static TreeMap<Character, Integer> contFactory(String str) {
        TreeMap<Character, Integer> map = new TreeMap<>();
        for (int i = 0; i < str.length(); i++) {
            if (map.containsKey(str.charAt(i))) {
                map.put(str.charAt(i), map.get(str.charAt(i)) + 1);
            } else {
                map.put(str.charAt(i), 1);
            }
        }
        return map;
    }
}

