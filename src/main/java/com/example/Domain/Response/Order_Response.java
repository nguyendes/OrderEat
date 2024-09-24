package com.example.Domain.Response;

import com.example.Common.Status;
import com.example.Domain.Entities.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Order_Response {
    private int id;
    private String note;
    private Status status;
    private Drivers_Response drive;
    private Store_Response store;
    private User_Response user;
    private List<Menu_Response> menus = new ArrayList<>();

    public Order_Response(Orders order) {
        this.id = order.getId();
        this.note = order.getNote();
        this.status = order.getStatus();
        this.drive = new Drivers_Response(order.getDrivers());
        this.user = new User_Response(order.getUsers());
        this.store = new Store_Response(order.getStores());
    }

    public Order_Response(Orders order, List<Menu> menus) {
        this.id = order.getId();
        this.note = order.getNote();
        this.status = order.getStatus();
        this.drive = new Drivers_Response(order.getDrivers());
        this.user = new User_Response(order.getUsers());
        this.store = new Store_Response(order.getStores());
        menus.forEach(menu -> this.menus.add(new Menu_Response(menu)));
    }
}