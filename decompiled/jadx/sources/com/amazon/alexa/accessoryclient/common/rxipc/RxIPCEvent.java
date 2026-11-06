package com.amazon.alexa.accessoryclient.common.rxipc;

import android.os.Bundle;
import com.amazon.alexa.accessoryclient.common.rxipc.RxIPCEventId;
import com.amazon.alexa.accessoryclient.common.transformers.BundleUtils;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.apache.commons.text.StringSubstitutor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u0017\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007B\u0017\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0006\u0010\u0012\u001a\u00020\u0005J\u000e\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u0014J\b\u0010\u0015\u001a\u00020\tH\u0016R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u000f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0017"}, d2 = {"Lcom/amazon/alexa/accessoryclient/common/rxipc/RxIPCEvent;", "", "eventId", "Lcom/amazon/alexa/accessoryclient/common/rxipc/RxIPCEventId;", "data", "Landroid/os/Bundle;", "(Lcom/amazon/alexa/accessoryclient/common/rxipc/RxIPCEventId;Landroid/os/Bundle;)V", "(Lcom/amazon/alexa/accessoryclient/common/rxipc/RxIPCEventId;)V", "error", "", "(Lcom/amazon/alexa/accessoryclient/common/rxipc/RxIPCEventId;Ljava/lang/String;)V", "getData", "()Landroid/os/Bundle;", "getError", "()Ljava/lang/String;", "rxIPCEventId", "getRxIPCEventId", "()Lcom/amazon/alexa/accessoryclient/common/rxipc/RxIPCEventId;", "toBundle", "action", "Lcom/amazon/alexa/accessoryclient/common/rxipc/RxIPCEventId$Action;", "toString", "Companion", "AlexaAccessoryAndroidClient_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class RxIPCEvent {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final String DATA_KEY = "data";

    @NotNull
    private static final String ERROR_KEY = "error";

    @NotNull
    private static final String RX_RN_EVENT_ID_KEY = "eventId";

    @NotNull
    private final Bundle data;

    @Nullable
    private final String error;

    @NotNull
    private final RxIPCEventId rxIPCEventId;

    public RxIPCEvent(@NotNull RxIPCEventId rxIPCEventId, @NotNull String str) {
        rxIPCEventId.getClass();
        str.getClass();
        this.rxIPCEventId = rxIPCEventId;
        this.data = new Bundle();
        this.error = str;
    }

    @NotNull
    public final Bundle getData() {
        return this.data;
    }

    @Nullable
    public final String getError() {
        return this.error;
    }

    @NotNull
    public final RxIPCEventId getRxIPCEventId() {
        return this.rxIPCEventId;
    }

    @NotNull
    public final Bundle toBundle(@NotNull RxIPCEventId.Action action) {
        action.getClass();
        Bundle bundle = new Bundle();
        bundle.putBundle("eventId", this.rxIPCEventId.toBundle(action));
        bundle.putBundle("data", this.data);
        String str = this.error;
        if (str != null) {
            bundle.putString("error", str);
        }
        return bundle;
    }

    @NotNull
    public String toString() {
        return "RxRNEvent{id='" + this.rxIPCEventId + "', bundle=" + BundleUtils.bundleToString(this.data) + StringSubstitutor.DEFAULT_VAR_END;
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/amazon/alexa/accessoryclient/common/rxipc/RxIPCEvent$Companion;", "", "()V", "DATA_KEY", "", "ERROR_KEY", "RX_RN_EVENT_ID_KEY", "fromBundle", "Lcom/amazon/alexa/accessoryclient/common/rxipc/RxIPCEvent;", "bundle", "Landroid/os/Bundle;", "AlexaAccessoryAndroidClient_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final RxIPCEvent fromBundle(@NotNull Bundle bundle) {
            bundle.getClass();
            if (bundle.getString("error") != null) {
                RxIPCEventId.Companion companion = RxIPCEventId.INSTANCE;
                Bundle bundle2 = bundle.getBundle("eventId");
                bundle2.getClass();
                RxIPCEventId from = companion.from(bundle2);
                String string = bundle.getString("error");
                string.getClass();
                return new RxIPCEvent(from, string);
            }
            RxIPCEventId.Companion companion2 = RxIPCEventId.INSTANCE;
            Bundle bundle3 = bundle.getBundle("eventId");
            bundle3.getClass();
            RxIPCEventId from2 = companion2.from(bundle3);
            Bundle bundle4 = bundle.getBundle("data");
            bundle4.getClass();
            return new RxIPCEvent(from2, bundle4);
        }

        private Companion() {
        }
    }

    public RxIPCEvent(@NotNull RxIPCEventId rxIPCEventId) {
        rxIPCEventId.getClass();
        this.rxIPCEventId = rxIPCEventId;
        this.data = new Bundle();
        this.error = null;
    }

    public RxIPCEvent(@NotNull RxIPCEventId rxIPCEventId, @NotNull Bundle bundle) {
        rxIPCEventId.getClass();
        bundle.getClass();
        this.rxIPCEventId = rxIPCEventId;
        this.data = bundle;
        this.error = null;
    }

    @NotNull
    public final Bundle toBundle() {
        return toBundle(this.rxIPCEventId.getAction());
    }
}
