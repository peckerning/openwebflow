package org.openwebflow.mgr.mem;

import java.util.ArrayList;
import java.util.List;

import org.openwebflow.ctrl.RuntimeActivityDefinitionEntity;
import org.openwebflow.ctrl.RuntimeActivityDefinitionManager;

public class InMemoryRuntimeActivityDefinitionManager implements RuntimeActivityDefinitionManager
{
	private static List<RuntimeActivityDefinitionEntity> _list = new ArrayList<RuntimeActivityDefinitionEntity>();

	public List<RuntimeActivityDefinitionEntity> list()
	{
		return _list;
	}

	public void removeAll()
	{
		_list.clear();
	}

	public void save(RuntimeActivityDefinitionEntity entity)
	{
		_list.add(entity);
	}
}
