package Maven.Maven;

import java.util.List;
import java.util.Optional;

public interface CRUDService<T> {
        List<T> list();
        T create(T t);
        Optional<T> get(int id);
        void update(T t, int id);
        void delete(int id);
    
    }
    

