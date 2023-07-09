package pp.home.organizer.shopping;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import static org.assertj.core.api.Assertions.assertThat;

@Transactional
@SpringBootTest
class ShoppingProductRepositoryTest {

    @Autowired
    private ShoppingProductRepository shoppingProductRepository;

    @Test
    void test() {
        final var a = shoppingProductRepository.findAll();
        assertThat(a).isNotEmpty().hasSize(2);
    }
}
