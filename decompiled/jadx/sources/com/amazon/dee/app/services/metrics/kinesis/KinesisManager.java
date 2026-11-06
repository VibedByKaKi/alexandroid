package com.amazon.dee.app.services.metrics.kinesis;

import com.amazon.alexa.identity.api.IdentityService;
import com.amazon.alexa.identity.api.UserIdentity;
import com.amazon.dee.app.services.logging.Log;
import com.amazon.dee.app.services.metrics.kinesis.client.KinesisEventClient;
import com.amazon.dee.app.services.metrics.kinesis.client.KinesisInternalEventClient;
import com.amazon.dee.app.services.metrics.kinesis.session.AppSessionClient;
import com.amazon.dee.app.services.metrics.kinesis.session.SessionObserver;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \r2\u00020\u0001:\u0001\rB\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0006\u0010\n\u001a\u00020\u0005J\u0006\u0010\u000b\u001a\u00020\fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/amazon/dee/app/services/metrics/kinesis/KinesisManager;", "", "kinesisEventClient", "Lcom/amazon/dee/app/services/metrics/kinesis/client/KinesisInternalEventClient;", "appSessionClient", "Lcom/amazon/dee/app/services/metrics/kinesis/session/AppSessionClient;", "identityService", "Lcom/amazon/alexa/identity/api/IdentityService;", "<init>", "(Lcom/amazon/dee/app/services/metrics/kinesis/client/KinesisInternalEventClient;Lcom/amazon/dee/app/services/metrics/kinesis/session/AppSessionClient;Lcom/amazon/alexa/identity/api/IdentityService;)V", "getAppSessionClient", "getEventClient", "Lcom/amazon/dee/app/services/metrics/kinesis/client/KinesisEventClient;", "Companion", "impl"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class KinesisManager {

    @NotNull
    private static final String TAG = Log.tag((Class<?>) KinesisManager.class);

    @NotNull
    private final AppSessionClient appSessionClient;

    @NotNull
    private final KinesisInternalEventClient kinesisEventClient;

    public KinesisManager(@NotNull KinesisInternalEventClient kinesisInternalEventClient, @NotNull AppSessionClient appSessionClient, @NotNull IdentityService identityService) {
        kinesisInternalEventClient.getClass();
        appSessionClient.getClass();
        identityService.getClass();
        this.kinesisEventClient = kinesisInternalEventClient;
        this.appSessionClient = appSessionClient;
        String str = TAG;
        UserIdentity user = identityService.getUser(str);
        if (user != null) {
            kinesisInternalEventClient.setDirectedId(user.getDirectedId());
        }
        kinesisInternalEventClient.getClass();
        appSessionClient.registerSessionObserver((SessionObserver) kinesisInternalEventClient);
        appSessionClient.startSession();
        Log.i(str, "Kinesis Manager initialization successfully completed");
    }

    @NotNull
    public final AppSessionClient getAppSessionClient() {
        return this.appSessionClient;
    }

    @NotNull
    public final KinesisEventClient getEventClient() {
        return this.kinesisEventClient;
    }
}
