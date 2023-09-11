package jackhaynes.auctions.api.dtos;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;

import java.util.UUID;

public class ItemDto {
    private UUID id;
    @NotNull
    @NotEmpty
    private String make;
    @NotNull
    @NotEmpty
    private String model;
    @NotNull
    @Min(1800)
    private int year;
    @NotNull
    @NotEmpty
    private String colour;
    @NotNull
    @NotEmpty
    private int mileage;
    @NotNull
    @NotEmpty
    private String imageUrl;

    public ItemDto() { }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }
}
