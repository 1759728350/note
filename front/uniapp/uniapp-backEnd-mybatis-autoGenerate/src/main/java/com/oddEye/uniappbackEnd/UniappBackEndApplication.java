package com.oddEye.uniappbackEnd;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@MapperScan("com.oddEye.uniappbackEnd.mapper")
//@MapperScan("com/oddEye/uniappbackEnd/dao/mapper")
@SpringBootApplication
public class UniappBackEndApplication {

	public static void main(String[] args) {
		SpringApplication.run(UniappBackEndApplication.class, args);
	}

}

