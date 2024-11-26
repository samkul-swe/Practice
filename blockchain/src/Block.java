import java.util.Arrays;

public class Block {
    private final String[] transactions;
    private final int previousHash;
    private final int blockHash;

    public Block(String[] transactions, int previousHash) {
        this.transactions = transactions;
        this.previousHash = previousHash;

        Object[] content = {Arrays.hashCode(this.transactions),this.previousHash};
        this.blockHash = Arrays.hashCode(content);
    }

    public String[] getTransactions() {
        return transactions;
    }

    public int getPreviousHash() {
        return previousHash;
    }

    public int getBlockHash() {
        return blockHash;
    }

    @Override
    public String toString() {
        return String.valueOf(this.blockHash);
    }
}
