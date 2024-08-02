package com.example.Domain.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor

public class Order_Details {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "order_id", nullable = false)
    private Orders orders;

    @ManyToOne
<<<<<<< HEAD
    @JoinColumn(name = "menu_id", nullable = false)
    private Menu menu;
=======
    @JoinColumn(name = "product_id", nullable = false)
    private Product product;
>>>>>>> c47469cd11a00b6f5d47f7496e0e2a222eb0180b

}
