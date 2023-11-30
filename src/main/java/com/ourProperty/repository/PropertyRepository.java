package com.ourProperty.repository;

import com.ourProperty.entity.Property;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PropertyRepository extends JpaRepository<Property, Long> {


}
