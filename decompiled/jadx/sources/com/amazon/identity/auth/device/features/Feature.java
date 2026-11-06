package com.amazon.identity.auth.device.features;

import android.content.Context;
import com.amazon.identity.auth.device.ap;
import com.amazon.identity.auth.device.framework.IsolatedModeSwitcher;
import com.amazon.identity.auth.device.gl;
import com.amazon.identity.auth.device.u7;
import java.util.HashSet;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public abstract class Feature {
    public static final Feature OverrideDeviceAttributes = new AnonymousClass1();
    public static final Feature DSNWhenNotRegistered = new AnonymousClass2();
    public static final Feature PandaRegistration = new AnonymousClass3();
    public static final Feature SplitRegistration = new AnonymousClass4();
    public static final Feature DirectedIdSupported = new AnonymousClass5();
    public static final Feature SplitRegistrationWithDirectedId = new AnonymousClass6();
    public static final Feature RegistrationViaAuthToken = new AnonymousClass7();
    public static final Feature UseDeviceLocaleAsLanguagePreference = new AnonymousClass8();
    public static final Feature IsolateApplication = new AnonymousClass9();
    public static final Feature SecondaryRegistrationUsingPanda = new AnonymousClass10();
    private static final /* synthetic */ Feature[] $VALUES = $values();

    private static /* synthetic */ Feature[] $values() {
        return new Feature[]{OverrideDeviceAttributes, DSNWhenNotRegistered, PandaRegistration, SplitRegistration, DirectedIdSupported, SplitRegistrationWithDirectedId, RegistrationViaAuthToken, UseDeviceLocaleAsLanguagePreference, IsolateApplication, SecondaryRegistrationUsingPanda};
    }

    public /* synthetic */ Feature(String str, int i, int i2) {
        this(str, i);
    }

    public static Feature valueOf(String str) {
        return (Feature) Enum.valueOf(Feature.class, str);
    }

    public static Feature[] values() {
        return (Feature[]) $VALUES.clone();
    }

    public abstract boolean fetchValue(Context context);

    private Feature(String str, int i) {
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    /* renamed from: com.amazon.identity.auth.device.features.Feature$1, reason: invalid class name */
    public enum AnonymousClass1 extends Feature {
        public /* synthetic */ AnonymousClass1() {
            this("OverrideDeviceAttributes", 0);
        }

        @Override // com.amazon.identity.auth.device.features.Feature
        public boolean fetchValue(Context context) {
            return !gl.g(context);
        }

        private AnonymousClass1(String str, int i) {
            super(str, i, 0);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    /* renamed from: com.amazon.identity.auth.device.features.Feature$2, reason: invalid class name */
    public enum AnonymousClass2 extends Feature {
        public /* synthetic */ AnonymousClass2() {
            this("DSNWhenNotRegistered", 1);
        }

        @Override // com.amazon.identity.auth.device.features.Feature
        public boolean fetchValue(Context context) {
            return !u7.b(context) || gl.g(context);
        }

        private AnonymousClass2(String str, int i) {
            super(str, i, 0);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    /* renamed from: com.amazon.identity.auth.device.features.Feature$3, reason: invalid class name */
    public enum AnonymousClass3 extends Feature {
        public /* synthetic */ AnonymousClass3() {
            this("PandaRegistration", 2);
        }

        @Override // com.amazon.identity.auth.device.features.Feature
        public boolean fetchValue(Context context) {
            if ("panda".equals(new ap().a("com.amazon.map.registration"))) {
                return true;
            }
            return !u7.b(context);
        }

        private AnonymousClass3(String str, int i) {
            super(str, i, 0);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    /* renamed from: com.amazon.identity.auth.device.features.Feature$4, reason: invalid class name */
    public enum AnonymousClass4 extends Feature {
        public /* synthetic */ AnonymousClass4() {
            this("SplitRegistration", 3);
        }

        @Override // com.amazon.identity.auth.device.features.Feature
        public boolean fetchValue(Context context) {
            if ("split".equals(new ap().a("com.amazon.map.registration"))) {
                return true;
            }
            HashSet hashSet = gl.f684a;
            return u7.b(context);
        }

        private AnonymousClass4(String str, int i) {
            super(str, i, 0);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    /* renamed from: com.amazon.identity.auth.device.features.Feature$5, reason: invalid class name */
    public enum AnonymousClass5 extends Feature {
        public /* synthetic */ AnonymousClass5() {
            this("DirectedIdSupported", 4);
        }

        @Override // com.amazon.identity.auth.device.features.Feature
        public boolean fetchValue(Context context) {
            HashSet hashSet = gl.f684a;
            return gl.a(u7.a(context));
        }

        private AnonymousClass5(String str, int i) {
            super(str, i, 0);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    /* renamed from: com.amazon.identity.auth.device.features.Feature$6, reason: invalid class name */
    public enum AnonymousClass6 extends Feature {
        public /* synthetic */ AnonymousClass6() {
            this("SplitRegistrationWithDirectedId", 5);
        }

        @Override // com.amazon.identity.auth.device.features.Feature
        public boolean fetchValue(Context context) {
            HashSet hashSet = gl.f684a;
            return u7.b(context);
        }

        private AnonymousClass6(String str, int i) {
            super(str, i, 0);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    /* renamed from: com.amazon.identity.auth.device.features.Feature$7, reason: invalid class name */
    public enum AnonymousClass7 extends Feature {
        public /* synthetic */ AnonymousClass7() {
            this("RegistrationViaAuthToken", 6);
        }

        @Override // com.amazon.identity.auth.device.features.Feature
        public boolean fetchValue(Context context) {
            HashSet hashSet = gl.f684a;
            return !u7.b(context);
        }

        private AnonymousClass7(String str, int i) {
            super(str, i, 0);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    /* renamed from: com.amazon.identity.auth.device.features.Feature$8, reason: invalid class name */
    public enum AnonymousClass8 extends Feature {
        public /* synthetic */ AnonymousClass8() {
            this("UseDeviceLocaleAsLanguagePreference", 7);
        }

        @Override // com.amazon.identity.auth.device.features.Feature
        public boolean fetchValue(Context context) {
            return gl.g(context);
        }

        private AnonymousClass8(String str, int i) {
            super(str, i, 0);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    /* renamed from: com.amazon.identity.auth.device.features.Feature$10, reason: invalid class name */
    public enum AnonymousClass10 extends Feature {
        public /* synthetic */ AnonymousClass10() {
            this("SecondaryRegistrationUsingPanda", 9);
        }

        @Override // com.amazon.identity.auth.device.features.Feature
        public boolean fetchValue(Context context) {
            return false;
        }

        private AnonymousClass10(String str, int i) {
            super(str, i, 0);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    /* renamed from: com.amazon.identity.auth.device.features.Feature$9, reason: invalid class name */
    public enum AnonymousClass9 extends Feature {
        public /* synthetic */ AnonymousClass9() {
            this("IsolateApplication", 8);
        }

        @Override // com.amazon.identity.auth.device.features.Feature
        public boolean fetchValue(Context context) {
            return IsolatedModeSwitcher.isAppInIsolatedMode(context);
        }

        private AnonymousClass9(String str, int i) {
            super(str, i, 0);
        }
    }
}
