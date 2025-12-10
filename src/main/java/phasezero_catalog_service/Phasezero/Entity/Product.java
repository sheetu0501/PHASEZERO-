package phasezero_catalog_service.Phasezero.Entity;


import java.time.Instant;
import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Product {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; 
    private String partNumber;
    private String partName; 
    private String category;
    private double price;
    private int stock;
    private Instant createdAt;

   

    public Product() { }

    public Product(Long id, String partNumber, String partName, String category, double price, int stock, Instant createdAt) {
        this.id = id;
        this.partNumber = partNumber;
        this.partName = partName;
        this.category = category;
        this.price = price;
        this.stock = stock;
        this.createdAt = createdAt;
    }

   
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Product)) return false;
        Product p = (Product) o;
        return Objects.equals(partNumber, p.partNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(partNumber);
    }
}

