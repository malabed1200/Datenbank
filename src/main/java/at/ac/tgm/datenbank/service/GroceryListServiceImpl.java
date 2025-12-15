package at.ac.tgm.datenbank.service;

import at.ac.tgm.datenbank.converter.GroceryItemConverter;
import at.ac.tgm.datenbank.dto.GroceryItemDto;
import at.ac.tgm.datenbank.entity.GroceryItemEntity;
import at.ac.tgm.datenbank.repository.GroceryItemRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GroceryListServiceImpl implements GroceryListService {

    private final GroceryItemRepository repository;
    private final GroceryItemConverter converter;

    public GroceryListServiceImpl(GroceryItemRepository repository,
                                  GroceryItemConverter converter) {
        this.repository = repository;
        this.converter = converter;
    }

    @Override
    @Transactional
    public GroceryItemDto add(GroceryItemDto item) {
        GroceryItemEntity entity = converter.dtoToEntity(item);
        GroceryItemEntity saved = repository.save(entity);
        return converter.entityToDto(saved);
    }

    @Override
    @Transactional(readOnly = true)
    public List<GroceryItemDto> findAll() {
        return converter.entityToDto(repository.findAll());
    }
}
