package phasezero_catalog_service.Phasezero.repository;


import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.stereotype.Repository;

import phasezero_catalog_service.Phasezero.Entity.Product;

@Repository
public class ProductRepository {
    private final Map<String, Product> storage = new ConcurrentHashMap<>(); // key = partNumber
    private final AtomicLong idGenerator = new AtomicLong(1);

    public Product save(Product p) {
        if (storage.containsKey(p.getPartNumber())) {
            throw new IllegalStateException("duplicate");
        }
        if (p.getId() == null) p.setId(idGenerator.getAndIncrement());
        storage.put(p.getPartNumber(), p);
        return p;
    }

    public Optional<Product> findByPartNumber(String partNumber) {
        return Optional.ofNullable(storage.get(partNumber));
    }

    public List<Product> findAll() {
        return new ArrayList<>(storage.values());
    }

    public boolean existsByPartNumber(String partNumber) {
        return storage.containsKey(partNumber);
    }

   
    public void clear() {
        storage.clear();
        idGenerator.set(1);
    }
}
