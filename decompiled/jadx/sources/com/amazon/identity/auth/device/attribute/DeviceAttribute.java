package com.amazon.identity.auth.device.attribute;

import android.content.Context;
import com.amazon.identity.auth.device.ta;
import com.amazon.identity.auth.device.u7;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public abstract class DeviceAttribute {
    public static final DeviceAttribute CentralDeviceType = new AnonymousClass1();
    public static final DeviceAttribute CentralAPK = new AnonymousClass2();
    private static final /* synthetic */ DeviceAttribute[] $VALUES = $values();

    private static /* synthetic */ DeviceAttribute[] $values() {
        return new DeviceAttribute[]{CentralDeviceType, CentralAPK};
    }

    public /* synthetic */ DeviceAttribute(String str, int i, int i2) {
        this(str, i);
    }

    public static DeviceAttribute valueOf(String str) {
        return (DeviceAttribute) Enum.valueOf(DeviceAttribute.class, str);
    }

    public static DeviceAttribute[] values() {
        return (DeviceAttribute[]) $VALUES.clone();
    }

    public abstract Object fetchValue(Context context);

    private DeviceAttribute(String str, int i) {
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    /* renamed from: com.amazon.identity.auth.device.attribute.DeviceAttribute$1, reason: invalid class name */
    public enum AnonymousClass1 extends DeviceAttribute {
        public /* synthetic */ AnonymousClass1() {
            this("CentralDeviceType", 0);
        }

        @Override // com.amazon.identity.auth.device.attribute.DeviceAttribute
        public Object fetchValue(Context context) {
            return ta.b(context);
        }

        private AnonymousClass1(String str, int i) {
            super(str, i, 0);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    /* renamed from: com.amazon.identity.auth.device.attribute.DeviceAttribute$2, reason: invalid class name */
    public enum AnonymousClass2 extends DeviceAttribute {
        public /* synthetic */ AnonymousClass2() {
            this("CentralAPK", 1);
        }

        @Override // com.amazon.identity.auth.device.attribute.DeviceAttribute
        public Object fetchValue(Context context) {
            return Boolean.valueOf(u7.b(context));
        }

        private AnonymousClass2(String str, int i) {
            super(str, i, 0);
        }
    }
}
