package ibm.com.test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Buffer_chenhaojian917 {
	public static void main(String[] args) throws IOException {

		// 创建文件夹
		File f = new File("D:\\Test");
		f.mkdirs();
		// 创建文件
		File ff = new File("D:\\Test" + File.separator + "myfile.txt");
		ff.createNewFile();

		BufferedReader br = new BufferedReader(new FileReader(ff));
		BufferedWriter bw = new BufferedWriter(new FileWriter("D:\\Test\\myfile_cp.txt"));
		String msg = null;
		while (null != (msg = br.readLine())) {
			bw.write(msg);
			bw.newLine();
		}
		bw.close();
		br.close();
	}
}
