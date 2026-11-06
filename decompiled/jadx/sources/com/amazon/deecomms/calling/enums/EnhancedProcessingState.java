package com.amazon.deecomms.calling.enums;

import androidx.annotation.NonNull;
import com.amazon.comms.models.gui.MediaSettingsInfo;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public enum EnhancedProcessingState {
    ON("ON"),
    OFF("OFF"),
    NOT_APPLICABLE(MediaSettingsInfo.ENHANCED_PROCESSING_NOT_APPLICABLE);

    private String name;

    EnhancedProcessingState(@NonNull String str) {
        this.name = str;
    }

    public String getValue() {
        return this.name;
    }
}
