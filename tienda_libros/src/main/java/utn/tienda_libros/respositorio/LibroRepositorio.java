package utn.tienda_libros.respositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import utn.tienda_libros.modelo.Libro;

public interface LibroRepositorio extends JpaRepository<Libro, Integer> {

}
