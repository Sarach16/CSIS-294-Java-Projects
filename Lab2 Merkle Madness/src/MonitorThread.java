public class MonitorThread implements Runnable {
    public void run(){
        while(true){
            if(MerkleManager.sMerkleRoot != null){
                if(MerkleManager.sMerkleRoot.equals(MerkleManager.sExpectedMerkle)){

                    System.out.println("You win: "+ MerkleManager.sMerkleRoot);
                    System.exit(0);
                }
                else{
                    System.out.println("The Merkle roots don't match. You lost!");
                    System.exit(0);
                }
            }

            if (MerkleManager.iStrikes ==3){
                System.out.println("3 strikes: you lost!");
                System.exit(0);
            }

            try {
                Thread.sleep(1000);

            } catch(InterruptedException e){
                System.out.println("MonitorThread interrupted");
            }
        }
    }
}
