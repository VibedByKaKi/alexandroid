package com.amazon.dee.app.services.metrics.kinesis.session;

import io.ktor.client.utils.CacheControl;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\b\u0010\u0005\u001a\u00020\u0003H&J\b\u0010\u0006\u001a\u00020\u0003H&J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\tH&J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\tH&J\b\u0010\u000b\u001a\u00020\u0003H&J\b\u0010\f\u001a\u00020\u0003H&J\b\u0010\r\u001a\u00020\u0003H&J\b\u0010\u000e\u001a\u00020\u0003H&¨\u0006\u000fÀ\u0006\u0003"}, d2 = {"Lcom/amazon/dee/app/services/metrics/kinesis/session/AppSessionClient;", "", "startSession", "", "stopSession", "pauseSession", "resumeSession", "registerSessionObserver", "sessionObserver", "Lcom/amazon/dee/app/services/metrics/kinesis/session/SessionObserver;", "unregisterSessionObserver", "fireSessionStartEvent", "fireSessionStopEvent", "fireSessionPauseEvent", "fireSessionResumeEvent", CacheControl.PUBLIC}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface AppSessionClient {
    void fireSessionPauseEvent();

    void fireSessionResumeEvent();

    void fireSessionStartEvent();

    void fireSessionStopEvent();

    void pauseSession();

    void registerSessionObserver(@NotNull SessionObserver sessionObserver);

    void resumeSession();

    void startSession();

    void stopSession();

    void unregisterSessionObserver(@NotNull SessionObserver sessionObserver);
}
