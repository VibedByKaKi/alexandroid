package com.amazon.alexa.api;

import android.os.Bundle;
import android.util.Log;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
class BundleProxyMapper<K> extends ManagedAlexaConnectionProxyMapper<K, Bundle> {
    private static final String TAG = "BundleProxyMapper";
    private final BundlerFactory<K> bundlerFactory;
    private final Map<K, Bundler> bundlers = new HashMap();
    private final ElementRemovalListener<K> elementRemovalListener;

    public BundleProxyMapper(BundlerFactory<K> bundlerFactory, ElementRemovalListener<K> elementRemovalListener) {
        this.bundlerFactory = bundlerFactory;
        this.elementRemovalListener = elementRemovalListener;
    }

    /* renamed from: clearValue, reason: avoid collision after fix types in other method */
    public void clearValue2(K k, Bundle bundle) {
        Bundler remove = this.bundlers.remove(k);
        if (remove != null) {
            remove.clear();
            this.elementRemovalListener.onRemove(k);
        } else {
            Log.w(TAG, "Could not find Bundler to clear for key: " + k);
        }
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.amazon.alexa.api.ManagedAlexaConnectionProxyMapper
    public Bundle createValueFor(K k) {
        Bundler createBundlerFor = this.bundlerFactory.createBundlerFor(k);
        this.bundlers.put(k, createBundlerFor);
        return createBundlerFor.getBundle();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.amazon.alexa.api.ManagedAlexaConnectionProxyMapper
    public /* bridge */ /* synthetic */ Bundle createValueFor(Object obj) {
        return createValueFor((BundleProxyMapper<K>) obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.amazon.alexa.api.ManagedAlexaConnectionProxyMapper
    public /* bridge */ /* synthetic */ void clearValue(Object obj, Bundle bundle) {
        clearValue2((BundleProxyMapper<K>) obj, bundle);
    }
}
