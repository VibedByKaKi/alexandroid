package androidx.camera.core.impl.utils;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.camera.core.FocusMeteringAction;
import androidx.camera.core.impl.SessionProcessor;
import androidx.collection.DoubleList$$ExternalSyntheticOutline0;
import java.util.ArrayList;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes.dex */
public final class SessionProcessorUtil {
    private SessionProcessorUtil() {
    }

    @Nullable
    public static FocusMeteringAction getModifiedFocusMeteringAction(@Nullable SessionProcessor sessionProcessor, @NonNull FocusMeteringAction focusMeteringAction) {
        boolean z;
        if (sessionProcessor == null) {
            return focusMeteringAction;
        }
        FocusMeteringAction.Builder builder = new FocusMeteringAction.Builder(focusMeteringAction);
        boolean z2 = true;
        if (focusMeteringAction.getMeteringPointsAf().isEmpty() || isOperationSupported(sessionProcessor, 1, 2)) {
            z = false;
        } else {
            builder.removePoints(1);
            z = true;
        }
        if (!focusMeteringAction.getMeteringPointsAe().isEmpty() && !isOperationSupported(sessionProcessor, 3)) {
            builder.removePoints(2);
            z = true;
        }
        if (focusMeteringAction.getMeteringPointsAwb().isEmpty() || isOperationSupported(sessionProcessor, 4)) {
            z2 = z;
        } else {
            builder.removePoints(4);
        }
        if (!z2) {
            return focusMeteringAction;
        }
        FocusMeteringAction build = builder.build();
        if (build.getMeteringPointsAf().isEmpty() && build.getMeteringPointsAe().isEmpty() && build.getMeteringPointsAwb().isEmpty()) {
            return null;
        }
        return builder.build();
    }

    public static boolean isOperationSupported(@Nullable SessionProcessor sessionProcessor, @NonNull int... iArr) {
        if (sessionProcessor == null) {
            return true;
        }
        ArrayList arrayList = new ArrayList(iArr.length);
        int length = iArr.length;
        int i = 0;
        while (i < length) {
            i = DoubleList$$ExternalSyntheticOutline0.m(iArr[i], arrayList, i, 1);
        }
        return sessionProcessor.getSupportedCameraOperations().containsAll(arrayList);
    }
}
