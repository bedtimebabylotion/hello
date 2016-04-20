package mission.model;

import java.io.Serializable;
import java.sql.Timestamp;

public class Board implements Serializable{
	private int b_id;
	private String b_name;
	private String b_title;
	private String b_content;
	private String b_pwd;
	private Timestamp b_date;
	private int b_hit;
	public Board(){}

	public Board(int b_id, String b_name, String b_title, String b_content, String b_pwd, Timestamp b_date, int b_hit,
			int b_ref, int b_step, int b_level) {
		super();
		this.b_id = b_id;
		this.b_name = b_name;
		this.b_title = b_title;
		this.b_content = b_content;
		this.b_pwd = b_pwd;
		this.b_date = b_date;
		this.b_hit = b_hit;
	}

	public int getB_id() {
		return b_id;
	}

	public void setB_id(int b_id) {
		this.b_id = b_id;
	}

	public String getB_name() {
		return b_name;
	}

	public void setB_name(String b_name) {
		this.b_name = b_name;
	}

	public String getB_title() {
		return b_title;
	}

	public void setB_title(String b_title) {
		this.b_title = b_title;
	}

	public String getB_content() {
		return b_content;
	}

	public void setB_content(String b_content) {
		this.b_content = b_content;
	}

	public String getB_pwd() {
		return b_pwd;
	}

	public void setB_pwd(String b_pwd) {
		this.b_pwd = b_pwd;
	}

	public Timestamp getB_date() {
		return b_date;
	}

	public void setB_date(Timestamp b_date) {
		this.b_date = b_date;
	}

	public int getB_hit() {
		return b_hit;
	}

	public void setB_hit(int b_hit) {
		this.b_hit = b_hit;
	}

	@Override
	public String toString() {
		return "Board [b_id=" + b_id + ", b_name=" + b_name + ", b_title=" + b_title + ", b_content=" + b_content
				+ ", b_pwd=" + b_pwd + ", b_date=" + b_date + ", b_hit=" + b_hit + "]";
	}
	
}
