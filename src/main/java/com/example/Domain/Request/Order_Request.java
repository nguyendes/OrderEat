package com.example.Domain.Request;

import com.example.Common.Status;
import lombok.Builder;
import lombok.Data;
import java.util.List;

@Data
@Builder
public class Order_Request {
    private int id;
    private String note;
    private Status status;
    private int id_user;
    private int id_shipper;
    private int id_store;
    private List<Integer> list_eat;
}