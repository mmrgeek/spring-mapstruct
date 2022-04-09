package dev.mrgeek.springmapstruct.entrypoint.rest.user.converter;

import java.time.LocalDateTime;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;

import dev.mrgeek.springmapstruct.core.domain.user.UserModel;
import org.springframework.core.convert.converter.Converter;
import org.springframework.lang.Nullable;

import dev.mrgeek.springmapstruct.entrypoint.rest.post.converter.PostModelToPostResponseDtoConverter;
import dev.mrgeek.springmapstruct.entrypoint.rest.user.dto.UserResponseDto;

public class UserModelToUserResponseDtoConverter implements Converter<UserModel, UserResponseDto> {

	private final PostModelToPostResponseDtoConverter converter = new PostModelToPostResponseDtoConverter();

	@Override
	public UserResponseDto convert(@Nullable final UserModel source) {

		if (Objects.isNull(source)) {

			return null;
		}

		return UserResponseDto.builder()
				.id(Optional.ofNullable(source.getId())
						.map(Long::intValue)
						.orElse(null))
				.name(source.getName())
				.email(source.getEmail())
				.date(Optional.ofNullable(source.getCreatedAt())
						.map(LocalDateTime::toString)
						.orElse(null)
				)
				.posts(source.getPosts()
						.stream()
						.map(converter::convert)
						.collect(Collectors.toList()))
				.build();
	}
}
