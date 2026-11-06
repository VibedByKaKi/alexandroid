package com.amazon.leapfrogmapgl;

import androidx.exifinterface.media.ExifInterface;
import com.facebook.react.uimanager.events.Event;
import kotlin.Metadata;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\b \u0018\u0000*\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\b\u001a\u00020\tH\u0016¨\u0006\n"}, d2 = {"Lcom/amazon/leapfrogmapgl/NativeMapboxViewEvent;", ExifInterface.GPS_DIRECTION_TRUE, "Lcom/facebook/react/uimanager/events/Event;", "surfaceId", "", "viewId", "<init>", "(II)V", "canCoalesce", "", "LeapfrogMapGLAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public abstract class NativeMapboxViewEvent<T extends Event<T>> extends Event<T> {
    public NativeMapboxViewEvent(int i, int i2) {
        super(i, i2);
    }

    @Override // com.facebook.react.uimanager.events.Event
    public boolean canCoalesce() {
        return false;
    }
}
