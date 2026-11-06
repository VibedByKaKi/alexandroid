package com.amazon.alexa.redesign.client;

import com.amazon.dee.app.util.InvitationConstants;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, d2 = {"Lcom/amazon/alexa/redesign/client/GetContentTrigger;", "", "value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "PRE_WARM", "COLD_START", "WARM_START", "PULL_TO_REFRESH", "RECONCILIATION_RETRY", "SECTIONS_EXPIRED", "CONVERSATIONS_CHANGED", "AlexaMobileAndroidHomeChannel_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes19.dex */
public final class GetContentTrigger {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ GetContentTrigger[] $VALUES;

    @NotNull
    private final String value;
    public static final GetContentTrigger PRE_WARM = new GetContentTrigger("PRE_WARM", 0, "preWarm");
    public static final GetContentTrigger COLD_START = new GetContentTrigger("COLD_START", 1, InvitationConstants.COLD_START);
    public static final GetContentTrigger WARM_START = new GetContentTrigger("WARM_START", 2, "warmStart");
    public static final GetContentTrigger PULL_TO_REFRESH = new GetContentTrigger("PULL_TO_REFRESH", 3, "pullToRefresh");
    public static final GetContentTrigger RECONCILIATION_RETRY = new GetContentTrigger("RECONCILIATION_RETRY", 4, "reconciliationRetry");
    public static final GetContentTrigger SECTIONS_EXPIRED = new GetContentTrigger("SECTIONS_EXPIRED", 5, "sectionsExpired");
    public static final GetContentTrigger CONVERSATIONS_CHANGED = new GetContentTrigger("CONVERSATIONS_CHANGED", 6, "conversationsChanged");

    private static final /* synthetic */ GetContentTrigger[] $values() {
        return new GetContentTrigger[]{PRE_WARM, COLD_START, WARM_START, PULL_TO_REFRESH, RECONCILIATION_RETRY, SECTIONS_EXPIRED, CONVERSATIONS_CHANGED};
    }

    static {
        GetContentTrigger[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    private GetContentTrigger(String str, int i, String str2) {
        this.value = str2;
    }

    @NotNull
    public static EnumEntries<GetContentTrigger> getEntries() {
        return $ENTRIES;
    }

    public static GetContentTrigger valueOf(String str) {
        return (GetContentTrigger) Enum.valueOf(GetContentTrigger.class, str);
    }

    public static GetContentTrigger[] values() {
        return (GetContentTrigger[]) $VALUES.clone();
    }

    @NotNull
    public final String getValue() {
        return this.value;
    }
}
