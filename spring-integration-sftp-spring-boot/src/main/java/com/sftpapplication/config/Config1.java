package com.sftpapplication.config;
/*package com.sftpapplication.config;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties
@ConfigurationProperties("sftp")
public class Config {

	private List<Host> hosts = new ArrayList<>();
	private Dest dest;
	private String download;

	public static class Host {
		private String ip;
		private String port;
		private String username;
		private String password;
		private String download;
		private String filter;
		private List<String> directoryList;

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

		public List<String> getDirectoryList() {
			return directoryList;
		}

		public void setDirectoryList(List<String> directoryList) {
			this.directoryList = directoryList;
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
					+ download + ", filter=" + filter + ", directoryList="
					+ directoryList + "]";
		}

	}

	public static class Dest {
		private String ip;
		private String port;
		private String username;
		private String password;
		private String download;

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

		@Override
		public String toString() {
			return "Dest [ip=" + ip + ", port=" + port + ", username="
					+ username + ", password=" + password + ", download="
					+ download + "]";
		}

	}

	public Dest getDest() {
		return dest;
	}

	public void setDest(Dest dest) {
		this.dest = dest;
	}

	public String getDownload() {
		return download;
	}

	public void setDownload(String download) {
		this.download = download;
	}

	public List<Host> getHosts() {
		return hosts;
	}

	public void setHosts(List<Host> hosts) {
		this.hosts = hosts;
	}

	@Override
	public String toString() {
		return "Config [details=" + hosts + ", dest=" + dest + ", download="
				+ download + "]";
	}

}
*/