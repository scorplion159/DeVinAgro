package com.viceri.test.repository;

import com.viceri.test.entidade.Tarefa;

@EnableJpaRepositories (basePackageClasses = {TarefaRepositorio.class})
public class TarefaRepositorio extends JpaRepository<Tarefa,Long> {
    
}
