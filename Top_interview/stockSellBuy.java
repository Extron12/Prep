package Top_interview;

public class stockSellBuy {
    public static void main(String[] args) {
        int [] prices = {7,1,5,3,6,4};
        int earn = maxprofit(prices);
        System.out.println(earn);
    }
    public static int maxprofit(int[] prices){
        int val = Integer.MAX_VALUE;
        int prof =0;
        int finalProf =0;
        for(int i=0;i<prices.length;i++){
            if(prices[i]<val){
                val = prices[i];
            }
            prof = prices[i] -val;
            if(finalProf<prof){
                finalProf = prof;
            }
        }
        return finalProf;
    }
}
