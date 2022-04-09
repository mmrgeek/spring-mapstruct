package dev.mrgeek.springmapstruct.core.application.user.service;

import java.util.List;

import dev.mrgeek.springmapstruct.core.domain.user.UserModel;

public interface UserService {

	List<UserModel> getAll();
}
