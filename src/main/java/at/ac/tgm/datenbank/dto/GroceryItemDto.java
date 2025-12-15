package at.ac.tgm.datenbank.dto;

public class GroceryItemDto {

    private Long id;
    private String name;
    private int amount;
    private boolean collected;

    public GroceryItemDto() {
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
