package com.czm.entity;

public class Resource {
    private Long resourcesId;

    private String name;

    private String url;

    private String isuserable;

    private String remark;

    public Long getResourcesId() {
        return resourcesId;
    }

    public void setResourcesId(Long resourcesId) {
        this.resourcesId = resourcesId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    public String getIsuserable() {
        return isuserable;
    }

    public void setIsuserable(String isuserable) {
        this.isuserable = isuserable == null ? null : isuserable.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}