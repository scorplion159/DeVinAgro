package Maven.Maven;

import java.util.List;

public interface CRUDRepository<T> {
    List<T> findall();
    boolean add (T t);
    
}
