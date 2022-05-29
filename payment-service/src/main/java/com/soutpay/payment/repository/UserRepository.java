package com.soutpay.payment.repository;

import com.soutpay.payment.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
