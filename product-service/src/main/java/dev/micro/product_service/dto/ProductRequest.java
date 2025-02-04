package dev.micro.product_service.dto;

import java.io.Serializable;
import java.math.BigInteger;

public record ProductRequest(String id,String name, String description, BigInteger price) implements Serializable {
}
