# You are given an array prices where prices[i] 
# is the price of a given stock on the ith day.
# You want to maximize your profit by choosing a single day 
# to buy one stock and choosing a different day in the future 
# to sell that stock.
# 
# Return the maximum profit you can achieve from 
# this transaction. If you cannot achieve any profit, return 0.
###
###
# Ex: prices = [7,6,4,3,1]
# out: 5
# Buy on day 2 (price = 1) and sell on day 5 (price = 6), 
# profit = 6-1 = 5.
# Note that buying on day 2 and selling on day 1 is not allowed 
# because you must buy before you sell.


def maxProfit(prices: list[int]) -> int:
    min_price = float('inf')
    max_profit = 0

    for price in prices:
        # atualiza o preço minimo
        min_price = min(min_price, price)
        # calcula o lucro possivel ao vender no preco atual
        profit = price - min_price
        # atualiza o lucro maximo
        max_profit = max(max_profit, profit)

    return max_profit


# prices = [7,1,5,3,6,4] # day1,d2,d3,d4,d5...
prices = [7,6,4,3,1]
print(maxProfit(prices))
