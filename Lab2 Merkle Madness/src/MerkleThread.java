import java.util.ArrayList;

public class MerkleThread implements Runnable{
    public static volatile ArrayList<String> lstWords; //Holds all the grabbed words
    private final int iMerkleTreeInputs = 4; // how many words to wait for before creating a merkle tree

    public void run(){
        Util util = new Util();

        lstWords = new ArrayList<>();

        while(true){
            util.sleepRandomTime("Merkle");

            String sNewWord = MerkleManager.grabWord();

            if(sNewWord != null){

                System.out.println("Merkle grabbed a word: "+ sNewWord);

                lstWords.add(sNewWord);

                if(lstWords.size() == iMerkleTreeInputs){

                    MerkleManager.sMerkleRoot = util.getMerkleRoot(lstWords);
                }
            }
        }
    }

}
