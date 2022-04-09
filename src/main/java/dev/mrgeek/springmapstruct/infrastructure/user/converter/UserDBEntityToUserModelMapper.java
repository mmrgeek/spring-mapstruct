package dev.mrgeek.springmapstruct.infrastructure.user.converter;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;
import org.mapstruct.factory.Mappers;

import dev.mrgeek.springmapstruct.core.domain.user.UserModel;
import dev.mrgeek.springmapstruct.infrastructure.post.converter.PostDBEntityToPostModelMapper;
import dev.mrgeek.springmapstruct.infrastructure.user.entities.UserDBEntity;

@Mapper(componentModel = "spring", uses = PostDBEntityToPostModelMapper.class)
public interface UserDBEntityToUserModelMapper {

	UserDBEntityToUserModelMapper INSTANCE = Mappers.getMapper(UserDBEntityToUserModelMapper.class);

	@Mapping(target = "name", source = "userDBEntity", qualifiedByName = "getName")
	UserModel of(final UserDBEntity userDBEntity);


	@Named("getName")
	default String getName(UserDBEntity userDBEntity){

		return userDBEntity.getFirstName() + " " + userDBEntity.getLastName();
	}
}
