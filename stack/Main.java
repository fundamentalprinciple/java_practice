import java.util.ArrayList;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {         
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

class Stack {
    protected ArrayList<TreeNode> stackList = new ArrayList<TreeNode>();

    public TreeNode top() {
        return this.stackList.get(stackList.size()-1);
    }

    public void push(TreeNode node) {
        this.stackList.add(node);
        return;
    }

    public TreeNode pop() {
        return this.stackList.remove(stackList.size()-1);
    }
}

class Main {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        TreeNode child1 = new TreeNode(9);
        TreeNode child2 = new TreeNode(20);
        root.left = child1;
        root.right = child2;
        
        Stack treeStack = new Stack();
        treeStack.push(root);
        treeStack.push(root.left);
        System.out.println(treeStack.top().val);
        System.out.println(treeStack.pop().val);
        System.out.println(treeStack.top().val);        
        return;
    }
}
