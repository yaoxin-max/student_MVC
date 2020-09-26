package com.yx.utils;
import java.sql.Connection;
import java.sql.SQLException;
import com.mchange.v2.c3p0.ComboPooledDataSource;

/**
 * 构建一个DB类
 * 
 * @author Administrator
 *
 */
public class JDBCUtil {

	//创建c3p0的连接池的对象
	static ComboPooledDataSource dataSource = null;
	
	static {
		
		dataSource = new ComboPooledDataSource();
	}
	
	public static  ComboPooledDataSource getDataSource(){
		return dataSource;
	}
	
	/**
	 * 获取数据库的连接对象，同步
	 * @throws SQLException 
	 */
	public synchronized static Connection getConnection() throws SQLException{
		
		return dataSource.getConnection();
		
	}
	
	/**
	 * 关闭连接
	 */
	public synchronized static void closeConnection(Connection conn){
		
		try {
			if(conn !=null){
				conn.close();//归还
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

