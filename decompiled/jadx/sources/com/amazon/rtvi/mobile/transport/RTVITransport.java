package com.amazon.rtvi.mobile.transport;

import com.amazon.alexa.assistant.transport.MissingTokenPull;
import com.amazon.rtvi.alexa.model.common.RTVIAttachment;
import com.amazon.rtvi.alexa.model.events.RTVIEvent;
import com.amazon.rtvi.mobile.alexa.DirectiveHandler;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import kotlin.Metadata;
import okio.Buffer$$ExternalSyntheticBUOutline0;
import org.apache.commons.fileupload.FileUploadBase;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0006\u001a\u00020\u0007H&J\b\u0010\b\u001a\u00020\u0007H&J(\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000fH&J\u0010\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u0012H&J\b\u0010\u0013\u001a\u00020\u0007H&J\u0010\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u0016H&J\u0010\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u0016H&R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0018"}, d2 = {"Lcom/amazon/rtvi/mobile/transport/RTVITransport;", "", "state", "Lcom/amazon/rtvi/mobile/transport/TransportState;", "getState", "()Lcom/amazon/rtvi/mobile/transport/TransportState;", MissingTokenPull.TRIGGER_CONNECT, "", "disconnect", "sendEvent", "event", "Lcom/amazon/rtvi/alexa/model/events/RTVIEvent;", FileUploadBase.ATTACHMENT, "Lcom/amazon/rtvi/alexa/model/common/RTVIAttachment;", "callback", "Lcom/amazon/rtvi/mobile/transport/TransportCallback;", "registerDirectiveHandler", "handler", "Lcom/amazon/rtvi/mobile/alexa/DirectiveHandler;", "unregisterDirectiveHandler", "addStateListener", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lcom/amazon/rtvi/mobile/transport/TransportStateListener;", "removeStateListener", "Orchestrator_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes14.dex */
public interface RTVITransport {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ void sendEvent$default(RTVITransport rTVITransport, RTVIEvent rTVIEvent, RTVIAttachment rTVIAttachment, TransportCallback transportCallback, int i, Object obj) {
            if (obj != null) {
                Buffer$$ExternalSyntheticBUOutline0.m$1("Super calls with default arguments not supported in this target, function: sendEvent");
                return;
            }
            if ((i & 2) != 0) {
                rTVIAttachment = null;
            }
            if ((i & 4) != 0) {
                transportCallback = null;
            }
            rTVITransport.sendEvent(rTVIEvent, rTVIAttachment, transportCallback);
        }
    }

    void addStateListener(@NotNull TransportStateListener listener);

    void connect();

    void disconnect();

    @NotNull
    TransportState getState();

    void registerDirectiveHandler(@NotNull DirectiveHandler handler);

    void removeStateListener(@NotNull TransportStateListener listener);

    void sendEvent(@NotNull RTVIEvent event, @Nullable RTVIAttachment attachment, @Nullable TransportCallback callback);

    void unregisterDirectiveHandler();
}
