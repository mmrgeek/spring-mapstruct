package dev.mrgeek.springmapstruct.core.domain.post;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class PostModel {

	private final Long id;

	private final String content;
}
