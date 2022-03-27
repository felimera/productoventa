package com.productoventa.repository;

import com.productoventa.entity.Usuario;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UsuarioRepository extends CrudRepository<Usuario, Long> {
    @Query(" SELECT u FROM Usuario u WHERE u.login=?1 AND u.contrasena = ?2 ")
    Optional<Usuario> getConsltarLoginPassword(String login, String pass);

    @Query(" SELECT u FROM Usuario u WHERE u.login=?1 ")
    Optional<Usuario> getConsltarLogin(String login);
}
