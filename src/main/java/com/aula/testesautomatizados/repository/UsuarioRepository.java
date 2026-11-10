package com.aula.testesautomatizados.repository;

import com.aula.testesautomatizados.entity.UsuarioEntity;

import java.util.Optional;

public class UsuarioRepository {

    private static final UsuarioEntity usuarioEntity = new UsuarioEntity(1L, "admin", "$2a$12$ujZHX1lXQGck8AE.1/ZV4eDhs1tKWnxEURkZz49dbXixht.H/Obdu", "ADMIN");

    public static Optional<UsuarioEntity> findByLogin(String login) {
        if (usuarioEntity.getLogin().equals(login)) {
            return Optional.of(usuarioEntity);
        }
        return Optional.empty();
    }
}
