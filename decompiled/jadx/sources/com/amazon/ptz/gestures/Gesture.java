package com.amazon.ptz.gestures;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import lombok.Generated;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public final class Gesture {

    @Nonnull
    private final GestureType gestureType;

    @Nullable
    private final TransformInfo transformInfo;

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public Gesture(@Nonnull GestureType gestureType, @Nullable TransformInfo transformInfo) {
        if (gestureType == null) {
            Single$$ExternalSyntheticBUOutline0.m$3("gestureType is marked non-null but is null");
            throw null;
        }
        this.gestureType = gestureType;
        this.transformInfo = transformInfo;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Gesture)) {
            return false;
        }
        Gesture gesture = (Gesture) obj;
        GestureType gestureType = getGestureType();
        GestureType gestureType2 = gesture.getGestureType();
        if (gestureType != null ? !gestureType.equals(gestureType2) : gestureType2 != null) {
            return false;
        }
        TransformInfo transformInfo = getTransformInfo();
        TransformInfo transformInfo2 = gesture.getTransformInfo();
        return transformInfo != null ? transformInfo.equals(transformInfo2) : transformInfo2 == null;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Nonnull
    @Generated
    public GestureType getGestureType() {
        return this.gestureType;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    @Nullable
    public TransformInfo getTransformInfo() {
        return this.transformInfo;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public int hashCode() {
        GestureType gestureType = getGestureType();
        int hashCode = gestureType == null ? 43 : gestureType.hashCode();
        TransformInfo transformInfo = getTransformInfo();
        return ((hashCode + 59) * 59) + (transformInfo != null ? transformInfo.hashCode() : 43);
    }

    public boolean isZoom() {
        GestureType gestureType = this.gestureType;
        return gestureType == GestureType.ZOOM || gestureType == GestureType.ZOOM_TOGGLE || gestureType == GestureType.ZOOM_IN_CENTER || gestureType == GestureType.ZOOM_OUT_CENTER;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public String toString() {
        return "Gesture(gestureType=" + getGestureType() + ", transformInfo=" + getTransformInfo() + MarkdownConstants.RIGHT_PARENTHESIS;
    }
}
