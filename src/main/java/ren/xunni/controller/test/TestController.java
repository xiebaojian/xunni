package ren.xunni.controller.test;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by xiebj on 2017/4/5.
 */
@Controller
@RequestMapping("test")
public class TestController {

    @RequestMapping("hello/{name}")
    public String hello(@PathVariable("name") String name, Model model){
        model.addAttribute("name",name);
        return "test/hello";
    }

    @RequestMapping("/json")
    @ResponseBody
    public Map<String,Object> json(){
        Map<String,Object> map = new HashMap<String,Object>();
        map.put("name","Flyat");
        map.put("age","25");
        map.put("gender","男");
        return map;
    }

}
