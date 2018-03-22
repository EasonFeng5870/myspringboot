package com.eason.core.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.io.Serializable;

/**
 * @author eason.fengys at 2018/3/21/0021 18:54
 **/
@ConfigurationProperties(prefix = "sop.swagger")
@Component
public class SwaggerConfig implements Serializable {

    /**
     * 是否开启Swagger
     */
    private boolean enable = false;

    /**
     * 要扫描的包
     */
    private String packageScan;

    /**
     * 标题
     */
    private String title;

    /**
     * 描述
     */
    private String descriptioin;

    /**
     * 版本信息
     */
    private String version;

    public boolean isEnable() {
        return enable;
    }

    public void setEnable(boolean enable) {
        this.enable = enable;
    }

    public String getPackageScan() {
        return packageScan;
    }

    public void setPackageScan(String packageScan) {
        this.packageScan = packageScan;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescriptioin() {
        return descriptioin;
    }

    public void setDescriptioin(String descriptioin) {
        this.descriptioin = descriptioin;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }
}
