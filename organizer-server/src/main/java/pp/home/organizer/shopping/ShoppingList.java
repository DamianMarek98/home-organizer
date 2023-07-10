package pp.home.organizer.shopping;


import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import org.springframework.data.domain.AbstractAggregateRoot;

import java.util.List;

@Entity
@Getter(value = AccessLevel.PACKAGE)
class ShoppingList extends AbstractAggregateRoot<ShoppingList> {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "shopping_product_gen")
    @SequenceGenerator(name = "shopping_product_gen", sequenceName = "shopping_product_seq")
    private Long id;

    @Column
    private String name;

    @OneToMany
    @JoinColumn(name = "list_id")
    private List<ShoppingProduct> products;
}
