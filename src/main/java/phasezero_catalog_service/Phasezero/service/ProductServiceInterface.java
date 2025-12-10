package phasezero_catalog_service.Phasezero.service;

import java.util.List;

import jakarta.validation.Valid;
import phasezero_catalog_service.Phasezero.DTO.ProductRequest;
import phasezero_catalog_service.Phasezero.Entity.Product;

public interface ProductServiceInterface {

	Product addProduct(@Valid ProductRequest req);

	List<Product> listAll();

	List<Product> searchByName(String q);

	List<Product> filterByCategory(String category);

	List<Product> sortByPriceAsc();

	double inventoryValue();
}
