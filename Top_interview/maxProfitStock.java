package Top_interview;

public class maxProfitStock {
    public static void main(String[] args) {
        int prices[] = {7,6,4,3,1};
        int sol = maxProfit(prices);
        System.out.println(sol);
    }
    public static int maxProfit(int[] prices){
        int profit = 0;
        for(int i=1;i<prices.length;i++){
            if(prices[i]>prices[i-1]){
                profit+= prices[i]-prices[i-1];
            }
        }
        return profit;
    }
}
