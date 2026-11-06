package com.amazon.dee.app.services.metrics.kinesis.session.client;

import com.amazon.dee.app.services.logging.Log;
import com.amazon.dee.app.services.metrics.kinesis.session.AppSession;
import com.amazon.dee.app.services.metrics.kinesis.session.client.AppDefaultSessionClient;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\t\b&\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\b\u001a\u00020\tH&J\b\u0010\n\u001a\u00020\tH&J\b\u0010\u000b\u001a\u00020\tH&J\b\u0010\f\u001a\u00020\tH&J\b\u0010\r\u001a\u00020\tH\u0004J\b\u0010\u000e\u001a\u00020\tH\u0004J\b\u0010\u000f\u001a\u00020\tH\u0004J\b\u0010\u0010\u001a\u00020\tH\u0004R\u0014\u0010\u0002\u001a\u00020\u0003X\u0084\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/amazon/dee/app/services/metrics/kinesis/session/client/AppSessionClientState;", "", "client", "Lcom/amazon/dee/app/services/metrics/kinesis/session/client/AppDefaultSessionClient;", "<init>", "(Lcom/amazon/dee/app/services/metrics/kinesis/session/client/AppDefaultSessionClient;)V", "getClient", "()Lcom/amazon/dee/app/services/metrics/kinesis/session/client/AppDefaultSessionClient;", "resume", "", "pause", "start", "stop", "executeStart", "executeStop", "executePause", "executeResume", "Companion", "impl"}, k = 1, mv = {2, 2, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nAppSessionClientState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AppSessionClientState.kt\ncom/amazon/dee/app/services/metrics/kinesis/session/client/AppSessionClientState\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,67:1\n1#2:68\n*E\n"})
/* loaded from: classes5.dex */
public abstract class AppSessionClientState {

    @NotNull
    private static final String TAG = Log.tag((Class<?>) AppSessionClientState.class);

    @NotNull
    private final AppDefaultSessionClient client;

    public AppSessionClientState(@NotNull AppDefaultSessionClient appDefaultSessionClient) {
        appDefaultSessionClient.getClass();
        this.client = appDefaultSessionClient;
    }

    public final void executePause() {
        AppSession appSession = this.client.getAppSession();
        if (appSession == null) {
            Single$$ExternalSyntheticBUOutline0.m$2("appSession must be non-null to pause");
            return;
        }
        appSession.pause();
        appSession.getSessionID();
        this.client.fireSessionPauseEvent();
        this.client.getAppSessionStore().storeSession(appSession);
        this.client.changeState$impl(AppDefaultSessionClient.SessionState.PAUSED);
    }

    public final void executeResume() {
        AppSession appSession = this.client.getAppSession();
        if (appSession == null) {
            Single$$ExternalSyntheticBUOutline0.m$2("appSession must be non-null to resume");
            return;
        }
        appSession.resume();
        this.client.fireSessionResumeEvent();
        appSession.getSessionID();
        this.client.changeState$impl(AppDefaultSessionClient.SessionState.ACTIVE);
    }

    public final void executeStart() {
        AppDefaultSessionClient appDefaultSessionClient = this.client;
        appDefaultSessionClient.setAppSession$impl(AppSession.INSTANCE.newInstance(appDefaultSessionClient.getKinesisContext()));
        this.client.fireSessionStartEvent();
        this.client.changeState$impl(AppDefaultSessionClient.SessionState.ACTIVE);
    }

    public final void executeStop() {
        AppSession appSession = this.client.getAppSession();
        if (appSession == null) {
            Single$$ExternalSyntheticBUOutline0.m$2("appSession must be non-null to stop");
            return;
        }
        if (!appSession.isPaused()) {
            appSession.pause();
        }
        this.client.fireSessionStopEvent();
        this.client.setAppSession$impl(null);
        this.client.changeState$impl(AppDefaultSessionClient.SessionState.INACTIVE);
    }

    @NotNull
    public final AppDefaultSessionClient getClient() {
        return this.client;
    }

    public abstract void pause();

    public abstract void resume();

    public abstract void start();

    public abstract void stop();
}
