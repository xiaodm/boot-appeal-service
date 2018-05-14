package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by xiaodm on 2018/5/2.
 */
@RestController
public class AppealController {
    @Autowired
    AppealService appealService;

    Logger log = LoggerFactory.getLogger(AppealController.class);

    @RequestMapping("/appeals")
    public List<Appeal> getAppealList() {
        log.info("start to getAppealList");
        return appealService.getAppeals();
    }

}
