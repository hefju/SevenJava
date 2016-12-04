package com.gage.utils;

import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * Created by rush on 2016/12/4.
 */
public class Json {
    /**
     * 返回json数据
     * @param object
     * @return
     */
    public static String jsonOut(Object object){

        System.out.println("进入jsonOut");
        ObjectMapper objectMapper=new ObjectMapper();
        try {
            String jsonString=objectMapper.writeValueAsString(object);
            System.out.println("jsonString:"+jsonString);
//            HttpServletResponse response=ServletActionContext.getResponse();
//            response.setContentType("text/json;charset=UTF8");
//            response.getWriter().print(jsonString);
            return jsonString;
        } catch (Exception e) {
            System.out.println("出错啦.");
            e.printStackTrace();
        }
        return null;
    }

}
