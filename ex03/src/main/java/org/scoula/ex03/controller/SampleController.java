package org.scoula.ex03.controller;

import lombok.extern.log4j.Log4j2;
import org.scoula.ex03.dto.SampleDTO;
import org.scoula.ex03.dto.SampleDTOList;
import org.scoula.ex03.dto.TodoDTO;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.*;

@Controller
@RequestMapping("/sample")
@Log4j2
public class SampleController {

    @RequestMapping("") // url: /sample
    public void basic() {
        log.info("basic............");
    }

    @RequestMapping(value = "/basic", method = {RequestMethod.GET, RequestMethod.POST})// url: /sample/basic
    public void basicGet() {
        log.info("basic get............");
    }

    @GetMapping("basicOnlyGet") // url:/ basicOnlyGet
    public void basicGet2() {
        log.info("basic get only get............");
    }

    @GetMapping("/ex01")
    public String ex01(SampleDTO dto) {
        log.info("" + dto);
        return "ex01";
    }

    @GetMapping("/ex02")
    public String ex02(@RequestParam("name") String name, @RequestParam("age") int age) {
        log.info("name: " + name);
        log.info("age: " + age);
        return "ex02";
    }

    @GetMapping("/ex02List")
    public String ex02List(@RequestParam("ids") ArrayList<String> ids) {
        log.info("ids: " + ids);
        return "ex02List";
    }

    @GetMapping("/ex02Array")
    public String ex02Array(@RequestParam("ids") String[] ids) {
        log.info("array ids: " + Arrays.toString(ids));
        return "ex02Array";
    }

    @GetMapping("/ex02Bean")
    public String ex02Bean(SampleDTOList list) {
        log.info("list dtos: " + list);
        return "ex02Bean";
    }

    @GetMapping("/ex03")
    public String ex03(TodoDTO todo) {
        log.info("todo : " + todo);
        return "ex03";
    }


    /*
    Model
    - 컨트롤러가 View로 데이터를 전달할 때 사용하는 객체 (key - Value) -> 직관적, 역할 분리

    ModelAndView
    - 데이터와 이동할 View 이름을 같이 반환
     */


    @GetMapping("/ex04")
    public String ex04(SampleDTO dto, @ModelAttribute("page") int page) {
        log.info("dto :" + dto);
        log.info("page: " + page);

        return "sample/ex04";

    }

    @GetMapping("/ex05")
    public void ex05() {
        log.info("/ex05........");
    }


    /*
    RedirectAttribute
    - 리다이렉트시 데이터를 임시로 전달

    Redirect
    - Return에 prefix로 [ redirect:리다이렉트 시킬 경로 ] 표시 해놓으면 redirect

     */
    @GetMapping("/ex06")
    public String ex06(RedirectAttributes ra) {
        log.info("/ex06........");
        ra.addAttribute("name", "AAA");
        ra.addAttribute("age", 10);

        return "redirect:/sample/ex06-2";
    }


    /*
    @RequestBody
    - 클라이언트가 보낸 Json 형식의 데이터를 자바 객체로 변환(역직렬화)
     */
    @GetMapping("/ex07")
    public @ResponseBody SampleDTO ex07() {
        log.info("/ex07........");

        SampleDTO dto = new SampleDTO();
        dto.setAge(10);
        dto.setName("홍길동");

        return dto;
    }

    @GetMapping("ex08")
    public ResponseEntity<String> ex08() {
        log.info("/ex08..........");

        // {"name": "홍길동"}
        String msg = "{\"name\": \"홍길동\"}";

        HttpHeaders header = new HttpHeaders();
        header.add("Content-Type", "application/json;charset =UTF-8");

        return new ResponseEntity<>(msg, header, HttpStatus.OK);
    }


    //MultipartResolver -> 이미지, 영상 multipart.form-data 오는 데이터를 처리하는 Resolver
    // Bean으로 등록하기

    @PostMapping("/exUploadPost")
    public void exUploadPost(ArrayList<MultipartFile> files) {
        for (MultipartFile file : files) {
            log.info("----------------------------------");
            log.info("name:" + file.getOriginalFilename()); // 윈도우 OS: 한글 파일명인 경우 깨짐
            log.info("size:" + file.getSize());
        }
    }
}