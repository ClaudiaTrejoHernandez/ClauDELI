package com.pluralsight.Interface;

import com.pluralsight.OrderManager.Order;

public interface Receipt {

    String orderDetails(Order order);
     void createReceiptFile(Order order);
}
