/**
 * 
 */
package com.oom;

import cn.hutool.core.convert.Convert;
import cn.hutool.core.date.DateUtil;
import cn.hutool.core.util.CharsetUtil;

/**
 * @Description:
 * @author zhengjuntao@hjtechcn.cn
 * @Since:2018年1月31日
 * @Version:1.1.0
 */
public class HutoolTest {

	/** 
	 * @Title: main 
	 * @Description:
	 * @param @param args    
	 * @return void    返回类型 
	 * @throws 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "我是一个小小的可爱的字符串";
		//转为16进制（Hex）字符串
		String hex = Convert.toHex(a, CharsetUtil.CHARSET_UTF_8);
		System.out.println(hex);
		//将16进制（Hex）字符串转为普通字符串:
		String raw = Convert.hexStrToStr(hex, CharsetUtil.CHARSET_UTF_8);
		System.out.println(raw);
		//Unicode和字符串转换
		String a1 = "我是一个小小的可爱的字符串";
		String unicode = Convert.strToUnicode(a1);
		System.out.println(unicode);
		raw = Convert.unicodeToStr(unicode);
		System.out.println(raw);
		
		//时间util
		//当前时间字符串，格式：yyyy-MM-dd HH:mm:ss
		String now = DateUtil.now();
		//当前日期字符串，格式：yyyy-MM-dd
		String today= DateUtil.today();
		System.out.println(now);
		System.out.println(today);
	}

}
