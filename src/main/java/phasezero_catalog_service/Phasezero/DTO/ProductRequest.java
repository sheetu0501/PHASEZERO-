package phasezero_catalog_service.Phasezero.DTO;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class ProductRequest {
    @NotBlank(message = "partNumber is required")
    private String partNumber;

    @NotBlank(message = "partName is required")
    private String partName;

    @NotBlank(message = "category is required")
    private String category;

    @NotNull(message = "price is required")
    @Min(value = 0, message = "price cannot be negative")
    private Double price;

    @NotNull(message = "stock is required")
    @Min(value = 0, message = "stock cannot be negative")
    private Integer stock;
}
