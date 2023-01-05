package nworld.dev.std_lab_week1.mapper;

import nworld.dev.std_lab_week1.dto.FreeboardDto;
import nworld.dev.std_lab_week1.entity.Freeboard;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface FreeboardMapper {
    Freeboard freeboardToFreeboardDtoRquestPost(FreeboardDto.Request.Post post);
    Freeboard freeboardToFreeboardDtoRquestPatch(FreeboardDto.Request.Patch patch);
}
