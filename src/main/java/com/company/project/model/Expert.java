package com.company.project.model;

import javax.persistence.*;

public class Expert {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "EXPERT_ID")
    private String expertId;

    private String name;

    /**
     * 国籍
     */
    private String hometown;

    /**
     * 职位
     */
    private String title;

    private String career;

    private String education;

    @Column(name = "DWDZ")
    private String dwdz;

    private String paper;

    /**
     * 邮编
     */
    private String zipcode;

    @Column(name = "ZJDM")
    private String zjdm;

    /**
     * 固定电话
     */
    @Column(name = "ZZDH")
    private String zzdh;

    /**
     * 传真
     */
    private String fax;

    private String ability;

    private String subject1;

    private String subject2;

    private String type;

    @Column(name = "HIGHADMIN_CODE")
    private String highadminCode;

    @Column(name = "STATE")
    private String state;

    @Column(name = "MZ")
    private String mz;

    private String position;

    /**
     * 原单位
     */
    private String organization;

    private String unit;

    /**
     * 移动电话
     */
    private String telephone;

    /**
     * 邮箱
     */
    private String email;

    /**
     * 证件类型
     */
    @Column(name = "identificationType")
    private String identificationtype;

    /**
     * 证件号
     */
    @Column(name = "identificationNo")
    private String identificationno;

    private String major1;

    private String major3;

    private String territory;

    @Column(name = "DP")
    private String dp;

    private String address;

    @Column(name = "ZJJB")
    private String zjjb;

    private String major;

    private String major2;

    /**
     * 学位
     */
    private String degree;

    private String mobilephone;

    /**
     * 性别
     */
    private String gender;

    /**
     * 年龄
     */
    @Column(name = "SCORE")
    private String score;

    @Column(name = "CTYPE")
    private String ctype;

    /**
     * 专家来源，1代表科技厅导入，2代表项目负责人，3代表专利第一发明人，4代表论文第一作者；5代表教师库爬取导入；21代表项目其他成员，31代表专利其他发明人，41代表论文其他作者，44代表是论文第一作者，但是其单位还没处理，以后要更新替换
     */
    private String source;

    /**
     * 标记是老师还是学生
     */
    private String sign;

    @Column(name = "nationalAward")
    private String nationalaward;

    @Column(name = "provincialAward")
    private String provincialaward;

    /**
     * 毕业学校
     */
    private String school;

    @Column(name = "research_field")
    private String researchField;

    @Column(name = "BACKIDEA")
    private String backidea;

    @Column(name = "FMZL")
    private String fmzl;

    @Column(name = "topicState")
    private String topicstate;

    private String patent;

    @Column(name = "REMARKS")
    private String remarks;

    /**
     * 个人简介
     */
    private String introduction;

    /**
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return EXPERT_ID
     */
    public String getExpertId() {
        return expertId;
    }

    /**
     * @param expertId
     */
    public void setExpertId(String expertId) {
        this.expertId = expertId;
    }

    /**
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取国籍
     *
     * @return hometown - 国籍
     */
    public String getHometown() {
        return hometown;
    }

    /**
     * 设置国籍
     *
     * @param hometown 国籍
     */
    public void setHometown(String hometown) {
        this.hometown = hometown;
    }

    /**
     * 获取职位
     *
     * @return title - 职位
     */
    public String getTitle() {
        return title;
    }

    /**
     * 设置职位
     *
     * @param title 职位
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * @return career
     */
    public String getCareer() {
        return career;
    }

    /**
     * @param career
     */
    public void setCareer(String career) {
        this.career = career;
    }

    /**
     * @return education
     */
    public String getEducation() {
        return education;
    }

    /**
     * @param education
     */
    public void setEducation(String education) {
        this.education = education;
    }

    /**
     * @return DWDZ
     */
    public String getDwdz() {
        return dwdz;
    }

    /**
     * @param dwdz
     */
    public void setDwdz(String dwdz) {
        this.dwdz = dwdz;
    }

    /**
     * @return paper
     */
    public String getPaper() {
        return paper;
    }

    /**
     * @param paper
     */
    public void setPaper(String paper) {
        this.paper = paper;
    }

    /**
     * 获取邮编
     *
     * @return zipcode - 邮编
     */
    public String getZipcode() {
        return zipcode;
    }

    /**
     * 设置邮编
     *
     * @param zipcode 邮编
     */
    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    /**
     * @return ZJDM
     */
    public String getZjdm() {
        return zjdm;
    }

    /**
     * @param zjdm
     */
    public void setZjdm(String zjdm) {
        this.zjdm = zjdm;
    }

    /**
     * 获取固定电话
     *
     * @return ZZDH - 固定电话
     */
    public String getZzdh() {
        return zzdh;
    }

    /**
     * 设置固定电话
     *
     * @param zzdh 固定电话
     */
    public void setZzdh(String zzdh) {
        this.zzdh = zzdh;
    }

    /**
     * 获取传真
     *
     * @return fax - 传真
     */
    public String getFax() {
        return fax;
    }

    /**
     * 设置传真
     *
     * @param fax 传真
     */
    public void setFax(String fax) {
        this.fax = fax;
    }

    /**
     * @return ability
     */
    public String getAbility() {
        return ability;
    }

    /**
     * @param ability
     */
    public void setAbility(String ability) {
        this.ability = ability;
    }

    /**
     * @return subject1
     */
    public String getSubject1() {
        return subject1;
    }

    /**
     * @param subject1
     */
    public void setSubject1(String subject1) {
        this.subject1 = subject1;
    }

    /**
     * @return subject2
     */
    public String getSubject2() {
        return subject2;
    }

    /**
     * @param subject2
     */
    public void setSubject2(String subject2) {
        this.subject2 = subject2;
    }

    /**
     * @return type
     */
    public String getType() {
        return type;
    }

    /**
     * @param type
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * @return HIGHADMIN_CODE
     */
    public String getHighadminCode() {
        return highadminCode;
    }

    /**
     * @param highadminCode
     */
    public void setHighadminCode(String highadminCode) {
        this.highadminCode = highadminCode;
    }

    /**
     * @return STATE
     */
    public String getState() {
        return state;
    }

    /**
     * @param state
     */
    public void setState(String state) {
        this.state = state;
    }

    /**
     * @return MZ
     */
    public String getMz() {
        return mz;
    }

    /**
     * @param mz
     */
    public void setMz(String mz) {
        this.mz = mz;
    }

    /**
     * @return position
     */
    public String getPosition() {
        return position;
    }

    /**
     * @param position
     */
    public void setPosition(String position) {
        this.position = position;
    }

    /**
     * 获取原单位
     *
     * @return organization - 原单位
     */
    public String getOrganization() {
        return organization;
    }

    /**
     * 设置原单位
     *
     * @param organization 原单位
     */
    public void setOrganization(String organization) {
        this.organization = organization;
    }

    /**
     * @return unit
     */
    public String getUnit() {
        return unit;
    }

    /**
     * @param unit
     */
    public void setUnit(String unit) {
        this.unit = unit;
    }

    /**
     * 获取移动电话
     *
     * @return telephone - 移动电话
     */
    public String getTelephone() {
        return telephone;
    }

    /**
     * 设置移动电话
     *
     * @param telephone 移动电话
     */
    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    /**
     * 获取邮箱
     *
     * @return email - 邮箱
     */
    public String getEmail() {
        return email;
    }

    /**
     * 设置邮箱
     *
     * @param email 邮箱
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * 获取证件类型
     *
     * @return identificationType - 证件类型
     */
    public String getIdentificationtype() {
        return identificationtype;
    }

    /**
     * 设置证件类型
     *
     * @param identificationtype 证件类型
     */
    public void setIdentificationtype(String identificationtype) {
        this.identificationtype = identificationtype;
    }

    /**
     * 获取证件号
     *
     * @return identificationNo - 证件号
     */
    public String getIdentificationno() {
        return identificationno;
    }

    /**
     * 设置证件号
     *
     * @param identificationno 证件号
     */
    public void setIdentificationno(String identificationno) {
        this.identificationno = identificationno;
    }

    /**
     * @return major1
     */
    public String getMajor1() {
        return major1;
    }

    /**
     * @param major1
     */
    public void setMajor1(String major1) {
        this.major1 = major1;
    }

    /**
     * @return major3
     */
    public String getMajor3() {
        return major3;
    }

    /**
     * @param major3
     */
    public void setMajor3(String major3) {
        this.major3 = major3;
    }

    /**
     * @return territory
     */
    public String getTerritory() {
        return territory;
    }

    /**
     * @param territory
     */
    public void setTerritory(String territory) {
        this.territory = territory;
    }

    /**
     * @return DP
     */
    public String getDp() {
        return dp;
    }

    /**
     * @param dp
     */
    public void setDp(String dp) {
        this.dp = dp;
    }

    /**
     * @return address
     */
    public String getAddress() {
        return address;
    }

    /**
     * @param address
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * @return ZJJB
     */
    public String getZjjb() {
        return zjjb;
    }

    /**
     * @param zjjb
     */
    public void setZjjb(String zjjb) {
        this.zjjb = zjjb;
    }

    /**
     * @return major
     */
    public String getMajor() {
        return major;
    }

    /**
     * @param major
     */
    public void setMajor(String major) {
        this.major = major;
    }

    /**
     * @return major2
     */
    public String getMajor2() {
        return major2;
    }

    /**
     * @param major2
     */
    public void setMajor2(String major2) {
        this.major2 = major2;
    }

    /**
     * 获取学位
     *
     * @return degree - 学位
     */
    public String getDegree() {
        return degree;
    }

    /**
     * 设置学位
     *
     * @param degree 学位
     */
    public void setDegree(String degree) {
        this.degree = degree;
    }

    /**
     * @return mobilephone
     */
    public String getMobilephone() {
        return mobilephone;
    }

    /**
     * @param mobilephone
     */
    public void setMobilephone(String mobilephone) {
        this.mobilephone = mobilephone;
    }

    /**
     * 获取性别
     *
     * @return gender - 性别
     */
    public String getGender() {
        return gender;
    }

    /**
     * 设置性别
     *
     * @param gender 性别
     */
    public void setGender(String gender) {
        this.gender = gender;
    }

    /**
     * 获取年龄
     *
     * @return SCORE - 年龄
     */
    public String getScore() {
        return score;
    }

    /**
     * 设置年龄
     *
     * @param score 年龄
     */
    public void setScore(String score) {
        this.score = score;
    }

    /**
     * @return CTYPE
     */
    public String getCtype() {
        return ctype;
    }

    /**
     * @param ctype
     */
    public void setCtype(String ctype) {
        this.ctype = ctype;
    }

    /**
     * 获取专家来源，1代表科技厅导入，2代表项目负责人，3代表专利第一发明人，4代表论文第一作者；5代表教师库爬取导入；21代表项目其他成员，31代表专利其他发明人，41代表论文其他作者，44代表是论文第一作者，但是其单位还没处理，以后要更新替换
     *
     * @return source - 专家来源，1代表科技厅导入，2代表项目负责人，3代表专利第一发明人，4代表论文第一作者；5代表教师库爬取导入；21代表项目其他成员，31代表专利其他发明人，41代表论文其他作者，44代表是论文第一作者，但是其单位还没处理，以后要更新替换
     */
    public String getSource() {
        return source;
    }

    /**
     * 设置专家来源，1代表科技厅导入，2代表项目负责人，3代表专利第一发明人，4代表论文第一作者；5代表教师库爬取导入；21代表项目其他成员，31代表专利其他发明人，41代表论文其他作者，44代表是论文第一作者，但是其单位还没处理，以后要更新替换
     *
     * @param source 专家来源，1代表科技厅导入，2代表项目负责人，3代表专利第一发明人，4代表论文第一作者；5代表教师库爬取导入；21代表项目其他成员，31代表专利其他发明人，41代表论文其他作者，44代表是论文第一作者，但是其单位还没处理，以后要更新替换
     */
    public void setSource(String source) {
        this.source = source;
    }

    /**
     * 获取标记是老师还是学生
     *
     * @return sign - 标记是老师还是学生
     */
    public String getSign() {
        return sign;
    }

    /**
     * 设置标记是老师还是学生
     *
     * @param sign 标记是老师还是学生
     */
    public void setSign(String sign) {
        this.sign = sign;
    }

    /**
     * @return nationalAward
     */
    public String getNationalaward() {
        return nationalaward;
    }

    /**
     * @param nationalaward
     */
    public void setNationalaward(String nationalaward) {
        this.nationalaward = nationalaward;
    }

    /**
     * @return provincialAward
     */
    public String getProvincialaward() {
        return provincialaward;
    }

    /**
     * @param provincialaward
     */
    public void setProvincialaward(String provincialaward) {
        this.provincialaward = provincialaward;
    }

    /**
     * 获取毕业学校
     *
     * @return school - 毕业学校
     */
    public String getSchool() {
        return school;
    }

    /**
     * 设置毕业学校
     *
     * @param school 毕业学校
     */
    public void setSchool(String school) {
        this.school = school;
    }

    /**
     * @return research_field
     */
    public String getResearchField() {
        return researchField;
    }

    /**
     * @param researchField
     */
    public void setResearchField(String researchField) {
        this.researchField = researchField;
    }

    /**
     * @return BACKIDEA
     */
    public String getBackidea() {
        return backidea;
    }

    /**
     * @param backidea
     */
    public void setBackidea(String backidea) {
        this.backidea = backidea;
    }

    /**
     * @return FMZL
     */
    public String getFmzl() {
        return fmzl;
    }

    /**
     * @param fmzl
     */
    public void setFmzl(String fmzl) {
        this.fmzl = fmzl;
    }

    /**
     * @return topicState
     */
    public String getTopicstate() {
        return topicstate;
    }

    /**
     * @param topicstate
     */
    public void setTopicstate(String topicstate) {
        this.topicstate = topicstate;
    }

    /**
     * @return patent
     */
    public String getPatent() {
        return patent;
    }

    /**
     * @param patent
     */
    public void setPatent(String patent) {
        this.patent = patent;
    }

    /**
     * @return REMARKS
     */
    public String getRemarks() {
        return remarks;
    }

    /**
     * @param remarks
     */
    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    /**
     * 获取个人简介
     *
     * @return introduction - 个人简介
     */
    public String getIntroduction() {
        return introduction;
    }

    /**
     * 设置个人简介
     *
     * @param introduction 个人简介
     */
    public void setIntroduction(String introduction) {
        this.introduction = introduction;
    }

    public Expert() {
    }
}