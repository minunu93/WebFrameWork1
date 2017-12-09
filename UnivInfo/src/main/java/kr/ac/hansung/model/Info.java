package kr.ac.hansung.model;



import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@ToString
public class Info {	

	//@Size(min=2, max=100, message="Name must be between 2 and 100 chars")
	private int year;
	
	//@Email(message="Please provide a valid email address")
	//@NotEmpty(message="The email address cannot be empty")
	private int semester;
	
	//@Size(min=5, max=100, message="Text must be between 5 and 100 chars")
	private String subject_code;
	private String subject_name;
	private String division;
	private int credit;
}

