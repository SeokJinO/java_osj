package kr.green.springtest.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import kr.green.springtest.service.BoardService;
import kr.green.springtest.vo.BoardVO;

@Controller
public class BoardController {

	@Autowired
	BoardService boardService;

	@RequestMapping(value = "/board/list", method = RequestMethod.GET)
	public ModelAndView boardListGet(ModelAndView mv) {
		// 등록된 게시글을 가져옴
		ArrayList<BoardVO> list = boardService.getBoardList();
		System.out.println(list);
		mv.addObject("list", list);
		mv.setViewName("/board/list");
		return mv;
	}
	@RequestMapping(value = "/board/select/{bd_num}", method = RequestMethod.GET)
	public ModelAndView boardSelecttGet(ModelAndView mv,
			@PathVariable("bd_num")int bd_num) {
		boardService.updateViews(bd_num);
		// 등록된 게시글을 가져옴
		BoardVO board = boardService.getBoard(bd_num);
		mv.addObject("board", board);
		mv.setViewName("/board/select");
		return mv;
	}
}
