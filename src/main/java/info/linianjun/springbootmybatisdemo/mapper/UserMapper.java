package info.linianjun.springbootmybatisdemo.mapper;

import java.util.List;

import info.linianjun.springbootmybatisdemo.domain.UsersEntity;

public interface UserMapper {
	List<UsersEntity> getAll();
	
	UsersEntity getOne(Long id);

	void insert(UsersEntity user);

	void update(UsersEntity user);

	void delete(Long id);

}
