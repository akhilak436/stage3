package net.javaguides.lombok.constructor;

import lombok.AllArgsConstructor;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@ToString
public class UserLombokModel {
	
	@Getter
	@Setter
	private long id;
	private String firstName;
	private String lastName;
	private int age;
	private String gender;
}
