package com.amazon.coral.util.http.uri;

import com.amazon.coral.metrics.Metrics;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public interface UriMatcherMap<T> {
    ValuedMatch<T> match(CharSequence charSequence);

    default ValuedMatch<T> match(CharSequence charSequence, Metrics metrics) {
        return match(charSequence);
    }
}
