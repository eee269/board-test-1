package com.example.boardtest1.controller;

import com.example.boardtest1.dto.BoardDto;
import com.example.boardtest1.service.BoardService;
import com.example.boardtest1.vo.Board;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/board")
@Log4j2
public class BoardController {

    @Autowired
    private BoardService service;

    @GetMapping("/")
    public List<Board> getBoardList()
    {
        return service.list();
    }

    @PostMapping("/create")
    public void createBoard(@RequestBody BoardDto boardDto)
    {
        log.info("[BOARD][CREATE] ----- START -----");
        try
        {
            service.createBoard(boardDto);
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
