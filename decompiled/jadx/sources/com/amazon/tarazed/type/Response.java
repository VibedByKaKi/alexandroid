package com.amazon.tarazed.type;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/amazon/tarazed/type/Response;", "", "(Ljava/lang/String;I)V", "ACCEPTED", "DENIED", "TIMEOUT", "TarazedAndroidLibrary_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes19.dex */
public final class Response {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ Response[] $VALUES;
    public static final Response ACCEPTED = new Response("ACCEPTED", 0);
    public static final Response DENIED = new Response("DENIED", 1);
    public static final Response TIMEOUT = new Response("TIMEOUT", 2);

    private static final /* synthetic */ Response[] $values() {
        return new Response[]{ACCEPTED, DENIED, TIMEOUT};
    }

    static {
        Response[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    private Response(String str, int i) {
    }

    @NotNull
    public static EnumEntries<Response> getEntries() {
        return $ENTRIES;
    }

    public static Response valueOf(String str) {
        return (Response) Enum.valueOf(Response.class, str);
    }

    public static Response[] values() {
        return (Response[]) $VALUES.clone();
    }
}
