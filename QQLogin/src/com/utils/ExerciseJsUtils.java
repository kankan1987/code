package com.utils;

import java.io.FileReader;
import java.io.IOException;

import javax.script.Invocable;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class ExerciseJsUtils {
	public static void main(String[] args) throws ScriptException, NoSuchMethodException, IOException {
		ScriptEngineManager manager = new ScriptEngineManager();
		ScriptEngine engine = manager.getEngineByName("nashorn");
		String jquery = "jquery-1.7.1.min.js";
		String jsFileName = "login_qq.js";
		String jsFileName1 = "test1.js";
		// 读取js文件
		FileReader reader = new FileReader(jsFileName);
		FileReader reader1 = new FileReader(jsFileName1);
		FileReader reader2 = new FileReader(jquery);
		// 执行指定脚本
		engine.eval(reader2);
		engine.eval(reader);
		engine.eval(reader1);
		
		if (engine instanceof Invocable) {
			Invocable invoke = (Invocable) engine;
			// 调用merge方法，并传入两个参数
			// c = merge(2, 3);
			//Double c = (Double) invoke.invokeFunction("merge", 2, 3);
			//System.out.println("c = " + c);
			String c = (String) invoke.invokeFunction("addPwd", null);
			System.out.println("c = " + c);
			Double c1 = (Double) invoke.invokeFunction("merge1", 2, 3);
			System.out.println("c1 = " + c1);
		}
		//reader.close();
		reader1.close();
	}
}
