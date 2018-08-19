package com.sadasen.search.settings;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @date 2018年8月19日
 * @author lei.ys
 * @addr home
 * @desc
 */
@Component
public class ElasticsearchSetting {
	
	@Value("${elasticsearch.server:http://127.0.0.1:9200}")
	private String server;

	public String getServer() {
		return server;
	}

	public void setServer(String server) {
		this.server = server;
	}

}
