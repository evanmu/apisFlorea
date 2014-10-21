/*
 * Copyright (C), 2002-2014, 苏宁易购电子商务有限公司
 * FileName: TestSqlserverJtds.java
 * Author:   Evan
 * Date:     2014年7月25日 下午3:09:08
 * Description: //模块目的、功能描述      
 * History: //修改记录
 * <author>      <time>      <version>    <desc>
 * 修改人姓名             修改时间            版本号                  描述
 */
package com.openIdeas.apps;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.hibernate.dialect.H2Dialect;
import org.junit.Test;

/**
 * 〈一句话功能简述〉<br>
 * 〈功能详细描述〉
 * 
 * @author Evan
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （可选）
 */
public class TestSqlserverJtds {

    @Test
    public void testConn() {
        Connection con = null;
        try {
            String driver = "net.sourceforge.jtds.jdbc.Driver";
            String url = "jdbc:jtds:sqlserver://10.32.96.177:1433; DatabaseName=apis";
            Class.forName(driver).newInstance();
            System.out.println(" 连接开始。。。。。。");
            long starttime = System.currentTimeMillis();
            con = DriverManager.getConnection(url, "apis", "apis");
            long endtime = System.currentTimeMillis();
            System.out.println(" 连接成功 !Lost time:" + (endtime - starttime) / 1000 + "秒");

            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {

                if (null != con) {
                    con.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
