package com.company.project.model;

import javax.persistence.*;

public class Paper {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 论文唯一ID
     */
    @Column(name = "PAPER_ID")
    private String paperId;

    /**
     * 名称
     */
    private String name;

    /**
     * 所有作者
     */
    private String authors;

    /**
     * 所有作者知网代号
     */
    @Column(name = "authors_code")
    private String authorsCode;

    /**
     * 未来删除
     */
    @Column(name = "first_organization")
    private String firstOrganization;

    /**
     * 第一作者标准大单位
     */
    private String unit;

    /**
     * 所有单位
     */
    private String organization;

    /**
     * 第一作者
     */
    @Column(name = "first_author")
    private String firstAuthor;

    /**
     * 第一作者的单位（主要是来源于百度学术）
     */
    @Column(name = "first_author_unit")
    private String firstAuthorUnit;

    /**
     * 第一作者在百度学术中的查找情况（01：百度学术中有专家页面，02：百度学术中没有专家页面，但是查找到，99：没有在百度学术中查找到）
     */
    @Column(name = "first_author_baidu")
    private String firstAuthorBaidu;

    /**
     * 第一作者代号
     */
    @Column(name = "first_author_code")
    private String firstAuthorCode;

    /**
     * 第二作者
     */
    @Column(name = "second_author")
    private String secondAuthor;

    /**
     * 第二作者的单位（主要是来源于百度学术）
     */
    @Column(name = "second_author_unit")
    private String secondAuthorUnit;

    /**
     * 第二作者在百度学术中的查找情况（01：百度学术中有专家页面，02：百度学术中没有专家页面，但是查找到，99：没有在百度学术中查找到）
     */
    @Column(name = "second_author_baidu")
    private String secondAuthorBaidu;

    /**
     * 第二作者代号
     */
    @Column(name = "second_author_code")
    private String secondAuthorCode;

    /**
     * 第三作者
     */
    @Column(name = "third_author")
    private String thirdAuthor;

    /**
     * 第三作者的单位（主要是来源于百度学术）
     */
    @Column(name = "third_author_unit")
    private String thirdAuthorUnit;

    /**
     * 第三作者在百度学术中的查找情况（01：百度学术中有专家页面，02：百度学术中没有专家页面，但是查找到，99：没有在百度学术中查找到）
     */
    @Column(name = "third_author_baidu")
    private String thirdAuthorBaidu;

    /**
     * 第三作者代号
     */
    @Column(name = "third_author_code")
    private String thirdAuthorCode;

    /**
     * 第四作者
     */
    @Column(name = "fourth_author")
    private String fourthAuthor;

    /**
     * 第四作者的单位（主要是来源于百度学术）
     */
    @Column(name = "fourth_author_unit")
    private String fourthAuthorUnit;

    /**
     * 第四作者在百度学术中的查找情况（01：百度学术中有专家页面，02：百度学术中没有专家页面，但是查找到，99：没有在百度学术中查找到）
     */
    @Column(name = "fourth_author_baidu")
    private String fourthAuthorBaidu;

    /**
     * 第四作者代号
     */
    @Column(name = "fourth_author_code")
    private String fourthAuthorCode;

    /**
     * 关键词
     */
    private String keywords;

    /**
     * 引用次数
     */
    private String citations;

    /**
     * 下载次数
     */
    private String downloads;

    /**
     * 分类号及其他信息字符串
     */
    @Column(name = "classification_str")
    private String classificationStr;

    /**
     * 分类号
     */
    private String classification;

    /**
     * 知网论文的code
     */
    @Column(name = "zw_paper_code")
    private String zwPaperCode;

    /**
     * 知网学科代号
     */
    @Column(name = "zw_subject_code")
    private String zwSubjectCode;

    /**
     * 学科代号
     */
    @Column(name = "subject_code")
    private String subjectCode;

    /**
     * 老的学科分类
     */
    @Column(name = "subject_code_old")
    private String subjectCodeOld;

    /**
     * 年份
     */
    private String year;

    /**
     * 地区
     */
    @Column(name = "area_code")
    private String areaCode;

    /**
     * 期刊名称
     */
    @Column(name = "journal_name")
    private String journalName;

    /**
     * 期刊号
     */
    @Column(name = "journal_no")
    private String journalNo;

    /**
     * 期刊质量（1代表SCI，2代表一级期刊，3代表EI，4代表核心期刊，5代表非核心好期刊，6代表水刊，7代表学位论文）
     */
    @Column(name = "journal_quality")
    private String journalQuality;

    /**
     * 期刊链接
     */
    @Column(name = "journal_url")
    private String journalUrl;

    /**
     * 链接
     */
    private String url;

    /**
     * 标记第一作者是否已经抽取
     */
    private Integer flag;

    /**
     * 单位类别
     */
    @Column(name = "unit_type")
    private String unitType;

    /**
     * 摘要
     */

    @Column(name = "abstract")
    private String paperAbstract;

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
     * 获取论文唯一ID
     *
     * @return PAPER_ID - 论文唯一ID
     */
    public String getPaperId() {
        return paperId;
    }

    /**
     * 设置论文唯一ID
     *
     * @param paperId 论文唯一ID
     */
    public void setPaperId(String paperId) {
        this.paperId = paperId;
    }

    /**
     * 获取名称
     *
     * @return name - 名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置名称
     *
     * @param name 名称
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取所有作者
     *
     * @return authors - 所有作者
     */
    public String getAuthors() {
        return authors;
    }

    /**
     * 设置所有作者
     *
     * @param authors 所有作者
     */
    public void setAuthors(String authors) {
        this.authors = authors;
    }

    /**
     * 获取所有作者知网代号
     *
     * @return authors_code - 所有作者知网代号
     */
    public String getAuthorsCode() {
        return authorsCode;
    }

    /**
     * 设置所有作者知网代号
     *
     * @param authorsCode 所有作者知网代号
     */
    public void setAuthorsCode(String authorsCode) {
        this.authorsCode = authorsCode;
    }

    /**
     * 获取未来删除
     *
     * @return first_organization - 未来删除
     */
    public String getFirstOrganization() {
        return firstOrganization;
    }

    /**
     * 设置未来删除
     *
     * @param firstOrganization 未来删除
     */
    public void setFirstOrganization(String firstOrganization) {
        this.firstOrganization = firstOrganization;
    }

    /**
     * 获取第一作者标准大单位
     *
     * @return unit - 第一作者标准大单位
     */
    public String getUnit() {
        return unit;
    }

    /**
     * 设置第一作者标准大单位
     *
     * @param unit 第一作者标准大单位
     */
    public void setUnit(String unit) {
        this.unit = unit;
    }

    /**
     * 获取所有单位
     *
     * @return organization - 所有单位
     */
    public String getOrganization() {
        return organization;
    }

    /**
     * 设置所有单位
     *
     * @param organization 所有单位
     */
    public void setOrganization(String organization) {
        this.organization = organization;
    }

    /**
     * 获取第一作者
     *
     * @return first_author - 第一作者
     */
    public String getFirstAuthor() {
        return firstAuthor;
    }

    /**
     * 设置第一作者
     *
     * @param firstAuthor 第一作者
     */
    public void setFirstAuthor(String firstAuthor) {
        this.firstAuthor = firstAuthor;
    }

    /**
     * 获取第一作者的单位（主要是来源于百度学术）
     *
     * @return first_author_unit - 第一作者的单位（主要是来源于百度学术）
     */
    public String getFirstAuthorUnit() {
        return firstAuthorUnit;
    }

    /**
     * 设置第一作者的单位（主要是来源于百度学术）
     *
     * @param firstAuthorUnit 第一作者的单位（主要是来源于百度学术）
     */
    public void setFirstAuthorUnit(String firstAuthorUnit) {
        this.firstAuthorUnit = firstAuthorUnit;
    }

    /**
     * 获取第一作者在百度学术中的查找情况（01：百度学术中有专家页面，02：百度学术中没有专家页面，但是查找到，99：没有在百度学术中查找到）
     *
     * @return first_author_baidu - 第一作者在百度学术中的查找情况（01：百度学术中有专家页面，02：百度学术中没有专家页面，但是查找到，99：没有在百度学术中查找到）
     */
    public String getFirstAuthorBaidu() {
        return firstAuthorBaidu;
    }

    /**
     * 设置第一作者在百度学术中的查找情况（01：百度学术中有专家页面，02：百度学术中没有专家页面，但是查找到，99：没有在百度学术中查找到）
     *
     * @param firstAuthorBaidu 第一作者在百度学术中的查找情况（01：百度学术中有专家页面，02：百度学术中没有专家页面，但是查找到，99：没有在百度学术中查找到）
     */
    public void setFirstAuthorBaidu(String firstAuthorBaidu) {
        this.firstAuthorBaidu = firstAuthorBaidu;
    }

    /**
     * 获取第一作者代号
     *
     * @return first_author_code - 第一作者代号
     */
    public String getFirstAuthorCode() {
        return firstAuthorCode;
    }

    /**
     * 设置第一作者代号
     *
     * @param firstAuthorCode 第一作者代号
     */
    public void setFirstAuthorCode(String firstAuthorCode) {
        this.firstAuthorCode = firstAuthorCode;
    }

    /**
     * 获取第二作者
     *
     * @return second_author - 第二作者
     */
    public String getSecondAuthor() {
        return secondAuthor;
    }

    /**
     * 设置第二作者
     *
     * @param secondAuthor 第二作者
     */
    public void setSecondAuthor(String secondAuthor) {
        this.secondAuthor = secondAuthor;
    }

    /**
     * 获取第二作者的单位（主要是来源于百度学术）
     *
     * @return second_author_unit - 第二作者的单位（主要是来源于百度学术）
     */
    public String getSecondAuthorUnit() {
        return secondAuthorUnit;
    }

    /**
     * 设置第二作者的单位（主要是来源于百度学术）
     *
     * @param secondAuthorUnit 第二作者的单位（主要是来源于百度学术）
     */
    public void setSecondAuthorUnit(String secondAuthorUnit) {
        this.secondAuthorUnit = secondAuthorUnit;
    }

    /**
     * 获取第二作者在百度学术中的查找情况（01：百度学术中有专家页面，02：百度学术中没有专家页面，但是查找到，99：没有在百度学术中查找到）
     *
     * @return second_author_baidu - 第二作者在百度学术中的查找情况（01：百度学术中有专家页面，02：百度学术中没有专家页面，但是查找到，99：没有在百度学术中查找到）
     */
    public String getSecondAuthorBaidu() {
        return secondAuthorBaidu;
    }

    /**
     * 设置第二作者在百度学术中的查找情况（01：百度学术中有专家页面，02：百度学术中没有专家页面，但是查找到，99：没有在百度学术中查找到）
     *
     * @param secondAuthorBaidu 第二作者在百度学术中的查找情况（01：百度学术中有专家页面，02：百度学术中没有专家页面，但是查找到，99：没有在百度学术中查找到）
     */
    public void setSecondAuthorBaidu(String secondAuthorBaidu) {
        this.secondAuthorBaidu = secondAuthorBaidu;
    }

    /**
     * 获取第二作者代号
     *
     * @return second_author_code - 第二作者代号
     */
    public String getSecondAuthorCode() {
        return secondAuthorCode;
    }

    /**
     * 设置第二作者代号
     *
     * @param secondAuthorCode 第二作者代号
     */
    public void setSecondAuthorCode(String secondAuthorCode) {
        this.secondAuthorCode = secondAuthorCode;
    }

    /**
     * 获取第三作者
     *
     * @return third_author - 第三作者
     */
    public String getThirdAuthor() {
        return thirdAuthor;
    }

    /**
     * 设置第三作者
     *
     * @param thirdAuthor 第三作者
     */
    public void setThirdAuthor(String thirdAuthor) {
        this.thirdAuthor = thirdAuthor;
    }

    /**
     * 获取第三作者的单位（主要是来源于百度学术）
     *
     * @return third_author_unit - 第三作者的单位（主要是来源于百度学术）
     */
    public String getThirdAuthorUnit() {
        return thirdAuthorUnit;
    }

    /**
     * 设置第三作者的单位（主要是来源于百度学术）
     *
     * @param thirdAuthorUnit 第三作者的单位（主要是来源于百度学术）
     */
    public void setThirdAuthorUnit(String thirdAuthorUnit) {
        this.thirdAuthorUnit = thirdAuthorUnit;
    }

    /**
     * 获取第三作者在百度学术中的查找情况（01：百度学术中有专家页面，02：百度学术中没有专家页面，但是查找到，99：没有在百度学术中查找到）
     *
     * @return third_author_baidu - 第三作者在百度学术中的查找情况（01：百度学术中有专家页面，02：百度学术中没有专家页面，但是查找到，99：没有在百度学术中查找到）
     */
    public String getThirdAuthorBaidu() {
        return thirdAuthorBaidu;
    }

    /**
     * 设置第三作者在百度学术中的查找情况（01：百度学术中有专家页面，02：百度学术中没有专家页面，但是查找到，99：没有在百度学术中查找到）
     *
     * @param thirdAuthorBaidu 第三作者在百度学术中的查找情况（01：百度学术中有专家页面，02：百度学术中没有专家页面，但是查找到，99：没有在百度学术中查找到）
     */
    public void setThirdAuthorBaidu(String thirdAuthorBaidu) {
        this.thirdAuthorBaidu = thirdAuthorBaidu;
    }

    /**
     * 获取第三作者代号
     *
     * @return third_author_code - 第三作者代号
     */
    public String getThirdAuthorCode() {
        return thirdAuthorCode;
    }

    /**
     * 设置第三作者代号
     *
     * @param thirdAuthorCode 第三作者代号
     */
    public void setThirdAuthorCode(String thirdAuthorCode) {
        this.thirdAuthorCode = thirdAuthorCode;
    }

    /**
     * 获取第四作者
     *
     * @return fourth_author - 第四作者
     */
    public String getFourthAuthor() {
        return fourthAuthor;
    }

    /**
     * 设置第四作者
     *
     * @param fourthAuthor 第四作者
     */
    public void setFourthAuthor(String fourthAuthor) {
        this.fourthAuthor = fourthAuthor;
    }

    /**
     * 获取第四作者的单位（主要是来源于百度学术）
     *
     * @return fourth_author_unit - 第四作者的单位（主要是来源于百度学术）
     */
    public String getFourthAuthorUnit() {
        return fourthAuthorUnit;
    }

    /**
     * 设置第四作者的单位（主要是来源于百度学术）
     *
     * @param fourthAuthorUnit 第四作者的单位（主要是来源于百度学术）
     */
    public void setFourthAuthorUnit(String fourthAuthorUnit) {
        this.fourthAuthorUnit = fourthAuthorUnit;
    }

    /**
     * 获取第四作者在百度学术中的查找情况（01：百度学术中有专家页面，02：百度学术中没有专家页面，但是查找到，99：没有在百度学术中查找到）
     *
     * @return fourth_author_baidu - 第四作者在百度学术中的查找情况（01：百度学术中有专家页面，02：百度学术中没有专家页面，但是查找到，99：没有在百度学术中查找到）
     */
    public String getFourthAuthorBaidu() {
        return fourthAuthorBaidu;
    }

    /**
     * 设置第四作者在百度学术中的查找情况（01：百度学术中有专家页面，02：百度学术中没有专家页面，但是查找到，99：没有在百度学术中查找到）
     *
     * @param fourthAuthorBaidu 第四作者在百度学术中的查找情况（01：百度学术中有专家页面，02：百度学术中没有专家页面，但是查找到，99：没有在百度学术中查找到）
     */
    public void setFourthAuthorBaidu(String fourthAuthorBaidu) {
        this.fourthAuthorBaidu = fourthAuthorBaidu;
    }

    /**
     * 获取第四作者代号
     *
     * @return fourth_author_code - 第四作者代号
     */
    public String getFourthAuthorCode() {
        return fourthAuthorCode;
    }

    /**
     * 设置第四作者代号
     *
     * @param fourthAuthorCode 第四作者代号
     */
    public void setFourthAuthorCode(String fourthAuthorCode) {
        this.fourthAuthorCode = fourthAuthorCode;
    }

    /**
     * 获取关键词
     *
     * @return keywords - 关键词
     */
    public String getKeywords() {
        return keywords;
    }

    /**
     * 设置关键词
     *
     * @param keywords 关键词
     */
    public void setKeywords(String keywords) {
        this.keywords = keywords;
    }

    /**
     * 获取引用次数
     *
     * @return citations - 引用次数
     */
    public String getCitations() {
        return citations;
    }

    /**
     * 设置引用次数
     *
     * @param citations 引用次数
     */
    public void setCitations(String citations) {
        this.citations = citations;
    }

    /**
     * 获取下载次数
     *
     * @return downloads - 下载次数
     */
    public String getDownloads() {
        return downloads;
    }

    /**
     * 设置下载次数
     *
     * @param downloads 下载次数
     */
    public void setDownloads(String downloads) {
        this.downloads = downloads;
    }

    /**
     * 获取分类号及其他信息字符串
     *
     * @return classification_str - 分类号及其他信息字符串
     */
    public String getClassificationStr() {
        return classificationStr;
    }

    /**
     * 设置分类号及其他信息字符串
     *
     * @param classificationStr 分类号及其他信息字符串
     */
    public void setClassificationStr(String classificationStr) {
        this.classificationStr = classificationStr;
    }

    /**
     * 获取分类号
     *
     * @return classification - 分类号
     */
    public String getClassification() {
        return classification;
    }

    /**
     * 设置分类号
     *
     * @param classification 分类号
     */
    public void setClassification(String classification) {
        this.classification = classification;
    }

    /**
     * 获取知网论文的code
     *
     * @return zw_paper_code - 知网论文的code
     */
    public String getZwPaperCode() {
        return zwPaperCode;
    }

    /**
     * 设置知网论文的code
     *
     * @param zwPaperCode 知网论文的code
     */
    public void setZwPaperCode(String zwPaperCode) {
        this.zwPaperCode = zwPaperCode;
    }

    /**
     * 获取知网学科代号
     *
     * @return zw_subject_code - 知网学科代号
     */
    public String getZwSubjectCode() {
        return zwSubjectCode;
    }

    /**
     * 设置知网学科代号
     *
     * @param zwSubjectCode 知网学科代号
     */
    public void setZwSubjectCode(String zwSubjectCode) {
        this.zwSubjectCode = zwSubjectCode;
    }

    /**
     * 获取学科代号
     *
     * @return subject_code - 学科代号
     */
    public String getSubjectCode() {
        return subjectCode;
    }

    /**
     * 设置学科代号
     *
     * @param subjectCode 学科代号
     */
    public void setSubjectCode(String subjectCode) {
        this.subjectCode = subjectCode;
    }

    /**
     * 获取老的学科分类
     *
     * @return subject_code_old - 老的学科分类
     */
    public String getSubjectCodeOld() {
        return subjectCodeOld;
    }

    /**
     * 设置老的学科分类
     *
     * @param subjectCodeOld 老的学科分类
     */
    public void setSubjectCodeOld(String subjectCodeOld) {
        this.subjectCodeOld = subjectCodeOld;
    }

    /**
     * 获取年份
     *
     * @return year - 年份
     */
    public String getYear() {
        return year;
    }

    /**
     * 设置年份
     *
     * @param year 年份
     */
    public void setYear(String year) {
        this.year = year;
    }

    /**
     * 获取地区
     *
     * @return area_code - 地区
     */
    public String getAreaCode() {
        return areaCode;
    }

    /**
     * 设置地区
     *
     * @param areaCode 地区
     */
    public void setAreaCode(String areaCode) {
        this.areaCode = areaCode;
    }

    /**
     * 获取期刊名称
     *
     * @return journal_name - 期刊名称
     */
    public String getJournalName() {
        return journalName;
    }

    /**
     * 设置期刊名称
     *
     * @param journalName 期刊名称
     */
    public void setJournalName(String journalName) {
        this.journalName = journalName;
    }

    /**
     * 获取期刊号
     *
     * @return journal_no - 期刊号
     */
    public String getJournalNo() {
        return journalNo;
    }

    /**
     * 设置期刊号
     *
     * @param journalNo 期刊号
     */
    public void setJournalNo(String journalNo) {
        this.journalNo = journalNo;
    }

    /**
     * 获取期刊质量（1代表SCI，2代表一级期刊，3代表EI，4代表核心期刊，5代表非核心好期刊，6代表水刊，7代表学位论文）
     *
     * @return journal_quality - 期刊质量（1代表SCI，2代表一级期刊，3代表EI，4代表核心期刊，5代表非核心好期刊，6代表水刊，7代表学位论文）
     */
    public String getJournalQuality() {
        return journalQuality;
    }

    /**
     * 设置期刊质量（1代表SCI，2代表一级期刊，3代表EI，4代表核心期刊，5代表非核心好期刊，6代表水刊，7代表学位论文）
     *
     * @param journalQuality 期刊质量（1代表SCI，2代表一级期刊，3代表EI，4代表核心期刊，5代表非核心好期刊，6代表水刊，7代表学位论文）
     */
    public void setJournalQuality(String journalQuality) {
        this.journalQuality = journalQuality;
    }

    /**
     * 获取期刊链接
     *
     * @return journal_url - 期刊链接
     */
    public String getJournalUrl() {
        return journalUrl;
    }

    /**
     * 设置期刊链接
     *
     * @param journalUrl 期刊链接
     */
    public void setJournalUrl(String journalUrl) {
        this.journalUrl = journalUrl;
    }

    /**
     * 获取链接
     *
     * @return url - 链接
     */
    public String getUrl() {
        return url;
    }

    /**
     * 设置链接
     *
     * @param url 链接
     */
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * 获取标记第一作者是否已经抽取
     *
     * @return flag - 标记第一作者是否已经抽取
     */
    public Integer getFlag() {
        return flag;
    }

    /**
     * 设置标记第一作者是否已经抽取
     *
     * @param flag 标记第一作者是否已经抽取
     */
    public void setFlag(Integer flag) {
        this.flag = flag;
    }

    /**
     * 获取单位类别
     *
     * @return unit_type - 单位类别
     */
    public String getUnitType() {
        return unitType;
    }

    /**
     * 设置单位类别
     *
     * @param unitType 单位类别
     */
    public void setUnitType(String unitType) {
        this.unitType = unitType;
    }

    /**
     * 获取摘要
     *
     * @return paperAbstract - 摘要
     */
    public String getAbstract() {
        return paperAbstract;
    }

    /**
     * 设置摘要
     *
     * @param paperAbstract - 摘要
     */
    public void setAbstract(String paperAbstract) {
        this.paperAbstract = paperAbstract;
    }

    public Paper() {
    }
}