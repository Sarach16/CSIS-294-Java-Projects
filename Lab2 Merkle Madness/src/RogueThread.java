public class RogueThread implements Runnable {

    @Override
    public void run() {
        Util oUtil = new Util();

        while (true) {

            oUtil.sleepRandomTime("Rogue Thread");


            String sNewWord = MerkleManager.grabWord();


            if (sNewWord != null) {

                MerkleManager.iStrikes++;


                System.out.println("Rogue grabbed a word: " + sNewWord + " STRIKE!");
            }
        }
    }
}
