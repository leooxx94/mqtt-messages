package com.leox.mqtt;

import org.springframework.data.repository.CrudRepository;

public interface MessageRepository extends CrudRepository<MyMessage, Long> {
}