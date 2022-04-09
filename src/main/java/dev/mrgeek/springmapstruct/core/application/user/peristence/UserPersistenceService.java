package dev.mrgeek.springmapstruct.core.application.user.peristence;

import java.util.List;

import dev.mrgeek.springmapstruct.core.domain.user.UserModel;

public interface UserPersistenceService {

	List<UserModel> getAll();
}
