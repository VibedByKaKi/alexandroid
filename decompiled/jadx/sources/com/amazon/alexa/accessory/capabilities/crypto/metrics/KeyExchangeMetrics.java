package com.amazon.alexa.accessory.capabilities.crypto.metrics;

import androidx.compose.runtime.BitVector$$ExternalSyntheticOutline0;
import androidx.room.Room$$ExternalSyntheticBUOutline0;
import com.amazon.alexa.accessory.capabilities.crypto.state.KeyExchangeState;
import com.amazon.alexa.accessory.metrics.AccessoryMetricsService;
import com.amazon.alexa.accessory.metrics.AccessoryMetricsServiceHolder;
import com.amazon.alexa.accessory.metrics.MetricsConstants;
import com.amazon.alexa.accessory.metrics.Stopwatch;
import com.google.common.collect.Sets;
import defpackage.a$$ExternalSyntheticOutline0;
import java.util.Collections;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public class KeyExchangeMetrics {
    private static final Map<KeyExchangeState, String> INITIALIZATION_NEXT_STATE_METRICS;
    private static final Map<KeyExchangeState, Set<String>> STATE_SUCCESS_RATE_METRICS;
    private static final String UNKNOWN_STATE_NAME = "UnknownState";
    private final Stopwatch stopwatch;
    private KeyExchangeState trackingState;

    static {
        Class<KeyExchangeState> cls = KeyExchangeState.class;
        INITIALIZATION_NEXT_STATE_METRICS = Collections.unmodifiableMap(new EnumMap<KeyExchangeState, String>(cls) { // from class: com.amazon.alexa.accessory.capabilities.crypto.metrics.KeyExchangeMetrics.1
            {
                put((AnonymousClass1) KeyExchangeState.NO_KEYS, (KeyExchangeState) MetricsConstants.KeyExchange.KEY_EXCHANGE_INITIALIZED_NO_KEYS_RATE);
                put((AnonymousClass1) KeyExchangeState.NO_KEYS_REQUIRED, (KeyExchangeState) MetricsConstants.KeyExchange.KEY_EXCHANGE_INITIALIZED_NO_KEYS_REQUIRED_RATE);
                put((AnonymousClass1) KeyExchangeState.HAS_KEYS, (KeyExchangeState) MetricsConstants.KeyExchange.KEY_EXCHANGE_INITIALIZED_WITH_KEYS_RATE);
            }
        });
        STATE_SUCCESS_RATE_METRICS = Collections.unmodifiableMap(new EnumMap<KeyExchangeState, Set<String>>(cls) { // from class: com.amazon.alexa.accessory.capabilities.crypto.metrics.KeyExchangeMetrics.2
            {
                put((AnonymousClass2) KeyExchangeState.INITIALIZING, (KeyExchangeState) Sets.newHashSet(KeyExchangeMetrics.INITIALIZATION_NEXT_STATE_METRICS.values()));
                put((AnonymousClass2) KeyExchangeState.NO_KEYS, (KeyExchangeState) Collections.unmodifiableSet(Sets.newHashSet(MetricsConstants.KeyExchange.KEY_EXCHANGE_NEGOTIATION_SUCCESS_RATE, MetricsConstants.KeyExchange.KEY_EXCHANGE_INIT_HANDSHAKE_ACKNOWLEDGEMENT_SUCCESS_RATE)));
                put((AnonymousClass2) KeyExchangeState.HAS_KEYS_AWAITING_COMPLETE_HANDSHAKE, (KeyExchangeState) Collections.singleton(MetricsConstants.KeyExchange.KEY_EXCHANGE_NEGOTIATION_SUCCESS_RATE));
                put((AnonymousClass2) KeyExchangeState.HAS_KEYS_AWAITING_CONFIRM_RESET, (KeyExchangeState) Collections.singleton(MetricsConstants.KeyExchange.KEY_EXCHANGE_ROTATION_SUCCESS_RATE));
            }
        });
    }

    public KeyExchangeMetrics(Stopwatch.CurrentTimeSupplier currentTimeSupplier) {
        this.trackingState = null;
        this.stopwatch = new Stopwatch(currentTimeSupplier);
    }

    private static AccessoryMetricsService getMetricsService() {
        return AccessoryMetricsServiceHolder.getInstance().get();
    }

    private String getStateName() {
        KeyExchangeState keyExchangeState = this.trackingState;
        return keyExchangeState == null ? UNKNOWN_STATE_NAME : keyExchangeState.name();
    }

    public void completeWithError(MetricsConstants.KeyExchange.IrrecoverableErrorCause irrecoverableErrorCause) {
        this.stopwatch.stopAndReset();
        String m = a$$ExternalSyntheticOutline0.m(new StringBuilder("KeyExchange."), getStateName(), ".IrrecoverableError.");
        MetricsConstants.KeyExchange.IrrecoverableErrorCause[] values = MetricsConstants.KeyExchange.IrrecoverableErrorCause.values();
        int length = values.length;
        for (int i = 0; i < length; i++) {
            MetricsConstants.KeyExchange.IrrecoverableErrorCause irrecoverableErrorCause2 = values[i];
            StringBuilder m2 = BitVector$$ExternalSyntheticOutline0.m(m);
            m2.append(irrecoverableErrorCause2.metricName);
            recordOccurrence(m2.toString(), irrecoverableErrorCause2 == irrecoverableErrorCause);
        }
        Map<KeyExchangeState, Set<String>> map = STATE_SUCCESS_RATE_METRICS;
        if (map.containsKey(this.trackingState)) {
            Iterator<String> it2 = map.get(this.trackingState).iterator();
            while (it2.hasNext()) {
                recordOccurrence(it2.next(), false);
            }
        }
        updateState(KeyExchangeState.IRRECOVERABLE_ERROR);
    }

    public void onInitializationComplete(KeyExchangeState keyExchangeState) {
        recordLatency(MetricsConstants.KeyExchange.KEY_EXCHANGE_INITIALIZATION_LATENCY, this.stopwatch.getElapsedTimeMillis());
        Iterator<Map.Entry<KeyExchangeState, String>> it2 = INITIALIZATION_NEXT_STATE_METRICS.entrySet().iterator();
        while (true) {
            boolean z = true;
            if (!it2.hasNext()) {
                recordOccurrence(MetricsConstants.KeyExchange.KEY_EXCHANGE_INITIALIZED_UNEXPECTED_NEXT_STATE_RATE, !INITIALIZATION_NEXT_STATE_METRICS.containsKey(keyExchangeState));
                updateState(keyExchangeState);
                return;
            } else {
                Map.Entry<KeyExchangeState, String> next = it2.next();
                String value = next.getValue();
                if (keyExchangeState != next.getKey()) {
                    z = false;
                }
                recordOccurrence(value, z);
            }
        }
    }

    public void onKeyNegotiationAcknowledged(long j, long j2) {
        recordOccurrence(MetricsConstants.KeyExchange.KEY_EXCHANGE_INIT_HANDSHAKE_ACKNOWLEDGEMENT_SUCCESS_RATE, true);
        recordLatency(MetricsConstants.KeyExchange.KEY_EXCHANGE_INIT_HANDSHAKE_PROCESSING_LATENCY, j);
        recordLatency(MetricsConstants.KeyExchange.KEY_EXCHANGE_INIT_HANDSHAKE_KEY_GENERATION_LATENCY, j2);
        updateState(KeyExchangeState.HAS_KEYS_AWAITING_COMPLETE_HANDSHAKE);
    }

    public void onKeyNegotiationComplete(long j, long j2) {
        long elapsedTimeMillis = this.stopwatch.getElapsedTimeMillis();
        this.stopwatch.stopAndReset();
        recordLatency(MetricsConstants.KeyExchange.KEY_EXCHANGE_NEGOTIATION_LATENCY, elapsedTimeMillis);
        recordOccurrence(MetricsConstants.KeyExchange.KEY_EXCHANGE_NEGOTIATION_SUCCESS_RATE, true);
        recordLatency(MetricsConstants.KeyExchange.KEY_EXCHANGE_COMPLETE_HANDSHAKE_PROCESSING_LATENCY, j);
        recordLatency(MetricsConstants.KeyExchange.KEY_EXCHANGE_COMPLETE_HANDSHAKE_KEY_FETCH_LATENCY, j2);
        updateState(KeyExchangeState.HAS_KEYS);
    }

    public void onKeyRotationAcknowledged() {
        recordOccurrence(MetricsConstants.KeyExchange.KEY_ROTATION_ACKNOWLEDGEMENT_SUCCESS_RATE, true);
        updateState(KeyExchangeState.HAS_KEYS_AWAITING_CONFIRM_RESET);
    }

    public void onKeyRotationComplete() {
        long elapsedTimeMillis = this.stopwatch.getElapsedTimeMillis();
        this.stopwatch.stopAndReset();
        recordLatency(MetricsConstants.KeyExchange.KEY_EXCHANGE_ROTATION_LATENCY, elapsedTimeMillis);
        recordOccurrence(MetricsConstants.KeyExchange.KEY_EXCHANGE_ROTATION_SUCCESS_RATE, true);
        updateState(KeyExchangeState.HAS_KEYS);
    }

    public void onKeyRotationStart() {
        this.stopwatch.startOrResume();
    }

    public void onResetKeysError(MetricsConstants.KeyExchange.IrrecoverableErrorCause irrecoverableErrorCause) {
        this.stopwatch.stopAndReset();
        recordOccurrence(MetricsConstants.KeyExchange.KEY_EXCHANGE_ROTATION_SUCCESS_RATE, false);
        recordOccurrence(MetricsConstants.KeyExchange.KEY_ROTATION_ACKNOWLEDGEMENT_SUCCESS_RATE, false);
        completeWithError(irrecoverableErrorCause);
    }

    public void onStart() {
        this.stopwatch.startOrResume();
        updateState(KeyExchangeState.INITIALIZING);
    }

    public void recordLatency(String str, long j) {
        getMetricsService().recordCounter(str, "unknown", j, null);
    }

    public void recordOccurrence(String str, boolean z) {
        getMetricsService().recordOccurrence(str, "unknown", z, null);
    }

    public void updateState(KeyExchangeState keyExchangeState) {
        this.trackingState = keyExchangeState;
    }

    public KeyExchangeMetrics() {
        this(new Room$$ExternalSyntheticBUOutline0(23));
    }
}
