package cj.ejeldes.springsecurityjwt.repository;

import cj.ejeldes.springsecurityjwt.entities.security.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

    Optional<Usuario> findByUsername(String username);
}
