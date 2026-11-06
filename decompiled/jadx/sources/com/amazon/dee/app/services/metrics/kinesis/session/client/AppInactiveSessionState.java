package com.amazon.dee.app.services.metrics.kinesis.session.client;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0007H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016J\b\u0010\t\u001a\u00020\u0007H\u0016J\b\u0010\n\u001a\u00020\u0007H\u0016¨\u0006\f"}, d2 = {"Lcom/amazon/dee/app/services/metrics/kinesis/session/client/AppInactiveSessionState;", "Lcom/amazon/dee/app/services/metrics/kinesis/session/client/AppSessionClientState;", "client", "Lcom/amazon/dee/app/services/metrics/kinesis/session/client/AppDefaultSessionClient;", "<init>", "(Lcom/amazon/dee/app/services/metrics/kinesis/session/client/AppDefaultSessionClient;)V", "resume", "", "pause", "start", "stop", "Companion", "impl"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class AppInactiveSessionState extends AppSessionClientState {

    @NotNull
    private static final String TAG = "AppInactiveSessionState";

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppInactiveSessionState(@NotNull AppDefaultSessionClient appDefaultSessionClient) {
        super(appDefaultSessionClient);
        appDefaultSessionClient.getClass();
    }

    @Override // com.amazon.dee.app.services.metrics.kinesis.session.client.AppSessionClientState
    public void start() {
        executeStart();
    }

    @Override // com.amazon.dee.app.services.metrics.kinesis.session.client.AppSessionClientState
    public void pause() {
    }

    @Override // com.amazon.dee.app.services.metrics.kinesis.session.client.AppSessionClientState
    public void resume() {
    }

    @Override // com.amazon.dee.app.services.metrics.kinesis.session.client.AppSessionClientState
    public void stop() {
    }
}
