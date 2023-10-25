package com.sulim.ddak.application.user;

import com.sulim.ddak.domain.user.User;
import com.sulim.ddak.infrastructure.persistence.UserRepository;
import com.sulim.ddak.presentation.user.dto.CreateUserRequest;
import com.sulim.ddak.shared.annotation.UseCase;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;

@UseCase
@RequiredArgsConstructor
public class CreatUserUseCase {

    private final UserRepository userRepository;

    @Transactional
    public void execute(CreateUserRequest request) {

        userRepository.save(
                User.builder()
                        .ogId(request.getOgId())
                        .zoId(request.getZoId())
                        .name(request.getName())
                        .build()
        );

    }

}
