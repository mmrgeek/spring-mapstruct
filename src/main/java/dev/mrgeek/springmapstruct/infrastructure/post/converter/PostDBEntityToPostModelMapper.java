package dev.mrgeek.springmapstruct.infrastructure.post.converter;

import org.mapstruct.Mapper;

import dev.mrgeek.springmapstruct.core.domain.post.PostModel;
import dev.mrgeek.springmapstruct.infrastructure.post.entities.PostDBEntity;

@Mapper(componentModel = "spring")
public interface PostDBEntityToPostModelMapper {

	PostModel of(final PostDBEntity postDBEntity);
}
