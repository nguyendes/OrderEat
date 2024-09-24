package com.example.Service.implement;


import com.example.Domain.Entities.Account;
import com.example.Repository.AccountRepository;
import com.example.Repository.DriverRepository;
import com.example.Repository.StoreRepository;
import com.example.Repository.UserRepository;
import com.example.Domain.Request.Account_User_Request;
import lombok.RequiredArgsConstructor;
import org.apache.catalina.User;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AccountServiceImpl implements AccountService {

    private final AccountRepository accountRepository;
    private final UserRepository userRepository;
    private final StoreRepository storeRepository;
    private final DriverRepository driverRepository;

    @Override
    public boolean addAccountUser(Account_User_Request account) {
        Account account1 = new Account();
        account1.setName(account.getName());
        account1.setPassword(account.getPassword());
        accountRepository.save(account1);
        User user = new User();
        user.setAccount(account1);
        user.setName(account.getUser().getName());
        user.setAddress(account.getUser().getAddress());
        user.setPhone(account.getUser().getPhone());
        userRepository.save(user);
        return true;
    }

    @Override
    public boolean addAccountStore(Account_Store_Request account) {
        Account account1 = new Account();
        account1.setName(account.getName());
        account1.setPassword(account.getPassword());
        accountRepository.save(account1);
        Store store = new Store();
        store.setAccount(account1);
        store.setName(account.getStore().getName());
        store.setAddress(account.getStore().getAddress());
        store.setPhone(account.getStore().getPhone());
        storeRepository.save(store);
        return true;
    }

    @Override
    public boolean addAccountShipper(Account_Shipper_Request account) {
        Account account1 = new Account();
        account1.setName(account.getName());
        account1.setPassword(account.getPassword());
        accountRepository.save(account1);
        Shipper shipper = new Shipper();
        shipper.setAccount(account1);
        shipper.setName(account.getShipper().getName());
        shipper.setPhone(account.getShipper().getPhone());
        shipperRepository.save(shipper);
        return true;
    }

    @Override
    public ApiResponse loginAccount(Account_Request account) {
        ApiResponse apiResponse = new ApiResponse();
        Account a = accountRepository.findByName(account.getName());
        if(a != null && a.getPassword().equals(account.getPassword())) {
            if ( userRepository.findByAccount(a) != null) {
                apiResponse.setResult(userRepository.findByAccount(a));
            }
            if ( shipperRepository.findByAccount(a) != null) {
                apiResponse.setResult(shipperRepository.findByAccount(a));
            }
            if ( storeRepository.findByAccount(a) != null) {
                apiResponse.setResult(storeRepository.findByAccount(a));
            }
            return apiResponse;
        }
        return apiResponse;
    }
}
