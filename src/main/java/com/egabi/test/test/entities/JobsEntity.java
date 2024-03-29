package com.egabi.test.test.entities;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "JOBS", schema = "HR", catalog = "")
public class JobsEntity {
    private String jobId;
    private String jobTitle;
    private Long minSalary;
    private Long maxSalary;

    @Id
    @Column(name = "JOB_ID")
    public String getJobId() {
        return jobId;
    }

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    @Basic
    @Column(name = "JOB_TITLE")
    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    @Basic
    @Column(name = "MIN_SALARY")
    public Long getMinSalary() {
        return minSalary;
    }

    public void setMinSalary(Long minSalary) {
        this.minSalary = minSalary;
    }

    @Basic
    @Column(name = "MAX_SALARY")
    public Long getMaxSalary() {
        return maxSalary;
    }

    public void setMaxSalary(Long maxSalary) {
        this.maxSalary = maxSalary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        JobsEntity that = (JobsEntity) o;
        return Objects.equals(jobId, that.jobId) &&
                Objects.equals(jobTitle, that.jobTitle) &&
                Objects.equals(minSalary, that.minSalary) &&
                Objects.equals(maxSalary, that.maxSalary);
    }

    @Override
    public int hashCode() {

        return Objects.hash(jobId, jobTitle, minSalary, maxSalary);
    }
}
