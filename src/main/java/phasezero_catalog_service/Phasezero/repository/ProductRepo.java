package phasezero_catalog_service.Phasezero.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import phasezero_catalog_service.Phasezero.Entity.Product;

public interface ProductRepo extends JpaRepository<Product, Long>{

	boolean existsByPartNumber(String partNumber);


}
