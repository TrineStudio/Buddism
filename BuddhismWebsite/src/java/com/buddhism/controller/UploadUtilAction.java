/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.buddhism.controller;

import com.buddhism.model.Administrator;
import com.buddhism.model.Packet;
import com.buddhism.service.AVServiceImpl;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;
import java.util.Random;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionContext;
import org.apache.struts2.ServletActionContext;
import org.apache.struts2.interceptor.SessionAware;


/**
 *
 * @author EthanPan
 */
public class UploadUtilAction extends ActionSupport implements SessionAware{
    
    private Map session;
    
    private AVServiceImpl avService;
    
    private File fileupload; //和JSP中input标记name同名 
    
    //Struts2拦截器获得的文件名,命名规则，File的名字+FileName 
    //如此处为 'fileupload' + 'FileName' = 'fileuploadFileName' 
    private String fileuploadFileName; //上传来的文件的名字
    private String imgfilePath;
   
    private int mediaType;
    
    @Override
    public void setSession(Map session) {   
  
       this.session = session;     
    }
    
    public File getFileupload() {
        return fileupload;
    }

    public void setFileupload(File fileupload) {
        this.fileupload = fileupload;
    }

    public String getFileuploadFileName() {
        return fileuploadFileName;
    }

    public void setFileuploadFileName(String fileuploadFileName) {
        this.fileuploadFileName = fileuploadFileName;
    }

    public String getImgfilePath() {
        return imgfilePath;
    }

    public void setImgfilePath(String imgfilePath) {
        this.imgfilePath = imgfilePath;
    }


    
    
    @Override
    public String execute() throws FileNotFoundException, IOException 
    {
        String extName = ""; //保存文件拓展名 
        SimpleDateFormat sDateFormat;
        Random r = new Random();
        
        
        //生成随机文件名：当前年月日时分秒+五位随机数（为了在实际项目中防止文件同名而进行的处理）   
        int rannum = (int) (r.nextDouble() * (99999 - 10000 + 1)) + 10000; //获取随机数 
        
        sDateFormat = new SimpleDateFormat("yyyyMMddHHmmss"); //时间格式化的格式 
        
        
        
        //获取拓展名 
        if (fileuploadFileName.lastIndexOf(".") >= 0) {
            extName = fileuploadFileName.substring(fileuploadFileName.lastIndexOf("."));
        }
        
        String path = "";
        
        if (mediaType == 0)
            path = "/media/photos/image/";        
        else if (mediaType == 1)
            path = "/media/videos/video/";
        
        String filename = sDateFormat.format(new Date()) +"_"+rannum + extName;
        File folder = new File(ServletActionContext.getServletContext().getRealPath(path));
        if (!folder.exists())  
            folder.mkdirs();  
       
        File outFile = new File(ServletActionContext.getServletContext().getRealPath(path+filename));  
        FileOutputStream outStream = new FileOutputStream(outFile);  
        FileInputStream inStream = new FileInputStream(fileupload);  
        
        byte[] buffer = new byte[1024];  
        
        int l = 0;  
        
        while ((l = inStream.read(buffer)) > 0) 
        {  
            outStream.write(buffer, 0, l);  
        }  
        
        inStream.close();  
        outStream.close();  
        setImgfilePath(ServletActionContext.getRequest().getContextPath()+path+filename);
        
        ActionContext ctx = ActionContext.getContext();       

        HttpServletRequest request = (HttpServletRequest)ctx.get(ServletActionContext.HTTP_REQUEST);       
              
        int packetId = Integer.parseInt(request.getParameter("type"));
        
        // packetId 集合 ID imgfilePath URL Type为照片
        // TODO: 将照片添加到数据库的Media中
        
        //type=1代表的是添加照片
        
        String id = request.getParameter("admin");
        
        Administrator admin = new Administrator();
        
        admin.setId((short)Integer.parseInt(id));
        
        Packet packet = getAvService().getPacket(packetId);
        getAvService().addMedia(admin, packet, imgfilePath, mediaType, null, 0);
        return SUCCESS; //这里不需要页面转向，所以返回空就可以了 
        
    }

    /**
     * @return the avService
     */
    public AVServiceImpl getAvService() {
        return avService;
    }

    /**
     * @param avService the avService to set
     */
    public void setAvService(AVServiceImpl avService) {
        this.avService = avService;
    }

    /**
     * @return the mediaType
     */
    public int getMediaType() {
        return mediaType;
    }

    /**
     * @param mediaType the mediaType to set
     */
    public void setMediaType(int mediaType) {
        this.mediaType = mediaType;
    }

 
}
