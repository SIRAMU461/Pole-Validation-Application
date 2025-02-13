package com.pva.pole.dto;

import java.util.Locale.Category;

import com.pva.pole.enums.Attachment;
import com.pva.pole.enums.Remarks;
import com.pva.pole.enums.SupportStructure;

import jakarta.validation.constraints.DecimalMax;
import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class PoleDTO {

    private long id;
    
    @NotBlank(message = "Pole ID is mandatory")
    @Size(max = 50, message = "Pole ID should not exceed 50 characters")
    private String poleId;
    
    @NotNull(message = "Category is mandatory")
    private Category category;
    
    @NotNull(message = "Support Structure is mandatory")
    private SupportStructure supportStructure;
    
    @DecimalMin(value = "-180.0", message = "Longitude should be between -180 and 180")
    @DecimalMax(value = "180.0", message = "Longitude should be between -180 and 180")
    private double longitude;
    
    @DecimalMin(value = "-90.0", message = "Latitude should be between -90 and 90")
    @DecimalMax(value = "90.0", message = "Latitude should be between -90 and 90")
    private double latitude;
    
    @NotNull(message = "Attachment is mandatory")
    private Attachment attachment;
    
    @NotNull(message = "Remarks is mandatory")
    private Remarks remarks;
    
    @Size(max = 500, message = "Additional Remarks should not exceed 500 characters")
    private String additionalRemarks;

    public PoleDTO() {
        super();
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getPoleId() {
        return poleId;
    }

    public void setPoleId(String poleId) {
        this.poleId = poleId;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public SupportStructure getSupportStructure() {
        return supportStructure;
    }

    public void setSupportStructure(SupportStructure supportStructure) {
        this.supportStructure = supportStructure;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public Attachment getAttachment() {
        return attachment;
    }

    public void setAttachment(Attachment attachment) {
        this.attachment = attachment;
    }

    public Remarks getRemarks() {
        return remarks;
    }

    public void setRemarks(Remarks remarks) {
        this.remarks = remarks;
    }

    public String getAdditionalRemarks() {
        return additionalRemarks;
    }

    public void setAdditionalRemarks(String additionalRemarks) {
        this.additionalRemarks = additionalRemarks;
    }

    @Override
    public String toString() {
        return "PoleDTO [id=" + id + ", poleId=" + poleId + ", category=" + category + ", supportStructure="
                + supportStructure + ", longitude=" + longitude + ", latitude=" + latitude + ", attachment="
                + attachment + ", remarks=" + remarks + ", additionalRemarks=" + additionalRemarks + "]";
    }
}
