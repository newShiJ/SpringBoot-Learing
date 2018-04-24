package learning.model;

import java.io.Serializable;

public class CmyContract implements Serializable {
    /**
     * 
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
     * 业务编号
     */
    private String businessNo;

    /**
     * 合同编号
     */
    private String contractCode;

    /**
     * 安存 OSS url
     */
    private String contractEvidenceUrl;

    /**
     * 合同名称
     */
    private String contractName;

    /**
     * 合同 OSS url
     */
    private String contractOssUrl;

    /**
     * 合同签约方式(在线/上传)
     */
    private String contractRecordType;

    /**
     * 合同类型(对应合同模版)
     */
    private String contractType;

    /**
     * 是否有效
     */
    private String isValid;

    /**
     * 生效时间
     */
    private String validTime;

    /**
     * 安存保全号 url
     */
    private String contractEvidenceCode;

    /**
     * cmy_contract
     */
    private static final long serialVersionUID = 1L;

    /**
     * 
     * @return id 
     */
    public String getId() {
        return id;
    }

    /**
     * 
     * @param id 
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
     * 业务编号
     * @return business_no 业务编号
     */
    public String getBusinessNo() {
        return businessNo;
    }

    /**
     * 业务编号
     * @param businessNo 业务编号
     */
    public void setBusinessNo(String businessNo) {
        this.businessNo = businessNo == null ? null : businessNo.trim();
    }

    /**
     * 合同编号
     * @return contract_code 合同编号
     */
    public String getContractCode() {
        return contractCode;
    }

    /**
     * 合同编号
     * @param contractCode 合同编号
     */
    public void setContractCode(String contractCode) {
        this.contractCode = contractCode == null ? null : contractCode.trim();
    }

    /**
     * 安存 OSS url
     * @return contract_evidence_url 安存 OSS url
     */
    public String getContractEvidenceUrl() {
        return contractEvidenceUrl;
    }

    /**
     * 安存 OSS url
     * @param contractEvidenceUrl 安存 OSS url
     */
    public void setContractEvidenceUrl(String contractEvidenceUrl) {
        this.contractEvidenceUrl = contractEvidenceUrl == null ? null : contractEvidenceUrl.trim();
    }

    /**
     * 合同名称
     * @return contract_name 合同名称
     */
    public String getContractName() {
        return contractName;
    }

    /**
     * 合同名称
     * @param contractName 合同名称
     */
    public void setContractName(String contractName) {
        this.contractName = contractName == null ? null : contractName.trim();
    }

    /**
     * 合同 OSS url
     * @return contract_oss_url 合同 OSS url
     */
    public String getContractOssUrl() {
        return contractOssUrl;
    }

    /**
     * 合同 OSS url
     * @param contractOssUrl 合同 OSS url
     */
    public void setContractOssUrl(String contractOssUrl) {
        this.contractOssUrl = contractOssUrl == null ? null : contractOssUrl.trim();
    }

    /**
     * 合同签约方式(在线/上传)
     * @return contract_record_type 合同签约方式(在线/上传)
     */
    public String getContractRecordType() {
        return contractRecordType;
    }

    /**
     * 合同签约方式(在线/上传)
     * @param contractRecordType 合同签约方式(在线/上传)
     */
    public void setContractRecordType(String contractRecordType) {
        this.contractRecordType = contractRecordType == null ? null : contractRecordType.trim();
    }

    /**
     * 合同类型(对应合同模版)
     * @return contract_type 合同类型(对应合同模版)
     */
    public String getContractType() {
        return contractType;
    }

    /**
     * 合同类型(对应合同模版)
     * @param contractType 合同类型(对应合同模版)
     */
    public void setContractType(String contractType) {
        this.contractType = contractType == null ? null : contractType.trim();
    }

    /**
     * 是否有效
     * @return is_valid 是否有效
     */
    public String getIsValid() {
        return isValid;
    }

    /**
     * 是否有效
     * @param isValid 是否有效
     */
    public void setIsValid(String isValid) {
        this.isValid = isValid == null ? null : isValid.trim();
    }

    /**
     * 生效时间
     * @return valid_time 生效时间
     */
    public String getValidTime() {
        return validTime;
    }

    /**
     * 生效时间
     * @param validTime 生效时间
     */
    public void setValidTime(String validTime) {
        this.validTime = validTime == null ? null : validTime.trim();
    }

    /**
     * 安存保全号 url
     * @return contract_evidence_code 安存保全号 url
     */
    public String getContractEvidenceCode() {
        return contractEvidenceCode;
    }

    /**
     * 安存保全号 url
     * @param contractEvidenceCode 安存保全号 url
     */
    public void setContractEvidenceCode(String contractEvidenceCode) {
        this.contractEvidenceCode = contractEvidenceCode == null ? null : contractEvidenceCode.trim();
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
        CmyContract other = (CmyContract) that;
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
            && (this.getBusinessNo() == null ? other.getBusinessNo() == null : this.getBusinessNo().equals(other.getBusinessNo()))
            && (this.getContractCode() == null ? other.getContractCode() == null : this.getContractCode().equals(other.getContractCode()))
            && (this.getContractEvidenceUrl() == null ? other.getContractEvidenceUrl() == null : this.getContractEvidenceUrl().equals(other.getContractEvidenceUrl()))
            && (this.getContractName() == null ? other.getContractName() == null : this.getContractName().equals(other.getContractName()))
            && (this.getContractOssUrl() == null ? other.getContractOssUrl() == null : this.getContractOssUrl().equals(other.getContractOssUrl()))
            && (this.getContractRecordType() == null ? other.getContractRecordType() == null : this.getContractRecordType().equals(other.getContractRecordType()))
            && (this.getContractType() == null ? other.getContractType() == null : this.getContractType().equals(other.getContractType()))
            && (this.getIsValid() == null ? other.getIsValid() == null : this.getIsValid().equals(other.getIsValid()))
            && (this.getValidTime() == null ? other.getValidTime() == null : this.getValidTime().equals(other.getValidTime()))
            && (this.getContractEvidenceCode() == null ? other.getContractEvidenceCode() == null : this.getContractEvidenceCode().equals(other.getContractEvidenceCode()));
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
        result = prime * result + ((getBusinessNo() == null) ? 0 : getBusinessNo().hashCode());
        result = prime * result + ((getContractCode() == null) ? 0 : getContractCode().hashCode());
        result = prime * result + ((getContractEvidenceUrl() == null) ? 0 : getContractEvidenceUrl().hashCode());
        result = prime * result + ((getContractName() == null) ? 0 : getContractName().hashCode());
        result = prime * result + ((getContractOssUrl() == null) ? 0 : getContractOssUrl().hashCode());
        result = prime * result + ((getContractRecordType() == null) ? 0 : getContractRecordType().hashCode());
        result = prime * result + ((getContractType() == null) ? 0 : getContractType().hashCode());
        result = prime * result + ((getIsValid() == null) ? 0 : getIsValid().hashCode());
        result = prime * result + ((getValidTime() == null) ? 0 : getValidTime().hashCode());
        result = prime * result + ((getContractEvidenceCode() == null) ? 0 : getContractEvidenceCode().hashCode());
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
        sb.append(", businessNo=").append(businessNo);
        sb.append(", contractCode=").append(contractCode);
        sb.append(", contractEvidenceUrl=").append(contractEvidenceUrl);
        sb.append(", contractName=").append(contractName);
        sb.append(", contractOssUrl=").append(contractOssUrl);
        sb.append(", contractRecordType=").append(contractRecordType);
        sb.append(", contractType=").append(contractType);
        sb.append(", isValid=").append(isValid);
        sb.append(", validTime=").append(validTime);
        sb.append(", contractEvidenceCode=").append(contractEvidenceCode);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}