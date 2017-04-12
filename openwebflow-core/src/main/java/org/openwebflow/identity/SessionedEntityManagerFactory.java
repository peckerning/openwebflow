package org.openwebflow.identity;

import org.activiti.engine.impl.interceptor.Session;
import org.activiti.engine.impl.interceptor.SessionFactory;

public class SessionedEntityManagerFactory implements SessionFactory
{
	Session _entityManager;

	Class<?> _sessionType;

	public SessionedEntityManagerFactory(Class<?> sessionType, Session entityManager)
	{
		super();
		_sessionType = sessionType;
		_entityManager = entityManager;
	}

	public Class<?> getSessionType()
	{
		return _sessionType;
	}

	public Session openSession()
	{
		return _entityManager;
	}
}
