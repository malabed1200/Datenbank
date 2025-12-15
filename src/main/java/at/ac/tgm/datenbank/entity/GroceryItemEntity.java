package at.ac.tgm.datenbank.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "GROCERY_ITEM")
public class GroceryItemEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private int amount;

    @Column(nullable = false)
    private boolean collected;

    public GroceryItemEntity() {
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAmount() {
        return amount;
    }

    public boolean isCollected() {
        return collected;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public void setCollected(boolean collected) {
        this.collected = collected;
    }
}
