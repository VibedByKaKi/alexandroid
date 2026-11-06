package com.amazon.alexa.smarthomecameras.model;

import android.text.TextUtils;
import defpackage.a$$ExternalSyntheticOutline0;
import java.util.Objects;
import javax.annotation.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public class CameraLabel {
    private final String cameraLabel;

    private CameraLabel(String str) {
        this.cameraLabel = str;
    }

    @Nullable
    public static CameraLabel create(@Nullable String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return new CameraLabel(str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof CameraLabel) {
            return this.cameraLabel.equals(((CameraLabel) obj).cameraLabel);
        }
        return false;
    }

    public final String getValue() {
        return this.cameraLabel;
    }

    public int hashCode() {
        return Objects.hash(this.cameraLabel);
    }

    public String toString() {
        return a$$ExternalSyntheticOutline0.m(new StringBuilder("CameraLabel{cameraLabel='"), this.cameraLabel, "'}");
    }
}
