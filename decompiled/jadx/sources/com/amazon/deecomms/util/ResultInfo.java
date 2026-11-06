package com.amazon.deecomms.util;

import android.util.Pair;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public class ResultInfo<S, I> extends Pair<S, I> {
    public ResultInfo(S s, I i) {
        super(s, i);
    }

    public I getInfo() {
        return (I) ((Pair) this).second;
    }

    public S getStatus() {
        return (S) ((Pair) this).first;
    }
}
