package com.example.boardtest1.repository;

import com.example.boardtest1.vo.Board;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BoardRepository extends JpaRepository<Board, Long> {
}
