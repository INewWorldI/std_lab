package nworld.dev.std_lab_week1.mapper;

import javax.annotation.processing.Generated;
import nworld.dev.std_lab_week1.dto.FreeboardDto;
import nworld.dev.std_lab_week1.entity.Freeboard;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-01-05T13:25:18+0900",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 11.0.17 (Azul Systems, Inc.)"
)
@Component
public class FreeboardMapperImpl implements FreeboardMapper {

    @Override
    public Freeboard freeboardToFreeboardDtoRquestPost(FreeboardDto.Request.Post post) {
        if ( post == null ) {
            return null;
        }

        Freeboard freeboard = new Freeboard();

        freeboard.setTitle( post.getTitle() );
        freeboard.setContent( post.getContent() );
        freeboard.setWriter( post.getWriter() );

        return freeboard;
    }

    @Override
    public Freeboard freeboardToFreeboardDtoRquestPatch(FreeboardDto.Request.Patch patch) {
        if ( patch == null ) {
            return null;
        }

        Freeboard freeboard = new Freeboard();

        freeboard.setTitle( patch.getTitle() );
        freeboard.setContent( patch.getContent() );
        freeboard.setWriter( patch.getWriter() );

        return freeboard;
    }
}
