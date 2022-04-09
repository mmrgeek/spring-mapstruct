package dev.mrgeek.springmapstruct.entrypoint.rest.post.converter;

import java.util.Objects;
import java.util.Optional;

import dev.mrgeek.springmapstruct.core.domain.post.PostModel;
import org.springframework.core.convert.converter.Converter;
import org.springframework.lang.Nullable;

import dev.mrgeek.springmapstruct.entrypoint.rest.post.dto.PostResponseDto;

public class PostModelToPostResponseDtoConverter implements Converter<PostModel, PostResponseDto> {

	@Override
	public PostResponseDto convert(@Nullable final PostModel source) {

		if (Objects.isNull(source)) {

			return null;
		}

		return PostResponseDto.builder()
				.id(Optional.ofNullable(source.getId())
						.map(Long::intValue)
						.orElse(null)
				)
				.content(source.getContent())
				.build();
	}
}
