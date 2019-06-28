package id.ideweb.reservation.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import id.ideweb.reservation.entity.Address;

@Repository
public interface AddressRepository extends JpaRepository<Address, Long> {

}
