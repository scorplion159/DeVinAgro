package com.viceri.test.repository;

public @interface EnableJpaRepositories {

    Class<TarefaRepositorio>[] basePackageClasses();
    
}
