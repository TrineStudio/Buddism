/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.buddhism.controller;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.config.entities.ResultConfig;
import com.opensymphony.xwork2.interceptor.Interceptor;
import java.util.Map;

/**
 *
 * @author Trine
 */
public class WebInfInterceptor implements Interceptor {
    private static String PathPrefix = "/WEB-INF/jsp/";
    private static final String LOCATION = "location";
    
    @Override
    public void destroy() {

    }

    @Override
    public void init() {
        if (PathPrefix.endsWith("/")) {
            PathPrefix = PathPrefix.substring(0, PathPrefix.length() - 1);
        }
    }

    @Override
    public String intercept(ActionInvocation arg0) throws Exception {

        Map map = arg0.getProxy().getConfig().getResults();

        for (java.util.Iterator iter = map.values().iterator(); iter.hasNext();) {
            ResultConfig rcg = (ResultConfig) iter.next();
            transferLocation(rcg);
        }

        return arg0.invoke();
    }

    public void transferLocation(ResultConfig rcg) {

        Map map = rcg.getParams();

        if (!map.containsKey(LOCATION)) {
            return;
        }

        // ////////////////////
        String location = (String) map.get(LOCATION);

        if (location.startsWith(PathPrefix)) {
            return;
        }

        if (!location.startsWith("/")) {
            location = "/" + location;
        }

        location = PathPrefix + location;

        map.put(LOCATION, location);
    }
}
