package com.directi.training.ocp.exercise;

public class ResourceAllocator
{
    public int allocate(AFreeRessource resourceType)
    {
        int resourceId = findFreeTimeSlot();
        markTimeSlotBusy(resourceId);
        return resourceId;
    }

    public void free(AFreeRessource resourceType, int resourceId)
    {
        markTimeSlotFree(resourceId);
    }
}
