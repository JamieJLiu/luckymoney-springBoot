package com.imooc.luckymoney;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

@RestController
@RequestMapping("/hello")
public class HelloController {
    @Autowired
    private LimitConfig limitConfig;

    @GetMapping("/say/{id}")
    public String say(@PathVariable("id") Integer id) {
//      return "说明：" + limitConfig.getDescription();
        return "id: " + id;
    }

}
