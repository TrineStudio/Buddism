/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.buddhism.controller;

import com.buddhism.service.AVService;
import com.buddhism.service.postService;
import com.opensymphony.xwork2.ActionSupport;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

/**
 *
 * @author GodBlessedMay
 */
public class AdminIndex extends ActionSupport {
    
    private postService pService;
    private AVService avService;
    
    private List<String> postNumbers;
    private List<String> avNumbers;
    private List<String> month;
    
    private String currentYear;
    
    public List<String> getMonth() {
        return month;
    }

    public void setMonth(List<String> month) {
        this.month = month;
    }
    
    private String[] months = {"一月", "二月", "三月", "四月", "五月", "六月", "七月", "八月", "九月", "十月", "十一月", "十二月"};

    public List<String> getPostNumbers() {
        return postNumbers;
    }

    public void setPostNumbers(List<String> postNumbers) {
        this.postNumbers = postNumbers;
    }

    public List<String> getAvNumbers() {
        return avNumbers;
    }

    public void setAvNumbers(List<String> avNumbers) {
        this.avNumbers = avNumbers;
    }

    public String getCurrentYear() {
        return currentYear;
    }

    public void setCurrentYear(String currentYear) {
        this.currentYear = currentYear;
    }



    public postService getpService() {
        return pService;
    }

    public void setpService(postService pService) {
        this.pService = pService;
    }

    public AVService getAvService() {
        return avService;
    }

    public void setAvService(AVService avService) {
        this.avService = avService;
    }       
    
    public AdminIndex() {
    }
    
    public String execute() throws Exception {
        
        month =  new ArrayList<String>();
        postNumbers = new ArrayList<String>();
        avNumbers = new ArrayList<String>();
        
        getData();
        
        return "SUCCESS";
    }
    
    private void getData()
    {
        //请注意一下这里的日期格式
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Calendar cal = Calendar.getInstance();
        
        List<String> tempMonth = new ArrayList<String>();
        
        currentYear = Integer.toString(cal.get(Calendar.YEAR));
        
        for (int i = 0; i != 6; i++)
        {
            tempMonth.add(months[cal.get(Calendar.MONTH)]);
            String start = sdf.format(cal.getTime());            
            cal.add(Calendar.MONTH, -1);
            String end = sdf.format(cal.getTime());
            
            postNumbers.add(Integer.toString(pService.getPostBetweenAnd(start, end)));
            // avNumbers.add(avService.getMediaBetweenAnd());
        }
        
        for (int i = tempMonth.size() - 1; i != -1; i--)
            month.add(tempMonth.get(i));
        
        
    }
}
