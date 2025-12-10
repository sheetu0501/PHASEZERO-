package phasezero_catalog_service.Phasezero.exception;


public class DuplicatePartNumberException extends RuntimeException {
    public DuplicatePartNumberException(String partNumber){
        super("Product with partNumber '" + partNumber + "' already exists");
    }
}
