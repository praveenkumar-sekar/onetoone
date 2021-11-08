package com.demoproject.onetoone.repository;

import com.demoproject.onetoone.Model.Address;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface AddressRepository  extends CrudRepository<Address,Long>{



}
