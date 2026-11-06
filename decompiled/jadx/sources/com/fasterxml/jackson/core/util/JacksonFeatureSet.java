package com.fasterxml.jackson.core.util;

import com.fasterxml.jackson.core.util.JacksonFeature;
import java.io.Serializable;
import okio.Buffer$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes7.dex */
public final class JacksonFeatureSet<F extends JacksonFeature> implements Serializable {
    private static final long serialVersionUID = 1;
    protected int _enabled;

    public JacksonFeatureSet(int i) {
        this._enabled = i;
    }

    public static <F extends JacksonFeature> JacksonFeatureSet<F> fromBitmask(int i) {
        return new JacksonFeatureSet<>(i);
    }

    public static <F extends JacksonFeature> JacksonFeatureSet<F> fromDefaults(F[] fArr) {
        if (fArr.length > 31) {
            Buffer$$ExternalSyntheticBUOutline0.m("Can not use type `%s` with JacksonFeatureSet: too many entries (%d > 31)", new Object[]{fArr[0].getClass().getName(), Integer.valueOf(fArr.length)});
            return null;
        }
        int i = 0;
        for (F f : fArr) {
            if (f.enabledByDefault()) {
                i |= f.getMask();
            }
        }
        return new JacksonFeatureSet<>(i);
    }

    public int asBitmask() {
        return this._enabled;
    }

    public boolean isEnabled(F f) {
        return (this._enabled & f.getMask()) != 0;
    }

    public JacksonFeatureSet<F> with(F f) {
        int mask = f.getMask() | this._enabled;
        return mask == this._enabled ? this : new JacksonFeatureSet<>(mask);
    }

    public JacksonFeatureSet<F> without(F f) {
        int i = (~f.getMask()) & this._enabled;
        return i == this._enabled ? this : new JacksonFeatureSet<>(i);
    }
}
