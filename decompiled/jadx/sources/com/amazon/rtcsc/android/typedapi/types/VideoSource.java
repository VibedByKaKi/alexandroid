package com.amazon.rtcsc.android.typedapi.types;

import com.amazon.rtcsc.android.typedapi.constants.VideoSourceType;
import lombok.NonNull;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public class VideoSource {
    private String sourceType;

    public VideoSource(@NonNull VideoSourceType videoSourceType) {
        if (videoSourceType != null) {
            this.sourceType = videoSourceType.name();
        } else {
            Single$$ExternalSyntheticBUOutline0.m$1("videoSourceType is marked non-null but is null");
            throw null;
        }
    }

    public String getSourceType() {
        return this.sourceType;
    }
}
