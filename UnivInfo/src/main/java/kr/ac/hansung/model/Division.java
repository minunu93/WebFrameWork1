package kr.ac.hansung.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@ToString
public class Division {
	//교필
	private int division1;
	//핵교
	private int division2;
	//전지
	private int division3;
	//전기
	private int division4;
	//전선
	private int division5;
	//총합
	private int total;
}
