package at.ac.tgm.datenbank.service;

import at.ac.tgm.datenbank.dto.GroceryItemDto;

import java.util.List;

public interface GroceryListService {

    GroceryItemDto add(GroceryItemDto item);

    List<GroceryItemDto> findAll();
}
