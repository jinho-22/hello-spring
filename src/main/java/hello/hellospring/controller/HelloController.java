package hello.hellospring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

    @GetMapping("hello")
    public String hello(Model model){
        model.addAttribute("data","hello!!" );
        return "hello";
    }

    @GetMapping("hello-mvc")
    public String HelloMvc(@RequestParam("name") String name, Model model){
        model.addAttribute("name", name);
        return "hello-template";
    }
//    http://localhost:8080/hello-mvc?name=Spring!!!


    @GetMapping("hello-string")
    @ResponseBody //http body부분에 아래데이터를 직접넣어준다는 내용
    public String helloString(@RequestParam("name ") String name){
        return "hello" + name;
    }
}
