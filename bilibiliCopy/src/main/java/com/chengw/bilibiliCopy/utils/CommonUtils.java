package com.bilibili.main.utils;

import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.beanutils.ConvertUtils;
import org.apache.commons.beanutils.converters.DateConverter;
import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class CommonUtils {

    public static final StringBuffer FILE_ROOT_PATH = new StringBuffer("D:/veax//java_OOP/java_OOP/webssm-Project/demo-2/bilibili/src/webapp/");
    public static final StringBuffer FILE_RELATIVE_PATH = new StringBuffer("static/userIconUploadDir/");

    public static <T> T toBean(Map map,Class<T> clazz){//讲form表单转华为对象。

        try {
            T bean = clazz.newInstance();
            ConvertUtils.register(new DateConverter(),java.util.Date.class);
            BeanUtils.populate(bean,map);
            return bean;
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
        }

        return null;

    }

    public static String uploadFile(HttpServletRequest request){


        DiskFileItemFactory fileItemFactory = new DiskFileItemFactory();
        fileItemFactory.setSizeThreshold(1024*1024*10);
        File repositoryPath = new File(System.getProperty("java.io.tmpdir"));//临时路径

        if(!repositoryPath.exists())
            repositoryPath.mkdirs();

        ServletFileUpload upload = new ServletFileUpload(fileItemFactory);
        upload.setFileSizeMax(1024*1024*10);
        upload.setSizeMax(1024*1024*2);
        upload.setHeaderEncoding("UTF-8");

        File uploadPath = new File(FILE_ROOT_PATH.append(FILE_RELATIVE_PATH).toString());
        if(!uploadPath.exists())
            uploadPath.mkdirs();
        try {
            List<FileItem> fileItems = upload.parseRequest(request);
            Iterator<FileItem> iterator = fileItems.iterator();
            while (iterator.hasNext()){
                FileItem fileItem = iterator.next();
                if(!fileItem.isFormField()){
                    String fileName = new File(fileItem.getName()).getName();
                    String filePath = FILE_ROOT_PATH + File.separator + fileName;
                    File file = new File(filePath);
                    fileItem.write(file);

                    return FILE_RELATIVE_PATH.append(fileName).toString();
                }

            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return  null;

    }



}
