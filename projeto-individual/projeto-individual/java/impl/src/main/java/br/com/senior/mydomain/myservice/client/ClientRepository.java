package br.com.senior.mydomain.myservice.client;

import br.com.senior.mydomain.myservice.ClientBaseRepository;
import br.com.senior.mydomain.myservice.ClientEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
interface ClientRepository extends ClientBaseRepository {

    List<ClientEntity> findByNameContainingIgnoreCase(String name);

    List<ClientEntity> findByCpfEquals(String cpf);

    List<ClientEntity> findByBirthdayEquals(LocalDate birthday);


    @Query("SELECT c FROM my_domain.my_service.ClientEntity c WHERE c.active = :active")
    List<ClientEntity> findByActive(@Param("active") Boolean active);


}