package com.amazon.alexa.client.alexaservice.features.camera.video;

import com.amazon.alexa.client.alexaservice.features.camera.payload.SessionId;
import java.util.HashSet;
import java.util.Set;
import javax.inject.Inject;
import javax.inject.Singleton;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Singleton
/* loaded from: classes17.dex */
public class VideoCaptureSessionAuthority {
    private final Set<VideoCaptureSession> ongoingVideoCaptures = new HashSet();

    @Inject
    public VideoCaptureSessionAuthority() {
    }

    public void addSession(VideoCaptureSession videoCaptureSession) {
        synchronized (this.ongoingVideoCaptures) {
            this.ongoingVideoCaptures.add(videoCaptureSession);
        }
    }

    public VideoCaptureSession findBySessionId(SessionId sessionId) {
        synchronized (this.ongoingVideoCaptures) {
            try {
                for (VideoCaptureSession videoCaptureSession : this.ongoingVideoCaptures) {
                    if (videoCaptureSession.getSessionId().equals(sessionId)) {
                        return videoCaptureSession;
                    }
                }
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public VideoCaptureSession getOngoingSession() {
        synchronized (this.ongoingVideoCaptures) {
            try {
                if (this.ongoingVideoCaptures.isEmpty()) {
                    return null;
                }
                return this.ongoingVideoCaptures.iterator().next();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean hasOngoingSession() {
        boolean z;
        synchronized (this.ongoingVideoCaptures) {
            z = !this.ongoingVideoCaptures.isEmpty();
        }
        return z;
    }

    public void removeSession(VideoCaptureSession videoCaptureSession) {
        synchronized (this.ongoingVideoCaptures) {
            this.ongoingVideoCaptures.remove(videoCaptureSession);
        }
    }
}
