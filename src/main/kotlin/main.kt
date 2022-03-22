package ru.netology


fun main() {

    val previousPurchaseAmount: Int = 15000
    val currentPurchaseAmount: Int = 10000
    val regularCustomer: Boolean = true
    var currentWithDiscount: Int = 0


    if (previousPurchaseAmount >= 0 && previousPurchaseAmount <= 1000) {
        currentWithDiscount = currentPurchaseAmount
    } else if (previousPurchaseAmount >= 1001 && previousPurchaseAmount <= 10000) {
        currentWithDiscount = currentPurchaseAmount - 100
    } else if (previousPurchaseAmount >= 10001) {
        currentWithDiscount = currentPurchaseAmount / 100 * 95
    }

    if (regularCustomer == true) {
        currentWithDiscount = currentWithDiscount / 100 * 99
    }

    println("Ваша цена: $currentWithDiscount")


}