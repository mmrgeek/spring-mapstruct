package dev.mrgeek.springmapstruct.entrypoint.rest.post.converter;

import dev.mrgeek.springmapstruct.core.domain.post.PostModel;
import dev.mrgeek.springmapstruct.entrypoint.rest.post.dto.PostResponseDto;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface PostModelToPostResponseDtoMapper {

	PostResponseDto of(final PostModel postModel);
}
