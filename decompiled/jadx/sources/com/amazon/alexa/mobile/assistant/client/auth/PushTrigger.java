package com.amazon.alexa.mobile.assistant.client.auth;

import com.amazon.alexa.assistant.transport.MissingTokenPull;
import com.amazon.alexa.ra.core.metrics.VisualShareErrorType;
import com.google.android.gms.common.Scopes;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012¨\u0006\u0013"}, d2 = {"Lcom/amazon/alexa/mobile/assistant/client/auth/PushTrigger;", "", "label", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getLabel", "()Ljava/lang/String;", "START", "ACCOUNT_ADDED", "ACCOUNT_REMOVED", "PROFILE", "PERIODIC", VisualShareErrorType.NETWORK, "NETWORK_UNBLOCKED", "SDK_UNAUTHORIZED", "SDK_PULL", "SDK_PULL_NO_TOKEN", "REQUEST", "client_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes18.dex */
public final class PushTrigger {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ PushTrigger[] $VALUES;

    @NotNull
    private final String label;
    public static final PushTrigger START = new PushTrigger("START", 0, "start");
    public static final PushTrigger ACCOUNT_ADDED = new PushTrigger("ACCOUNT_ADDED", 1, "account_added");
    public static final PushTrigger ACCOUNT_REMOVED = new PushTrigger("ACCOUNT_REMOVED", 2, "account_removed");
    public static final PushTrigger PROFILE = new PushTrigger("PROFILE", 3, Scopes.PROFILE);
    public static final PushTrigger PERIODIC = new PushTrigger("PERIODIC", 4, "periodic");
    public static final PushTrigger NETWORK = new PushTrigger(VisualShareErrorType.NETWORK, 5, "network");
    public static final PushTrigger NETWORK_UNBLOCKED = new PushTrigger("NETWORK_UNBLOCKED", 6, "network_unblocked");
    public static final PushTrigger SDK_UNAUTHORIZED = new PushTrigger("SDK_UNAUTHORIZED", 7, "sdk_unauthorized");
    public static final PushTrigger SDK_PULL = new PushTrigger("SDK_PULL", 8, "sdk_pull");
    public static final PushTrigger SDK_PULL_NO_TOKEN = new PushTrigger("SDK_PULL_NO_TOKEN", 9, "sdk_pull_no_token");
    public static final PushTrigger REQUEST = new PushTrigger("REQUEST", 10, MissingTokenPull.TRIGGER_REQUEST);

    private static final /* synthetic */ PushTrigger[] $values() {
        return new PushTrigger[]{START, ACCOUNT_ADDED, ACCOUNT_REMOVED, PROFILE, PERIODIC, NETWORK, NETWORK_UNBLOCKED, SDK_UNAUTHORIZED, SDK_PULL, SDK_PULL_NO_TOKEN, REQUEST};
    }

    static {
        PushTrigger[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    private PushTrigger(String str, int i, String str2) {
        this.label = str2;
    }

    @NotNull
    public static EnumEntries<PushTrigger> getEntries() {
        return $ENTRIES;
    }

    public static PushTrigger valueOf(String str) {
        return (PushTrigger) Enum.valueOf(PushTrigger.class, str);
    }

    public static PushTrigger[] values() {
        return (PushTrigger[]) $VALUES.clone();
    }

    @NotNull
    public final String getLabel() {
        return this.label;
    }
}
