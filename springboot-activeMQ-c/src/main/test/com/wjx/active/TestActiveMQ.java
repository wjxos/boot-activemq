package com.wjx.active;

import javax.annotation.Resource;

import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.wjx.active.produce.Queue_Concumer;

@SpringBootTest(classes = MainApp_Concumer.class)
@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
public class TestActiveMQ {
	
	@Resource
	private Queue_Concumer queue_Produce;


}
