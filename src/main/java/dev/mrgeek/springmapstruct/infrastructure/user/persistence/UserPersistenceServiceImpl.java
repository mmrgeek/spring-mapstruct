package dev.mrgeek.springmapstruct.infrastructure.user.persistence;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import dev.mrgeek.springmapstruct.core.application.user.peristence.UserPersistenceService;
import dev.mrgeek.springmapstruct.core.domain.user.UserModel;
import dev.mrgeek.springmapstruct.infrastructure.user.converter.UserDBEntityToUserModelConverter;
import dev.mrgeek.springmapstruct.infrastructure.user.converter.UserDBEntityToUserModelMapper;
import dev.mrgeek.springmapstruct.infrastructure.user.repository.UserRepository;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class UserPersistenceServiceImpl implements UserPersistenceService {

	private final UserDBEntityToUserModelMapper mapper;

	private final UserDBEntityToUserModelConverter converter = new UserDBEntityToUserModelConverter();

	private final UserRepository userRepository;

	@Override
	public List<UserModel> getAll() {

		return userRepository.getAll()
				.stream()
				.map(mapper::of)
				.collect(Collectors.toList());
	}
}
