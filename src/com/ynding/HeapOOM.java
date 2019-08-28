package com.ynding;

import java.util.ArrayList;
import java.util.List;

/**
 * java堆内存溢出异常测试
 * VM Args: -Xms20m -Xmx20m -XX:+HeapDumpOutOfMemoryError
 * @author ynding
 *
 */
public class HeapOOM {

	static class OOMObject{
		
	}
	
	public static void main(String[] args) {
		List<OOMObject> list = new ArrayList<>();
		
		while(true){
			list.add(new OOMObject());
		}
	}
	
}
