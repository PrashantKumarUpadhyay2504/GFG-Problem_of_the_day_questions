// User function Template for Java

/*
static final int ALPHABET_SIZE = 26;

    // trie node
    static class TrieNode {
        TrieNode[] children = new TrieNode[ALPHABET_SIZE];

        // isEndOfWord is true if the node represents
        // end of a word
        boolean isEndOfWord;

        TrieNode() {
            isEndOfWord = false;
            for (int i = 0; i < ALPHABET_SIZE; i++) children[i] = null;
        }
    };
*/
//Function to insert string into TRIE.
static void insert(TrieNode root, String key) 
{
    // Your code here
    TrieNode curr = root;
    for(int level=0; level<key.length(); level++){
        int idx = key.charAt(level)-'a';
        if(curr.children[idx] == null){
            curr.children[idx] = new TrieNode();
        }
        curr = curr.children[idx];
    }
    curr.isEndOfWord = true;
}

//Function to use TRIE data structure and search the given string.
static boolean search(TrieNode root, String key)
{
    // Your code here
    TrieNode curr = root;
    for(int level=0; level<key.length(); level++){
        int idx = key.charAt(level)-'a';
        if(curr.children[idx] == null){
            return false;
        }
        curr = curr.children[idx];
    }
    return curr.isEndOfWord == true;
}
