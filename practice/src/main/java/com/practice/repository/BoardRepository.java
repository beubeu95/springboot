package com.practice.repository;

import com.practice.domain.BoardDTO;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BoardRepository extends JpaRepository<BoardDTO, Long> {
}
