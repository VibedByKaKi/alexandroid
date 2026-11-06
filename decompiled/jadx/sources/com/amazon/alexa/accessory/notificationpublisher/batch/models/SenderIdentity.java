package com.amazon.alexa.accessory.notificationpublisher.batch.models;

import androidx.annotation.NonNull;
import com.amazon.alexa.accessory.notificationpublisher.utils.NotificationConstants;
import com.amazon.alexa.accessory.notificationpublisher.utils.PhoneNumberUtils;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public class SenderIdentity {
    private final String appName;
    private final String name;
    private final Type type;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    /* renamed from: com.amazon.alexa.accessory.notificationpublisher.batch.models.SenderIdentity$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$amazon$alexa$accessory$notificationpublisher$batch$models$SenderIdentity$Type;

        static {
            int[] iArr = new int[Type.values().length];
            $SwitchMap$com$amazon$alexa$accessory$notificationpublisher$batch$models$SenderIdentity$Type = iArr;
            try {
                iArr[Type.KNOWN_CONTACT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$amazon$alexa$accessory$notificationpublisher$batch$models$SenderIdentity$Type[Type.UNKNOWN_PHONE_NUMBER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$amazon$alexa$accessory$notificationpublisher$batch$models$SenderIdentity$Type[Type.UNKNOWN_CONTACT_3P.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$amazon$alexa$accessory$notificationpublisher$batch$models$SenderIdentity$Type[Type.NON_COMMS_APP.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum Type {
        KNOWN_CONTACT,
        UNKNOWN_PHONE_NUMBER,
        UNKNOWN_CONTACT_3P,
        NON_COMMS_APP
    }

    public SenderIdentity(@NonNull Type type, @NonNull String str, @NonNull String str2) {
        this.type = type;
        this.name = str;
        this.appName = str2;
    }

    @NonNull
    public static SenderIdentity from(@NonNull Notification notification) {
        String type = notification.getType();
        String appName = notification.getAppName();
        if (!NotificationConstants.TYPE_COMMS.equals(type)) {
            return new SenderIdentity(Type.NON_COMMS_APP, "", appName);
        }
        String contact = notification.getContact();
        return !contact.isEmpty() ? PhoneNumberUtils.isPhoneNumber(contact) ? new SenderIdentity(Type.UNKNOWN_PHONE_NUMBER, contact, "") : new SenderIdentity(Type.KNOWN_CONTACT, contact, "") : new SenderIdentity(Type.UNKNOWN_CONTACT_3P, "", appName);
    }

    @NonNull
    public String getAppName() {
        return this.appName;
    }

    @NonNull
    public String getDisplayLabel() {
        int i = AnonymousClass1.$SwitchMap$com$amazon$alexa$accessory$notificationpublisher$batch$models$SenderIdentity$Type[this.type.ordinal()];
        if (i == 1) {
            return this.name;
        }
        if (i != 2) {
            return i != 3 ? i != 4 ? "Unknown" : this.appName : "an unknown contact";
        }
        String extractAreaCode = PhoneNumberUtils.extractAreaCode(this.name);
        return !extractAreaCode.isEmpty() ? "someone from area code ".concat(extractAreaCode) : "an unknown contact";
    }

    @NonNull
    public String getName() {
        return this.name;
    }

    @NonNull
    public Type getType() {
        return this.type;
    }
}
