package learning.model;

import java.io.Serializable;

public class BillFeeUrl implements Serializable {
    /**
     * uuid主键
     */
    private String id;

    /**
     * 录入时间
     */
    private String createTime;

    /**
     * 是否逻辑删除
     */
    private String deleted;

    /**
     * 操作企业编号
     */
    private String opCmyCode;

    /**
     * 修改企业名称
     */
    private String opCmyName;

    /**
     * 操作时间
     */
    private String opTime;

    /**
     * 操作人编号
     */
    private String operatorCode;

    /**
     * 操作人名称
     */
    private String operatorName;

    /**
     * 预留字段1，使用后及时修改注释
     */
    private String reserved1;

    /**
     * 预留字段2，使用后及时修改注释
     */
    private String reserved2;

    /**
     * 预留字段3，使用后及时修改注释
     */
    private String reserved3;

    /**
     * 预留字段4，使用后及时修改注释
     */
    private Long reserved4;

    /**
     * 预留字段5，使用后及时修改注释
     */
    private Long reserved5;

    /**
     * 签名， 用于验证其他字段的值是否正确
     */
    private String signature;

    /**
     * 
     */
    private Integer version;

    /**
     * 具体的缴费记录
     */
    private String billFeeId;

    /**
     * url
     */
    private String url;

    /**
     * bill_fee_url
     */
    private static final long serialVersionUID = 1L;

    /**
     * uuid主键
     * @return id uuid主键
     */
    public String getId() {
        return id;
    }

    /**
     * uuid主键
     * @param id uuid主键
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * 录入时间
     * @return create_time 录入时间
     */
    public String getCreateTime() {
        return createTime;
    }

    /**
     * 录入时间
     * @param createTime 录入时间
     */
    public void setCreateTime(String createTime) {
        this.createTime = createTime == null ? null : createTime.trim();
    }

    /**
     * 是否逻辑删除
     * @return deleted 是否逻辑删除
     */
    public String getDeleted() {
        return deleted;
    }

    /**
     * 是否逻辑删除
     * @param deleted 是否逻辑删除
     */
    public void setDeleted(String deleted) {
        this.deleted = deleted == null ? null : deleted.trim();
    }

    /**
     * 操作企业编号
     * @return op_cmy_code 操作企业编号
     */
    public String getOpCmyCode() {
        return opCmyCode;
    }

    /**
     * 操作企业编号
     * @param opCmyCode 操作企业编号
     */
    public void setOpCmyCode(String opCmyCode) {
        this.opCmyCode = opCmyCode == null ? null : opCmyCode.trim();
    }

    /**
     * 修改企业名称
     * @return op_cmy_name 修改企业名称
     */
    public String getOpCmyName() {
        return opCmyName;
    }

    /**
     * 修改企业名称
     * @param opCmyName 修改企业名称
     */
    public void setOpCmyName(String opCmyName) {
        this.opCmyName = opCmyName == null ? null : opCmyName.trim();
    }

    /**
     * 操作时间
     * @return op_time 操作时间
     */
    public String getOpTime() {
        return opTime;
    }

    /**
     * 操作时间
     * @param opTime 操作时间
     */
    public void setOpTime(String opTime) {
        this.opTime = opTime == null ? null : opTime.trim();
    }

    /**
     * 操作人编号
     * @return operator_code 操作人编号
     */
    public String getOperatorCode() {
        return operatorCode;
    }

    /**
     * 操作人编号
     * @param operatorCode 操作人编号
     */
    public void setOperatorCode(String operatorCode) {
        this.operatorCode = operatorCode == null ? null : operatorCode.trim();
    }

    /**
     * 操作人名称
     * @return operator_name 操作人名称
     */
    public String getOperatorName() {
        return operatorName;
    }

    /**
     * 操作人名称
     * @param operatorName 操作人名称
     */
    public void setOperatorName(String operatorName) {
        this.operatorName = operatorName == null ? null : operatorName.trim();
    }

    /**
     * 预留字段1，使用后及时修改注释
     * @return reserved1 预留字段1，使用后及时修改注释
     */
    public String getReserved1() {
        return reserved1;
    }

    /**
     * 预留字段1，使用后及时修改注释
     * @param reserved1 预留字段1，使用后及时修改注释
     */
    public void setReserved1(String reserved1) {
        this.reserved1 = reserved1 == null ? null : reserved1.trim();
    }

    /**
     * 预留字段2，使用后及时修改注释
     * @return reserved2 预留字段2，使用后及时修改注释
     */
    public String getReserved2() {
        return reserved2;
    }

    /**
     * 预留字段2，使用后及时修改注释
     * @param reserved2 预留字段2，使用后及时修改注释
     */
    public void setReserved2(String reserved2) {
        this.reserved2 = reserved2 == null ? null : reserved2.trim();
    }

    /**
     * 预留字段3，使用后及时修改注释
     * @return reserved3 预留字段3，使用后及时修改注释
     */
    public String getReserved3() {
        return reserved3;
    }

    /**
     * 预留字段3，使用后及时修改注释
     * @param reserved3 预留字段3，使用后及时修改注释
     */
    public void setReserved3(String reserved3) {
        this.reserved3 = reserved3 == null ? null : reserved3.trim();
    }

    /**
     * 预留字段4，使用后及时修改注释
     * @return reserved4 预留字段4，使用后及时修改注释
     */
    public Long getReserved4() {
        return reserved4;
    }

    /**
     * 预留字段4，使用后及时修改注释
     * @param reserved4 预留字段4，使用后及时修改注释
     */
    public void setReserved4(Long reserved4) {
        this.reserved4 = reserved4;
    }

    /**
     * 预留字段5，使用后及时修改注释
     * @return reserved5 预留字段5，使用后及时修改注释
     */
    public Long getReserved5() {
        return reserved5;
    }

    /**
     * 预留字段5，使用后及时修改注释
     * @param reserved5 预留字段5，使用后及时修改注释
     */
    public void setReserved5(Long reserved5) {
        this.reserved5 = reserved5;
    }

    /**
     * 签名， 用于验证其他字段的值是否正确
     * @return signature 签名， 用于验证其他字段的值是否正确
     */
    public String getSignature() {
        return signature;
    }

    /**
     * 签名， 用于验证其他字段的值是否正确
     * @param signature 签名， 用于验证其他字段的值是否正确
     */
    public void setSignature(String signature) {
        this.signature = signature == null ? null : signature.trim();
    }

    /**
     * 
     * @return version 
     */
    public Integer getVersion() {
        return version;
    }

    /**
     * 
     * @param version 
     */
    public void setVersion(Integer version) {
        this.version = version;
    }

    /**
     * 具体的缴费记录
     * @return bill_fee_id 具体的缴费记录
     */
    public String getBillFeeId() {
        return billFeeId;
    }

    /**
     * 具体的缴费记录
     * @param billFeeId 具体的缴费记录
     */
    public void setBillFeeId(String billFeeId) {
        this.billFeeId = billFeeId == null ? null : billFeeId.trim();
    }

    /**
     * url
     * @return url url
     */
    public String getUrl() {
        return url;
    }

    /**
     * url
     * @param url url
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
        BillFeeUrl other = (BillFeeUrl) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getDeleted() == null ? other.getDeleted() == null : this.getDeleted().equals(other.getDeleted()))
            && (this.getOpCmyCode() == null ? other.getOpCmyCode() == null : this.getOpCmyCode().equals(other.getOpCmyCode()))
            && (this.getOpCmyName() == null ? other.getOpCmyName() == null : this.getOpCmyName().equals(other.getOpCmyName()))
            && (this.getOpTime() == null ? other.getOpTime() == null : this.getOpTime().equals(other.getOpTime()))
            && (this.getOperatorCode() == null ? other.getOperatorCode() == null : this.getOperatorCode().equals(other.getOperatorCode()))
            && (this.getOperatorName() == null ? other.getOperatorName() == null : this.getOperatorName().equals(other.getOperatorName()))
            && (this.getReserved1() == null ? other.getReserved1() == null : this.getReserved1().equals(other.getReserved1()))
            && (this.getReserved2() == null ? other.getReserved2() == null : this.getReserved2().equals(other.getReserved2()))
            && (this.getReserved3() == null ? other.getReserved3() == null : this.getReserved3().equals(other.getReserved3()))
            && (this.getReserved4() == null ? other.getReserved4() == null : this.getReserved4().equals(other.getReserved4()))
            && (this.getReserved5() == null ? other.getReserved5() == null : this.getReserved5().equals(other.getReserved5()))
            && (this.getSignature() == null ? other.getSignature() == null : this.getSignature().equals(other.getSignature()))
            && (this.getVersion() == null ? other.getVersion() == null : this.getVersion().equals(other.getVersion()))
            && (this.getBillFeeId() == null ? other.getBillFeeId() == null : this.getBillFeeId().equals(other.getBillFeeId()))
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
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getDeleted() == null) ? 0 : getDeleted().hashCode());
        result = prime * result + ((getOpCmyCode() == null) ? 0 : getOpCmyCode().hashCode());
        result = prime * result + ((getOpCmyName() == null) ? 0 : getOpCmyName().hashCode());
        result = prime * result + ((getOpTime() == null) ? 0 : getOpTime().hashCode());
        result = prime * result + ((getOperatorCode() == null) ? 0 : getOperatorCode().hashCode());
        result = prime * result + ((getOperatorName() == null) ? 0 : getOperatorName().hashCode());
        result = prime * result + ((getReserved1() == null) ? 0 : getReserved1().hashCode());
        result = prime * result + ((getReserved2() == null) ? 0 : getReserved2().hashCode());
        result = prime * result + ((getReserved3() == null) ? 0 : getReserved3().hashCode());
        result = prime * result + ((getReserved4() == null) ? 0 : getReserved4().hashCode());
        result = prime * result + ((getReserved5() == null) ? 0 : getReserved5().hashCode());
        result = prime * result + ((getSignature() == null) ? 0 : getSignature().hashCode());
        result = prime * result + ((getVersion() == null) ? 0 : getVersion().hashCode());
        result = prime * result + ((getBillFeeId() == null) ? 0 : getBillFeeId().hashCode());
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
        sb.append(", id=").append(id);
        sb.append(", createTime=").append(createTime);
        sb.append(", deleted=").append(deleted);
        sb.append(", opCmyCode=").append(opCmyCode);
        sb.append(", opCmyName=").append(opCmyName);
        sb.append(", opTime=").append(opTime);
        sb.append(", operatorCode=").append(operatorCode);
        sb.append(", operatorName=").append(operatorName);
        sb.append(", reserved1=").append(reserved1);
        sb.append(", reserved2=").append(reserved2);
        sb.append(", reserved3=").append(reserved3);
        sb.append(", reserved4=").append(reserved4);
        sb.append(", reserved5=").append(reserved5);
        sb.append(", signature=").append(signature);
        sb.append(", version=").append(version);
        sb.append(", billFeeId=").append(billFeeId);
        sb.append(", url=").append(url);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}