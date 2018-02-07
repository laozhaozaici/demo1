package com.lanou.demo;

import redis.clients.jedis.Jedis;

public class Demo {
	public static void main(String[] args) {
		Jedis jedis=new Jedis("127.0.0.1",6379);
		jedis.select(0);
		jedis.set("name","xinxin");
		String s = jedis.get("666");
		System.out.println(s);
	}
}
