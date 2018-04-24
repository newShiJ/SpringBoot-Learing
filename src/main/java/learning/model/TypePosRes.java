package learning.model;

import java.io.Serializable;

public class TypePosRes implements Serializable {
    /**
     * 主键uuid
     */
    private String id;

    /**
     * 职位码
     */
    private String position;

    /**
     * 资源码
     */
    private String resCode;

    /**
     * 企业类型码
     */
    private String typeCode;

    /**
     * type_pos_res
     */
    private static final long serialVersionUID = 1L;

    /**
     * 主键uuid
     * @return id 主键uuid
     */
    public String getId() {
        return id;
    }

    /**
     * 主键uuid
     * @param id 主键uuid
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * 职位码
     * @return position 职位码
     */
    public String getPosition() {
        return position;
    }

    /**
     * 职位码
     * @param position 职位码
     */
    public void setPosition(String position) {
        this.position = position == null ? null : position.trim();
    }

    /**
     * 资源码
     * @return res_code 资源码
     */
    public String getResCode() {
        return resCode;
    }

    /**
     * 资源码
     * @param resCode 资源码
     */
    public void setResCode(String resCode) {
        this.resCode = resCode == null ? null : resCode.trim();
    }

    /**
     * 企业类型码
     * @return type_code 企业类型码
     */
    public String getTypeCode() {
        return typeCode;
    }

    /**
     * 企业类型码
     * @param typeCode 企业类型码
     */
    public void setTypeCode(String typeCode) {
        this.typeCode = typeCode == null ? null : typeCode.trim();
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
        TypePosRes other = (TypePosRes) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getPosition() == null ? other.getPosition() == null : this.getPosition().equals(other.getPosition()))
            && (this.getResCode() == null ? other.getResCode() == null : this.getResCode().equals(other.getResCode()))
            && (this.getTypeCode() == null ? other.getTypeCode() == null : this.getTypeCode().equals(other.getTypeCode()));
    }

    /**
     *
     * @mbg.generated 2018-04-23
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getPosition() == null) ? 0 : getPosition().hashCode());
        result = prime * result + ((getResCode() == null) ? 0 : getResCode().hashCode());
        result = prime * result + ((getTypeCode() == null) ? 0 : getTypeCode().hashCode());
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
        sb.append(", id=").append(id);
        sb.append(", position=").append(position);
        sb.append(", resCode=").append(resCode);
        sb.append(", typeCode=").append(typeCode);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}