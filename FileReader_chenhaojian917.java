package ibm.com.test;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

public class FileReader_chenhaojian917 {
	public static void main(String[] args) throws IOException {

		// �����ļ���
		// ʡ�������� + File.separator + "test.txt");����д���д����ļ�
		File f = new File("D:\\Patrick\\FileIO");
		f.mkdirs();

		// File ff = new File("D:\\Patrick\\FileIO" + File.separator + "test.txt");
		//// �����ļ�
		// ff.createNewFile();

		// try {
		// ��ʾ֮ǰ���Ƿ�������±��ɫ���ļ��������ھʹ���
		// String fileName = "D:\\\\Patrick\\FileIO\\test.txt";
		// FileOutputStream out = new FileOutputStream(fileName);
		// PrintStream p = new PrintStream(out);
		// for (int i = 0; i < 100; i++)
		// д���ļ�����
		// p.println("233333");
		// } catch (FileNotFoundException e) {
		// e.printStackTrace();
		// }

		// �ַ���д��
		// �����ļ�����д����Ϣ
		Writer out = new FileWriter("D:\\Patrick\\FileIO\\text.txt", true);
		String str = "2333333333333333333";
		out.write(str);
		out.close();

		// �ַ�����ȡ
		Reader input = new FileReader("D:\\Patrick\\FileIO\\text.txt");
		char[] c = new char[1024];

		// �ж��Ƿ��ȡ���ļ��ײ�
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
