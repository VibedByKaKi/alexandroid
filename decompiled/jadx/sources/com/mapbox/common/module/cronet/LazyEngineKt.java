package com.mapbox.common.module.cronet;

import android.content.Context;
import androidx.annotation.VisibleForTesting;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import org.chromium.net.CronetProvider;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000(\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0012\u0010\f\u001a\u0004\u0018\u00010\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0001\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\"\"\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00058\u0000X\u0081\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\"\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"CRONET_PLAY_SERVICES_INSTALLER_CLASS", "", "canInstallFromGooglePlay", "Ljava/util/concurrent/atomic/AtomicBoolean;", "disabledProviders", "Ljava/util/concurrent/CopyOnWriteArraySet;", "getDisabledProviders$annotations", "()V", "getDisabledProviders", "()Ljava/util/concurrent/CopyOnWriteArraySet;", "isPlayServicesCronetProviderInstallerAvailable", "", "findCronetProvider", "Lorg/chromium/net/CronetProvider;", "context", "Landroid/content/Context;", "common_release"}, k = 2, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes8.dex */
public final class LazyEngineKt {

    @NotNull
    private static final String CRONET_PLAY_SERVICES_INSTALLER_CLASS = "com.google.android.gms.net.CronetProviderInstaller";

    @NotNull
    private static final AtomicBoolean canInstallFromGooglePlay;

    @NotNull
    private static final CopyOnWriteArraySet<String> disabledProviders;
    private static final boolean isPlayServicesCronetProviderInstallerAvailable;

    static {
        Object m25294constructorimpl;
        CopyOnWriteArraySet<String> copyOnWriteArraySet = new CopyOnWriteArraySet<>();
        copyOnWriteArraySet.add(CronetProvider.PROVIDER_NAME_FALLBACK);
        disabledProviders = copyOnWriteArraySet;
        try {
            Result.Companion companion = Result.INSTANCE;
            m25294constructorimpl = Result.m25294constructorimpl(Class.forName(CRONET_PLAY_SERVICES_INSTALLER_CLASS));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m25294constructorimpl = Result.m25294constructorimpl(ResultKt.createFailure(th));
        }
        boolean m25301isSuccessimpl = Result.m25301isSuccessimpl(m25294constructorimpl);
        isPlayServicesCronetProviderInstallerAvailable = m25301isSuccessimpl;
        canInstallFromGooglePlay = new AtomicBoolean(m25301isSuccessimpl);
    }

    @VisibleForTesting(otherwise = 2)
    @Nullable
    public static final CronetProvider findCronetProvider(@NotNull Context context) {
        Object obj;
        context.getClass();
        List<CronetProvider> allProviders = CronetProvider.getAllProviders(context);
        allProviders.getClass();
        Iterator<T> it2 = allProviders.iterator();
        while (true) {
            if (!it2.hasNext()) {
                obj = null;
                break;
            }
            obj = it2.next();
            CronetProvider cronetProvider = (CronetProvider) obj;
            try {
                if (cronetProvider.isEnabled() && !disabledProviders.contains(cronetProvider.getName())) {
                    break;
                }
            } catch (Exception unused) {
            }
        }
        return (CronetProvider) obj;
    }

    @NotNull
    public static final CopyOnWriteArraySet<String> getDisabledProviders() {
        return disabledProviders;
    }

    @VisibleForTesting(otherwise = 2)
    public static /* synthetic */ void getDisabledProviders$annotations() {
    }
}
