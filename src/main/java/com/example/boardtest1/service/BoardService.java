package com.example.boardtest1.service;

import com.example.boardtest1.dto.BoardDto;
import com.example.boardtest1.repository.BoardRepository;
import com.example.boardtest1.vo.Board;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BoardService {

    @Autowired
    private BoardRepository repository;

    public List<Board> list() {
        return repository.findAll();
    }

    public void createBoard(BoardDto boardDto) throws Exception {
        if (boardDto.getTitle() == null) throw new Exception();

    }
}
