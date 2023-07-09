package com.example.boardtest1.controller;

import com.example.boardtest1.dao.BoardDao;
import com.example.boardtest1.service.BoardService;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/board")
@Log4j2
public class BoardController {
    @Autowired
    private BoardService service;
    @PostMapping("/create")
    public void createBoard(@RequestBody BoardDao boardDao)
    {
        log.info("[BOARD][CREATE] ----- START -----");
        try
        {
            service.createBoard(boardDao);
        }
        catch (Exception e)
        {
            log.error(e.getMessage(), e);
        }
        finally {
            log.info("[BOARD][CREATE] ----- END -----");
        }
    }
}
