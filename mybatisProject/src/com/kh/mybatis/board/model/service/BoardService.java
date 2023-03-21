package com.kh.mybatis.board.model.service;

import java.util.ArrayList;

import com.kh.mybatis.board.model.vo.Board;
import com.kh.mybatis.common.model.vo.PageInfo;

public interface BoardService {

	int selectListCount();
	ArrayList<Board> selectList(PageInfo pi);
	
	int increaseCount(int boardNo);
	Board selectBoard(int boardNo);
}
