package com.amazon.alexa.ra.core.data.utils;

import android.content.Context;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.content.ContextCompat;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0007\u0018\u0000 \t2\u00020\u0001:\u0001\tB\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\u0006\u001a\u00020\u0007J\u0006\u0010\b\u001a\u00020\u0007R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/amazon/alexa/ra/core/data/utils/PermissionManager;", "", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "checkMicrophonePermission", "", "checkCameraPermission", "Companion", "ui-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes18.dex */
public final class PermissionManager {

    @NotNull
    private static final String PERMISSION_CAMERA = "android.permission.CAMERA";

    @NotNull
    private static final String PERMISSION_MICROPHONE = "android.permission.RECORD_AUDIO";

    @NotNull
    private final Context context;
    public static final int $stable = 8;

    public PermissionManager(@NotNull Context context) {
        context.getClass();
        this.context = context;
    }

    public final boolean checkCameraPermission() {
        return ContextCompat.checkSelfPermission(this.context, PERMISSION_CAMERA) == 0;
    }

    public final boolean checkMicrophonePermission() {
        return ContextCompat.checkSelfPermission(this.context, PERMISSION_MICROPHONE) == 0;
    }
}
