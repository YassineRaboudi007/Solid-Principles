package com.directi.training.isp.exercise;

public interface AFreeRessource
{
    int findFreeSlot(int resourceId)

    void markSlotFree(int resourceId)

    void markSpaceSlotBusy(int resourceId)
}
