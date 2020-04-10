package com.itgaoshu.util;


public class ShengChengYzmUtil {
    /**
     * 随机生成六位验证码
     * @return
     */
    public static String getYzm(){
       String yzm="";
       for(int i=1;i<6;i++){
           yzm+=Math.floor(Math.random()*10);
       }
       return yzm;
    }
}
