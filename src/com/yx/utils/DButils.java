package com.yx.utils;


import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class DButils {
	//为了方便，将方法定位satic的，而static只能调用static的属性
	//所以属性定义为static
	
	
	//功能要分装在方法里，不是在工具类里直接实行。只有封装在方法，才可以供外部使用
	//如果直接写在自己类里，只能供自己使用了。
	public static Properties properties=null;//为了避免new DBUtils()来初始化properties,可直接给其赋值为null
	static{
		//db.properties文件只需加载一次，因此放在静态代码块，在程序执行开始前就去先抓取properties
		//当前上下文类加载器
		properties = new Properties();
	try {
		properties.load(Thread.currentThread().getContextClassLoader().getResourceAsStream("da.properties"));
	} catch (IOException e) {
		e.printStackTrace();
	}
		
		
	}
	public static Connection getconn(){
		/*
		 * 此函数返回Connection,因为在外部PreparedStatement prestatement = connection.prepareStatement(sql);
		 * 要通过connection去创建preStatement,如果不返回，外部类无法实现。
		 */
		Connection connection = null;
		try {
			//必须new,前面只是给了一个引用而已，并没有创建对象
			Class.forName(properties.getProperty("drivername"));
			connection = DriverManager.getConnection(properties.getProperty("url"),properties.getProperty("user"),properties.getProperty("password"));
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return connection;
		
	}
	
	//关闭coonnection
	public static void close(Connection connection){
		try {
			if (connection != null) {
				//这里的意思，一旦connection创建成功了，在程序结束的末尾要关闭它，如没创建成功就不要管他
				//避免connection就没有创建成功就去关闭它，导致空指针异常。
				connection.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	//关闭statement
	public static void close(Statement statement){
		try {
			if (statement != null) {
				statement.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	//关闭RestultSet
	
	public static void close(ResultSet resultSet){
		try {
			if (resultSet != null) {
				//这里的意思，一旦connection创建成功了，在程序结束的末尾要关闭它，如没创建成功就不要管他
				resultSet.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
