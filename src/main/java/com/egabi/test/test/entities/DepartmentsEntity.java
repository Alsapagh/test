package com.egabi.test.test.entities;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "DEPARTMENTS", schema = "HR", catalog = "")
public class DepartmentsEntity {
    private long departmentId;
    private String departmentName;
    private Long managerId;
    private Long locationId;

    @Id
    @Column(name = "DEPARTMENT_ID")
    public long getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(long departmentId) {
        this.departmentId = departmentId;
    }

    @Basic
    @Column(name = "DEPARTMENT_NAME")
    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    @Basic
    @Column(name = "MANAGER_ID")
    public Long getManagerId() {
        return managerId;
    }

    public void setManagerId(Long managerId) {
        this.managerId = managerId;
    }

    @Basic
    @Column(name = "LOCATION_ID")
    public Long getLocationId() {
        return locationId;
    }

    public void setLocationId(Long locationId) {
        this.locationId = locationId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DepartmentsEntity that = (DepartmentsEntity) o;
        return departmentId == that.departmentId &&
                Objects.equals(departmentName, that.departmentName) &&
                Objects.equals(managerId, that.managerId) &&
                Objects.equals(locationId, that.locationId);
    }

    @Override
    public int hashCode() {

        return Objects.hash(departmentId, departmentName, managerId, locationId);
    }
}
