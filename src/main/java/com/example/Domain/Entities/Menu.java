package com.example.Domain.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor

public class Menu {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String price;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="StoreId",referencedColumnName = "id")
    private Stores stores;
}
