package com.fasterxml.jackson.core;

import com.fasterxml.jackson.core.exc.StreamConstraintsException;
import defpackage.a$$ExternalSyntheticOutline0;
import java.io.Serializable;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes7.dex */
public class StreamWriteConstraints implements Serializable {
    private static StreamWriteConstraints DEFAULT = new StreamWriteConstraints(1000);
    public static final int DEFAULT_MAX_DEPTH = 1000;
    private static final long serialVersionUID = 1;
    protected final int _maxNestingDepth;

    public StreamWriteConstraints(int i) {
        this._maxNestingDepth = i;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static StreamWriteConstraints defaults() {
        return DEFAULT;
    }

    public static void overrideDefaultStreamWriteConstraints(StreamWriteConstraints streamWriteConstraints) {
        if (streamWriteConstraints == null) {
            DEFAULT = new StreamWriteConstraints(1000);
        } else {
            DEFAULT = streamWriteConstraints;
        }
    }

    public String _constrainRef(String str) {
        return a$$ExternalSyntheticOutline0.m("`StreamWriteConstraints.", str, "()`");
    }

    public StreamConstraintsException _constructException(String str, Object... objArr) throws StreamConstraintsException {
        throw new StreamConstraintsException(String.format(str, objArr));
    }

    public int getMaxNestingDepth() {
        return this._maxNestingDepth;
    }

    public Builder rebuild() {
        return new Builder(this);
    }

    public void validateNestingDepth(int i) throws StreamConstraintsException {
        if (i > this._maxNestingDepth) {
            throw _constructException("Document nesting depth (%d) exceeds the maximum allowed (%d, from %s)", Integer.valueOf(i), Integer.valueOf(this._maxNestingDepth), _constrainRef("getMaxNestingDepth"));
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class Builder {
        private int maxNestingDepth;

        public Builder(StreamWriteConstraints streamWriteConstraints) {
            this.maxNestingDepth = streamWriteConstraints._maxNestingDepth;
        }

        public StreamWriteConstraints build() {
            return new StreamWriteConstraints(this.maxNestingDepth);
        }

        public Builder maxNestingDepth(int i) {
            if (i >= 0) {
                this.maxNestingDepth = i;
                return this;
            }
            Single$$ExternalSyntheticBUOutline0.m$3("Cannot set maxNestingDepth to a negative value");
            return null;
        }

        public Builder(int i) {
            this.maxNestingDepth = i;
        }

        public Builder() {
            this(1000);
        }
    }
}
