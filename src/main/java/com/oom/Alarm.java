/**
 * 
 */
package com.oom;

import cn.hutool.core.io.resource.Resource;
import cn.hutool.core.io.resource.ResourceUtil;
import cn.hutool.extra.mail.MailUtil;

/**
 * @Description:报警类.引入工具包hutool(http://hutool.mydoc.io)的邮件发送
 * @author zhengjuntao@hjtechcn.cn
 * @Since:2018年1月26日
 * @Version:1.1.0
 */
public class Alarm {
	//判断是否发送过邮件
	private  transient static Boolean isSendEmail=false;
	public static void main(String[] args) {
		new Thread(new Runnable() {
			public void run() {
				while (true) {
					System.out.println("==================>异常请注意");
					try {
						if(!isSendEmail){
							
							MailUtil.send("827890676@qq.com", "内存溢出报警", "邮件来自内存溢出报警测试", false);
							isSendEmail=true;
						}
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		}).start();
		
	}
}
