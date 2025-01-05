package com.bmcl.refactoring.example1;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private final List<OrderLine> orderLines;

    public Order() {
        this.orderLines = new ArrayList<>();
    }

    public void add(Product product, int quantity) {
        OrderLine newLine = new OrderLine(product, quantity);
        orderLines.add(newLine);
    }

    public boolean isEligibleForFreeDelivery() {
        return calculateTotal() > 100.0;
    }

    private double calculateTotal() {
        return orderLines.stream()
                .mapToDouble(OrderLine::getTotal)
                .sum();
    }

    public String printOrder() {
        StringBuilder orderDetails = new StringBuilder();
        orderLines.forEach(line -> orderDetails.append(line).append("\n"));
        orderDetails.append("Total: ").append(calculateTotal());
        return orderDetails.toString();
    }
}
