package repository;

import java.util.List;
import com.generation.lojadegames.model.Categorias;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

public interface CategoriaRepository extends JpaRepository<Categorias, Long> {
	public List<Categorias> findAllByTipoContainingIgnoreCase(@Param("tipo") String tipo);
}
