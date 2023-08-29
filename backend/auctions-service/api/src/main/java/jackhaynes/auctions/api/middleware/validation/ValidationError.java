package jackhaynes.auctions.api.middleware.validation;

import java.util.List;
import java.util.Objects;

public class ValidationError {
    private ValidationErrorField field;
    private List<ValidationErrorDescription> errors;

    public ValidationError(ValidationErrorField field, List<ValidationErrorDescription> errors) {
        this.field = field;
        this.errors = errors;
    }

    public void addErrorDescription(ValidationErrorDescription description) {
        errors.add(description);
    }

    public ValidationErrorField getField() {
        return field;
    }

    public void setField(ValidationErrorField field) {
        this.field = field;
    }

    public List<ValidationErrorDescription> getErrors() {
        return errors;
    }

    public void setErrors(List<ValidationErrorDescription> errors) {
        this.errors = errors;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ValidationError that = (ValidationError) o;
        return Objects.equals(field, that.field) && Objects.equals(errors, that.errors);
    }

    @Override
    public int hashCode() {
        return Objects.hash(field, errors);
    }
}
