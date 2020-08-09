package com.company.project.model;

import javax.persistence.*;

@Table(name = "expert_paper_join")
public class ExpertPaperJoin {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 专家ID
     */
    @Column(name = "EXPERT_ID")
    private String expertId;

    /**
     * 专家名字
     */
    @Column(name = "expert_name")
    private String expertName;

    /**
     * 专家在对应的成果中扮演的角色，1代表第一作者（负责人、第一发明人），2代表第二作者，3代表第三作者，4代表第四作者，以此类推
     */
    @Column(name = "expert_role")
    private Integer expertRole;

    /**
     * 论文ID
     */
    @Column(name = "PAPER_ID")
    private String paperId;

    /**
     * 论文名称
     */
    @Column(name = "paper_name")
    private String paperName;

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
     * 获取专家ID
     *
     * @return EXPERT_ID - 专家ID
     */
    public String getExpertId() {
        return expertId;
    }

    /**
     * 设置专家ID
     *
     * @param expertId 专家ID
     */
    public void setExpertId(String expertId) {
        this.expertId = expertId;
    }

    /**
     * 获取专家名字
     *
     * @return expert_name - 专家名字
     */
    public String getExpertName() {
        return expertName;
    }

    /**
     * 设置专家名字
     *
     * @param expertName 专家名字
     */
    public void setExpertName(String expertName) {
        this.expertName = expertName;
    }

    /**
     * 获取专家在对应的成果中扮演的角色，1代表第一作者（负责人、第一发明人），2代表第二作者，3代表第三作者，4代表第四作者，以此类推
     *
     * @return expert_role - 专家在对应的成果中扮演的角色，1代表第一作者（负责人、第一发明人），2代表第二作者，3代表第三作者，4代表第四作者，以此类推
     */
    public Integer getExpertRole() {
        return expertRole;
    }

    /**
     * 设置专家在对应的成果中扮演的角色，1代表第一作者（负责人、第一发明人），2代表第二作者，3代表第三作者，4代表第四作者，以此类推
     *
     * @param expertRole 专家在对应的成果中扮演的角色，1代表第一作者（负责人、第一发明人），2代表第二作者，3代表第三作者，4代表第四作者，以此类推
     */
    public void setExpertRole(Integer expertRole) {
        this.expertRole = expertRole;
    }

    /**
     * 获取论文ID
     *
     * @return PAPER_ID - 论文ID
     */
    public String getPaperId() {
        return paperId;
    }

    /**
     * 设置论文ID
     *
     * @param paperId 论文ID
     */
    public void setPaperId(String paperId) {
        this.paperId = paperId;
    }

    /**
     * 获取论文名称
     *
     * @return paper_name - 论文名称
     */
    public String getPaperName() {
        return paperName;
    }

    /**
     * 设置论文名称
     *
     * @param paperName 论文名称
     */
    public void setPaperName(String paperName) {
        this.paperName = paperName;
    }

    public ExpertPaperJoin() {
    }
}