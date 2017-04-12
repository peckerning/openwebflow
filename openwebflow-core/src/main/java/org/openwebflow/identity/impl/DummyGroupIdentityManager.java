package org.openwebflow.identity.impl;

import java.util.List;
import java.util.Map;

import org.activiti.engine.identity.Group;
import org.activiti.engine.identity.GroupQuery;
import org.activiti.engine.impl.GroupQueryImpl;
import org.activiti.engine.impl.Page;
import org.activiti.engine.impl.interceptor.Session;
import org.activiti.engine.impl.persistence.entity.GroupIdentityManager;
import org.apache.log4j.Logger;
import org.openwebflow.identity.IdentityMembershipManager;
import org.openwebflow.util.IdentityUtils;

public class DummyGroupIdentityManager implements GroupIdentityManager, Session
{
	IdentityMembershipManager _customMembershipManager;

	public DummyGroupIdentityManager(IdentityMembershipManager customMembershipManager)
	{
		super();
		_customMembershipManager = customMembershipManager;
	}

	public void close()
	{
	}

	public Group createNewGroup(String groupId)
	{
		throw new UnsupportedOperationException();
	}

	public GroupQuery createNewGroupQuery()
	{
		throw new UnsupportedOperationException();
	}

	public void deleteGroup(String groupId)
	{
		throw new UnsupportedOperationException();
	}

	public List<Group> findGroupByQueryCriteria(GroupQueryImpl query, Page page)
	{
		throw new UnsupportedOperationException();
	}

	public long findGroupCountByNativeQuery(Map<String, Object> parameterMap)
	{
		throw new UnsupportedOperationException();
	}

	public long findGroupCountByQueryCriteria(GroupQueryImpl query)
	{
		throw new UnsupportedOperationException();
	}

	public List<Group> findGroupsByNativeQuery(Map<String, Object> parameterMap, int firstResult, int maxResults)
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

	public void flush()
	{
	}

	public void insertGroup(Group group)
	{
		throw new UnsupportedOperationException();
	}

	public boolean isNewGroup(Group group)
	{
		throw new UnsupportedOperationException();
	}

	public void updateGroup(Group updatedGroup)
	{
		throw new UnsupportedOperationException();
	}

}
