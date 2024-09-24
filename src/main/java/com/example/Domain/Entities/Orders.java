package com.example.Domain.Entities;

import com.example.Common.Status;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor

public class Orders {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String note;
    private Status status;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="DriverId",referencedColumnName = "id")
    Drivers drivers;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name ="StoreId", referencedColumnName = "id")
    Stores stores;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name= "UserId", referencedColumnName = "id")
    Users users;

}
