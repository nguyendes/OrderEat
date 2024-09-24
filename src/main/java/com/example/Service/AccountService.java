package com.example.Service;


import com.example.Domain.Request.Account_Driver_Request;
import com.example.Domain.Request.Account_Request;
import com.example.Domain.Request.Account_Store_Request;
import com.example.Domain.Request.Account_User_Request;
import com.example.Domain.Response.ApiResponse;
import org.springframework.stereotype.Service;

@Service
public interface AccountService {
    boolean addAccountUser(Account_User_Request account);
    boolean addAccountStore(Account_Store_Request account);
    boolean addAccountShipper(Account_Driver_Request account);
    ApiResponse loginAccount(Account_Request account);
}
