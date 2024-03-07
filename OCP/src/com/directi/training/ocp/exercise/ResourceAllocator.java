package com.directi.training.ocp.exercise;

public class ResourceAllocator
{
    public int allocate(IFreeRessource resourceType)
    {
        int resourceId = resourceType.findFreeTimeSlot();
        resourceType.markTimeSlotBusy(resourceId);
        return resourceId;
    }

    public void free(IFreeRessource resourceType, int resourceId)
    {
        resourceType.markTimeSlotFree(resourceId);
    }
}
