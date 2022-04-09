package dev.mrgeek.springmapstruct.infrastructure.user.entities;

import java.time.LocalDateTime;
import java.util.List;

import dev.mrgeek.springmapstruct.infrastructure.post.entities.PostDBEntity;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class UserDBEntity {

	private final Long id;

	private final String firstName;

	private final String lastName;

	private final String email;

	private final String password;

	private final LocalDateTime createdAt;

	private final String differentAttrib;

	private final List<PostDBEntity> posts;
}
