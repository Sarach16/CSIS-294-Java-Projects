import javax.swing.*;

public class MerkleManager {

    public static volatile String sUserEntry;
    public static String sExpectedMerkle;
    public static String sMerkleRoot = null;
    public static int iStrikes = 0;

    public void manage() {

        Util oUtil = new Util();

        sExpectedMerkle = JOptionPane.showInputDialog("Enter Expected Merkle Root (use: https://xorbin.com/tools/sha256-hash-calculator): ");

        //1. Create an instance of the target class

        //Creates thread for MerkleThread
        MerkleThread oMerkle1 = new MerkleThread();
        Thread oThread1 = new Thread(oMerkle1);
        oThread1.setName("Merkle Thread");

        //Creates thread for RogueThread
        RogueThread oRogue1 = new RogueThread();
        Thread oThread2 = new Thread(oRogue1);
        oThread2.setName("Rogue Thread");

        //Creates thread for MonitorThread
        MonitorThread oMonitor1 = new MonitorThread();
        Thread oThread3 = new Thread(oMonitor1);
        oThread3.setName("Monitor Thread");



        //3. Call the start method of the thread instance.
        oThread1.start();       //*************************************************
        oThread2.start();       //***Spawns off the new thread (the run method) ***
        oThread3.start();       //*************************************************


        while (true){

            sUserEntry = JOptionPane.showInputDialog("Enter Word: ");

        }

    }

    public static synchronized String grabWord(){

        String temp = sUserEntry;
        sUserEntry = null;

        return temp;
    }

}