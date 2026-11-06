package com.google.auto.value.extension.serializable.serializer.interfaces;

import java.util.Optional;
import javax.annotation.processing.ProcessingEnvironment;
import javax.lang.model.type.TypeMirror;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
public interface SerializerExtension {
    Optional<Serializer> getSerializer(TypeMirror typeMirror, SerializerFactory serializerFactory, ProcessingEnvironment processingEnvironment);
}
