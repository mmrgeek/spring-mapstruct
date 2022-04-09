package dev.mrgeek.springmapstruct.infrastructure.user.converter;

import java.util.Objects;
import java.util.stream.Collectors;

import org.springframework.core.convert.converter.Converter;
import org.springframework.lang.Nullable;

import dev.mrgeek.springmapstruct.core.domain.user.UserModel;
import dev.mrgeek.springmapstruct.infrastructure.post.converter.PostDBEntityToPostModelConverter;
import dev.mrgeek.springmapstruct.infrastructure.user.entities.UserDBEntity;

public class UserDBEntityToUserModelConverter implements Converter<UserDBEntity, UserModel> {

	private final PostDBEntityToPostModelConverter converter = new PostDBEntityToPostModelConverter();

	@Override
	public UserModel convert(@Nullable final UserDBEntity source) {

		if (Objects.isNull(source)) {

			return null;
		}

		return UserModel.builder()
				.id(source.getId())
				.name(getName(source.getFirstName(), source.getLastName()))
				.email(source.getEmail())
				.createdAt(source.getCreatedAt())
				.posts(source.getPosts()
						.stream()
						.map(converter::convert)
						.collect(Collectors.toList()))
				.build();
	}

	private String getName(final String firstName, final String lastName) {

		return firstName + " " + lastName;
	}
}
