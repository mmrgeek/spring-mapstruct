package dev.mrgeek.springmapstruct.entrypoint.rest.user.converter;

import dev.mrgeek.springmapstruct.core.domain.user.UserModel;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import dev.mrgeek.springmapstruct.entrypoint.rest.user.dto.UserResponseDto;

@Mapper(componentModel = "spring")
public interface UserModelToUserResponseDtoMapper {

	@Mapping(target = "date", source = "createdAt")
	UserResponseDto of(final UserModel userModel);
}
