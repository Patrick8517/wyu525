package ibm.com.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Document_chenhaojian917 {
	public static void main(String[] args) throws IOException {

		// 创建文件夹
		File f = new File("D:\\Test");
		f.mkdirs();
		// 创建文件
		File ff = new File("D:\\Test" + File.separator + "myfile.txt");
		ff.createNewFile();

		InputStream is = new FileInputStream(ff);
		OutputStream os = new FileOutputStream("D:/Test/myfile_cp.txt", true);
		byte[] buffer = new byte[1024];
		int len = 0;
		while (-1 != (len = is.read(buffer))) {
			os.write(buffer, 0, len);
		}
		os.flush();
		os.close();
		is.close();
	}
}
