package dev.mrgeek.springmapstruct.infrastructure.post.entities;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class PostDBEntity {

	private final Long id;

	private final String content;
}
