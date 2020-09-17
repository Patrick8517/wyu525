package DailyHomeWork;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ShowFileDetials_chenhaojian917 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String path = "C:\\Users\\Administrator\\Desktop\\IBM第一周课程记录：java后端";
		File file = new File(path);
		if (!file.exists())
		// || file.isDirectory()添加入（）判断是否是文件夹
		{
			throw new FileNotFoundException();
		}

		walk(file);

//      读取文件内容
//      FileInputStream fis = new FileInputStream(file);
//	    //TODO: handle exception
//		fis = new FileInputStream(file);
//		InputStreamReader reader = new InputStreamReader(fis,"UTF-8");
//		BufferedReader br = new BufferedReader(reader);

	}

	private static void walk(File file) {
		if (file != null) {
			if (file.isDirectory()) {
				// 列出全部的文件
				File f[] = file.listFiles();
				if (f != null)
					for (int i = 0; i < f.length; i++)
						// 递归调用
						walk(f[i]);
			} else {
				// 输出路径
				System.out.println(file);
			}
		}
	}
}
