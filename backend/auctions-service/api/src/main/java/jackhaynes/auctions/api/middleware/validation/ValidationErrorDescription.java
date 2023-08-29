package jackhaynes.auctions.api.middleware.validation;

import java.util.List;

public class ValidationErrorDescription {
    private String code;
    private String message;

    public ValidationErrorDescription(String code, String message) {
        this.code = code;
        this.message = message;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
