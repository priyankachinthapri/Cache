package com.example.springcache.service;

import java.util.concurrent.TimeUnit;

import org.springframework.cache.CacheManager;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cache.caffeine.CaffeineCacheManager;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.github.benmanes.caffeine.cache.Caffeine;

@Configuration
@EnableCaching
public class Config {
	@Bean(name="studentCache")
	public CacheManager cacheManager() {
		CaffeineCacheManager cacheManager = new CaffeineCacheManager("student");
		  cacheManager.setCaffeine(caffeineCacheBuilder());
		  return cacheManager;
	}

	 Caffeine < Object, Object > caffeineCacheBuilder() {
	  return Caffeine.newBuilder()
	   .initialCapacity(100)
	   .maximumSize(500)
	   .expireAfterAccess(10, TimeUnit.MINUTES)
	   .weakKeys()
	   .recordStats();
	 }

}
