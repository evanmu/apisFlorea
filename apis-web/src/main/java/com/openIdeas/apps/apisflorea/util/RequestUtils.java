package com.openIdeas.apps.apisflorea.util;

import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.collections.MapUtils;

public class RequestUtils {
    /**
     * 功能描述: <br>
     * 转换request参数map
     * 
     * @param request
     * @return
     */
    @SuppressWarnings("unchecked")
    public static Map<String, String> getParameters(HttpServletRequest request) {
        Map<String, String> map = new HashMap<String, String>();
        if (MapUtils.isNotEmpty(request.getParameterMap())) {
            Enumeration<String> item = request.getParameterNames();
            while (item.hasMoreElements()) {
                String paramName = item.nextElement();
                String paramValue = request.getParameter(paramName);
                // 形成键值对应的map
                map.put(paramName, paramValue);
            }
        }
        return map;
    }
}
