package learning.model;

import java.io.Serializable;

public class CompanyInfo implements Serializable {
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
     * 认证材料路径--管理员身份背面
     */
    private String adminIdNumberBackUrl;

    /**
     * 认证材料路径--管理员身份证正面
     */
    private String adminIdNumberFrontUrl;

    /**
     * 申请审核时间
     */
    private String applyAuditTime;

    /**
     * 审核意见
     */
    private String auditOpinion;

    /**
     * 审核时间
     */
    private String auditTime;

    /**
     * 认证材料路径--授权委托书
     */
    private String authorizationLetterUrl;

    /**
     * 认证材料路径--银行账户证明
     */
    private String bankAccountEvidenceUrl;

    /**
     * 认证材料路径--营业执照正本
     */
    private String businessLicenseUrl;

    /**
     * 经营范围
     */
    private String businessScope;

    /**
     * 所在地区-市
     */
    private String city;

    /**
     * 通讯地址
     */
    private String cmyAddress;

    /**
     * 企业代码
     */
    private String cmyCode;

    /**
     * 企业名称
     */
    private String cmyName;

    /**
     * 组织机构代码
     */
    private String cmyOrgCode;

    /**
     * 企业联系电话
     */
    private String cmyPhone;

    /**
     * 邮政编码
     */
    private String cmyPostcode;

    /**
     * 企业规模
     */
    private String cmyScale;

    /**
     * 企业描述
     */
    private String description;

    /**
     * 成立年份
     */
    private String establishmentTime;

    /**
     * 企业法人证件号
     */
    private String legalPersonCertificate;

    /**
     * 认证材料路径--法人身份证背面
     */
    private String legalPersonIdNumberBackUrl;

    /**
     * 认证材料路径--法人身份证正面
     */
    private String legalPersonIdNumberFrontUrl;

    /**
     * 企业法人
     */
    private String legalPersonName;

    /**
     * 营业执照编号
     */
    private String licenseNumber;

    /**
     * 企业 logo URL
     */
    private String logoUrl;

    /**
     * 所在地区-省
     */
    private String province;

    /**
     * 注册资本
     */
    private String registeredCapital;

    /**
     * 统一社会信用代码
     */
    private String socialCreditCode;

    /**
     * 状态
     */
    private String state;

    /**
     * company_info
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
     * 认证材料路径--管理员身份背面
     * @return admin_id_number_back_url 认证材料路径--管理员身份背面
     */
    public String getAdminIdNumberBackUrl() {
        return adminIdNumberBackUrl;
    }

    /**
     * 认证材料路径--管理员身份背面
     * @param adminIdNumberBackUrl 认证材料路径--管理员身份背面
     */
    public void setAdminIdNumberBackUrl(String adminIdNumberBackUrl) {
        this.adminIdNumberBackUrl = adminIdNumberBackUrl == null ? null : adminIdNumberBackUrl.trim();
    }

    /**
     * 认证材料路径--管理员身份证正面
     * @return admin_id_number_front_url 认证材料路径--管理员身份证正面
     */
    public String getAdminIdNumberFrontUrl() {
        return adminIdNumberFrontUrl;
    }

    /**
     * 认证材料路径--管理员身份证正面
     * @param adminIdNumberFrontUrl 认证材料路径--管理员身份证正面
     */
    public void setAdminIdNumberFrontUrl(String adminIdNumberFrontUrl) {
        this.adminIdNumberFrontUrl = adminIdNumberFrontUrl == null ? null : adminIdNumberFrontUrl.trim();
    }

    /**
     * 申请审核时间
     * @return apply_audit_time 申请审核时间
     */
    public String getApplyAuditTime() {
        return applyAuditTime;
    }

    /**
     * 申请审核时间
     * @param applyAuditTime 申请审核时间
     */
    public void setApplyAuditTime(String applyAuditTime) {
        this.applyAuditTime = applyAuditTime == null ? null : applyAuditTime.trim();
    }

    /**
     * 审核意见
     * @return audit_opinion 审核意见
     */
    public String getAuditOpinion() {
        return auditOpinion;
    }

    /**
     * 审核意见
     * @param auditOpinion 审核意见
     */
    public void setAuditOpinion(String auditOpinion) {
        this.auditOpinion = auditOpinion == null ? null : auditOpinion.trim();
    }

    /**
     * 审核时间
     * @return audit_time 审核时间
     */
    public String getAuditTime() {
        return auditTime;
    }

    /**
     * 审核时间
     * @param auditTime 审核时间
     */
    public void setAuditTime(String auditTime) {
        this.auditTime = auditTime == null ? null : auditTime.trim();
    }

    /**
     * 认证材料路径--授权委托书
     * @return authorization_letter_url 认证材料路径--授权委托书
     */
    public String getAuthorizationLetterUrl() {
        return authorizationLetterUrl;
    }

    /**
     * 认证材料路径--授权委托书
     * @param authorizationLetterUrl 认证材料路径--授权委托书
     */
    public void setAuthorizationLetterUrl(String authorizationLetterUrl) {
        this.authorizationLetterUrl = authorizationLetterUrl == null ? null : authorizationLetterUrl.trim();
    }

    /**
     * 认证材料路径--银行账户证明
     * @return bank_account_evidence_url 认证材料路径--银行账户证明
     */
    public String getBankAccountEvidenceUrl() {
        return bankAccountEvidenceUrl;
    }

    /**
     * 认证材料路径--银行账户证明
     * @param bankAccountEvidenceUrl 认证材料路径--银行账户证明
     */
    public void setBankAccountEvidenceUrl(String bankAccountEvidenceUrl) {
        this.bankAccountEvidenceUrl = bankAccountEvidenceUrl == null ? null : bankAccountEvidenceUrl.trim();
    }

    /**
     * 认证材料路径--营业执照正本
     * @return business_license_url 认证材料路径--营业执照正本
     */
    public String getBusinessLicenseUrl() {
        return businessLicenseUrl;
    }

    /**
     * 认证材料路径--营业执照正本
     * @param businessLicenseUrl 认证材料路径--营业执照正本
     */
    public void setBusinessLicenseUrl(String businessLicenseUrl) {
        this.businessLicenseUrl = businessLicenseUrl == null ? null : businessLicenseUrl.trim();
    }

    /**
     * 经营范围
     * @return business_scope 经营范围
     */
    public String getBusinessScope() {
        return businessScope;
    }

    /**
     * 经营范围
     * @param businessScope 经营范围
     */
    public void setBusinessScope(String businessScope) {
        this.businessScope = businessScope == null ? null : businessScope.trim();
    }

    /**
     * 所在地区-市
     * @return city 所在地区-市
     */
    public String getCity() {
        return city;
    }

    /**
     * 所在地区-市
     * @param city 所在地区-市
     */
    public void setCity(String city) {
        this.city = city == null ? null : city.trim();
    }

    /**
     * 通讯地址
     * @return cmy_address 通讯地址
     */
    public String getCmyAddress() {
        return cmyAddress;
    }

    /**
     * 通讯地址
     * @param cmyAddress 通讯地址
     */
    public void setCmyAddress(String cmyAddress) {
        this.cmyAddress = cmyAddress == null ? null : cmyAddress.trim();
    }

    /**
     * 企业代码
     * @return cmy_code 企业代码
     */
    public String getCmyCode() {
        return cmyCode;
    }

    /**
     * 企业代码
     * @param cmyCode 企业代码
     */
    public void setCmyCode(String cmyCode) {
        this.cmyCode = cmyCode == null ? null : cmyCode.trim();
    }

    /**
     * 企业名称
     * @return cmy_name 企业名称
     */
    public String getCmyName() {
        return cmyName;
    }

    /**
     * 企业名称
     * @param cmyName 企业名称
     */
    public void setCmyName(String cmyName) {
        this.cmyName = cmyName == null ? null : cmyName.trim();
    }

    /**
     * 组织机构代码
     * @return cmy_org_code 组织机构代码
     */
    public String getCmyOrgCode() {
        return cmyOrgCode;
    }

    /**
     * 组织机构代码
     * @param cmyOrgCode 组织机构代码
     */
    public void setCmyOrgCode(String cmyOrgCode) {
        this.cmyOrgCode = cmyOrgCode == null ? null : cmyOrgCode.trim();
    }

    /**
     * 企业联系电话
     * @return cmy_phone 企业联系电话
     */
    public String getCmyPhone() {
        return cmyPhone;
    }

    /**
     * 企业联系电话
     * @param cmyPhone 企业联系电话
     */
    public void setCmyPhone(String cmyPhone) {
        this.cmyPhone = cmyPhone == null ? null : cmyPhone.trim();
    }

    /**
     * 邮政编码
     * @return cmy_postcode 邮政编码
     */
    public String getCmyPostcode() {
        return cmyPostcode;
    }

    /**
     * 邮政编码
     * @param cmyPostcode 邮政编码
     */
    public void setCmyPostcode(String cmyPostcode) {
        this.cmyPostcode = cmyPostcode == null ? null : cmyPostcode.trim();
    }

    /**
     * 企业规模
     * @return cmy_scale 企业规模
     */
    public String getCmyScale() {
        return cmyScale;
    }

    /**
     * 企业规模
     * @param cmyScale 企业规模
     */
    public void setCmyScale(String cmyScale) {
        this.cmyScale = cmyScale == null ? null : cmyScale.trim();
    }

    /**
     * 企业描述
     * @return description 企业描述
     */
    public String getDescription() {
        return description;
    }

    /**
     * 企业描述
     * @param description 企业描述
     */
    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    /**
     * 成立年份
     * @return establishment_time 成立年份
     */
    public String getEstablishmentTime() {
        return establishmentTime;
    }

    /**
     * 成立年份
     * @param establishmentTime 成立年份
     */
    public void setEstablishmentTime(String establishmentTime) {
        this.establishmentTime = establishmentTime == null ? null : establishmentTime.trim();
    }

    /**
     * 企业法人证件号
     * @return legal_person_certificate 企业法人证件号
     */
    public String getLegalPersonCertificate() {
        return legalPersonCertificate;
    }

    /**
     * 企业法人证件号
     * @param legalPersonCertificate 企业法人证件号
     */
    public void setLegalPersonCertificate(String legalPersonCertificate) {
        this.legalPersonCertificate = legalPersonCertificate == null ? null : legalPersonCertificate.trim();
    }

    /**
     * 认证材料路径--法人身份证背面
     * @return legal_person_id_number_back_url 认证材料路径--法人身份证背面
     */
    public String getLegalPersonIdNumberBackUrl() {
        return legalPersonIdNumberBackUrl;
    }

    /**
     * 认证材料路径--法人身份证背面
     * @param legalPersonIdNumberBackUrl 认证材料路径--法人身份证背面
     */
    public void setLegalPersonIdNumberBackUrl(String legalPersonIdNumberBackUrl) {
        this.legalPersonIdNumberBackUrl = legalPersonIdNumberBackUrl == null ? null : legalPersonIdNumberBackUrl.trim();
    }

    /**
     * 认证材料路径--法人身份证正面
     * @return legal_person_id_number_front_url 认证材料路径--法人身份证正面
     */
    public String getLegalPersonIdNumberFrontUrl() {
        return legalPersonIdNumberFrontUrl;
    }

    /**
     * 认证材料路径--法人身份证正面
     * @param legalPersonIdNumberFrontUrl 认证材料路径--法人身份证正面
     */
    public void setLegalPersonIdNumberFrontUrl(String legalPersonIdNumberFrontUrl) {
        this.legalPersonIdNumberFrontUrl = legalPersonIdNumberFrontUrl == null ? null : legalPersonIdNumberFrontUrl.trim();
    }

    /**
     * 企业法人
     * @return legal_person_name 企业法人
     */
    public String getLegalPersonName() {
        return legalPersonName;
    }

    /**
     * 企业法人
     * @param legalPersonName 企业法人
     */
    public void setLegalPersonName(String legalPersonName) {
        this.legalPersonName = legalPersonName == null ? null : legalPersonName.trim();
    }

    /**
     * 营业执照编号
     * @return license_number 营业执照编号
     */
    public String getLicenseNumber() {
        return licenseNumber;
    }

    /**
     * 营业执照编号
     * @param licenseNumber 营业执照编号
     */
    public void setLicenseNumber(String licenseNumber) {
        this.licenseNumber = licenseNumber == null ? null : licenseNumber.trim();
    }

    /**
     * 企业 logo URL
     * @return logo_url 企业 logo URL
     */
    public String getLogoUrl() {
        return logoUrl;
    }

    /**
     * 企业 logo URL
     * @param logoUrl 企业 logo URL
     */
    public void setLogoUrl(String logoUrl) {
        this.logoUrl = logoUrl == null ? null : logoUrl.trim();
    }

    /**
     * 所在地区-省
     * @return province 所在地区-省
     */
    public String getProvince() {
        return province;
    }

    /**
     * 所在地区-省
     * @param province 所在地区-省
     */
    public void setProvince(String province) {
        this.province = province == null ? null : province.trim();
    }

    /**
     * 注册资本
     * @return registered_capital 注册资本
     */
    public String getRegisteredCapital() {
        return registeredCapital;
    }

    /**
     * 注册资本
     * @param registeredCapital 注册资本
     */
    public void setRegisteredCapital(String registeredCapital) {
        this.registeredCapital = registeredCapital == null ? null : registeredCapital.trim();
    }

    /**
     * 统一社会信用代码
     * @return social_credit_code 统一社会信用代码
     */
    public String getSocialCreditCode() {
        return socialCreditCode;
    }

    /**
     * 统一社会信用代码
     * @param socialCreditCode 统一社会信用代码
     */
    public void setSocialCreditCode(String socialCreditCode) {
        this.socialCreditCode = socialCreditCode == null ? null : socialCreditCode.trim();
    }

    /**
     * 状态
     * @return state 状态
     */
    public String getState() {
        return state;
    }

    /**
     * 状态
     * @param state 状态
     */
    public void setState(String state) {
        this.state = state == null ? null : state.trim();
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
        CompanyInfo other = (CompanyInfo) that;
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
            && (this.getAdminIdNumberBackUrl() == null ? other.getAdminIdNumberBackUrl() == null : this.getAdminIdNumberBackUrl().equals(other.getAdminIdNumberBackUrl()))
            && (this.getAdminIdNumberFrontUrl() == null ? other.getAdminIdNumberFrontUrl() == null : this.getAdminIdNumberFrontUrl().equals(other.getAdminIdNumberFrontUrl()))
            && (this.getApplyAuditTime() == null ? other.getApplyAuditTime() == null : this.getApplyAuditTime().equals(other.getApplyAuditTime()))
            && (this.getAuditOpinion() == null ? other.getAuditOpinion() == null : this.getAuditOpinion().equals(other.getAuditOpinion()))
            && (this.getAuditTime() == null ? other.getAuditTime() == null : this.getAuditTime().equals(other.getAuditTime()))
            && (this.getAuthorizationLetterUrl() == null ? other.getAuthorizationLetterUrl() == null : this.getAuthorizationLetterUrl().equals(other.getAuthorizationLetterUrl()))
            && (this.getBankAccountEvidenceUrl() == null ? other.getBankAccountEvidenceUrl() == null : this.getBankAccountEvidenceUrl().equals(other.getBankAccountEvidenceUrl()))
            && (this.getBusinessLicenseUrl() == null ? other.getBusinessLicenseUrl() == null : this.getBusinessLicenseUrl().equals(other.getBusinessLicenseUrl()))
            && (this.getBusinessScope() == null ? other.getBusinessScope() == null : this.getBusinessScope().equals(other.getBusinessScope()))
            && (this.getCity() == null ? other.getCity() == null : this.getCity().equals(other.getCity()))
            && (this.getCmyAddress() == null ? other.getCmyAddress() == null : this.getCmyAddress().equals(other.getCmyAddress()))
            && (this.getCmyCode() == null ? other.getCmyCode() == null : this.getCmyCode().equals(other.getCmyCode()))
            && (this.getCmyName() == null ? other.getCmyName() == null : this.getCmyName().equals(other.getCmyName()))
            && (this.getCmyOrgCode() == null ? other.getCmyOrgCode() == null : this.getCmyOrgCode().equals(other.getCmyOrgCode()))
            && (this.getCmyPhone() == null ? other.getCmyPhone() == null : this.getCmyPhone().equals(other.getCmyPhone()))
            && (this.getCmyPostcode() == null ? other.getCmyPostcode() == null : this.getCmyPostcode().equals(other.getCmyPostcode()))
            && (this.getCmyScale() == null ? other.getCmyScale() == null : this.getCmyScale().equals(other.getCmyScale()))
            && (this.getDescription() == null ? other.getDescription() == null : this.getDescription().equals(other.getDescription()))
            && (this.getEstablishmentTime() == null ? other.getEstablishmentTime() == null : this.getEstablishmentTime().equals(other.getEstablishmentTime()))
            && (this.getLegalPersonCertificate() == null ? other.getLegalPersonCertificate() == null : this.getLegalPersonCertificate().equals(other.getLegalPersonCertificate()))
            && (this.getLegalPersonIdNumberBackUrl() == null ? other.getLegalPersonIdNumberBackUrl() == null : this.getLegalPersonIdNumberBackUrl().equals(other.getLegalPersonIdNumberBackUrl()))
            && (this.getLegalPersonIdNumberFrontUrl() == null ? other.getLegalPersonIdNumberFrontUrl() == null : this.getLegalPersonIdNumberFrontUrl().equals(other.getLegalPersonIdNumberFrontUrl()))
            && (this.getLegalPersonName() == null ? other.getLegalPersonName() == null : this.getLegalPersonName().equals(other.getLegalPersonName()))
            && (this.getLicenseNumber() == null ? other.getLicenseNumber() == null : this.getLicenseNumber().equals(other.getLicenseNumber()))
            && (this.getLogoUrl() == null ? other.getLogoUrl() == null : this.getLogoUrl().equals(other.getLogoUrl()))
            && (this.getProvince() == null ? other.getProvince() == null : this.getProvince().equals(other.getProvince()))
            && (this.getRegisteredCapital() == null ? other.getRegisteredCapital() == null : this.getRegisteredCapital().equals(other.getRegisteredCapital()))
            && (this.getSocialCreditCode() == null ? other.getSocialCreditCode() == null : this.getSocialCreditCode().equals(other.getSocialCreditCode()))
            && (this.getState() == null ? other.getState() == null : this.getState().equals(other.getState()));
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
        result = prime * result + ((getAdminIdNumberBackUrl() == null) ? 0 : getAdminIdNumberBackUrl().hashCode());
        result = prime * result + ((getAdminIdNumberFrontUrl() == null) ? 0 : getAdminIdNumberFrontUrl().hashCode());
        result = prime * result + ((getApplyAuditTime() == null) ? 0 : getApplyAuditTime().hashCode());
        result = prime * result + ((getAuditOpinion() == null) ? 0 : getAuditOpinion().hashCode());
        result = prime * result + ((getAuditTime() == null) ? 0 : getAuditTime().hashCode());
        result = prime * result + ((getAuthorizationLetterUrl() == null) ? 0 : getAuthorizationLetterUrl().hashCode());
        result = prime * result + ((getBankAccountEvidenceUrl() == null) ? 0 : getBankAccountEvidenceUrl().hashCode());
        result = prime * result + ((getBusinessLicenseUrl() == null) ? 0 : getBusinessLicenseUrl().hashCode());
        result = prime * result + ((getBusinessScope() == null) ? 0 : getBusinessScope().hashCode());
        result = prime * result + ((getCity() == null) ? 0 : getCity().hashCode());
        result = prime * result + ((getCmyAddress() == null) ? 0 : getCmyAddress().hashCode());
        result = prime * result + ((getCmyCode() == null) ? 0 : getCmyCode().hashCode());
        result = prime * result + ((getCmyName() == null) ? 0 : getCmyName().hashCode());
        result = prime * result + ((getCmyOrgCode() == null) ? 0 : getCmyOrgCode().hashCode());
        result = prime * result + ((getCmyPhone() == null) ? 0 : getCmyPhone().hashCode());
        result = prime * result + ((getCmyPostcode() == null) ? 0 : getCmyPostcode().hashCode());
        result = prime * result + ((getCmyScale() == null) ? 0 : getCmyScale().hashCode());
        result = prime * result + ((getDescription() == null) ? 0 : getDescription().hashCode());
        result = prime * result + ((getEstablishmentTime() == null) ? 0 : getEstablishmentTime().hashCode());
        result = prime * result + ((getLegalPersonCertificate() == null) ? 0 : getLegalPersonCertificate().hashCode());
        result = prime * result + ((getLegalPersonIdNumberBackUrl() == null) ? 0 : getLegalPersonIdNumberBackUrl().hashCode());
        result = prime * result + ((getLegalPersonIdNumberFrontUrl() == null) ? 0 : getLegalPersonIdNumberFrontUrl().hashCode());
        result = prime * result + ((getLegalPersonName() == null) ? 0 : getLegalPersonName().hashCode());
        result = prime * result + ((getLicenseNumber() == null) ? 0 : getLicenseNumber().hashCode());
        result = prime * result + ((getLogoUrl() == null) ? 0 : getLogoUrl().hashCode());
        result = prime * result + ((getProvince() == null) ? 0 : getProvince().hashCode());
        result = prime * result + ((getRegisteredCapital() == null) ? 0 : getRegisteredCapital().hashCode());
        result = prime * result + ((getSocialCreditCode() == null) ? 0 : getSocialCreditCode().hashCode());
        result = prime * result + ((getState() == null) ? 0 : getState().hashCode());
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
        sb.append(", adminIdNumberBackUrl=").append(adminIdNumberBackUrl);
        sb.append(", adminIdNumberFrontUrl=").append(adminIdNumberFrontUrl);
        sb.append(", applyAuditTime=").append(applyAuditTime);
        sb.append(", auditOpinion=").append(auditOpinion);
        sb.append(", auditTime=").append(auditTime);
        sb.append(", authorizationLetterUrl=").append(authorizationLetterUrl);
        sb.append(", bankAccountEvidenceUrl=").append(bankAccountEvidenceUrl);
        sb.append(", businessLicenseUrl=").append(businessLicenseUrl);
        sb.append(", businessScope=").append(businessScope);
        sb.append(", city=").append(city);
        sb.append(", cmyAddress=").append(cmyAddress);
        sb.append(", cmyCode=").append(cmyCode);
        sb.append(", cmyName=").append(cmyName);
        sb.append(", cmyOrgCode=").append(cmyOrgCode);
        sb.append(", cmyPhone=").append(cmyPhone);
        sb.append(", cmyPostcode=").append(cmyPostcode);
        sb.append(", cmyScale=").append(cmyScale);
        sb.append(", description=").append(description);
        sb.append(", establishmentTime=").append(establishmentTime);
        sb.append(", legalPersonCertificate=").append(legalPersonCertificate);
        sb.append(", legalPersonIdNumberBackUrl=").append(legalPersonIdNumberBackUrl);
        sb.append(", legalPersonIdNumberFrontUrl=").append(legalPersonIdNumberFrontUrl);
        sb.append(", legalPersonName=").append(legalPersonName);
        sb.append(", licenseNumber=").append(licenseNumber);
        sb.append(", logoUrl=").append(logoUrl);
        sb.append(", province=").append(province);
        sb.append(", registeredCapital=").append(registeredCapital);
        sb.append(", socialCreditCode=").append(socialCreditCode);
        sb.append(", state=").append(state);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}