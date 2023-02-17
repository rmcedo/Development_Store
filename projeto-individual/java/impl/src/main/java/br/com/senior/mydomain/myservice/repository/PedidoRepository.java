package br.com.senior.mydomain.myservice.repository;

import br.com.senior.mydomain.myservice.PedidoBaseRepository;
import br.com.senior.mydomain.myservice.PedidoEntity;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface PedidoRepository extends PedidoBaseRepository {

    List<PedidoEntity> findByOrderDateBetween(LocalDate date1, LocalDate date2);
}
