package com.micro.inventory_service.service;

import com.micro.inventory_service.model.Inventory;
import com.micro.inventory_service.repository.InventoryRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InventoryService {
    private final InventoryRepository inventoryRepository;
    public InventoryService(InventoryRepository inventoryRepository) {
        this.inventoryRepository = inventoryRepository;
    }

    public boolean isInstock(String skuCode,Integer quantity){
       return inventoryRepository.existsBySkuCodeAndQuantityIsGreaterThanEqual(skuCode,quantity);
    }

    public List<Inventory> getAll() {
        return inventoryRepository.findAll();
    }
}
