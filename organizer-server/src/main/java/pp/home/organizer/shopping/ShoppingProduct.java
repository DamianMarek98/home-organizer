package pp.home.organizer.shopping;

import jakarta.persistence.*;


@Table(name = "shopping_product")
@Entity
class ShoppingProduct {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "shopping_product_gen")
    @SequenceGenerator(name = "shopping_product_gen", sequenceName = "shopping_product_seq")
    private Long id;

    @Column
    private String name;

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
