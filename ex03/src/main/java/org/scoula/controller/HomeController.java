package org.scoula.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@Slf4j
public class HomeController {
    // String -> ViewSolver 환성
    // void 변환 타입일 경우 요청 URL 기준으로 뷰 이름을 추론

    /*
    ModelAttribute
    -> 요청 파라미터를 자바 객체에 바인딩하는 역할
    - 객체의 Setter를 통해 값이 주입됨
    - 생략 가능
     */
    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("name", "홍길동");

        return "index"; // View의 이름, forward
    }

}
