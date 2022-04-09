package dev.mrgeek.springmapstruct.infrastructure.user.repository;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.stereotype.Component;

import dev.mrgeek.springmapstruct.infrastructure.post.entities.PostDBEntity;
import dev.mrgeek.springmapstruct.infrastructure.user.entities.UserDBEntity;

@Component
public class UserRepository {

	public List<UserDBEntity> getAll() {

		return Stream.generate(() -> UserDBEntity.builder()
						.id(10L)
						.firstName("Ahmed")
						.lastName("Mohamed")
						.email("ahmed@email.com")
						.password("12345678")
						.createdAt(LocalDateTime.now())
						.posts(List.of(PostDBEntity.builder()
										.id(1L)
										.content("User post")
								.build()))
						.build())
				.limit(10)
				.collect(Collectors.toList());
	}
}
