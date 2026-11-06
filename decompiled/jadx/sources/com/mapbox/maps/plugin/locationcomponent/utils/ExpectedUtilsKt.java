package com.mapbox.maps.plugin.locationcomponent.utils;

import androidx.exifinterface.media.ExifInterface;
import com.mapbox.bindgen.Expected;
import com.mapbox.maps.MapboxLocationComponentException;
import kotlin.Metadata;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a&\u0010\u0000\u001a\u0002H\u0001\"\u0006\b\u0000\u0010\u0001\u0018\u0001*\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u0002H\u00010\u0002H\u0080\b¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"take", ExifInterface.GPS_DIRECTION_TRUE, "Lcom/mapbox/bindgen/Expected;", "", "(Lcom/mapbox/bindgen/Expected;)Ljava/lang/Object;", "plugin-locationcomponent_release"}, k = 2, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes9.dex */
public final class ExpectedUtilsKt {
    public static final /* synthetic */ <T> T take(Expected<String, T> expected) {
        expected.getClass();
        String error = expected.getError();
        if (error != null) {
            throw new MapboxLocationComponentException(error);
        }
        T value = expected.getValue();
        if (value != null) {
            return value;
        }
        throw new MapboxLocationComponentException("Error in parsing expression.");
    }
}
