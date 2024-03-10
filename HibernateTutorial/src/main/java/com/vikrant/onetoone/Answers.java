package com.vikrant.onetoone;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "answer_info")
public class Answers {

	@Id
	private int ans_id;
	private String ansdesc;
	
	@OneToOne(mappedBy = "ans") // this will avoid the foreign key creation in answer table as only ans will be created
	private Questions ques;;
	

	public Questions getQues() {
		return ques;
	}

	public void setQues(Questions ques) {
		this.ques = ques;
	}

	
	public int getAns_id() {
		return ans_id;
	}

	public void setAns_id(int ans_id) {
		this.ans_id = ans_id;
	}

	public String getAnsdesc() {
		return ansdesc;
	}

	public void setAnsdesc(String ansdesc) {
		this.ansdesc = ansdesc;
	}


}
