package com.qzztf.webfluxdemo;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import reactor.core.publisher.Mono;

/**
 * @author qzz
 */
public interface UserRepository extends ReactiveMongoRepository<User, String> {  // 1
    /**
     * @param username
     * @return
     */
    Mono<User> findByUsername(String username);     // 2

    /**
     * @param username
     * @return
     */
    Mono<Long> deleteByUsername(String username);
}