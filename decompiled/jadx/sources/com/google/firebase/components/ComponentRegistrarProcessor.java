package com.google.firebase.components;

import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
public interface ComponentRegistrarProcessor {
    public static final ComponentRegistrarProcessor NOOP = new OptionalProvider$$ExternalSyntheticLambda0();

    List<Component<?>> processRegistrar(ComponentRegistrar componentRegistrar);
}
