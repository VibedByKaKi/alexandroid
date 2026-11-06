package com.amazon.alexa.apl.extension;

import com.amazon.alexaext.ExtensionProxy;
import com.amazon.alexaext.LocalExtensionProxy;
import com.amazon.apl.android.LegacyLocalExtensionProxy;
import com.amazon.apl.android.providers.IExtension;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lcom/amazon/alexa/apl/extension/ExtensionProxyProvider;", "", "()V", "getExtensionProxy", "Lcom/amazon/alexaext/ExtensionProxy;", "requestedExtension", "Lcom/amazon/alexaext/IExtension;", "Lcom/amazon/apl/android/providers/IExtension;", "AVSMobileFramework-android-apl_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class ExtensionProxyProvider {
    @NotNull
    public final ExtensionProxy getExtensionProxy(@NotNull IExtension requestedExtension) {
        requestedExtension.getClass();
        return new LegacyLocalExtensionProxy(requestedExtension);
    }

    @NotNull
    public final ExtensionProxy getExtensionProxy(@NotNull com.amazon.alexaext.IExtension requestedExtension) {
        requestedExtension.getClass();
        return new LocalExtensionProxy(requestedExtension);
    }
}
