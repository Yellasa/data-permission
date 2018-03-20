/**
 * 
 */
package com.farpower.datapermission;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author xiaoshenbo
 */
@SpringBootApplication
//@MapperScan("com.farpower.*.*.mapper")
@MapperScan("com.farpower.*.dao")
public class Application {
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}


}