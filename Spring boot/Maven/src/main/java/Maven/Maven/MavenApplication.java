package Maven.Maven;

import java.util.List;

import javax.management.loading.ClassLoaderRepository;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MavenApplication {

	public static void main(String[] args) {
		SpringApplication.run(MavenApplication.class, args);
		Curso cursos = new Curso("Spring","Curso de Spring","Spring.net");
    Cursorepository cursoRepository = new Cursorepository();
    cursoRepository.add(cursos);
        List<Curso> lista_main= cursoRepository.findall();
        for (Curso c:lista_main
             ) {System.out.println(c.toString());

        }
    }
	
}


