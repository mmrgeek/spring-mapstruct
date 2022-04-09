package dev.mrgeek.springmapstruct.core.domain.user;

import java.time.LocalDateTime;
import java.util.List;

import dev.mrgeek.springmapstruct.core.domain.post.PostModel;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class UserModel {

	private final Long id;

	private final String name;

	private final String email;

	private final LocalDateTime createdAt;

	private final List<PostModel> posts;

	private final String anotherAttrib;
}
