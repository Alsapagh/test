package com.egabi.test.test.entities;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "COUNTRIES", schema = "HR", catalog = "")
public class CountriesEntity {
    private String countryId;
    private String countryName;
    private Long regionId;

    @Id
    @Column(name = "COUNTRY_ID")
    public String getCountryId() {
        return countryId;
    }

    public void setCountryId(String countryId) {
        this.countryId = countryId;
    }

    @Basic
    @Column(name = "COUNTRY_NAME")
    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    @Basic
    @Column(name = "REGION_ID")
    public Long getRegionId() {
        return regionId;
    }

    public void setRegionId(Long regionId) {
        this.regionId = regionId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CountriesEntity that = (CountriesEntity) o;
        return Objects.equals(countryId, that.countryId) &&
                Objects.equals(countryName, that.countryName) &&
                Objects.equals(regionId, that.regionId);
    }

    @Override
    public int hashCode() {

        return Objects.hash(countryId, countryName, regionId);
    }
}
