package com.vikrant.onetoone;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "questions_info")
public class Questions {

	@Id
	private int quesid;

	private String quesdesc;

	@OneToOne 
	@JoinColumn(name="foreign_keyofanswer")  //will set the name of the column as desired
	private Answers ans;

	public int getQuesid() {
		return quesid;
	}

	public void setQuesid(int quesid) {
		this.quesid = quesid;
	}

	public Answers getAns() {
		return ans;
	}

	public void setAns(Answers ans) {
		this.ans = ans;
	}

	public String getQuesdesc() {
		return quesdesc;
	}

	public void setQuesdesc(String quesdesc) {
		this.quesdesc = quesdesc;
	}

}
