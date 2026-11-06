package com.amazon.comms.calling.domain.model;

import com.amazon.deecomms.alexa.CallTypeEventConstants;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/amazon/comms/calling/domain/model/CallExperienceType;", "", "<init>", "(Ljava/lang/String;I)V", CallTypeEventConstants.VUI_ONLY, CallTypeEventConstants.GUI_ONLY, "AlexaCommsCallingUI-Android_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes20.dex */
public final class CallExperienceType {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ CallExperienceType[] $VALUES;
    public static final CallExperienceType VUI_ONLY = new CallExperienceType(CallTypeEventConstants.VUI_ONLY, 0);
    public static final CallExperienceType GUI_ONLY = new CallExperienceType(CallTypeEventConstants.GUI_ONLY, 1);

    private static final /* synthetic */ CallExperienceType[] $values() {
        return new CallExperienceType[]{VUI_ONLY, GUI_ONLY};
    }

    static {
        CallExperienceType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    private CallExperienceType(String str, int i) {
    }

    @NotNull
    public static EnumEntries<CallExperienceType> getEntries() {
        return $ENTRIES;
    }

    public static CallExperienceType valueOf(String str) {
        return (CallExperienceType) Enum.valueOf(CallExperienceType.class, str);
    }

    public static CallExperienceType[] values() {
        return (CallExperienceType[]) $VALUES.clone();
    }
}
