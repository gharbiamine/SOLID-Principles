package com.directi.training.ocp.exercise;

public class TimeResource implements Resource {

    public int allocate() {
        int resourceId;
        resourceId = findFreeSlot();
        markSlotBusy(resourceId);
        return resourceId;
    }

    public void free(int resourceId) {
        markSlotFree(resourceId);
    }

    public void markSlotFree(int resourceId) {
    }

    public void markSlotBusy(int resourceId) {
    }

    public int findFreeSlot() {
        return 0;
    }
}