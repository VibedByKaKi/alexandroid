package com.amazon.identity.platform.metric.csm;

import android.os.Build;
import com.amazon.identity.auth.device.yf;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
final class MAPCSMTransitionFactoryProvider {

    /* renamed from: a, reason: collision with root package name */
    private MAPCSMTransitionFactory f1123a;

    private MAPCSMTransitionFactoryProvider() {
        getMAPCSMTransitionFactoryImpl();
    }

    public static MAPCSMTransitionFactoryProvider getInstance() {
        return a.f1124a;
    }

    private void getMAPCSMTransitionFactoryImpl() {
        try {
            Class<?> cls = Class.forName("com.amazon.csm.map.MAPCSMTransitionFactoryImpl", false, MAPCSMTransitionFactoryProvider.class.getClassLoader());
            if (cls != null) {
                this.f1123a = (MAPCSMTransitionFactory) cls.newInstance();
                yf.a("MAPCSMTransitionFactoryProvider");
                "user".equalsIgnoreCase(Build.TYPE);
            }
        } catch (ClassNotFoundException unused) {
            yf.a("MAPCSMTransitionFactoryProvider");
            "user".equalsIgnoreCase(Build.TYPE);
        } catch (IllegalAccessException unused2) {
            yf.a("MAPCSMTransitionFactoryProvider");
            "user".equalsIgnoreCase(Build.TYPE);
        } catch (InstantiationException unused3) {
            yf.a("MAPCSMTransitionFactoryProvider");
            "user".equalsIgnoreCase(Build.TYPE);
        }
    }

    public MAPCSMTransitionFactory getMAPCSMTransitionFactory() {
        return this.f1123a;
    }

    public /* synthetic */ MAPCSMTransitionFactoryProvider(int i) {
        this();
    }
}
