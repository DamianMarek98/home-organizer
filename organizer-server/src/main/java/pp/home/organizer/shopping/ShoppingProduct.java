package pp.home.organizer.shopping;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@Table(name = "shopping_product")
@Entity
class ShoppingProduct {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "shopping_product_gen")
    @SequenceGenerator(name = "shopping_product_gen", sequenceName = "shopping_product_seq")
    private Long id;

    @Column
    private String name;

    @Column
    private Long listId;
}
