package com.fasterxml.jackson.annotation;

import com.fasterxml.jackson.annotation.ObjectIdGenerator;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes7.dex */
public interface ObjectIdResolver {
    void bindItem(ObjectIdGenerator.IdKey idKey, Object obj);

    boolean canUseFor(ObjectIdResolver objectIdResolver);

    ObjectIdResolver newForDeserialization(Object obj);

    Object resolveId(ObjectIdGenerator.IdKey idKey);
}
