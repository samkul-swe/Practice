import java.util.ArrayList;

public class Chain {
    static ArrayList<Block> blockChain = new ArrayList<>();

    public static void main(String[] args) {
        String[] genesisTransactions = {"Sampada created the blockchain repository"};
        Block genesisBlock = new Block(genesisTransactions,0);

        String[] block2Transactions = {"Sameer sent Sampada 25 bitcoins", "Renuka gave Sampada 25 bitcoins"};
        Block block2 = new Block(block2Transactions,genesisBlock.getBlockHash());

        String[] block3Transactions = {"Sampada sent Sameer 25 bitcoins"};
        Block block3 = new Block(block3Transactions, block2.getBlockHash());

        String[] block4Transactions = {"Sampada sent Renuka 25 bitcoins"};
        Block block4 = new Block(block4Transactions, block3.getBlockHash());

        blockChain.add(genesisBlock);
        blockChain.add(block2);
        blockChain.add(block3);
        blockChain.add(block4);

        System.out.println(blockChain);

    }
}
