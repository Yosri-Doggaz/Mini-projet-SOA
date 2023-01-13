package com.example.demo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Entity
public class Score {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long idFolder;
	private int score=0;
	private String evaluation="Rouge";
	
	public void calculateScore(requestType r) {
		if(r.bct) {
			if(r.salaire >= 2000) {
				this.score+= 20;
			}else if(r.salaire > 1000 && r.salaire <2000) {
				this.score+= 10;
			}
			
			if(r.typeContrat.equals("CDI")) {
				this.score+= 30;
			}
			
			if( ( r.mensualite / r.salaire ) < 0.45 ) {
				this.score+= 50;
			}
		}
		if(this.score >= 50) {
			this.evaluation = "Vert";
		}
		
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getIdFolder() {
		return idFolder;
	}
	public void setIdFolder(Long idFolder) {
		this.idFolder = idFolder;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public String getEvaluation() {
		return evaluation;
	}
	public void setEvaluation(String evaluation) {
		this.evaluation = evaluation;
	}
	
	
	
}
