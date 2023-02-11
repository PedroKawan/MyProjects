package Class.peripherals;

public class Dpi {
    int amount = 0;
    private int dp[] = new int[4];

    
    protected void dpi1(int a){
        this.dp[1] = a;
        this.setAmount(1);
    }
    
    protected void dpi2(int a, int b){
        this.dp[1] = a;
        this.dp[2] = b;
        this.setAmount(2);
    }
    
    protected void dpi3(int a, int b, int c){
        this.dp[1] = a;
        this.dp[2] = b;
        this.dp[3] = c;
        this.setAmount(3);
    }
    
    //Setters and Getters methods.   
    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
    /**/

    public int[] getDp() {
        return dp;
    }

    public void setDp(int v,int dp) {
        this.dp[v] = dp;
    }

    
}
