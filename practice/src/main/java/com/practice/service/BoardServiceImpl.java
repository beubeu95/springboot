package com.practice.service;

import com.practice.domain.BoardDTO;
import com.practice.entity.Board;
import com.practice.repository.BoardRepository;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BoardServiceImpl implements BoardService{

    private final BoardRepository boardRepository;

    private final ModelMapper modelMapper;


    @Override
    public List<BoardDTO> findAll() {
        List<Board> boradList = boardRepository.findAll();
        List<BoardDTO> boardDTOList =

        return ;
    }

    @Override
    public BoardDTO findByBno(Long bno) {
        return null;
    }
}
