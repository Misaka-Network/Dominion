package com.misaka.network.dominion.web.utils;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Luhaijie on 2018/2/12.
 */
public class HttpHelper {

    public static Map<String, String> spiltHttpParams(String uriQuery) {
        Map<String, String> result = new HashMap<String, String>();
        String[] params = uriQuery.split("&");
        for (String param : params) {
            String[] keyValue = param != null ? param.split("=") : new String[0];
            if (keyValue.length == 2)
                result.put(keyValue[0], keyValue[1]);
        }
        return result;
    }

}
