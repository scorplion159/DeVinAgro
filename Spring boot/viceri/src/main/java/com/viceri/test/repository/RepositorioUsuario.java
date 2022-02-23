package com.viceri.test.repository;

import com.viceri.test.entidade.Usuario;
@EnableJpaRepositories (basePackageClasses = {TarefaRepositorio.class})
public class RepositorioUsuario extends JpaRepository<Usuario,Long> {
    
}
