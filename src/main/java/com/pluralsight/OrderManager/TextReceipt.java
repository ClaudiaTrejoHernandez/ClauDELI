package com.pluralsight.OrderManager;

import com.pluralsight.Interface.Receipt;

public abstract class TextReceipt implements Receipt {

    public String orderDetails(Order order) {
        return "";
    }

    public void createReceiptFile(Order order) {

    }
}
