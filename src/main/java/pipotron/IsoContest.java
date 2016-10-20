package pipotron;

/*******
 * Read input from System.in
 * Use System.out.println to ouput your result.
 * Use:
 * IsoContestBase.localEcho( variable)
 * to display variable in a dedicated area.
 ***/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class IsoContest {
    public static void main(String[] argv) throws Exception {
        String line;
        Scanner sc = new Scanner(System.in);
        sc.nextLine();

        List<List<Node<String>>> nodes = new ArrayList<>();

        List<String> numbersOfWords = Arrays.asList(sc.nextLine().split(" "));

        int j = 0;
        for (String numbersOfWord : numbersOfWords) {
            nodes.add(new ArrayList<Node<String>>());
            for (int i = 0; i < Integer.parseInt(numbersOfWord); i++) {
                String word = sc.nextLine();
                nodes.get(j).add(new Node<>(word));
            }
            j++;
        }


        Node<String> root = new Node<>("");
        root.addChildren(nodes.get(0));
        int i = 1;
        for (List<Node<String>> node : nodes) {
            for (Node<String> stringNode : node) {
                if (i < nodes.size()) {
                    stringNode.addChildren(nodes.get(i));
                }
            }
            i++;
        }

        int result = 0;
        List<String> allSentences = root.display();

        sc.nextLine();
        while (sc.hasNextLine()) {
            line = sc.nextLine();
            if (allSentences.contains(line)) {
                result++;
            }
        }

        System.out.println(result);
    }
}

class Node<T> {
    private List<Node<T>> children = new ArrayList<Node<T>>();
    private Node<T> parent = null;
    private T data = null;

    public Node(T data) {
        this.data = data;
    }

    public Node(T data, Node<T> parent) {
        this.data = data;
        this.parent = parent;
    }

    public List<Node<T>> getChildren() {
        return children;
    }

    public void setParent(Node<T> parent) {
        //parent.addChild(this);
        this.parent = parent;
    }

    public void addChild(T data) {
        Node<T> child = new Node<T>(data);
        child.setParent(this);
        this.children.add(child);
    }

    public void addChild(Node<T> child) {
        child.setParent(this);
        this.children.add(child);
    }

    public T getData() {
        return this.data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public boolean isRoot() {
        return (this.parent == null);
    }

    public boolean isLeaf() {
        if (this.children.size() == 0)
            return true;
        else
            return false;
    }

    public void removeParent() {
        this.parent = null;
    }

    public void addChildren(List<Node<T>> nodes) {
        for (Node<T> node : nodes) {
            addChild(node);
        }
    }

    public List<String> display() {
        List<String> result = new ArrayList<>();
        for (Node<T> child : children) {
            if (child.isLeaf()) {
                result.add((String) child.data);
            } else {
                for (String s : child.display()) {
                    result.add(child.data + " " + s);
                }
            }
        }

        return result;
    }
}