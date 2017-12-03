package com.labausegtic.aresvi.service.dto;

import javax.validation.constraints.*;
import java.io.Serializable;
import java.time.Instant;
import java.util.Set;
import java.util.Objects;
import javax.persistence.Lob;

/**
 * A DTO for the AuditTaskRecommendation entity.
 */
public class AuditTaskRecommendationDTO implements Serializable {

    private Long id;

    @NotNull
    @Lob
    private String description;

    private boolean reviewed;

    private String standardObservation;

    private Long auditProcessRecomId;

    private Long auditTaskId;

    private AuditTaskDTO auditTask;

    private Set<CategoryAttrRecommendationDTO> CategoryAttrRecommendationSet;

    private Instant revisedDate;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Long getAuditProcessRecomId() {
        return auditProcessRecomId;
    }

    public void setAuditProcessRecomId(Long auditProcessRecommendationId) {
        this.auditProcessRecomId = auditProcessRecommendationId;
    }

    public Long getAuditTaskId() {
        return auditTaskId;
    }

    public void setAuditTaskId(Long auditTaskId) {
        this.auditTaskId = auditTaskId;
    }

    public AuditTaskDTO getAuditTask() {
        return auditTask;
    }

    public void setAuditTask(AuditTaskDTO auditTask) {
        this.auditTask = auditTask;
    }

    public Set<CategoryAttrRecommendationDTO> getCategoryAttrRecommendationSet() {
        return CategoryAttrRecommendationSet;
    }

    public void setCategoryAttrRecommendationSet(Set<CategoryAttrRecommendationDTO> categoryAttrRecommendationSet) {
        CategoryAttrRecommendationSet = categoryAttrRecommendationSet;
    }

    public boolean isReviewed() {
        return reviewed;
    }

    public void setReviewed(boolean reviewed) {
        this.reviewed = reviewed;
    }

    public Instant getRevisedDate() {
        return revisedDate;
    }

    public void setRevisedDate(Instant revisedDate) {
        this.revisedDate = revisedDate;
    }

    public String getStandardObservation() {
        return standardObservation;
    }

    public void setStandardObservation(String standardObservation) {
        this.standardObservation = standardObservation;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        AuditTaskRecommendationDTO auditTaskRecommendationDTO = (AuditTaskRecommendationDTO) o;
        if(auditTaskRecommendationDTO.getId() == null || getId() == null) {
            return false;
        }
        return Objects.equals(getId(), auditTaskRecommendationDTO.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getId());
    }

    @Override
    public String toString() {
        return "AuditTaskRecommendationDTO{" +
            "id=" + getId() +
            ", description='" + getDescription() + "'" +
            "}";
    }
}
