package org.openwebflow.identity.impl;

import java.util.List;
import java.util.Map;

import org.activiti.engine.identity.Group;
import org.activiti.engine.identity.Picture;
import org.activiti.engine.identity.User;
import org.activiti.engine.identity.UserQuery;
import org.activiti.engine.impl.Page;
import org.activiti.engine.impl.UserQueryImpl;
import org.activiti.engine.impl.interceptor.Session;
import org.activiti.engine.impl.persistence.entity.IdentityInfoEntity;
import org.activiti.engine.impl.persistence.entity.UserIdentityManager;
import org.apache.log4j.Logger;
import org.openwebflow.identity.IdentityMembershipManager;
import org.openwebflow.util.IdentityUtils;

public class DummyUserIdentityManager implements UserIdentityManager, Session
{
	IdentityMembershipManager _customMembershipManager;

	public DummyUserIdentityManager(IdentityMembershipManager customMembershipManager)
	{
		_customMembershipManager = customMembershipManager;
	}

	public Boolean checkPassword(String userId, String password)
	{
		throw new UnsupportedOperationException();
	}

	public void close()
	{
	}

	public User createNewUser(String userId)
	{
		throw new UnsupportedOperationException();
	}

	public UserQuery createNewUserQuery()
	{
		throw new UnsupportedOperationException();
	}

	public void deleteUser(String userId)
	{
		throw new UnsupportedOperationException();
	}

	public List<Group> findGroupsByUser(String userId)
	{
		Logger.getLogger(this.getClass()).debug(
			String.format("%s#findGroupsByUser(\"%s\")", _customMembershipManager, userId));

		try
		{
			return IdentityUtils.getGroupsFromIds(_customMembershipManager.findGroupIdsByUser(userId));
		}
		catch (Exception e)
		{
			throw new RuntimeException(e);
		}
	}

	public List<User> findPotentialStarterUsers(String proceDefId)
	{
		throw new UnsupportedOperationException();
	}

	public User findUserById(String userId)
	{
		throw new UnsupportedOperationException();
	}

	public List<User> findUserByQueryCriteria(UserQueryImpl query, Page page)
	{
		throw new UnsupportedOperationException();
	}

	public long findUserCountByNativeQuery(Map<String, Object> parameterMap)
	{
		throw new UnsupportedOperationException();
	}

	public long findUserCountByQueryCriteria(UserQueryImpl query)
	{
		throw new UnsupportedOperationException();
	}

	public IdentityInfoEntity findUserInfoByUserIdAndKey(String userId, String key)
	{
		throw new UnsupportedOperationException();
	}

	public List<String> findUserInfoKeysByUserIdAndType(String userId, String type)
	{
		throw new UnsupportedOperationException();
	}

	public List<User> findUsersByNativeQuery(Map<String, Object> parameterMap, int firstResult, int maxResults)
	{
		throw new UnsupportedOperationException();
	}

	public void flush()
	{
	}

	public Picture getUserPicture(String userId)
	{
		throw new UnsupportedOperationException();
	}

	public void insertUser(User user)
	{
		throw new UnsupportedOperationException();
	}

	public boolean isNewUser(User user)
	{
		throw new UnsupportedOperationException();
	}

	public void setUserPicture(String userId, Picture picture)
	{
		throw new UnsupportedOperationException();
	}

	public void updateUser(User updatedUser)
	{
		throw new UnsupportedOperationException();
	}
}
