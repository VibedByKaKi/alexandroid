package com.amazon.alexa.biloba.model;

import androidx.biometric.ErrorUtils$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public class DeviceInfo {
    private List<AlertCondition> conditionList = new ArrayList();
    private final String deviceName;
    private final String id;
    private boolean selected;

    public DeviceInfo(String str, String str2, boolean z) {
        this.id = str;
        this.deviceName = str2;
        this.selected = z;
    }

    public void addCondition(AlertCondition alertCondition) {
        this.conditionList.add(alertCondition);
    }

    public List<AlertCondition> getConditions() {
        return this.conditionList;
    }

    public String getDeviceName() {
        return this.deviceName;
    }

    public String getId() {
        return this.id;
    }

    public boolean isSelected() {
        return this.selected;
    }

    public void setSelected(boolean z) {
        this.selected = z;
    }

    public String toString() {
        String str = this.id;
        String str2 = this.deviceName;
        boolean z = this.selected;
        StringBuilder m = ErrorUtils$$ExternalSyntheticOutline0.m("id: ", str, ", name: ", str2, ", selected: ");
        m.append(z);
        return m.toString();
    }
}
