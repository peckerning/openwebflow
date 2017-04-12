package org.openwebflow.mgr.mem;

import java.util.HashMap;
import java.util.Map;

import org.openwebflow.alarm.TaskNotificationManager;
import org.openwebflow.mgr.ext.TaskNotificationManagerEx;

public class InMemoryTaskNotificationManager implements TaskNotificationManager, TaskNotificationManagerEx
{
	Map<String, Boolean> _notificationMap = new HashMap<String, Boolean>();

	public boolean isNotified(String taskId)
	{
		return _notificationMap.containsKey(taskId) && _notificationMap.get(taskId) == true;
	}

	public void removeAll()
	{
		_notificationMap.clear();
	}

	public void setNotified(String taskId)
	{
		_notificationMap.put(taskId, true);
	}

}
