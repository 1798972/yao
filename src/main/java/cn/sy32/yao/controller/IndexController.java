package cn.sy32.yao.controller;

import org.springframework.stereotype.Controller;

/**
 * @Author Yiang37
 * @Date 2020/3/28 20:01
 * Description:
 */

@Controller
public class IndexController {

    public String toIndex(){
        return "/";
    }
}