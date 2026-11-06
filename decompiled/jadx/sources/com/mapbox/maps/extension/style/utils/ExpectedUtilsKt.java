package com.mapbox.maps.extension.style.utils;

import androidx.exifinterface.media.ExifInterface;
import com.here.time.Duration$$ExternalSyntheticBUOutline0;
import com.mapbox.bindgen.Expected;
import com.mapbox.bindgen.None;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u001a\u0010\u0000\u001a\u00020\u0001*\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002H\u0000\u001a(\u0010\u0005\u001a\u0002H\u0006\"\u0006\b\u0000\u0010\u0006\u0018\u0001*\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u0002H\u0006\u0018\u00010\u0002H\u0080\b¢\u0006\u0002\u0010\u0007¨\u0006\b"}, d2 = {"check", "", "Lcom/mapbox/bindgen/Expected;", "", "Lcom/mapbox/bindgen/None;", "take", ExifInterface.GPS_DIRECTION_TRUE, "(Lcom/mapbox/bindgen/Expected;)Ljava/lang/Object;", "extension-style_release"}, k = 2, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes9.dex */
public final class ExpectedUtilsKt {
    public static final void check(@Nullable Expected<String, None> expected) {
        if (expected == null) {
            Duration$$ExternalSyntheticBUOutline0.m$1("Plugin is not added to Style yet.");
            return;
        }
        String error = expected.getError();
        if (error == null) {
            return;
        }
        Duration$$ExternalSyntheticBUOutline0.m$1(error);
    }

    public static final /* synthetic */ <T> T take(Expected<String, T> expected) {
        if (expected != null) {
            String error = expected.getError();
            if (error != null) {
                Duration$$ExternalSyntheticBUOutline0.m$1(error);
                return null;
            }
            T value = expected.getValue();
            if (value != null) {
                return value;
            }
        }
        Duration$$ExternalSyntheticBUOutline0.m$1("Plugin is not added to Style yet.");
        return null;
    }
}
