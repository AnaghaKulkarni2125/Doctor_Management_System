package org.bmit.doctormanagement;

import java.util.Arrays;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

@Entity
@Table(name="doctor1_tbl")
public class Doctor {
	@Id
	@GeneratedValue (strategy=GenerationType.IDENTITY)
	@Column(name="doc_id")
	private int seqNo;
	
	@Column(name ="doc_name")
	private String docName;
	
	@Column(name="doc_qualification")
	private String docQualification;
	
	@Lob
	@Column(name="doc_image")
	private byte[] image;

	public int getSeqNo() {
		return seqNo;
	}

	public void setSeqNo(int seqNo) {
		this.seqNo = seqNo;
	}

	public String getDocName() {
		return docName;
	}

	public void setDocName(String docName) {
		this.docName = docName;
	}

	public String getDocQualification() {
		return docQualification;
	}

	public void setDocQualification(String docQualification) {
		this.docQualification = docQualification;
	}

	public byte[] getImage() {
		return image;
	}

	public void setImage(byte[] image) {
		this.image = image;
	}

	@Override
	public String toString() {
		return "Doctor [seqNo=" + seqNo + ", docName=" + docName + ", docQualification=" + docQualification + ", image="
				+ Arrays.toString(image) + "]";
	}

}

