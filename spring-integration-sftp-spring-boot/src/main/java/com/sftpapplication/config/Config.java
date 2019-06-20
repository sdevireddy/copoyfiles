package com.sftpapplication.config;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@EnableConfigurationProperties
@ConfigurationProperties("sftp")
@Configuration
public class Config {

	private String download;
	private List<Host> host = new ArrayList<>();

	public static class Host {
		private String ip;
		private String port;
		private String username;
		private String password;
		private String download;
		private String filter;

		public String getIp() {
			return ip;
		}

		public void setIp(String ip) {
			this.ip = ip;
		}

		public String getPort() {
			return port;
		}

		public void setPort(String port) {
			this.port = port;
		}

		public String getUsername() {
			return username;
		}

		public void setUsername(String username) {
			this.username = username;
		}

		public String getPassword() {
			return password;
		}

		public void setPassword(String password) {
			this.password = password;
		}

		public String getDownload() {
			return download;
		}

		public void setDownload(String download) {
			this.download = download;
		}

		public String getFilter() {
			return filter;
		}

		public void setFilter(String filter) {
			this.filter = filter;
		}

		@Override
		public String toString() {
			return "Host [ip=" + ip + ", port=" + port + ", username="
					+ username + ", password=" + password + ", download="
					+ download + ", filter=" + filter + "]";
		}

	}

	public String getDownload() {
		return download;
	}

	public void setDownload(String download) {
		this.download = download;
	}

	public List<Host> getHost() {
		return host;
	}

	public void setHost(List<Host> host) {
		this.host = host;
	}

	@Override
	public String toString() {
		return "Config [download=" + download + ", host=" + host + "]";
	}

}
