public class Solution {
    
    public static void main(String[] args) {
        int[] s = {7,1,5,3,6,4};
        System.out.println(maxProfit(s));
    }

    public static int maxProfit(int[] prices) {
        int min_price = Integer.MAX_VALUE;
        int max_profit = 0;

        for (int i = 0; i < prices.length; i++) {
            // atualiza o preço minimo
            min_price = Math.min(min_price, prices[i]);
            // calcula o lucro possivel com o preço atual
            int profit = prices[i] - min_price;
            // atualiza o lucro maximo
            max_profit = Math.max(max_profit, profit);
        }
        
        return max_profit;
    }
}
