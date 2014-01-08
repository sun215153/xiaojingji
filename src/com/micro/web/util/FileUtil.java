package com.micro.web.util;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

import javax.imageio.ImageIO;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.apache.log4j.Logger;
import org.csource.common.MyException;
import org.csource.common.NameValuePair;
import org.csource.fastdfs.ClientGlobal;
import org.csource.fastdfs.StorageClient1;
import org.csource.fastdfs.StorageServer;
import org.csource.fastdfs.TrackerClient;
import org.csource.fastdfs.TrackerServer;

import com.sun.image.codec.jpeg.JPEGCodec;
import com.sun.image.codec.jpeg.JPEGImageEncoder;
/**
 * 用于上传文件、下载的工具类
 */
public class FileUtil {

	private static Logger logger = Logger.getLogger(FileUtil.class);
	public static String DOWNLOAD_ERROR = "<script>downloadError()</script>"; //下载失败回调函数
	public static String CALLBACK_ERROR  = "<script>parent.callback('error')</script>"; //上传回调函数
	public static String CALLBACK_MISTAKE ="<script>parent.callback('mistake')</script>"; //下载失败回调函数 ;
	public static String CALLBACK_MISTAKE_TYPE ="<script>parent.callback('type')</script>"; //下载失败回调函数 ;
	public static String CALLBACK_MISTAKE_NULL = "<script>parent.callback('nullvalue')</script>";//无上传文件
	public static String CALLBACK_SUCCESS  = "<script>parent.callback('success')</script>"; //上传回调函数
	public static String WEB_PATH ="/FileItem/";
	public static final String CALLBACK_MISTAKE_NULL_PIC = "<script>parent.callback('picnull')</script>";
	public static final String CALLBACK_MISTAKE_PIC = "<script>parent.callback('mistakepic')</script>";
	public static final  String  CALLBACK_MISTAKE_TYPE_PIC = "<script>parent.callback('mistakepictype')</script>";
	private static int maxPostSize = 100 * 1024 * 1024; 
	/**
	 * 
	 * @param in   输入流
	 * @param name 文件名字
	 * @param type 文件类型
	 * @param path 文件路径
	 * @return UUID，文件临时名字
	 * @throws IOException 
	 */
	public static void upload(InputStream in, String name, String type,
			String path) throws IOException {
		try {
			BufferedOutputStream out =null;
			File file = new File(path);
			System.out.println(path);
			if(!file.exists()){
				file.mkdirs();
			}
			in = new BufferedInputStream(in);
			out= new BufferedOutputStream(new FileOutputStream(file+"\\"+name+"."+type));
			int i ;
			while(!((i=in.read()) == -1)){
				out.write(i);
			}
			in.close();
			out.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	public static void upload(File filedata, String name, String type,
			String path) throws IOException {
		try {
			BufferedOutputStream out =null;
			BufferedInputStream in = null;
			File file = new File(path); 
			System.out.println(path);
			if(!file.exists()){
				file.mkdirs();
			}
			in = new BufferedInputStream( new FileInputStream(filedata));
			out= new BufferedOutputStream(new FileOutputStream(file+"\\"+name+"."+type));
			int i ;
			while(!((i=in.read()) == -1)){
				out.write(i);
			}
			in.close();
			out.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	
	public static String getFilePath(String path) {
		//F:\ZW_Workspace\elipse_workspace\.metadata\.plugins\org.eclipse.wst.server.core\tmp0\wtpwebapps\gpms-web\FileItemHeadImage\2013\01\sam123 (系统找不到指定的路径。)
		Date date = new Date();
		SimpleDateFormat format = new SimpleDateFormat("yyyy/MM");
		return   path+"/"+format.format(date)+"/";
	}
	
	public static String getUUID(){
		return UUID.randomUUID().toString();
	}

	public static void downloadDefault(String path, HttpServletResponse response){
		try {
			 BufferedInputStream in = null;
			 response.reset();
	         response.setHeader("Cache-Control", "no-cache");
	         response.setContentType("application/octet-stream");
			 File file = new File(path);
			 in = new BufferedInputStream(new FileInputStream(file));
			 ServletOutputStream out = response.getOutputStream();
			 Long l = new Long(file.length());
	         int length = l.intValue();
	         int k = 0;
	         int i = 65000;
	         byte byteArry[] = new byte[i];
	         while (k < length) {
	             int j =in.read(byteArry, 0, i);
	             k += j;
	             out.write(byteArry, 0, j);
	         }
	         in.close();
	         out.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	
	}
		
	
	public static void download(String remotePath, HttpServletResponse response){
		try {
			 response.reset();
	         response.setHeader("Cache-Control", "no-cache");
	         response.setContentType("application/octet-stream");
	 //        response.setCharacterEncoding("UTF-8"); 
	 //        filename = URLEncoder.encode(filename, "UTF-8"); 
	         response.setHeader("Content-disposition", "attachment;filename=img.jpg");
	         URL url = new URL(remotePath);
	         URLConnection connection = url.openConnection();
	         InputStream  in = connection.getInputStream();
			 ServletOutputStream out = response.getOutputStream();
			/* String path = VersionManager.getInstance().getValueByKey("name.server.in");
			  if(in.available() ==0){
				  in = new FileInputStream(path+"/"+"image/home/wutu.jpg");
			  }*/
			 byte[] b = new byte[8192];
			 while(in.read(b,0,b.length)>0){
				 out.write(b);
			 }
	         in.close();
	         out.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	
	}
	
	
	
	public static void download(String path,String filename, HttpServletResponse response){
		try {
			 BufferedInputStream in = null;
			 response.reset();
	         response.setHeader("Cache-Control", "no-cache");
	         response.setContentType("application/octet-stream");
	 //        response.setCharacterEncoding("UTF-8"); 
	//         filename = URLEncoder.encode(filename, "UTF-8"); 
	         response.setHeader("Content-disposition", "attachment;filename="+new String(filename.getBytes("gb2312"),"iso8859-1"));
			 File file = new File(path);
			 in = new BufferedInputStream(new FileInputStream(file));
			 ServletOutputStream out = response.getOutputStream();
			 Long l = new Long(file.length());
	         int length = l.intValue();
	         int k = 0;
	         int i = 65000;
	         byte byteArry[] = new byte[i];
	         while (k < length) {
	             int j =in.read(byteArry, 0, i);
	             k += j;
	             out.write(byteArry, 0, j);
	         }
	         in.close();
	         out.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	
	}
	
	public static void deleteFile(String path, String filename, String saveName, String filePath) {
		File file = new File(path+"\\"+filePath+"\\"+saveName);
		file.delete();
	}

	public static void deleteFile(String path) {
		try {
			File file = new File(path);
			file.delete();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public static void downloadCompressPic(String path, String filename,
			HttpServletResponse response, int width, int height) throws IOException {
		 response.reset();
         response.setHeader("Cache-Control", "no-cache");
         response.setContentType("application/octet-stream");
 //        response.setCharacterEncoding("UTF-8"); 
         filename = URLEncoder.encode(filename, "UTF-8"); 
         response.setHeader("Content-disposition", "attachment;filename="+filename);
		 File file = new File(path);
		 Image img = ImageIO.read(file);   
		 BufferedImage tag = new BufferedImage((int) width, (int) height, BufferedImage.TYPE_INT_RGB);
		 tag.getGraphics().drawImage(img.getScaledInstance(width, height, Image.SCALE_SMOOTH), 0, 0, null);
		 ServletOutputStream out = response.getOutputStream();
		 JPEGImageEncoder encoder = JPEGCodec.createJPEGEncoder(out);   
         encoder.encode(tag);   
         out.close();   
	}

	
    /** 
     * Upload File to DFS. 
     * @param fileBuff, file to be uploaded. 
     * @param uploadFileName, the name of the file. 
     * @param fileLength, the length of the file. 
     * @return the file ID in DFS. 
     * @throws IOException  
     */  
    public static String uploadFile(InputStream inStream, String uploadFileName) throws IOException {  
    	String fileId = "";  
        byte[] fileBuff = getFileBuffer(inStream);
        if (fileBuff == null || fileBuff.length <=0){
        	return "";
        }
        String fileExtName = "";  
        if (uploadFileName.contains(".")) {  
            fileExtName = uploadFileName.substring(uploadFileName.lastIndexOf(".") + 1);  
        } else {  
            logger.warn("Fail to upload file, because the format of filename is illegal.");  
            return fileId;  
        }  
        URL url = Thread.currentThread().getContextClassLoader().getResource("fdfs_client.conf");
		System.out.println("配置文件:" + url.getFile());
        try {
			ClientGlobal.init(url.getFile());
		} catch (MyException e1) {
			e1.printStackTrace();
		}
        //建立连接  
        TrackerClient tracker = new TrackerClient();  
        TrackerServer trackerServer = null;
        try{
        	trackerServer = tracker.getConnection();
        }catch(Exception e){
        	e.printStackTrace();
        }
        StorageServer storageServer = null;  
        StorageClient1 client = new StorageClient1(trackerServer, storageServer);  
      
      
        //设置元信息  
        NameValuePair[] metaList = new NameValuePair[3];  
        metaList[0] = new NameValuePair("fileName", uploadFileName);  
        metaList[1] = new NameValuePair("fileExtName", fileExtName);  
        metaList[2] = new NameValuePair("fileLength", String.valueOf(fileBuff.length));  
      
        String accessFileUrl = "";
        //上传文件  
        try {  
            fileId = client.upload_file1(fileBuff, fileExtName, metaList);
        } catch (Exception e) {  
        	e.printStackTrace();
            logger.warn("Upload file \"" + uploadFileName + "\"fails");  
        } 
        if (inStream != null){
        	inStream.close();
        }
        trackerServer.close();  
        return fileId;  
    }  
	
    /** 
     * Transfer java.io.InpuStream to byte array. 
     * @param inStream, input stream of the uploaded file. 
     * @param fileLength, the length of the file. 
     * @return the byte array transferred from java.io.Inputstream. 
     * @throws IOException occurred by the method read(byte[]) of java.io.InputStream. 
     */  
    private static byte[] getFileBuffer(InputStream inputStream) throws IOException {  
    	byte[] fileBuffer  = null;
		ByteArrayOutputStream swapStream = new ByteArrayOutputStream();
		byte [] buff = new byte[1024];
		int readNum = 0;
		try {
			while((readNum = inputStream.read(buff, 0, buff.length)) != -1){
				swapStream.write(buff, 0, readNum);
			}
			fileBuffer = swapStream.toByteArray();
		} catch (IOException e) {
			System.out.println("Read audio data error3");
		}
		return fileBuffer;
    }  
    
    public static String generatorAudioRes(long userid, int userType, String audioType){
		StringBuffer audioAddress = new StringBuffer();
		if (userType == 0){
			audioAddress.append("u");
		}else{
			audioAddress.append("d");
		}
		audioAddress.append(userid)
					.append(DateUtil.formatDate(new Date(), DateUtil.PATTERN_DATE))
					.append(UUIDUtil.generateUUID()+ "."+ audioType);
		return audioAddress.toString();
	}

    
    
	public static InputStream getInputStreamFromURL(String remoteURL) throws IOException {
		 URL url = new URL(remoteURL);
         URLConnection connection = url.openConnection();
         InputStream  in = connection.getInputStream();
		 return in;
	}
	
	
	
	/**
	 * 解析request中唯一的输入流
	 * @throws IOException 
	 */
	public static InputStream getInputStreamFromRequest(HttpServletRequest request,HttpServletResponse response) throws IOException{
		 request.setCharacterEncoding("UTF-8");  
		 response.setContentType("text/html; charset=UTF-8");  
		  DiskFileItemFactory factory = new DiskFileItemFactory();  
		  factory.setSizeThreshold(4096);  
		  ServletFileUpload upload = new ServletFileUpload(factory);  
		  upload.setSizeMax(maxPostSize);  
		  FileItem item = null;
		  try{  
			   @SuppressWarnings("rawtypes")
			List fileItems = upload.parseRequest(request);  
			   @SuppressWarnings("rawtypes")
			Iterator iter = fileItems.iterator();  
			   while (iter.hasNext()){  
				   item = (FileItem) iter.next();  
				   if (!item.isFormField()){  
				     String name = item.getName();  
				     System.out.println(name);  
				     try{  
				    	 InputStream in =  item.getInputStream();
				    	 return in;
				     } catch (Exception e){  
				      e.printStackTrace();  
				     }  
				   }  
			   }  
		  }catch (FileUploadException e){  
			  e.printStackTrace();  
		  }  
		  return null;
	}

	
	
	/**
	 * 解析request中的流，返回多个FileItem
	 * @param request
	 * @param response
	 * @return List<MyFile>
	 * @throws ServletException
	 * @throws IOException
	 */
	  public static List<MyFile> getFileItemsFromRequest(HttpServletRequest request, HttpServletResponse response)
	            throws ServletException, IOException {
	        response.setContentType("text/html;charset=UTF-8");
	        request.setCharacterEncoding("UTF-8");
	        //保存文件到服务器中
	        DiskFileItemFactory factory = new DiskFileItemFactory();
	        factory.setSizeThreshold(4096);
	        ServletFileUpload upload = new ServletFileUpload(factory);
	        upload.setSizeMax(maxPostSize);
	        ArrayList<MyFile> myFiles = new ArrayList<MyFile>();
	        try {
	            List fileItems = upload.parseRequest(request);
	            Iterator iter = fileItems.iterator();
	            while (iter.hasNext()) {
	                FileItem item = (FileItem) iter.next();
	                if (!item.isFormField()) {
	                    String name = item.getName();
	                    System.out.println(name);
	                    try {
	                    	File file = new File(UUIDUtil.generateUUID()+"."+item.getName());
	                    	MyFile myFile = new MyFile();
	                    	item.write(file);
	                    	myFile.setFile(file);
	                    	myFile.setRotation(Integer.parseInt(item.getFieldName()));
	                    	myFile.setFileName(item.getName());
	                    	myFiles.add(myFile);
	                    } catch (Exception e) {
	                        e.printStackTrace();
	                    }
	                }
	            }
	        } catch (FileUploadException e) {
	        	e.printStackTrace();
	        }
			return myFiles;
	    }
	
	
	public static void download(String path,String filename, HttpServletResponse response,String contentType) {
		try {
			 BufferedInputStream in = null;
			 response.reset();
	         response.setHeader("Cache-Control", "no-cache");
	         response.setContentType(contentType);
	 //        response.setCharacterEncoding("UTF-8"); 
	//         filename = URLEncoder.encode(filename, "UTF-8"); 
	         response.setHeader("Content-disposition", "attachment;filename="+new String(filename.getBytes("gb2312"),"iso8859-1"));
			 File file = new File(path);
			 in = new BufferedInputStream(new FileInputStream(file));
			 ServletOutputStream out = response.getOutputStream();
			 Long l = new Long(file.length());
	         int length = l.intValue();
	         int k = 0;
	         int i = 65000;
	         byte byteArry[] = new byte[i];
	         while (k < length) {
	             int j =in.read(byteArry, 0, i);
	             k += j;
	             out.write(byteArry, 0, j);
	         }
	         in.close();
	         out.close();
	//       FileUtil.deleteFile(path);
		} catch (Exception e) {
			e.printStackTrace();
		}
	
		
	}
	
	
	
	
	/**删除指定文件夹下所有文件param path 文件夹完整绝对路径*/
	   public static boolean delAllFile(String path) {
	       boolean flag = false;
	       File file = new File(path);
	       if (!file.exists()) {
	         return flag;
	       }
	       if (!file.isDirectory()) {
	         return flag;
	       }
	       String[] tempList = file.list();
	       File temp = null;
	       for (int i = 0; i < tempList.length; i++) {
	          if (path.endsWith(File.separator)) {
	             temp = new File(path + tempList[i]);
	          } else {
	              temp = new File(path + File.separator + tempList[i]);
	          }
	          if (temp.isFile()) {
	             temp.delete();
	          }
	          if (temp.isDirectory()) {
	             delAllFile(path + "/" + tempList[i]);//先删除文件夹里面的文件
	             delFolder(path + "/" + tempList[i]);//再删除空文件夹
	             flag = true;
	          }
	       }
	       return flag;
	     }
	   
	   
	   
	 /**删除文件夹param folderPath 文件夹完整绝对路径*/
	      public static void delFolder(String folderPath) {
	      try {
	         delAllFile(folderPath); //删除完里面所有内容
	         String filePath = folderPath;
	         filePath = filePath.toString();
	         java.io.File myFilePath = new java.io.File(filePath);
	         myFilePath.delete(); //删除空文件夹
	      } catch (Exception e) {
	        e.printStackTrace(); 
	      }
	 }
	   
	
	
	
	
	public static void main(String[] args) throws IOException{
		File file =  new File("C:/Users/heqi\\Desktop\\test.zip");
		FileInputStream inputStream  = new FileInputStream(file);
	    String str =uploadFile(inputStream,"11.zip");
	    
	    System.out.println(str);
	    
	   //  getInputStreamFromURL("http://192.168.37.128:8080/"+str);
	}
	
}
	








