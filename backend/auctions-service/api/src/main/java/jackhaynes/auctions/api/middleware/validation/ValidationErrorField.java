package jackhaynes.auctions.api.middleware.validation;

import java.util.Objects;

public class ValidationErrorField {
    private String entity;
    private String field;

    public ValidationErrorField(String entity, String field) {
        this.entity = entity;
        this.field = field;
    }

    public String getEntity() {
        return entity;
    }

    public void setEntity(String entity) {
        this.entity = entity;
    }

    public String getField() {
        return field;
    }

    public void setField(String field) {
        this.field = field;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ValidationErrorField that = (ValidationErrorField) o;
        return Objects.equals(entity, that.entity) && Objects.equals(field, that.field);
    }

    @Override
    public int hashCode() {
        return Objects.hash(entity, field);
    }
}
