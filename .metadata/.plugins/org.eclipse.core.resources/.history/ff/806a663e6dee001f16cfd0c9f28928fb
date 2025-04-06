package com.pva.pole.entity;

import com.pva.pole.enums.Attachment;
import com.pva.pole.enums.Remarks;
import com.pva.pole.enums.SupportStructure;
import com.pva.pole.enums.category;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;


@Entity
public class Pole {
	
	@Id
	private long id ;
	
	private String  poleId;
	
	private category category;
	
	private SupportStructure  supportStructure;
	
	private double longitude ;
	
	private double latitude;
	
	private Attachment attachment ;
	
	private Remarks remarks;
	
	private String additionalRemarks;

	public Pole() {
		super();
	}

	public Pole(long id, String poleId, com.pva.pole.enums.category category, SupportStructure supportStructure,
			double longitude, double latitude, Attachment attachment, Remarks remarks, String additionalRemarks) {
		super();
		this.id = id;
		this.poleId = poleId;
		this.category = category;
		this.supportStructure = supportStructure;
		this.longitude = longitude;
		this.latitude = latitude;
		this.attachment = attachment;
		this.remarks = remarks;
		this.additionalRemarks = additionalRemarks;
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

	public category getCategory() {
		return category;
	}

	public void setCategory(category category) {
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
		return "Pole [id=" + id + ", poleId=" + poleId + ", category=" + category + ", supportStructure="
				+ supportStructure + ", longitude=" + longitude + ", latitude=" + latitude + ", attachment="
				+ attachment + ", remarks=" + remarks + ", additionalRemarks=" + additionalRemarks + "]";
	}
	
	
	
	
	
	
	
	
	
	

}
