package edu.miu.cs.cs425.lesson10.lab8.studentsmgmtapp.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="transcripts")
public class Transcript {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long transcriptId;
	@Column(name="degree_titler", nullable=false)
	private String degreeTitle;
	
	@OneToOne(mappedBy = "transcript")
	private Student student;
	
	public Transcript(String degreeTitle) {
		this.degreeTitle = degreeTitle;
	}

	public Transcript(long transcriptId, String degreeTitle) {
		this.transcriptId = transcriptId;
		this.degreeTitle = degreeTitle;
	}

	
	public long getTranscriptId() {
		return transcriptId;
	}

	public void setTranscriptId(long transcriptId) {
		this.transcriptId = transcriptId;
	}

	public String getDegreeTitle() {
		return degreeTitle;
	}

	public void setDegreeTitle(String degreeTitle) {
		this.degreeTitle = degreeTitle;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	@Override
	public String toString() {
		return String.format("Transcript [transcriptId=%s, degreeTitle=%s]", transcriptId, degreeTitle);
	}
	
}
