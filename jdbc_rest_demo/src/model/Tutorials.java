package model;

import java.time.LocalDate;
import java.util.Objects;

public class Tutorials {
	private int tutorialId;
	private String tutorialName;
	private LocalDate startDate;
	private int duration;
	
	public int getTutorialId() {
		return tutorialId;
	}
	public void setTutorialId(int tutorialId) {
		this.tutorialId = tutorialId;
	}
	public String getTutorialName() {
		return tutorialName;
	}
	public void setTutorialName(String tutorialName) {
		this.tutorialName = tutorialName;
	}
	public LocalDate getStartDate() {
		return startDate;
	}
	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	
	public Tutorials() {
	
	}
	
	public Tutorials(int tutorialId, String tutorialName, LocalDate startDate, int duration) {
		this.tutorialId = tutorialId;
		this.tutorialName = tutorialName;
		this.startDate = startDate;
		this.duration = duration;
	}
	
	@Override
	public String toString() {
		return "Tutorials [tutorialId=" + tutorialId + ", tutorialName=" + tutorialName + ", startDate=" + startDate
				+ ", duration=" + duration + "]";
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(duration, startDate, tutorialId, tutorialName);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Tutorials other = (Tutorials) obj;
		return duration == other.duration && Objects.equals(startDate, other.startDate)
				&& tutorialId == other.tutorialId && Objects.equals(tutorialName, other.tutorialName);
	}
	
	
}
