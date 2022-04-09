package dev.mrgeek.springmapstruct.infrastructure.user.converter;

import static org.junit.jupiter.api.Assertions.assertEquals;

import dev.mrgeek.springmapstruct.core.domain.user.UserModel;
import dev.mrgeek.springmapstruct.infrastructure.user.entities.UserDBEntity;
import org.junit.jupiter.api.Test;

class UserDBEntityToUserModelMapperTest {

	private final UserDBEntityToUserModelMapper mapper = UserDBEntityToUserModelMapper.INSTANCE;


	@Test
	void of_allValid_coverAll(){

		UserDBEntity entity = UserDBEntity.builder()
				.email("ahmed@email.com")
				.build();

		UserModel convertedModel = mapper.of(entity);

		assertEquals(convertedModel.getEmail(), entity.getEmail());
	}
}