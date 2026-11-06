package com.amazon.alexaext;

import android.util.Log;
import androidx.annotation.NonNull;
import com.amazon.common.BoundObject;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class ExtensionRegistrar extends BoundObject {
    private static final String TAG = "ExtensionRegistrar";
    private final Set<IExtensionProvider> mProviders;
    private final Map<String, ExtensionProxy> mProxies;

    public ExtensionRegistrar() {
        bind(nCreate());
        this.mProxies = new HashMap();
        this.mProviders = new HashSet();
    }

    @NonNull
    private long createProxy(String str) {
        ExtensionProxy extension = getExtension(str);
        if (extension != null) {
            return extension.getNativeHandle();
        }
        return 0L;
    }

    private native long nCreate();

    public ExtensionRegistrar addProvider(IExtensionProvider iExtensionProvider) {
        this.mProviders.add(iExtensionProvider);
        return this;
    }

    public void closeAllRemoteV1Connections() {
        Log.i(TAG, "Closing connections to all remote extensions");
        int i = 0;
        for (ExtensionProxy extensionProxy : this.mProxies.values()) {
            if (extensionProxy instanceof RemoteExtensionProxy) {
                try {
                    ((RemoteExtensionProxy) extensionProxy).disconnectV1();
                    i++;
                } catch (Throwable th) {
                    Log.e(TAG, "Exception caused while cleaning connections with cause: " + th);
                }
            }
        }
        Log.i(TAG, String.format("Closing connections to all remote extensions (count=%d)", Integer.valueOf(i)));
    }

    public ExtensionProxy getExtension(String str) {
        ExtensionProxy extension;
        ExtensionProxy extensionProxy = this.mProxies.get(str);
        if (extensionProxy != null) {
            return extensionProxy;
        }
        for (IExtensionProvider iExtensionProvider : this.mProviders) {
            if (iExtensionProvider.hasExtension(str) && (extension = iExtensionProvider.getExtension(str)) != null) {
                this.mProxies.put(str, extension);
                return extension;
            }
        }
        return null;
    }

    @Deprecated
    public Collection<ExtensionProxy> getExtensions() {
        return this.mProxies.values();
    }

    @NonNull
    public boolean hasExtension(String str) {
        if (this.mProxies.containsKey(str)) {
            return true;
        }
        Iterator<IExtensionProvider> it2 = this.mProviders.iterator();
        while (it2.hasNext()) {
            if (it2.next().hasExtension(str)) {
                return true;
            }
        }
        return false;
    }

    public ExtensionRegistrar registerExtension(ExtensionProxy extensionProxy) {
        this.mProxies.put(extensionProxy.getUri(), extensionProxy);
        return this;
    }
}
