package dev.micro.product_service.dto;

import java.math.BigInteger;

public record ProductResponse(String id, String name, String description, BigInteger price) {
}
