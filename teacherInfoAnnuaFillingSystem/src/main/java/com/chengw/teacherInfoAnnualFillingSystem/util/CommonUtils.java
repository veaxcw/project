package com.chengw.teacherInfoAnnualFillingSystem.util;

import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.beanutils.ConvertUtils;
import org.apache.commons.beanutils.converters.DateConverter;
import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

import javax.servlet.http.HttpServletRequest;
import java.io.*;
import java.lang.reflect.InvocationTargetException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author chengw
 */
public class CommonUtils {

    public static String filePath = "D:/veax/java_OOP/java_OOP/webssm-Project/demo-1/src/webapp/upload/";

    public static final int MEMORY_THRESHOLD = 1024*1024*3;
    public static final int MAX_FILE_SIZE = 1024*1024*30;
    public static final int MAX_REQUEST_SIZE = 1024*1024*50;

    /**首先解决使用设置表单属性enctype="multipart/form-data"之后传值问题**/
    public static Map<String,String> saveForm(HttpServletRequest request,String leafPath){
        Map<String,String> info = new HashMap<String, String>();//用来存储form表单中的数据

        DiskFileItemFactory diskFileItemFactory = new DiskFileItemFactory();

        diskFileItemFactory.setRepository(new File(System.getProperty("java.io.tmpdir")));//设置临时文件目录
        diskFileItemFactory.setSizeThreshold(CommonUtils.MEMORY_THRESHOLD);//设置临界内存值
        ServletFileUpload upload = new ServletFileUpload(diskFileItemFactory);
        upload.setSizeMax(CommonUtils.MAX_REQUEST_SIZE);//设置最大文件上传值
        upload.setFileSizeMax(CommonUtils.MAX_FILE_SIZE);//设置最大请求值
        upload.setHeaderEncoding("utf-8");

        String uploadPath = CommonUtils.filePath + leafPath;//设置文件目录
        File uploadDir = new File(uploadPath);
        if(!uploadDir.exists())
            uploadDir.mkdirs();

        try {
            List<FileItem> fileItems = upload.parseRequest(request);
            for(FileItem fileItem:fileItems){
                if(fileItem.isFormField()){//判断表单是普通类型还是文件类型
                    info.put(fileItem.getFieldName(),fileItem.getString("UTF-8"));
                }else{//文件类型则读取文件
                    try {
                        String fileName = new File(fileItem.getName()).getName();
                        String filePath = uploadPath + File.separator + fileName;
                        File storeFile = new File(filePath);
                        fileItem.write(storeFile);
                        info.put("rpath",storeFile.getAbsolutePath());
                    } catch (Exception e) {
                        e.printStackTrace();
                    }

                }
            }
        } catch (FileUploadException e) {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }

        return info;
    }


    public  static <T> T toBean(Map map,Class<T> clazz){//将map中的数据分装到对象中区
        try {
            T bean = clazz.newInstance();
            ConvertUtils.register(new DateConverter(),java.util.Date.class);
            BeanUtils.populate(bean,map);
            return bean;
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }

        return null;
    }

    public static String getCode(String httpUrl){
        String code = "";
        try {
            InputStream in;
            URL url =  new URL(httpUrl);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.connect();
            in = connection.getInputStream();
            InputStreamReader inputStreamReader =  new InputStreamReader(in);
            BufferedReader reader = new BufferedReader(inputStreamReader);

        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return code;
    }

    public static synchronized void writeHtml(String filePath,String info){

        PrintWriter writer = null;
        try {
            File file = new File(filePath);
            boolean isExist = file.exists();
            if(isExist != true){
                file.createNewFile();
            }else{
                if(!"NO".equals(file)){
                    file.delete();
                    file.createNewFile();
                }
            }
            writer = new PrintWriter(new FileOutputStream(file, true));
            writer.print(info);
            writer.close();
        } catch (Exception e) {
            e.printStackTrace();
        }finally{
            writer.close();
        }


}
}
