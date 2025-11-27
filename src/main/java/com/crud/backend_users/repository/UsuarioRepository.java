package com.crud.backend_users.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.crud.backend_users.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {


}
