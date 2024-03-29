package kr.green.springtest.service;

import java.util.ArrayList;

import org.springframework.web.multipart.MultipartFile;

import kr.green.springtest.pagination.Criteria;
import kr.green.springtest.vo.BoardVO;
import kr.green.springtest.vo.CommentVO;
import kr.green.springtest.vo.FileVO;
import kr.green.springtest.vo.LikesVO;
import kr.green.springtest.vo.MemberVO;

public interface BoardService {

	ArrayList<BoardVO> getBoardList(Criteria cri);

	BoardVO getBoard(int bd_num);

	void updateViews(int bd_num);

	void insertBoard(BoardVO board, MemberVO user, MultipartFile[] files);

	void updateBoard(BoardVO board, MemberVO user, MultipartFile[] files, int[] nums);

	void deleteBoard(int bd_num, MemberVO user);

	int getTotalCount(Criteria cri);

	String getLikesState(LikesVO likes, MemberVO user);

	LikesVO getLikes(int bd_num, MemberVO user);

	boolean insertComment(CommentVO comment, MemberVO user);

	ArrayList<CommentVO> getCommentList(int bd_num, Criteria cri);

	int getCommentTotalCount(int bd_num);

	boolean deleteComment(CommentVO comment, MemberVO user);

	boolean updateComment(CommentVO comment, MemberVO user);

	ArrayList<FileVO> getFileList(int bd_num);

	String uploadImg(MultipartFile file);

}