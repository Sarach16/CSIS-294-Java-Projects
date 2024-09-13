public class MerkleNode {

    public String sHash;
    public MerkleNode oLeft;
    public MerkleNode oRight;

    public MerkleNode() {
        this.sHash = null;
        this.oLeft = null;
        this.oRight = null;
    }

    public MerkleNode(String sHash, MerkleNode oLeft, MerkleNode oRight) {
        this.sHash = sHash;
        this.oLeft = oLeft;
        this.oRight = oRight;
    }
}
