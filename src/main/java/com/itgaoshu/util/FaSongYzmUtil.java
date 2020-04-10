package com.itgaoshu.util;

import com.aliyuncs.CommonRequest;
import com.aliyuncs.CommonResponse;
import com.aliyuncs.DefaultAcsClient;
import com.aliyuncs.IAcsClient;
import com.aliyuncs.exceptions.ClientException;
import com.aliyuncs.exceptions.ServerException;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.profile.DefaultProfile;

public class FaSongYzmUtil {
    public static boolean faSong(String phoneNumber,String yzm,int flag) {
        DefaultProfile profile = DefaultProfile.getProfile("cn-hangzhou", "LTAI4FqWyoycciemXWqBeHtC", "h8dCnVSwXrESUMqnflUMOtMfloDNVO");
        IAcsClient client = new DefaultAcsClient(profile);

        CommonRequest request = new CommonRequest();
        request.setMethod(MethodType.POST);
        request.setDomain("dysmsapi.aliyuncs.com");
        request.setVersion("2017-05-25");
        request.setAction("SendSms");
        request.putQueryParameter("RegionId", "cn-hangzhou");
       //接收验证码的手机号
        request.putQueryParameter("PhoneNumbers", "phoneNum");
        //签名
        request.putQueryParameter("SignName", "高数");
        //发送验证码
        request.putQueryParameter("TemplateParam","{\"code\":\""+yzm+"\"}");
        if(flag==1){ //注册
            //登录或注册的模板编码
            request.putQueryParameter("TemplateCode", "SMS_187561112");
        }else{ //登录
            //登录或注册的模板编码
            request.putQueryParameter("TemplateCode", "SMS_187591076");
        }
        try {
            CommonResponse response = client.getCommonResponse(request);
            System.out.println(response.getData());
        } catch (ServerException e) {
            e.printStackTrace();
        } catch (ClientException e) {
            e.printStackTrace();
        }
        return false;
    }


}


