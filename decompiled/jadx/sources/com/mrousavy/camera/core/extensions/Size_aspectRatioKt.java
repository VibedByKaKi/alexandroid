package com.mrousavy.camera.core.extensions;

import android.util.Size;
import com.facebook.react.uimanager.ViewProps;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {ViewProps.ASPECT_RATIO, "", "Landroid/util/Size;", "getAspectRatio", "(Landroid/util/Size;)F", "react-native-vision-camera_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class Size_aspectRatioKt {
    public static final float getAspectRatio(@NotNull Size size) {
        size.getClass();
        return size.getWidth() / size.getHeight();
    }
}
