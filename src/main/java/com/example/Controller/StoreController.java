// package com.example.Controller;

// //import com.ordereat.domain.entity.Store;
// //import com.ordereat.service.impl.StoreService;
// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.web.bind.annotation.*;

// import java.util.List;

// @RestController
// @RequestMapping("/api/stores")
// public class StoreController {

//     @Autowired
//     private StoreService storeService;

//     @GetMapping("/")
//     public List<Store> getAllStores() {
//         return storeService.getAllStores();
//     }

//     @GetMapping("/{storeId}")
//     public Store getStoreById(@PathVariable Long storeId) {
//         return storeService.getStoreById(storeId);
//     }

//     @PostMapping("/")
//     public Store createStore(@RequestBody Store store) {
//         return storeService.createStore(store);
//     }

//     @PutMapping("/{storeId}")
//     public Store updateStore(@PathVariable Long storeId, @RequestBody Store store) {
//         return storeService.updateStore(storeId, store);
//     }

//     @DeleteMapping("/{storeId}")
//     public void deleteStore(@PathVariable Long storeId) {
//         storeService.deleteStore(storeId);
//     }

//     // Các endpoint khác (e.g., get menu items, etc.)
// }

