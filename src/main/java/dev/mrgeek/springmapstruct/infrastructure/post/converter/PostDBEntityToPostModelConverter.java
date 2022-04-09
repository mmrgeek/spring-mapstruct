package dev.mrgeek.springmapstruct.infrastructure.post.converter;

import java.util.Objects;

import org.springframework.core.convert.converter.Converter;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;

import dev.mrgeek.springmapstruct.core.domain.post.PostModel;
import dev.mrgeek.springmapstruct.infrastructure.post.entities.PostDBEntity;

@Component
public class PostDBEntityToPostModelConverter implements Converter<PostDBEntity, PostModel> {

	@Override
	public PostModel convert(@Nullable final PostDBEntity source) {

		if (Objects.isNull(source)) {

			return null;
		}

		return PostModel.builder()
				.id(source.getId())
				.content(source.getContent())
				.build();
	}
}
