package pp.home.organizer.common;

import lombok.NonNull;
import org.springframework.data.domain.AbstractAggregateRoot;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean
public interface AggregateRepository<T extends AbstractAggregateRoot<T>> extends JpaRepository<T, Long> {
    default @NonNull T getById(@NonNull Long id) {
        return findById(id).orElseThrow(() -> new EntityNotFoundException(id));
    }
}
