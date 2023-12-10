package com.practice.service;

import com.practice.domain.BoardDTO;

import java.util.List;

public interface BoardService {
    public List<BoardDTO> findAll();

    public BoardDTO findByBno(Long bno);


}
