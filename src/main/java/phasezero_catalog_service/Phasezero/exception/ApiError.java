package phasezero_catalog_service.Phasezero.exception;

import java.time.Instant;

public record ApiError(String message, int status, Instant timestamp) {
	
}
