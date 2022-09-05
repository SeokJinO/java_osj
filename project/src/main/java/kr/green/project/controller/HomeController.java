package kr.green.project.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import kr.green.project.service.MemberService;
import kr.green.project.vo.MemberVO;

@Controller
public class HomeController {

	@Autowired
    MemberService memberService;
	
	@RequestMapping(value= "/", method=RequestMethod.GET)
	public ModelAndView home(ModelAndView mv){
	    mv.setViewName("/main/home");
	    return mv;
	}
	@RequestMapping(value= "/login", method=RequestMethod.GET)
	public ModelAndView loginGet(ModelAndView mv, HttpServletRequest request){
		String url = request.getHeader("Referer");
		//로그인 화면을 url을 직접 입력하지 않고, url에 /login이 없으면 => 돌아가야할 url이 있으면
		if(url != null && !url.contains("/login"))
			request.getSession().setAttribute("redirectURL", url);
	    mv.setViewName("/main/login");
	    return mv;
	}
	@RequestMapping(value= "/login", method=RequestMethod.POST)
	public ModelAndView loginPost(ModelAndView mv, MemberVO member){
		MemberVO user = memberService.login(member);
		System.out.println(user);
		if(user != null)
			mv.setViewName("redirect:/");
		else
			mv.setViewName("redirect:/login");
		mv.addObject("user", user);
		mv.setViewName("/main/home");
	    return mv;
	}
	@RequestMapping(value= "/signup", method=RequestMethod.GET)
	public ModelAndView signupGet(ModelAndView mv){
	    mv.setViewName("/main/signup");
	    return mv;
	}
	@RequestMapping(value= "/signup", method=RequestMethod.POST)
	public ModelAndView signupPost(ModelAndView mv, MemberVO member){
	    mv.setViewName("redirect:/");
	    System.out.println(member);
	    MemberVO dbMember = memberService.signUp(member);
	    return mv;
	}
	@RequestMapping(value= "/logout", method=RequestMethod.GET)
	public ModelAndView logoutGet(ModelAndView mv, HttpServletRequest request, HttpServletResponse response){
		memberService.logout(request, response);
	    mv.setViewName("redirect:/");
	    return mv;
	}
	
}
