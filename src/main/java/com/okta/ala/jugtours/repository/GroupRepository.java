package com.okta.ala.jugtours.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.okta.ala.jugtours.model.Group;

public interface GroupRepository extends JpaRepository<Group, Long> {
    Group findByName(String name);
}
