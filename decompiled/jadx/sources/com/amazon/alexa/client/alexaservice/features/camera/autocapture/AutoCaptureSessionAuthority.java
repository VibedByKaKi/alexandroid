package com.amazon.alexa.client.alexaservice.features.camera.autocapture;

import com.amazon.alexa.client.alexaservice.features.camera.payload.SessionId;
import java.util.HashSet;
import java.util.Set;
import javax.inject.Inject;
import javax.inject.Singleton;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Singleton
/* loaded from: classes17.dex */
public class AutoCaptureSessionAuthority {
    private final Set<AutoCaptureSession> ongoingSessions = new HashSet();

    @Inject
    public AutoCaptureSessionAuthority() {
    }

    public void addSession(AutoCaptureSession autoCaptureSession) {
        synchronized (this.ongoingSessions) {
            this.ongoingSessions.add(autoCaptureSession);
        }
    }

    public AutoCaptureSession findBySessionId(SessionId sessionId) {
        synchronized (this.ongoingSessions) {
            try {
                for (AutoCaptureSession autoCaptureSession : this.ongoingSessions) {
                    if (autoCaptureSession.getSessionId().equals(sessionId)) {
                        return autoCaptureSession;
                    }
                }
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public AutoCaptureSession getOngoingSession() {
        synchronized (this.ongoingSessions) {
            try {
                if (this.ongoingSessions.isEmpty()) {
                    return null;
                }
                return this.ongoingSessions.iterator().next();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean hasOngoingSession() {
        boolean z;
        synchronized (this.ongoingSessions) {
            z = !this.ongoingSessions.isEmpty();
        }
        return z;
    }

    public void removeSession(AutoCaptureSession autoCaptureSession) {
        synchronized (this.ongoingSessions) {
            this.ongoingSessions.remove(autoCaptureSession);
        }
    }
}
