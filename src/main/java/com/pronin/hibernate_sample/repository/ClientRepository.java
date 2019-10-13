package com.pronin.hibernate_sample.repository;

import com.pronin.hibernate_sample.model.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Long> {


}
