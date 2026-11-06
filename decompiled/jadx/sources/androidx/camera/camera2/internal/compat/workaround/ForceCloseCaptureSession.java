package androidx.camera.camera2.internal.compat.workaround;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.camera.camera2.internal.SynchronizedCaptureSession;
import androidx.camera.camera2.internal.compat.quirk.CaptureSessionOnClosedNotCalledQuirk;
import androidx.camera.core.impl.Quirks;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes.dex */
public class ForceCloseCaptureSession {

    @Nullable
    private final CaptureSessionOnClosedNotCalledQuirk mCaptureSessionOnClosedNotCalledQuirk;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @FunctionalInterface
    public interface OnConfigured {
        void run(@NonNull SynchronizedCaptureSession synchronizedCaptureSession);
    }

    public ForceCloseCaptureSession(@NonNull Quirks quirks) {
        this.mCaptureSessionOnClosedNotCalledQuirk = (CaptureSessionOnClosedNotCalledQuirk) quirks.get(CaptureSessionOnClosedNotCalledQuirk.class);
    }

    private void forceOnClosed(@NonNull Set<SynchronizedCaptureSession> set) {
        for (SynchronizedCaptureSession synchronizedCaptureSession : set) {
            synchronizedCaptureSession.getStateCallback().onClosed(synchronizedCaptureSession);
        }
    }

    private void forceOnConfigureFailed(@NonNull Set<SynchronizedCaptureSession> set) {
        for (SynchronizedCaptureSession synchronizedCaptureSession : set) {
            synchronizedCaptureSession.getStateCallback().onConfigureFailed(synchronizedCaptureSession);
        }
    }

    public void onSessionConfigured(@NonNull SynchronizedCaptureSession synchronizedCaptureSession, @NonNull List<SynchronizedCaptureSession> list, @NonNull List<SynchronizedCaptureSession> list2, @NonNull OnConfigured onConfigured) {
        SynchronizedCaptureSession next;
        SynchronizedCaptureSession next2;
        if (shouldForceClose()) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            Iterator<SynchronizedCaptureSession> it2 = list.iterator();
            while (it2.hasNext() && (next2 = it2.next()) != synchronizedCaptureSession) {
                linkedHashSet.add(next2);
            }
            forceOnConfigureFailed(linkedHashSet);
        }
        onConfigured.run(synchronizedCaptureSession);
        if (shouldForceClose()) {
            LinkedHashSet linkedHashSet2 = new LinkedHashSet();
            Iterator<SynchronizedCaptureSession> it3 = list2.iterator();
            while (it3.hasNext() && (next = it3.next()) != synchronizedCaptureSession) {
                linkedHashSet2.add(next);
            }
            forceOnClosed(linkedHashSet2);
        }
    }

    public boolean shouldForceClose() {
        return this.mCaptureSessionOnClosedNotCalledQuirk != null;
    }
}
