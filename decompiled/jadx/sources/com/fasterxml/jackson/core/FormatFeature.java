package com.fasterxml.jackson.core;

import com.fasterxml.jackson.core.util.JacksonFeature;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes7.dex */
public interface FormatFeature extends JacksonFeature {
    @Override // com.fasterxml.jackson.core.util.JacksonFeature
    boolean enabledByDefault();

    @Override // com.fasterxml.jackson.core.util.JacksonFeature
    boolean enabledIn(int i);

    @Override // com.fasterxml.jackson.core.util.JacksonFeature
    int getMask();
}
