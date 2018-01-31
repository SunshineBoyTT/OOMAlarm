package com.oom;

import java.io.IOException;
import java.util.Vector;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		try {
			Vector v = new Vector();
			for (int i = 0; i < 25; i++)
				v.add(new byte[1 * 1024 * 1024]);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			//运用trt catch的方式抛出异常程序
//			run_cmd("calc");
//				run_cmd("cmd /c start E:/huajiancode1/OOMAlarm/target/client/bin/start.bat");
		}

	}

	/**
	 * 执行start文件命令
	 * @Title: run_cmd 
	 * @Description:
	 * @param @param strcmd    
	 * @return void    返回类型 
	 * @throws
	 */
	public static void run_cmd(String strcmd) {
		//
		Runtime rt = Runtime.getRuntime(); // Runtime.getRuntime()返回当前应用程序的Runtime对象
		Process ps = null; // Process可以控制该子进程的执行或获取该子进程的信息。
		try {
			ps = rt.exec(strcmd); // 该对象的exec()方法指示Java虚拟机创建一个子进程执行指定的可执行程序，并返回与该子进程对应的Process对象实例。
			ps.waitFor(); // 等待子进程完成再往下执行。
		} catch (IOException e1) {
			e1.printStackTrace();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		int i = ps.exitValue(); // 接收执行完毕的返回值
		if (i == 0) {
			System.out.println("执行完成.");
		} else {
			System.out.println("执行失败.");
		}

		ps.destroy(); // 销毁子进程
		ps = null;
	}
}
