package at.ac.tgm.datenbank;

import at.ac.tgm.datenbank.dto.GroceryItemDto;
import at.ac.tgm.datenbank.service.GroceryListService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DatenbankApplication implements CommandLineRunner {

    private final GroceryListService service;

    public DatenbankApplication(GroceryListService service) {
        this.service = service;
    }

    public static void main(String[] args) {
        SpringApplication.run(DatenbankApplication.class, args);
    }

    @Override
    public void run(String... args) {
        System.out.println("=== Grocery Items aus der Datenbank ===");

        for (GroceryItemDto item : service.findAll()) {
            System.out.println(
                    item.getName() +
                            " | Menge: " + item.getAmount() +
                            " | Gesammelt: " + item.isCollected()
            );
        }
    }
}
