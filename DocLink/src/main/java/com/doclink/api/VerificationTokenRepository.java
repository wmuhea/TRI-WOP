package com.doclink.api;

import org.apache.catalina.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VerificationTokenRepository extends JpaRepository<VerificationToken, Long> {

        VerificationToken findByToken(String token);

        VerificationToken findByUser(User user);
    }

