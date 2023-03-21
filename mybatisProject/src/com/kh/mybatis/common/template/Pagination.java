package com.kh.mybatis.common.template;

import com.kh.mybatis.common.model.vo.PageInfo;

public class Pagination {

	public static PageInfo getPageInfo(int listCount, int currentPage, int pageLimit, int boardLimit) {

		int maxPage = (int) Math.ceil((double) listCount / boardLimit);

		// * startPage : 페이징바의 시작수
		int startPage = (currentPage - 1) / pageLimit * pageLimit + 1;

		// * endPage : 페이징바의 끝 수
		int endPage = startPage + pageLimit - 1;

		// startPage가 11이어서 endPage 20으로 됨 (근데 maxPage가 고작 13 밖에 안되면?)
		if (endPage > maxPage) {
			endPage = maxPage;
		}

		PageInfo pi = new PageInfo(listCount, currentPage, pageLimit, boardLimit, maxPage, startPage, endPage);

		return pi;
	}
}
