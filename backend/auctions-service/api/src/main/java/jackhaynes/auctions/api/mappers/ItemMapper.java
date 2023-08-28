package jackhaynes.auctions.api.mappers;

import jackhaynes.auctions.api.dtos.ItemDto;
import jackhaynes.auctions.api.entities.Item;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ItemMapper {
    public ItemDto toDto(Item item);
    public Item fromDto(ItemDto itemDto);
}
