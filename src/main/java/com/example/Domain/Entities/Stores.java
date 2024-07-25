package com.example.Domain.Entities;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Stores {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private  String phone;
    private String address;

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name= "AccountId",referencedColumnName = "id")
    private Account account;
}
