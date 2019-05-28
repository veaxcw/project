package com.chengw.teacherInfoAnnualFillingSystem.util;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.nio.file.Path;

/**
 * @author chengw
 */
public class JspToHtmlUtil extends HttpServlet {


    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        HttpSession session = req.getSession();
        String url = "";
        String name = "";
        ServletContext context = session.getServletContext();

        String fileName = req.getParameter("file_name");
        String realName = req.getParameter("realName");
        String path =  req.getParameter("path");
        String realPath = req.getParameter("realPath");

        if(realName == null || realName == ""){
            int a = 0;
            a = fileName.indexOf("=") + 1;
            realName = fileName.substring(a);
            if(realName.indexOf(".") > 0){
                realName = fileName.substring(0,fileName.indexOf("."));
            }
        }
        if (path == null || path.equals("")) {
            url = "/" + fileName;
        } else {
            url = "/" + path + "/" + fileName;
        }

        if (realPath == null || realPath.equals("") ) {
            if (path == null || path.equals("") ) {
                // 这是生成的html文件名,如index.htm.说明： ConfConstants.CONTEXT_PATH为你的上下文路径。
                name = session.getServletContext().getRealPath("") + File.separator + realName + ".html";
            } else {
                // 这是生成的html文件名,如index.html
                name = session.getServletContext().getRealPath("") + File.separator + path + File.separator
                        + realName + ".html";

            }

        } else {
            // 这是生成的html文件名,如index.html
            name = session.getServletContext().getRealPath("") + File.separator + realPath + File.separator
                    + realName + ".html";
        }

        // 访问请求的页面，并生成指定的文件。
        RequestDispatcher rd = context.getRequestDispatcher(url);

        final ByteArrayOutputStream os = new ByteArrayOutputStream();

        final ServletOutputStream stream = new ServletOutputStream() {
            @Override
            public boolean isReady() {
                return false;
            }
            @Override
            public void setWriteListener(WriteListener writeListener) {

            }
            @Override
            public void write(byte[] data, int offset, int length) {
                os.write(data, offset, length);

            }
            @Override
            public void write(int b) throws IOException {

                os.write(b);

            }

        };

        final PrintWriter pw = new PrintWriter(new OutputStreamWriter(os));
        HttpServletResponse rep = new HttpServletResponseWrapper(resp) {

            @Override
            public ServletOutputStream getOutputStream() {
                return stream;
            }

            @Override
            public PrintWriter getWriter() {

                return pw;

            }

        };
        //response的编码为gbk防乱码
        rep.setCharacterEncoding("utf-8");

        rd.include(req, rep);

        pw.flush();
        // 把jsp输出的内容写到xxx.html
        FileOutputStream fos = new FileOutputStream(name);
        os.writeTo(fos);
        fos.close();
    }



}
