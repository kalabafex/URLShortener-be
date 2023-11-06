package com.example.usbe.repo;

import com.example.usbe.entity.URL;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface URLRepo extends JpaRepository<URL, String>
{
}
