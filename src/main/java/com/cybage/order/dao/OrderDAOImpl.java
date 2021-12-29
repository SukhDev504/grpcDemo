package com.cybage.order.dao;

import com.cybage.order.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;

import java.sql.PreparedStatement;
import java.util.List;

@Repository
public class OrderDAOImpl implements OrderDAO {

    @Autowired
    JdbcTemplate jdbcTemplate;

    @Override
    public void saveOrder(OrderRequest request) {
        System.out.println("Inside saveOrder DAO!!!!!!!!!!!!!!!!!!!!");

        String INSERT_ORDER_RECORD = "INSERT INTO order_details(order_date,order_status,payment_status)VALUES(NOW(),?,? )";

        KeyHolder keyHolder = null;
        int orderID = 0;
        jdbcTemplate.update(connection -> {
            PreparedStatement ps = connection
                    .prepareStatement(INSERT_ORDER_RECORD);
            ps.setString(1, String.valueOf(Status.PENDING));
            ps.setString(2, String.valueOf(PaymentStatus.UNPAID));
            return ps;
        }, keyHolder);

        orderID = (int) keyHolder.getKey();

        List<Item> items = request.getItemsList();

        String INSERT_ITEM = "INSERT INTO order_item(order_id,item_id,item_name,price)VALUES(?,?,?,?)";
        if (orderID != 0) {
            for (Item i : items
            ) {
                System.out.println(i.toString());
                int itemID = i.getItemID();
                String name = i.getItemName();
                int price = i.getPrice();
                jdbcTemplate.update(INSERT_ITEM, new Object[]{orderID, itemID, name, price});

            }
        }

        OrderResponse resp= getOrderDetailsByID(orderID);
       // return void;
    }

    private OrderResponse getOrderDetailsByID(int orderID) {
        return  null;
    }
}
