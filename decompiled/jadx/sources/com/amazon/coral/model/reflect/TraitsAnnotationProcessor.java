package com.amazon.coral.model.reflect;

import com.amazon.coral.annotation.customtrait.Trait;
import com.amazon.coral.model.Traits;
import com.amazon.coral.util.reflection.ClassesManifestAnnotationProcessor;
import com.google.auto.service.AutoService;
import javax.annotation.processing.Processor;
import javax.annotation.processing.SupportedAnnotationTypes;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@AutoService({Processor.class})
@SupportedAnnotationTypes({"com.amazon.coral.annotation.customtrait.Trait"})
/* loaded from: classes19.dex */
public class TraitsAnnotationProcessor extends ClassesManifestAnnotationProcessor {
    public TraitsAnnotationProcessor() {
        super(Trait.class, Traits.class);
    }
}
