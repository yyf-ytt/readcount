package com.yyf.read;

import org.apache.http.client.fluent.Request;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by andy on 2015/8/3 0003.
 */
public class ReloadHTML {

    public static void main(String[] args) {
        try {
            //String[] forStr = new String[11];
            //forStr[0] = "http://club.sh.sohu.com/nanjing/thread/3dyxasgjoj8";
            //forStr[1] = "http://www.xici.net/d220258043.htm";
            //forStr[2] = "http://bbs.tianya.cn/post-306-87166-1.shtml";
            //forStr[3] = "http://r.club.china.com/xx.do?event=VIEWUNCHECKTHREAD&forumid=312393761&messageid=354706685&threadid=277993369";
        //ok    //forStr[4] = "http://bbs.local.163.com/bbs/localjs/569473012.html";
            //forStr[5] = "http://nanjing.19lou.com/forum-938-thread-118781438680922961-1-1.html";
        //ok    //forStr[6] = "http://bbs.njrx.cc/forum.php?mod=viewthread&tid=302541&extra=";
            //forStr[7] = "http://itbbs.pconline.com.cn/market/52405759.html";
            //forStr[8] = "http://xiaozu.renren.com/xiaozu/620004368/thread/362386320";
            //forStr[9] = "http://bbs.lohjs.com/thread-192099-1-1.html";
            //forStr[10] = "http://www.hainei.org/thread-2306643-1-1.html";
            //forStr[0] = "http://club.sh.sohu.com/nanjing/thread/3egii3dja8v?qq-pf-to=pcqq.c2c";
            //forStr[0] = "http://www.xici.net/d220495643.htm";
            //forStr[0] = "http://www.xici.net/d220495865.htm";
            //forStr[0] = "http://bbs.ifeng.com/viewthread.php?tid=19838512&extra=page%3D1";
            SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            //for (int i = 0; i < forStr.length; i++) {
                /*if(null == forStr[i]){
                    continue;
                }*/
                int s = Integer.parseInt(args[0]);
                int count = 0;
                System.out.println(args[1] + "\n开始" + sf.format(new Date()));
                long begin = System.currentTimeMillis();
                while (--s > 0) {
                    if(s % 100 == 0){
                        System.out.print("已执行" + (count += 100) + "次-");
                    }
                    Request.Get(args[1]).execute().returnContent();
                }
                System.out.println("\n" + sf.format(new Date()));
                System.out.println(args[1] + "\n" + "共耗时：" + (System.currentTimeMillis() - begin) / 1000 + "秒");
            //}

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
