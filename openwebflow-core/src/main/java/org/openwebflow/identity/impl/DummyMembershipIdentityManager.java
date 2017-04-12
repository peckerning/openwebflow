package org.openwebflow.identity.impl;

import org.activiti.engine.impl.interceptor.Session;
import org.activiti.engine.impl.persistence.entity.MembershipIdentityManager;

public class DummyMembershipIdentityManager implements MembershipIdentityManager, Session
{

	public void close()
	{
	}

	public void createMembership(String userId, String groupId)
	{
		throw new UnsupportedOperationException();
	}

	public void deleteMembership(String userId, String groupId)
	{
		throw new UnsupportedOperationException();
	}

	public void flush()
	{
	}

}
