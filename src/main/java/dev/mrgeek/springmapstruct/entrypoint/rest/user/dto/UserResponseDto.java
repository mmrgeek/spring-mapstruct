package dev.mrgeek.springmapstruct.entrypoint.rest.user.dto;

import java.util.List;

import dev.mrgeek.springmapstruct.entrypoint.rest.post.dto.PostResponseDto;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class UserResponseDto {

	private final Integer id;

	private final String name;

	private final String email;

	private final String date;

	private final List<PostResponseDto> posts;
}
