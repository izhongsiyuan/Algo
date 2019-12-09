package me.toys;

//Note that one day can buy once and sell once, {1, 2, 7} buy 1 sell 7 get 6 equal to buy 1 sell 2 buy 2 sell 7
//So the solution is finding ascending pairs buy at smaller one and sell at larger one
// 1. Loop the array, have a var smaller, default equal to the first element, a var output, default equal to 0,
// move to the next element.
// 2. if the current element is smaller than var smaller change the value of var smaller to the current element;
// 3. if the current element is larger than var smaller, 3.1-> output plus the value of next element minus var smaller,
// that means we buy at the price that var smaller hold and sell at the price that the current element hold,
// 3.2-> set var smaller to the value of current element
public class BuyOrSellII {
    public int buyOrSell(int[] prices) {
        if (prices.length <= 1) {
            return 0;
        }
        int smaller = prices[0];
        int output = 0;
        for (int i=1; i<prices.length; i++) {
            if (prices[i] > smaller) {
                output += (prices[i] - smaller);
            }
            smaller = prices[i];
        }
        return output;
    }
}
