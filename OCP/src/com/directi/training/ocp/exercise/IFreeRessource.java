package com.directi.training.isp.exercise;

public interface IFreeRessource
{
    int findFreeSlot(int resourceId)

    void markSlotFree(int resourceId)

    void markSlotBusy(int resourceId)
}
