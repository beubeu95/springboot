package com.team36.controller;

import com.team36.dto.MemberJoinDTO;
import com.team36.service.MemberService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.security.Principal;

@Log4j2
@Controller
@RequiredArgsConstructor
public class MemberController {

    private final MemberService memberService;

    @GetMapping("/join")
    public String joinGET(Model model){
        log.info("join get...");
        model.addAttribute("MemberJoinDTO", new MemberJoinDTO());
        return "member/join";
    }

    @PostMapping("/join")
    public String joinPOST(MemberJoinDTO memberJoinDTO, RedirectAttributes redirectAttributes){
        log.info("join post...");
        log.info(memberJoinDTO);
        try {
            memberService.join(memberJoinDTO);
        } catch (MemberService.MidExistException e) {

            redirectAttributes.addFlashAttribute("error", "mid");
            return "redirect:/join";
        }
        redirectAttributes.addFlashAttribute("result", "success");
        return "redirect:/login"; //회원 가입 후 로그인
    }

    @GetMapping("/login")
    public String loginGet(){
        log.info("/login get ...........");
        return "member/login";
    }

}