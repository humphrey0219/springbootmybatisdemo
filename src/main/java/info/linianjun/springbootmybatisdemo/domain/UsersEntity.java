package info.linianjun.springbootmybatisdemo.domain;

import java.io.Serializable;

import info.linianjun.springbootmybatisdemo.enums.UserSexEnum;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UsersEntity implements Serializable {
	private static final long serialVersionUID = -2152108151919771818L;
	private Long id;
	
	private String userName;
	private String passWord;
	private UserSexEnum userSex;
	private String nickName;
	
	public UsersEntity(String userName, String passWord, UserSexEnum userSex) {
		super();
		this.passWord = passWord;
		this.userName = userName;
		this.userSex = userSex;
	}


}
