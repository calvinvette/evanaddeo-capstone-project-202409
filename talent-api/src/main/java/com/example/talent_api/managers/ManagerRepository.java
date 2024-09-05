package com.example.talent_api;

import com.example.talent_api.Manager;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface ManagerRepository extends JpaRepository<Manager, Long> {
    List<Manager> findByUserId(Long userId);
}
