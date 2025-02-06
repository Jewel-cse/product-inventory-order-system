package com.micro.inventory_service.controller;

import com.micro.inventory_service.model.Inventory;
import com.micro.inventory_service.service.InventoryService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import lombok.RequiredArgsConstructor;

import java.util.List;

@RestController
@RequestMapping("/api/inventory")
@RequiredArgsConstructor
public class InventoryController {
    private final InventoryService inventoryService;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public boolean inStock(@RequestParam String skuCode,@RequestParam Integer quantity) {
        try{
            Thread.sleep(3000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        return inventoryService.isInstock(skuCode, quantity);
    }

    @GetMapping("/get-all")
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<List<Inventory>> listAll() {
        return ResponseEntity.ok(inventoryService.getAll());
    }

}
