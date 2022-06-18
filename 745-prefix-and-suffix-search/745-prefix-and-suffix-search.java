
class WordFilter {
    private static class Node{
        boolean isLeaf;
        int index;
        Node[] childs;
        public Node(){
            this.childs = new Node[26];
            this.index = -1;
        }
    }
    private Node prefixRoot;
    private Node suffixRoot;
    private void insertPrefix(String word, int index){
        char[] arr = word.toCharArray();
        Node node = prefixRoot;
        for(int i = 0; i < arr.length; i++){
            int c = arr[i] - 'a';
            if(node.childs[c] == null){
                node.childs[c] = new Node();
            }
            node = node.childs[c];
        }
        node.isLeaf = true;
        node.index = index;
    }
    private void insertSuffix(String word, int index){
        char[] arr = word.toCharArray();
        Node node = suffixRoot;
        for(int i = arr.length - 1; i >= 0; i--){
            int c = arr[i] - 'a';
            if(node.childs[c] == null){
                node.childs[c] = new Node();
            }
            node = node.childs[c];
        }
        node.isLeaf = true;
        node.index = index;
    }
    public WordFilter(String[] words) {
        prefixRoot = new Node();
        suffixRoot = new Node();
        for(int i = 0; i < words.length; i++){
            insertPrefix(words[i], i);
            insertSuffix(words[i], i);
        }
    }
    public int f(String prefix, String suffix) {
        int res = -1;
        Set<Integer> set = new HashSet<>();
        findPrefix(prefix, set);
        return findSuffix(suffix, set);
    }
    private void findPrefix(String prefix, Set<Integer> set){
        char[] arr = prefix.toCharArray();
        Node node = this.prefixRoot;
        for(int i = 0; i < arr.length; i++){
            int c = arr[i] - 'a';
            if(node.childs[c] == null) return;
            else{
                node = node.childs[c];
            }
        }
        addChilds(node, set);
    }
    public void addChilds(Node node, Set<Integer> set){
        if(node.isLeaf) set.add(node.index);
        for(int i = 0; i < 26; i++){
            if(node.childs[i] != null){
                addChilds(node.childs[i], set);
            }
        }
    }
    private int findSuffix(String suffix, Set<Integer> set){
        char[] arr = suffix.toCharArray();
        Node node = this.suffixRoot;
        for(int i = arr.length - 1; i >= 0; i--){
            int c = arr[i] - 'a';
            if(node.childs[c] == null) return -1;
            else{
                node = node.childs[c];
            }
        }
        return checkChilds(node, set);
    }
    public int checkChilds(Node node, Set<Integer> set){
        int res = -1;
        if(node.isLeaf && set.contains(node.index)){
            res = node.index;
        }
        for(int i = 0; i < 26; i++){
            if(node.childs[i] != null){
                res = Math.max(res, checkChilds(node.childs[i], set));
            }
        }
        return res;
    }
}
/**
 * Your WordFilter object will be instantiated and called as such:
 * WordFilter obj = new WordFilter(words);
 * int param_1 = obj.f(prefix,suffix);
 */
/**
 * Your WordFilter object will be instantiated and called as such:
 * WordFilter obj = new WordFilter(words);
 * int param_1 = obj.f(prefix,suffix);
 */