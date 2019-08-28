/*package com.ynding;

import com.ynding.HeapOOM.OOMObject;

*//**
 * 借助CGLib使方法区出现内存溢出异常
 * VM Args:-XX:PermSize=10M -XX:MaxpermSize=10M
 * @author ynding
 *
 *//*
public class JavaMethodAreaOOM {

	public static void main(String[] args) {
		while(true){
			Enhancer enhancer = new Enhancer();
			enhancer.setSuperclass(OOMObject.class);
			enhancer.setUseCache(false);
			enhancer.setCallback(new MethodInterceptor(){)
			   public Object intercept(Object obj, Method method,
					   Object[] args, MethodProxy proxy) throws Throwable{
				return proxy.invokeSuper(obj,args);
			}
			});
			enhancer.create();
		}
	}
	
	static class OOMObject{}
}
*/