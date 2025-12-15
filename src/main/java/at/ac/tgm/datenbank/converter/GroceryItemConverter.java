package at.ac.tgm.datenbank.converter;

import at.ac.tgm.datenbank.dto.GroceryItemDto;
import at.ac.tgm.datenbank.entity.GroceryItemEntity;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class GroceryItemConverter {

    public GroceryItemDto entityToDto(GroceryItemEntity entity) {
        if (entity == null) {
            return null;
        }

        GroceryItemDto dto = new GroceryItemDto();
        dto.setId(entity.getId());
        dto.setName(entity.getName());
        dto.setAmount(entity.getAmount());
        dto.setCollected(entity.isCollected());
        return dto;
    }

    public GroceryItemEntity dtoToEntity(GroceryItemDto dto) {
        if (dto == null) {
            return null;
        }

        GroceryItemEntity entity = new GroceryItemEntity();
        entity.setId(dto.getId());
        entity.setName(dto.getName());
        entity.setAmount(dto.getAmount());
        entity.setCollected(dto.isCollected());
        return entity;
    }

    public List<GroceryItemDto> entityToDto(List<GroceryItemEntity> entities) {
        List<GroceryItemDto> result = new ArrayList<>();
        for (GroceryItemEntity entity : entities) {
            result.add(entityToDto(entity));
        }
        return result;
    }
}
