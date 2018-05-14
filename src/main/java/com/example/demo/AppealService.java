package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by xiaodm on 2018/5/2.
 */
@Service
public class AppealService {

    @Value("${Appeal.preName}")
    String AppealPreName;

    List<Appeal> appeals = new ArrayList<>();
//    SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    public List<Appeal> getAppeals(){
        List<Appeal> list =new ArrayList<>();
        for (int id = 0; id < 10; ++id) {

            Appeal appeal = new Appeal();
            appeal.setId(id);
            appeal.setAddr(AppealPreName+" addr"+id);
            appeal.setTel(AppealPreName+" Tel"+id);
            appeal.setAppealName(AppealPreName+ "Name"+id);
            appeal.setAppealTime(new Date());
            list.add(appeal);
        }
        return list;
    }
}
