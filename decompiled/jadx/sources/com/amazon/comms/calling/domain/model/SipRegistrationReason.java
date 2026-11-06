package com.amazon.comms.calling.domain.model;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, d2 = {"Lcom/amazon/comms/calling/domain/model/SipRegistrationReason;", "", "value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "SIP_REGISTRATION_PUSH_NOTIFICATION", "SIP_REGISTRATION_NETWORK_CHANGED", "SIP_REGISTRATION_APP_FOREGROUNDED", "SIP_REGISTRATION_MODE_SWITCHED_TABLET", "SIP_REGISTRATION_BEGIN_CALL", "SIP_REGISTRATION_APP_STARTED", "SIP_REGISTRATION_ON_AUTH_TOKEN_EXPIRING", "AlexaCommsCallingUI-Android_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes20.dex */
public final class SipRegistrationReason {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ SipRegistrationReason[] $VALUES;

    @NotNull
    private final String value;
    public static final SipRegistrationReason SIP_REGISTRATION_PUSH_NOTIFICATION = new SipRegistrationReason("SIP_REGISTRATION_PUSH_NOTIFICATION", 0, "sip_registration_pushNotification");
    public static final SipRegistrationReason SIP_REGISTRATION_NETWORK_CHANGED = new SipRegistrationReason("SIP_REGISTRATION_NETWORK_CHANGED", 1, "sip_registration_networkChanged");
    public static final SipRegistrationReason SIP_REGISTRATION_APP_FOREGROUNDED = new SipRegistrationReason("SIP_REGISTRATION_APP_FOREGROUNDED", 2, "sip_registration_appForegrounded");
    public static final SipRegistrationReason SIP_REGISTRATION_MODE_SWITCHED_TABLET = new SipRegistrationReason("SIP_REGISTRATION_MODE_SWITCHED_TABLET", 3, "sip_registration_modeSwitchedTablet");
    public static final SipRegistrationReason SIP_REGISTRATION_BEGIN_CALL = new SipRegistrationReason("SIP_REGISTRATION_BEGIN_CALL", 4, "sip_registration_beginCall");
    public static final SipRegistrationReason SIP_REGISTRATION_APP_STARTED = new SipRegistrationReason("SIP_REGISTRATION_APP_STARTED", 5, "sip_registration_app_started");
    public static final SipRegistrationReason SIP_REGISTRATION_ON_AUTH_TOKEN_EXPIRING = new SipRegistrationReason("SIP_REGISTRATION_ON_AUTH_TOKEN_EXPIRING", 6, "sip_registration_onAuthTokenExpiring");

    private static final /* synthetic */ SipRegistrationReason[] $values() {
        return new SipRegistrationReason[]{SIP_REGISTRATION_PUSH_NOTIFICATION, SIP_REGISTRATION_NETWORK_CHANGED, SIP_REGISTRATION_APP_FOREGROUNDED, SIP_REGISTRATION_MODE_SWITCHED_TABLET, SIP_REGISTRATION_BEGIN_CALL, SIP_REGISTRATION_APP_STARTED, SIP_REGISTRATION_ON_AUTH_TOKEN_EXPIRING};
    }

    static {
        SipRegistrationReason[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    private SipRegistrationReason(String str, int i, String str2) {
        this.value = str2;
    }

    @NotNull
    public static EnumEntries<SipRegistrationReason> getEntries() {
        return $ENTRIES;
    }

    public static SipRegistrationReason valueOf(String str) {
        return (SipRegistrationReason) Enum.valueOf(SipRegistrationReason.class, str);
    }

    public static SipRegistrationReason[] values() {
        return (SipRegistrationReason[]) $VALUES.clone();
    }

    @NotNull
    public final String getValue() {
        return this.value;
    }
}
