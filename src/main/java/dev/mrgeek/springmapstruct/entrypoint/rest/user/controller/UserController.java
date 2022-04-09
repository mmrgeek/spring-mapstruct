package dev.mrgeek.springmapstruct.entrypoint.rest.user.controller;

import java.util.List;
import java.util.stream.Collectors;

import dev.mrgeek.springmapstruct.core.application.user.service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dev.mrgeek.springmapstruct.entrypoint.rest.user.converter.UserModelToUserResponseDtoConverter;
import dev.mrgeek.springmapstruct.entrypoint.rest.user.converter.UserModelToUserResponseDtoMapper;
import dev.mrgeek.springmapstruct.entrypoint.rest.user.dto.UserResponseDto;
import lombok.RequiredArgsConstructor;

@RequestMapping("/users")
@RestController
@RequiredArgsConstructor
public class UserController {

	private final UserService userService;

	private final UserModelToUserResponseDtoMapper mapper;

	private final UserModelToUserResponseDtoConverter converter = new UserModelToUserResponseDtoConverter();

	@GetMapping
	public ResponseEntity<List<UserResponseDto>> getUsers() {

		return ResponseEntity.ok(userService.getAll()
				.stream()
				.map(mapper::of)
				.collect(Collectors.toList()));
	}

}
