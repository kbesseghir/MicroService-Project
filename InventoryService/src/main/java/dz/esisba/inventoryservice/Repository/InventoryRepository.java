package dz.esisba.inventoryservice.Repository;

import dz.esisba.inventoryservice.Entity.Inventory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InventoryRepository extends JpaRepository<Inventory,Long> {
}
