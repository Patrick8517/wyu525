package ibm.com.test;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

public class FileReader_chenhaojian917 {
	public static void main(String[] args) throws IOException {

		// 创建文件夹
		// 省略括号内 + File.separator + "test.txt");下文写入有创建文件
		File f = new File("D:\\Patrick\\FileIO");
		f.mkdirs();

		// File ff = new File("D:\\Patrick\\FileIO" + File.separator + "test.txt");
		//// 创建文件
		// ff.createNewFile();

		// try {
		// 演示之前看是否存在以下标红色的文件，不存在就创建
		// String fileName = "D:\\\\Patrick\\FileIO\\test.txt";
		// FileOutputStream out = new FileOutputStream(fileName);
		// PrintStream p = new PrintStream(out);
		// for (int i = 0; i < 100; i++)
		// 写入文件内容
		// p.println("233333");
		// } catch (FileNotFoundException e) {
		// e.printStackTrace();
		// }

		// 字符流写入
		// 创建文件，并写入信息
		Writer out = new FileWriter("D:\\Patrick\\FileIO\\text.txt", true);
		String str = "2333333333333333333";
		out.write(str);
		out.close();

		// 字符流读取
		Reader input = new FileReader("D:\\Patrick\\FileIO\\text.txt");
		char[] c = new char[1024];

		// 判断是否读取到文件底部
		int temp = 0;
		int len = 0;
		while ((temp = input.read()) != -1) {
			c[len] = (char) temp;
			len++;
		}
		input.close();
		System.out.println(new String(c, 0, len));

	}
}
