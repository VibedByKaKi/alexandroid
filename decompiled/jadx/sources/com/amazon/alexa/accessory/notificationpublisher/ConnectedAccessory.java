package com.amazon.alexa.accessory.notificationpublisher;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.biometric.ErrorUtils$$ExternalSyntheticOutline0;
import com.amazon.alexa.accessory.protocol.Input;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import java.util.List;
import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public class ConnectedAccessory {
    private List<Input.InputBehaviorConfiguration> configList;
    private String deviceType;
    private int vipFilterCapableValue;

    public ConnectedAccessory(@NonNull String str, int i, @Nullable List<Input.InputBehaviorConfiguration> list) {
        this.deviceType = str;
        this.vipFilterCapableValue = i;
        this.configList = list;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            ConnectedAccessory connectedAccessory = (ConnectedAccessory) obj;
            if (Objects.equals(this.deviceType, connectedAccessory.deviceType) && Integer.valueOf(this.vipFilterCapableValue).equals(Integer.valueOf(connectedAccessory.vipFilterCapableValue)) && Objects.equals(this.configList, connectedAccessory.configList)) {
                return true;
            }
        }
        return false;
    }

    public final List<Input.InputBehaviorConfiguration> getConfigList() {
        return this.configList;
    }

    public final String getDeviceType() {
        return this.deviceType;
    }

    public final int getVipFilterCapableValue() {
        return this.vipFilterCapableValue;
    }

    public int hashCode() {
        return Objects.hash(this.deviceType, Integer.valueOf(this.vipFilterCapableValue), this.configList);
    }

    public final void setConfigList(@Nullable List<Input.InputBehaviorConfiguration> list) {
        this.configList = list;
    }

    public final void setDeviceType(@NonNull String str) {
        this.deviceType = str;
    }

    public final void setVipFilterCapableValue(int i) {
        this.vipFilterCapableValue = i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ConnectedAccessory(deviceType=");
        sb.append(this.deviceType);
        sb.append(", vipFilterCapableValue=");
        sb.append(this.vipFilterCapableValue);
        sb.append(", configList=");
        return ErrorUtils$$ExternalSyntheticOutline0.m(MarkdownConstants.RIGHT_PARENTHESIS, this.configList, sb);
    }
}
