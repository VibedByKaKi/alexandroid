package com.amazon.comms.calling.data.dao;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\r\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"Lcom/amazon/comms/calling/data/dao/BeginCallStatusCode;", "", "<init>", "(Ljava/lang/String;I)V", "SUCCESS", "MEMBERS_NOT_FOUND_IN_GROUP", "SUCCESS_OMITTING_EXCESS_DEVICES", "NO_OTHER_ENDPOINTS", "ALL_DEVICES_DND", "NO_DEVICES_FOUND", "ALL_DEVICES_BUSY", "NO_DEVICES_AVAILABLE", "NOT_SUPPORTED", "FAIL", "AlexaCommsCallingUI-Android_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes20.dex */
public final class BeginCallStatusCode {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ BeginCallStatusCode[] $VALUES;
    public static final BeginCallStatusCode SUCCESS = new BeginCallStatusCode("SUCCESS", 0);
    public static final BeginCallStatusCode MEMBERS_NOT_FOUND_IN_GROUP = new BeginCallStatusCode("MEMBERS_NOT_FOUND_IN_GROUP", 1);
    public static final BeginCallStatusCode SUCCESS_OMITTING_EXCESS_DEVICES = new BeginCallStatusCode("SUCCESS_OMITTING_EXCESS_DEVICES", 2);
    public static final BeginCallStatusCode NO_OTHER_ENDPOINTS = new BeginCallStatusCode("NO_OTHER_ENDPOINTS", 3);
    public static final BeginCallStatusCode ALL_DEVICES_DND = new BeginCallStatusCode("ALL_DEVICES_DND", 4);
    public static final BeginCallStatusCode NO_DEVICES_FOUND = new BeginCallStatusCode("NO_DEVICES_FOUND", 5);
    public static final BeginCallStatusCode ALL_DEVICES_BUSY = new BeginCallStatusCode("ALL_DEVICES_BUSY", 6);
    public static final BeginCallStatusCode NO_DEVICES_AVAILABLE = new BeginCallStatusCode("NO_DEVICES_AVAILABLE", 7);
    public static final BeginCallStatusCode NOT_SUPPORTED = new BeginCallStatusCode("NOT_SUPPORTED", 8);
    public static final BeginCallStatusCode FAIL = new BeginCallStatusCode("FAIL", 9);

    private static final /* synthetic */ BeginCallStatusCode[] $values() {
        return new BeginCallStatusCode[]{SUCCESS, MEMBERS_NOT_FOUND_IN_GROUP, SUCCESS_OMITTING_EXCESS_DEVICES, NO_OTHER_ENDPOINTS, ALL_DEVICES_DND, NO_DEVICES_FOUND, ALL_DEVICES_BUSY, NO_DEVICES_AVAILABLE, NOT_SUPPORTED, FAIL};
    }

    static {
        BeginCallStatusCode[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    private BeginCallStatusCode(String str, int i) {
    }

    @NotNull
    public static EnumEntries<BeginCallStatusCode> getEntries() {
        return $ENTRIES;
    }

    public static BeginCallStatusCode valueOf(String str) {
        return (BeginCallStatusCode) Enum.valueOf(BeginCallStatusCode.class, str);
    }

    public static BeginCallStatusCode[] values() {
        return (BeginCallStatusCode[]) $VALUES.clone();
    }
}
