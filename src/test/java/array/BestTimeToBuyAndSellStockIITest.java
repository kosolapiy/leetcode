package array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class BestTimeToBuyAndSellStockIITest {

    @Test
    void maxProfit_1() {
        int[] prices = {7, 1, 5, 3, 6, 4};
        Assertions.assertEquals(7, new BestTimeToBuyAndSellStockII().maxProfit(prices));
    }

    @Test
    void maxProfit_2() {
        int[] prices = {1,2,3,4,5};
        Assertions.assertEquals(4, new BestTimeToBuyAndSellStockII().maxProfit(prices));
    }

    @Test
    void maxProfit_3() {
        int[] prices = {7,6,4,3,1};
        Assertions.assertEquals(0, new BestTimeToBuyAndSellStockII().maxProfit(prices));
    }
}