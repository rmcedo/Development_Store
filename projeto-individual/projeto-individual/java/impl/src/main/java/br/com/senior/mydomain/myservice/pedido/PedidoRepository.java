package br.com.senior.mydomain.myservice.pedido;

import br.com.senior.mydomain.myservice.PedidoBaseRepository;
import br.com.senior.mydomain.myservice.PedidoEntity;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

@Repository
interface PedidoRepository extends PedidoBaseRepository {

//    List<PedidoEntity> findByOrderDateBetween(LocalDate date1, LocalDate date2);

    List<PedidoEntity> findByFinalValueGreaterThan(BigDecimal value);
}
