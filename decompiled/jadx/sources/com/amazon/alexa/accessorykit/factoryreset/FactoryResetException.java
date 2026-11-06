package com.amazon.alexa.accessorykit.factoryreset;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
public class FactoryResetException extends Exception {
    private final int errorCode;
    private final String reason;
    private final Type type;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    /* renamed from: com.amazon.alexa.accessorykit.factoryreset.FactoryResetException$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$amazon$alexa$accessorykit$factoryreset$FactoryResetException$Type;

        static {
            int[] iArr = new int[Type.values().length];
            $SwitchMap$com$amazon$alexa$accessorykit$factoryreset$FactoryResetException$Type = iArr;
            try {
                iArr[Type.FEATURE_DISABLED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$amazon$alexa$accessorykit$factoryreset$FactoryResetException$Type[Type.NO_ACTIVE_SESSION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$amazon$alexa$accessorykit$factoryreset$FactoryResetException$Type[Type.TIMEOUT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$amazon$alexa$accessorykit$factoryreset$FactoryResetException$Type[Type.ALREADY_IN_PROGRESS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum Type {
        FEATURE_DISABLED,
        NO_ACTIVE_SESSION,
        ACCESSORY_REJECTED,
        TIMEOUT,
        ALREADY_IN_PROGRESS
    }

    public FactoryResetException(Type type) {
        super(messageForType(type));
        this.type = type;
        this.errorCode = 0;
        this.reason = null;
    }

    private static String messageForType(Type type) {
        int i = AnonymousClass1.$SwitchMap$com$amazon$alexa$accessorykit$factoryreset$FactoryResetException$Type[type.ordinal()];
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? "Factory reset failed" : "A factory reset is already in progress" : "Factory reset timed out waiting for accessory response" : "No active accessory session found" : "Factory reset feature is not enabled";
    }

    public static String reasonForCode(int i) {
        if (i == 1) {
            return "Unknown error";
        }
        switch (i) {
            case 100:
                return "Insufficient battery";
            case 101:
                return "Insufficient resources";
            case 102:
                return "Device is too hot";
            default:
                return "Unrecognized error";
        }
    }

    public int getErrorCode() {
        return this.errorCode;
    }

    public String getReason() {
        return this.reason;
    }

    public Type getType() {
        return this.type;
    }

    public FactoryResetException(Type type, int i) {
        this(type, i, reasonForCode(i));
    }

    public FactoryResetException(Type type, int i, String str) {
        super(str);
        this.type = type;
        this.errorCode = i;
        this.reason = reasonForCode(i);
    }
}
