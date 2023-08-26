package jackhaynes.auctions.api.entities;

import jakarta.persistence.*;

import java.util.UUID;

@Entity(name = "Item")
@Table(name = "item")
public class Item {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "id", updatable = false)
    private UUID id;

    @Column(name = "make", nullable = false)
    private String make;

    @Column(name = "model", nullable = false)
    private String model;

    @Column(name = "year", nullable = false)
    private int year;

    @Column(name = "colour", nullable = false)
    private String colour;

    @Column(name = "mileage", nullable = false)
    private int mileage;

    @Column(name = "image_url", nullable = false)
    private String imageUrl;

    @OneToOne(mappedBy = "")
    private Auction auction;
}
