package jackhaynes.auctions.api.middleware.validation;

import java.util.List;

public class ValidationResponse {
    private String message;
    private String errorCode;
    private List<ValidationError> invalidParams;

    public ValidationResponse(String message, String errorCode, List<ValidationError> invalidParams) {
        this.message = message;
        this.errorCode = errorCode;
        this.invalidParams = invalidParams;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public List<ValidationError> getInvalidParams() {
        return invalidParams;
    }

    public void setInvalidParams(List<ValidationError> invalidParams) {
        this.invalidParams = invalidParams;
    }
}
