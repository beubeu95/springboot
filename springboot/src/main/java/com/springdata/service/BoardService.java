package com.springdata.service;

import com.springdata.dto.BoardDTO;
import com.springdata.dto.PageDTO;
import com.springdata.entity.Board;

import java.util.List;

public interface BoardService {
    Long boardAdd(BoardDTO boardDTO);
    Long boardEdit(BoardDTO boardDTO);
    BoardDTO boardDetail(Long bno);
    Long boardRemove(Long bno);
    void boardDelete(Long bno);
    PageDTO<Board, BoardDTO> boardList(PageDTO<Board, BoardDTO> pageDTO);
}
