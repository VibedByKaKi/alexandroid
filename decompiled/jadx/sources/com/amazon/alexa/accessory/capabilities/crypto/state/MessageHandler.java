package com.amazon.alexa.accessory.capabilities.crypto.state;

import com.amazon.alexa.accessory.capabilities.crypto.metrics.KeyExchangeMetrics;
import com.amazon.alexa.accessory.crypto.CryptoKeyDataStore;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public interface MessageHandler<T> {
    TransitionResponse getResponse(T t, String str, CryptoKeyDataStore cryptoKeyDataStore, KeyExchangeMetrics keyExchangeMetrics);
}
