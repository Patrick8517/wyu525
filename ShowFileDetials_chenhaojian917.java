package DailyHomeWork;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ShowFileDetials_chenhaojian917 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String path = "C:\\Users\\Administrator\\Desktop\\IBM��һ�ܿγ̼�¼��java���";
		File file = new File(path);
		if (!file.exists())
		// || file.isDirectory()����루���ж��Ƿ����ļ���
		{
			throw new FileNotFoundException();
		}

		walk(file);

//      ��ȡ�ļ�����
//      FileInputStream fis = new FileInputStream(file);
//	    //TODO: handle exception
//		fis = new FileInputStream(file);
//		InputStreamReader reader = new InputStreamReader(fis,"UTF-8");
//		BufferedReader br = new BufferedReader(reader);

	}

	private static void walk(File file) {
		if (file != null) {
			if (file.isDirectory()) {
				// �г�ȫ�����ļ�
				File f[] = file.listFiles();
				if (f != null)
					for (int i = 0; i < f.length; i++)
						// �ݹ����
						walk(f[i]);
			} else {
				// ���·��
				System.out.println(file);
			}
		}
	}
}
