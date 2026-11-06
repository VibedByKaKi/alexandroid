package com.amazon.alexa.handsfree.protocols.uservoicerecognition.locale;

import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.amazon.alexa.handsfree.protocols.dependencies.FalcoProtocolScope;
import javax.inject.Inject;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@FalcoProtocolScope
/* loaded from: classes17.dex */
public class UVRLocaleProvider {
    private UVRLocale mUVRLocale;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class InstanceHolder {
        private static final UVRLocaleProvider INSTANCE = new UVRLocaleProvider();

        private InstanceHolder() {
        }
    }

    @Inject
    @VisibleForTesting
    public UVRLocaleProvider() {
    }

    public static UVRLocaleProvider getInstance() {
        return InstanceHolder.INSTANCE;
    }

    public UVRLocale getUVRLocale() {
        UVRLocale uVRLocale = this.mUVRLocale;
        if (uVRLocale != null) {
            return uVRLocale;
        }
        Single$$ExternalSyntheticBUOutline0.m$2("UVRLocaleProvider wasn't initialized.");
        return null;
    }

    public void setUVRLocale(@NonNull UVRLocale uVRLocale) {
        this.mUVRLocale = uVRLocale;
    }
}
