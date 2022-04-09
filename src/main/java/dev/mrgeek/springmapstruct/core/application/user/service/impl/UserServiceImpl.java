package dev.mrgeek.springmapstruct.core.application.user.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import dev.mrgeek.springmapstruct.core.application.user.peristence.UserPersistenceService;
import dev.mrgeek.springmapstruct.core.application.user.service.UserService;
import dev.mrgeek.springmapstruct.core.domain.user.UserModel;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

	private final UserPersistenceService userPersistenceService;

	@Override
	public List<UserModel> getAll() {

		return userPersistenceService.getAll();
	}
}
