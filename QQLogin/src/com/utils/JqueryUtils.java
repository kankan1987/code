package com.utils;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.mozilla.javascript.Context;
import org.mozilla.javascript.ContextFactory;
import org.mozilla.javascript.Function;
import org.mozilla.javascript.Scriptable;
import org.mozilla.javascript.ScriptableObject;

public class JqueryUtils {
    private String url;  
    private String jsFile;  
  
    private Context cx;  
    private Scriptable scope;  
  
    public String getUrl() {  
        return url;  
    }  
  
    public String getJsFile() {  
        return jsFile;  
    }  
  
    public void setUrl(String url) {  
        this.url = url;  
        putObject("url", url);  
    }  
  
    public void setJsFile(String jsFile) {  
        this.jsFile = jsFile;  
    }  
    
    public static void  newInit() {
    	String jsDemo = "env.rhino.1.2.js";
    	String jsPath = "test_demo.js";
    	String jqPath = "jquery-1.7.1.min.js";
        String jsFunction = "Transfer";
        String content = "<html><head><title>测试测试</title></head><body><div>aaaa</div>html body ,hahahaha ，垃圾</body></html>";
        String baseurl = "http://www.edzh.com";
        
        //开始调用javascript函数
        //Context cx = Context.enter();
        Context cx = ContextFactory.getGlobal().enterContext();
        try {
            Scriptable scope = cx.initStandardObjects();
            try {
            	//cx.evaluateReader(scope, new java.io.FileReader(jsDemo), jsDemo, 1, null);
            	cx.evaluateReader(scope, new java.io.FileReader(jqPath), jqPath, 1, null);
				cx.evaluateReader(scope, new java.io.FileReader(jsPath), "<cmd>", 1, null);
			
            } catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

            Object fObj = scope.get(jsFunction, scope);
            if (!(fObj instanceof Function)) {
                System.out.println("找不到方法" +jsFunction);
            } else {
                Object functionArgs[] = { content, baseurl};
                Function f = (Function)fObj;
                Object result = f.call(cx, scope, scope, functionArgs);
                System.out.println("返回结果："+Context.toString(result));
            }
        } finally {
            Context.exit();
        }
    }
    
//    public void init() {  
//        cx = ContextFactory.getGlobal().enterContext();  
//        scope = cx.initStandardObjects(null);  
//        cx.setOptimizationLevel(-1);  
//        cx.setLanguageVersion(Context.VERSION_1_5);  
//  
//        String[] file = { "./lib/env.rhino.1.2.js", "./lib/jquery.js" };  
//        for (String f : file) {  
//            evaluateJs(f);  
//        }  
//          
//        try {  
//            ScriptableObject.defineClass(scope, ExtendUtil.class);  
//        } catch (IllegalAccessException e1) {  
//            e1.printStackTrace();  
//        } catch (InstantiationException e1) {  
//            e1.printStackTrace();  
//        } catch (InvocationTargetException e1) {  
//            e1.printStackTrace();  
//        }  
//        ExtendUtil util = (ExtendUtil) cx.newObject(scope, "util");  
//        scope.put("util", scope, util);  
//    }  
  
    protected void evaluateJs(String f) {  
        try {  
            FileReader in = null;  
            in = new FileReader(f);  
            cx.evaluateReader(scope, in, f, 1, null);  
        } catch (FileNotFoundException e1) {  
            e1.printStackTrace();  
        } catch (IOException e1) {  
            e1.printStackTrace();  
        }  
    }  
  
    public void putObject(String name, Object o) {  
        scope.put(name, scope, o);  
    }  
  
    public void run() {  
        evaluateJs(this.jsFile);  
    }  
    
    public static void main(String[] args) {
    	newInit();
	}
}
