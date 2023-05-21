package pp.home.organizer.shopping;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ShoppingProductController {
    private final ShoppingProductRepository shoppingProductRepository;

    public ShoppingProductController(ShoppingProductRepository shoppingProductRepository) {
        this.shoppingProductRepository = shoppingProductRepository;
    }

    @GetMapping("/products")
    public Iterable<ShoppingProductDto> getProducts() {
        return shoppingProductRepository.findAll()
                .stream()
                .map(ShoppingProductDto::from)
                .toList();
    }

    private record ShoppingProductDto(long id, String name) {
        public static ShoppingProductDto from(ShoppingProduct product) {
            return new ShoppingProductDto(product.getId(), product.getName());
        }
    }
}
