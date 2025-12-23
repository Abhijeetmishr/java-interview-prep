package LLD.Encapsulation;


public class PiggyBank {
    private String owner;
    private int amount = 0;

    public PiggyBank(String owner){
        this.owner = owner;
    }

    public void setAmount(int amount){
        if(amount < 0) {
            throw new RuntimeException("invalid amount");
        }
        this.amount = amount;
    }

    public int getAmount(int amount){
        if(amount > this.amount){
            throw new RuntimeException("invalid amount");
        }
        return amount;
    }

    public String getOwner(){
        return owner;
    }
}
