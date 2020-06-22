package br.com.github.kalilventura.clientes.model.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import br.com.github.kalilventura.clientes.model.entity.ServicoPrestado;

public interface ServicoRepository extends JpaRepository<ServicoPrestado, Integer> {

    @Query(" select s from ServicoPrestado s join s.cliente c "
            + " where upper( c.nome ) like upper( :nome ) and MONTH(s.data) =:mes ")
    List<ServicoPrestado> findClienteAndMes(@Param("nome") String nome, @Param("mes") Integer mes);
}