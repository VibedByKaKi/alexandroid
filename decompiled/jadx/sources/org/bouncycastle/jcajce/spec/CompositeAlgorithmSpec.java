package org.bouncycastle.jcajce.spec;

import java.security.spec.AlgorithmParameterSpec;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import rx.Single$$ExternalSyntheticBUOutline0;

/* loaded from: classes11.dex */
public class CompositeAlgorithmSpec implements AlgorithmParameterSpec {
    private final List<String> algorithmNames;
    private final List<AlgorithmParameterSpec> parameterSpecs;

    public CompositeAlgorithmSpec(Builder builder) {
        this.algorithmNames = Collections.unmodifiableList(new ArrayList(builder.algorithmNames));
        this.parameterSpecs = Collections.unmodifiableList(new ArrayList(builder.parameterSpecs));
    }

    public List<String> getAlgorithmNames() {
        return this.algorithmNames;
    }

    public List<AlgorithmParameterSpec> getParameterSpecs() {
        return this.parameterSpecs;
    }

    public static class Builder {
        private List<String> algorithmNames = new ArrayList();
        private List<AlgorithmParameterSpec> parameterSpecs = new ArrayList();

        public Builder add(String str) {
            this.algorithmNames.add(str);
            this.parameterSpecs.add(null);
            return this;
        }

        public CompositeAlgorithmSpec build() {
            if (!this.algorithmNames.isEmpty()) {
                return new CompositeAlgorithmSpec(this);
            }
            Single$$ExternalSyntheticBUOutline0.m$2("cannot call build with no algorithm names added");
            return null;
        }

        public Builder add(String str, AlgorithmParameterSpec algorithmParameterSpec) {
            this.algorithmNames.add(str);
            this.parameterSpecs.add(algorithmParameterSpec);
            return this;
        }
    }
}
