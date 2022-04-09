package dev.mrgeek.springmapstruct.entrypoint.rest.post.dto;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class PostResponseDto {

	private final Integer id;

	private final String content;
}
