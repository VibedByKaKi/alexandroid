package com.amazon.alexa.api.compat.model;

import com.amazon.alexa.capabilityagent.cardstudiosurface.common.SurfaceWire;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/amazon/alexa/api/compat/model/ResponseType;", "", "<init>", "(Ljava/lang/String;I)V", SurfaceWire.RENDER_TYPE_FRAGMENT, "APL_DEEP_BROWSE", "URL_DEEP_BROWSE", "EXISTING_CHAT", "AlexaMobileAndroidVoiceSDKApiCompatModel_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class ResponseType {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ ResponseType[] $VALUES;
    public static final ResponseType FRAGMENT = new ResponseType(SurfaceWire.RENDER_TYPE_FRAGMENT, 0);
    public static final ResponseType APL_DEEP_BROWSE = new ResponseType("APL_DEEP_BROWSE", 1);
    public static final ResponseType URL_DEEP_BROWSE = new ResponseType("URL_DEEP_BROWSE", 2);
    public static final ResponseType EXISTING_CHAT = new ResponseType("EXISTING_CHAT", 3);

    private static final /* synthetic */ ResponseType[] $values() {
        return new ResponseType[]{FRAGMENT, APL_DEEP_BROWSE, URL_DEEP_BROWSE, EXISTING_CHAT};
    }

    static {
        ResponseType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    private ResponseType(String str, int i) {
    }

    @NotNull
    public static EnumEntries<ResponseType> getEntries() {
        return $ENTRIES;
    }

    public static ResponseType valueOf(String str) {
        return (ResponseType) Enum.valueOf(ResponseType.class, str);
    }

    public static ResponseType[] values() {
        return (ResponseType[]) $VALUES.clone();
    }
}
