package com.amazon.alexa.accessoryclient.common.rxipc;

import android.os.Bundle;
import defpackage.a$$ExternalSyntheticOutline0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00112\u00020\u0001:\u0002\u0010\u0011B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0015\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007J\u0006\u0010\f\u001a\u00020\rJ\u000e\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0003J\b\u0010\u000f\u001a\u00020\u0006H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0012"}, d2 = {"Lcom/amazon/alexa/accessoryclient/common/rxipc/RxIPCEventId;", "", "action", "Lcom/amazon/alexa/accessoryclient/common/rxipc/RxIPCEventId$Action;", "(Lcom/amazon/alexa/accessoryclient/common/rxipc/RxIPCEventId$Action;)V", "uuid", "", "(Ljava/lang/String;Lcom/amazon/alexa/accessoryclient/common/rxipc/RxIPCEventId$Action;)V", "getAction", "()Lcom/amazon/alexa/accessoryclient/common/rxipc/RxIPCEventId$Action;", "getUuid", "()Ljava/lang/String;", "toBundle", "Landroid/os/Bundle;", "newAction", "toString", "Action", "Companion", "AlexaAccessoryAndroidClient_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class RxIPCEventId {

    @NotNull
    private static final String ACTION_KEY = "action";

    @NotNull
    private static final String UUID_KEY = "uuid";

    @NotNull
    private final Action action;

    @NotNull
    private final String uuid;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final Action[] ACTION_VALUES = Action.values();

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0003H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/amazon/alexa/accessoryclient/common/rxipc/RxIPCEventId$Action;", "", "action", "", "(Ljava/lang/String;ILjava/lang/String;)V", "toString", "INIT", "ON_NEXT", "ON_ERROR", "ON_COMPLETE", "ON_DISPOSE", "AlexaAccessoryAndroidClient_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public enum Action {
        INIT("INIT"),
        ON_NEXT("ON_NEXT"),
        ON_ERROR("ON_ERROR"),
        ON_COMPLETE("ON_COMPLETE"),
        ON_DISPOSE("ON_DISPOSE");


        @NotNull
        private final String action;

        Action(String str) {
            this.action = str;
        }

        @Override // java.lang.Enum
        @NotNull
        public String toString() {
            return a$$ExternalSyntheticOutline0.m("Action{action='", this.action, "'}");
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public RxIPCEventId(@org.jetbrains.annotations.NotNull com.amazon.alexa.accessoryclient.common.rxipc.RxIPCEventId.Action r2) {
        /*
            r1 = this;
            r2.getClass()
            java.util.UUID r0 = java.util.UUID.randomUUID()
            java.lang.String r0 = r0.toString()
            r0.getClass()
            r1.<init>(r0, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.alexa.accessoryclient.common.rxipc.RxIPCEventId.<init>(com.amazon.alexa.accessoryclient.common.rxipc.RxIPCEventId$Action):void");
    }

    @NotNull
    public final Action getAction() {
        return this.action;
    }

    @NotNull
    public final String getUuid() {
        return this.uuid;
    }

    @NotNull
    public final Bundle toBundle(@NotNull Action newAction) {
        newAction.getClass();
        Bundle bundle = new Bundle();
        bundle.putString("uuid", this.uuid);
        bundle.putInt("action", newAction.ordinal());
        return bundle;
    }

    @NotNull
    public String toString() {
        return a$$ExternalSyntheticOutline0.m("RxRNEventId{action=", this.action.name(), ", uuid='", this.uuid, "'}");
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u0016\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\bR\u000e\u0010\t\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/amazon/alexa/accessoryclient/common/rxipc/RxIPCEventId$Companion;", "", "()V", "ACTION_KEY", "", "ACTION_VALUES", "", "Lcom/amazon/alexa/accessoryclient/common/rxipc/RxIPCEventId$Action;", "[Lcom/amazon/alexa/accessoryclient/common/rxipc/RxIPCEventId$Action;", "UUID_KEY", "from", "Lcom/amazon/alexa/accessoryclient/common/rxipc/RxIPCEventId;", "bundle", "Landroid/os/Bundle;", "AlexaAccessoryAndroidClient_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final RxIPCEventId from(@NotNull Bundle bundle) {
            bundle.getClass();
            String string = bundle.getString("uuid");
            string.getClass();
            return new RxIPCEventId(string, RxIPCEventId.ACTION_VALUES[bundle.getInt("action")]);
        }

        private Companion() {
        }
    }

    public RxIPCEventId(@NotNull String str, @NotNull Action action) {
        str.getClass();
        action.getClass();
        this.uuid = str;
        this.action = action;
    }

    @NotNull
    public final Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putString("uuid", this.uuid);
        bundle.putInt("action", this.action.ordinal());
        return bundle;
    }
}
