package jackhaynes.auctions.api.middleware.validation;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.*;

@RestControllerAdvice
public class ValidationExceptionHandler {
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<ValidationResponse> handle(MethodArgumentNotValidException ex) {
        List<ValidationError> errors = getErrorsFromException(ex);
        ValidationResponse response = createResponse(errors);

        return new ResponseEntity<>(response, new HttpHeaders(), HttpStatus.BAD_REQUEST);
    }

    private List<ValidationError> getErrorsFromException(MethodArgumentNotValidException ex) {
        List<FieldError> exceptionErrors = ex.getBindingResult().getFieldErrors();
        Map<ValidationErrorField, ValidationError> errors = new HashMap<>();

        for(FieldError exceptionError : exceptionErrors) {
            ValidationErrorField field = new ValidationErrorField(
                exceptionError.getObjectName(),
                exceptionError.getField());

            ValidationErrorDescription description = new ValidationErrorDescription(
                exceptionError.getCode(),
                exceptionError.getDefaultMessage());

            ValidationError existingError = errors.get(field);
            if(existingError != null) {
                existingError.addErrorDescription(description);
            }

            ValidationError newError = new ValidationError(field, new ArrayList<>(List.of(description)));
            errors.put(field, newError);
        }

        return new ArrayList<>(errors.values());
    }

    private ValidationResponse createResponse(List<ValidationError> errors) {
        String message = "One or more validation errors occurred.";
        String code = "VALIDATION_ERROR";

        return new ValidationResponse(message, code, errors);
    }
}
