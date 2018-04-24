package learning.model;

import java.io.Serializable;

public class Resource implements Serializable {
    /**
     * 资源码
     */
    private String code;

    /**
     * 资源等级
     */
    private Integer level;

    /**
     * 资源名称
     */
    private String name;

    /**
     * 上级资源名称
     */
    private String parentCode;

    /**
     * 资源url
     */
    private String url;

    /**
     * resource
     */
    private static final long serialVersionUID = 1L;

    /**
     * 资源码
     * @return code 资源码
     */
    public String getCode() {
        return code;
    }

    /**
     * 资源码
     * @param code 资源码
     */
    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    /**
     * 资源等级
     * @return level 资源等级
     */
    public Integer getLevel() {
        return level;
    }

    /**
     * 资源等级
     * @param level 资源等级
     */
    public void setLevel(Integer level) {
        this.level = level;
    }

    /**
     * 资源名称
     * @return name 资源名称
     */
    public String getName() {
        return name;
    }

    /**
     * 资源名称
     * @param name 资源名称
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * 上级资源名称
     * @return parent_code 上级资源名称
     */
    public String getParentCode() {
        return parentCode;
    }

    /**
     * 上级资源名称
     * @param parentCode 上级资源名称
     */
    public void setParentCode(String parentCode) {
        this.parentCode = parentCode == null ? null : parentCode.trim();
    }

    /**
     * 资源url
     * @return url 资源url
     */
    public String getUrl() {
        return url;
    }

    /**
     * 资源url
     * @param url 资源url
     */
    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    /**
     *
     * @mbg.generated 2018-04-23
     */
    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        Resource other = (Resource) that;
        return (this.getCode() == null ? other.getCode() == null : this.getCode().equals(other.getCode()))
            && (this.getLevel() == null ? other.getLevel() == null : this.getLevel().equals(other.getLevel()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getParentCode() == null ? other.getParentCode() == null : this.getParentCode().equals(other.getParentCode()))
            && (this.getUrl() == null ? other.getUrl() == null : this.getUrl().equals(other.getUrl()));
    }

    /**
     *
     * @mbg.generated 2018-04-23
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getCode() == null) ? 0 : getCode().hashCode());
        result = prime * result + ((getLevel() == null) ? 0 : getLevel().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getParentCode() == null) ? 0 : getParentCode().hashCode());
        result = prime * result + ((getUrl() == null) ? 0 : getUrl().hashCode());
        return result;
    }

    /**
     *
     * @mbg.generated 2018-04-23
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", code=").append(code);
        sb.append(", level=").append(level);
        sb.append(", name=").append(name);
        sb.append(", parentCode=").append(parentCode);
        sb.append(", url=").append(url);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}