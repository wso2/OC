package org.wso2.oc.data;

import java.util.List;

public class OCAgentMessage {

	private String serverId;
	private String ip;
	private String serverName;
	private String serverVersion;
	private String domain;
	private String subDomain;
	private String adminServiceUrl;
	private String startTime;
	private String os;
	private double totalMemory;
	private int cpuCount;
	private double cpuSpeed;
	private String timestamp;
	private List<String> patches;
	private double freeMemory;
	private double idleCpuUsage;
	private double systemCpuUsage;
	private double userCpuUsage;
	private String serverUpTime;
	private int threadCount;
	private double systemLoadAverage;
	private List<Tenant> tenants;
	private String status;
	private String carbonLog;

	public String getCarbonLog() {
		return carbonLog;
	}

	public void setCarbonLog(String carbonLog) {
		this.carbonLog = carbonLog;
	}

	public String getServerId() {
		return serverId;
	}

	public void setServerId(String serverId) {
		this.serverId = serverId;
	}

	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public String getServerName() {
		return serverName;
	}

	public void setServerName(String serverName) {
		this.serverName = serverName;
	}

	public String getServerVersion() {
		return serverVersion;
	}

	public void setServerVersion(String serverVersion) {
		this.serverVersion = serverVersion;
	}

	public String getDomain() {
		return domain;
	}

	public void setDomain(String domain) {
		this.domain = domain;
	}

	public String getSubDomain() {
		return subDomain;
	}

	public void setSubDomain(String subDomain) {
		this.subDomain = subDomain;
	}

	public String getAdminServiceUrl() {
		return adminServiceUrl;
	}

	public void setAdminServiceUrl(String adminServiceUrl) {
		this.adminServiceUrl = adminServiceUrl;
	}

	public String getStartTime() {
		return startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	public String getOs() {
		return os;
	}

	public void setOs(String os) {
		this.os = os;
	}

	public double getTotalMemory() {
		return totalMemory;
	}

	public void setTotalMemory(double totalMemory) {
		this.totalMemory = totalMemory;
	}

	public int getCpuCount() {
		return cpuCount;
	}

	public void setCpuCount(int cpuCount) {
		this.cpuCount = cpuCount;
	}

	public double getCpuSpeed() {
		return cpuSpeed;
	}

	public void setCpuSpeed(double cpuSpeed) {
		this.cpuSpeed = cpuSpeed;
	}

	public String getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}

	public List<String> getPatches() {
		return patches;
	}

	public void setPatches(List<String> patches) {
		this.patches = patches;
	}

	public double getFreeMemory() {
		return freeMemory;
	}

	public void setFreeMemory(double freeMemory) {
		this.freeMemory = freeMemory;
	}

	public double getIdleCpuUsage() {
		return idleCpuUsage;
	}

	public void setIdleCpuUsage(double idleCpuUsage) {
		this.idleCpuUsage = idleCpuUsage;
	}

	public double getSystemCpuUsage() {
		return systemCpuUsage;
	}

	public void setSystemCpuUsage(double systemCpuUsage) {
		this.systemCpuUsage = systemCpuUsage;
	}

	public double getUserCpuUsage() {
		return userCpuUsage;
	}

	public void setUserCpuUsage(double userCpuUsage) {
		this.userCpuUsage = userCpuUsage;
	}

	public String getServerUpTime() {
		return serverUpTime;
	}

	public void setServerUpTime(String serverUpTime) {
		this.serverUpTime = serverUpTime;
	}

	public int getThreadCount() {
		return threadCount;
	}

	public void setThreadCount(int threadCount) {
		this.threadCount = threadCount;
	}

	public double getSystemLoadAverage() {
		return systemLoadAverage;
	}

	public void setSystemLoadAverage(double systemLoadAverage) {
		this.systemLoadAverage = systemLoadAverage;
	}

	public List<Tenant> getTenants() {
		return tenants;
	}

	public void setTenants(List<Tenant> tenants) {
		this.tenants = tenants;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "OCAgentMessage{" +
		       "serverId='" + serverId + '\'' +
		       ", ip='" + ip + '\'' +
		       ", serverName='" + serverName + '\'' +
		       ", serverVersion='" + serverVersion + '\'' +
		       ", domain='" + domain + '\'' +
		       ", subDomain='" + subDomain + '\'' +
		       ", adminServiceUrl='" + adminServiceUrl + '\'' +
		       ", startTime='" + startTime + '\'' +
		       ", os='" + os + '\'' +
		       ", totalMemory=" + totalMemory +
		       ", cpuCount=" + cpuCount +
		       ", cpuSpeed=" + cpuSpeed +
		       ", timestamp='" + timestamp + '\'' +
		       ", patches=" + patches +
		       ", freeMemory=" + freeMemory +
		       ", idleCpuUsage=" + idleCpuUsage +
		       ", systemCpuUsage=" + systemCpuUsage +
		       ", userCpuUsage=" + userCpuUsage +
		       ", serverUpTime='" + serverUpTime + '\'' +
		       ", threadCount=" + threadCount +
		       ", systemLoadAverage=" + systemLoadAverage +
		       ", tenants=" + tenants +
		       ", status='" + status + '\'' +
		       '}';
	}
}
