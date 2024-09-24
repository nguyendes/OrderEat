package com.example.Domain.Response;

import com.example.Domain.Entities.Menu;
import lombok.Data;

@Data

public class Menu_Response {
    private int id;
    private String name;
    private String price;
    public Menu_Response(Menu menu) {
        this.id = menu.getId();
        this.name = menu.getName();
        this.price = menu.getPrice();
    }
}
