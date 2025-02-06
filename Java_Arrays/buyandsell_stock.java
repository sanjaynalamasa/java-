public class buyandsell_stock {
    public static int BuyAndSellstock(int prises[]) {
        int buyprise = Integer.MAX_VALUE;
        int maxprofit = 0;
        for(int i=0; i<prises.length; i++) {
            if(buyprise < prises[i]) {
                int profit = prises[i] - buyprise;
                maxprofit = Math.max(maxprofit, profit);
            } else {
                buyprise = prises[i];
            }
        }
        return maxprofit;
    }
    public static void main(String[] args) {
        int prises[]= {7,1,5,3,6,4};
        System.out.println(BuyAndSellstock(prises));
    }
    
}
