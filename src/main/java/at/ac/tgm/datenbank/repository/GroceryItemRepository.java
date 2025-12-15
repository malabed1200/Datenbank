package at.ac.tgm.datenbank.repository;

import at.ac.tgm.datenbank.entity.GroceryItemEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GroceryItemRepository
        extends JpaRepository<GroceryItemEntity, Long> {
}
