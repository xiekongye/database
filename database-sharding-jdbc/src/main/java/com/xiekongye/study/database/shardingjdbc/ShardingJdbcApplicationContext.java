package com.xiekongye.study.database.shardingjdbc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author : lieying
 * date : 2018/12/6 14:18
 */
@SpringBootApplication
public class ShardingJdbcApplicationContext {

	public static void main(String[] args) {
		new SpringApplication(ShardingJdbcApplicationContext.class).run(args);
	}

}
