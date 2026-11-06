package com.amazon.identity.auth.device.utils;

import com.amazon.identity.auth.device.framework.InvalidEnumValueException;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'UserDebug' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByField(EnumVisitor.java:372)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:337)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:322)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInvoke(EnumVisitor.java:293)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:266)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public final class BuildConfiguration {
    private static final /* synthetic */ BuildConfiguration[] $VALUES;
    public static final BuildConfiguration Eng = new BuildConfiguration("Eng", 0, KeyType.Debug);
    public static final BuildConfiguration ReleaseDebug;
    public static final BuildConfiguration User;
    public static final BuildConfiguration UserDebug;
    private final KeyType mSignedWith;

    private static /* synthetic */ BuildConfiguration[] $values() {
        return new BuildConfiguration[]{Eng, UserDebug, User, ReleaseDebug};
    }

    static {
        KeyType keyType = KeyType.ReleaseDebug;
        UserDebug = new BuildConfiguration("UserDebug", 1, keyType);
        User = new BuildConfiguration("User", 2, KeyType.Release);
        ReleaseDebug = new BuildConfiguration("ReleaseDebug", 3, keyType);
        $VALUES = $values();
    }

    private BuildConfiguration(String str, int i, KeyType keyType) {
        this.mSignedWith = keyType;
    }

    public static BuildConfiguration fromString(String str) throws InvalidEnumValueException {
        if (str == null) {
            throw new InvalidEnumValueException("Null is not a valid BuildType");
        }
        for (BuildConfiguration buildConfiguration : values()) {
            if (buildConfiguration.toString().equalsIgnoreCase(str)) {
                return buildConfiguration;
            }
        }
        throw new InvalidEnumValueException("Unknown build type: ".concat(str));
    }

    public static BuildConfiguration valueOf(String str) {
        return (BuildConfiguration) Enum.valueOf(BuildConfiguration.class, str);
    }

    public static BuildConfiguration[] values() {
        return (BuildConfiguration[]) $VALUES.clone();
    }

    public boolean isSignedWith(KeyType keyType) {
        return this.mSignedWith == keyType;
    }
}
