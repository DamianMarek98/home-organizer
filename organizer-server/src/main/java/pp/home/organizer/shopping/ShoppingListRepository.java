package pp.home.organizer.shopping;

import org.springframework.stereotype.Repository;
import pp.home.organizer.common.AggregateRepository;

//todo test this impl
@Repository
interface ShoppingListRepository extends AggregateRepository<ShoppingList> {
    //todo aggregate roots and us e aggregate concepts, value obejcts, process managers (?) - read more
    //todo start with one module - ex. shopping product, list, amounts, types, events - shopping done, shopping required etc
    //todo read about events vs domain events, how to treat them
}
