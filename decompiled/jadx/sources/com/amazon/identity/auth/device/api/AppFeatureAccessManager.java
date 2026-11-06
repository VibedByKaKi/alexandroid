package com.amazon.identity.auth.device.api;

import com.amazon.fireos.sdk.annotations.FireOsSdk;
import com.amazon.identity.auth.device.api.AppFeatureProvider;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public final class AppFeatureAccessManager {

    /* renamed from: a, reason: collision with root package name */
    private static AppFeatureProvider.WeblabFeatureProvider f468a;
    private static AppFeatureProvider.PermissionFeatureProvider b;

    public static AppFeatureProvider.PermissionFeatureProvider getPermissionFeatureProvider() {
        return b;
    }

    public static AppFeatureProvider.WeblabFeatureProvider getWeblabFeatureProvider() {
        return f468a;
    }

    @FireOsSdk
    public static synchronized void init(AppFeatureProvider... appFeatureProviderArr) {
        synchronized (AppFeatureAccessManager.class) {
            try {
                for (AppFeatureProvider appFeatureProvider : appFeatureProviderArr) {
                    if (appFeatureProvider instanceof AppFeatureProvider.WeblabFeatureProvider) {
                        f468a = (AppFeatureProvider.WeblabFeatureProvider) appFeatureProvider;
                    } else if (appFeatureProvider instanceof AppFeatureProvider.PermissionFeatureProvider) {
                        b = (AppFeatureProvider.PermissionFeatureProvider) appFeatureProvider;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
