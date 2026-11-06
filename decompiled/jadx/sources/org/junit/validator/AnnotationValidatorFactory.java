package org.junit.validator;

import ai.onnxruntime.OnnxMap$$ExternalSyntheticBUOutline0;
import java.util.concurrent.ConcurrentHashMap;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public class AnnotationValidatorFactory {
    private static final ConcurrentHashMap<ValidateWith, AnnotationValidator> VALIDATORS_FOR_ANNOTATION_TYPES = new ConcurrentHashMap<>();

    public AnnotationValidator createAnnotationValidator(ValidateWith validateWith) {
        ConcurrentHashMap<ValidateWith, AnnotationValidator> concurrentHashMap = VALIDATORS_FOR_ANNOTATION_TYPES;
        AnnotationValidator annotationValidator = concurrentHashMap.get(validateWith);
        if (annotationValidator != null) {
            return annotationValidator;
        }
        Class<? extends AnnotationValidator> value = validateWith.value();
        if (value == null) {
            Single$$ExternalSyntheticBUOutline0.m$3("Can't create validator, value is null in annotation ".concat(validateWith.getClass().getName()));
            return null;
        }
        try {
            concurrentHashMap.putIfAbsent(validateWith, value.newInstance());
            return concurrentHashMap.get(validateWith);
        } catch (Exception e) {
            OnnxMap$$ExternalSyntheticBUOutline0.m("Exception received when creating AnnotationValidator class ".concat(value.getName()), e);
            return null;
        }
    }
}
