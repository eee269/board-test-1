package com.example.boardtest1.service;

import com.example.boardtest1.dao.BoardDao;
import org.springframework.stereotype.Service;

@Service
public class BoardService {
    public void createBoard(BoardDao boardDao) throws Exception {
        if (boardDao.getTitle() == null) throw new Exception();
    }
}
