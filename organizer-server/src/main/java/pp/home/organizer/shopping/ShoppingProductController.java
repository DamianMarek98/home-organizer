package pp.home.organizer.shopping;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
class ShoppingProductController {
    private final ShoppingListRepository shoppingListRepository;

    public ShoppingProductController(ShoppingListRepository shoppingListRepository) {
        this.shoppingListRepository = shoppingListRepository;
    }

    @GetMapping("/products")
    public Iterable<ShoppingProductDto> getProducts() {
        return shoppingListRepository.findAll()
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
