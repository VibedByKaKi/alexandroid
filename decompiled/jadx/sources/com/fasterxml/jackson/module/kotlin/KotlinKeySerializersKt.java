package com.fasterxml.jackson.module.kotlin;

import com.fasterxml.jackson.annotation.JsonKey;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u0012\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u0006\u0012\u0002\b\u00030\u0002H\u0002¨\u0006\u0003"}, d2 = {"getStaticJsonKeyGetter", "Ljava/lang/reflect/Method;", "Ljava/lang/Class;", "jackson-module-kotlin"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nKotlinKeySerializers.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KotlinKeySerializers.kt\ncom/fasterxml/jackson/module/kotlin/KotlinKeySerializersKt\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,72:1\n12474#2,2:73\n*S KotlinDebug\n*F\n+ 1 KotlinKeySerializers.kt\ncom/fasterxml/jackson/module/kotlin/KotlinKeySerializersKt\n*L\n34#1:73,2\n*E\n"})
/* loaded from: classes7.dex */
public final class KotlinKeySerializersKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Method getStaticJsonKeyGetter(Class<?> cls) {
        Method[] declaredMethods = cls.getDeclaredMethods();
        declaredMethods.getClass();
        for (Method method : declaredMethods) {
            if (Modifier.isStatic(method.getModifiers())) {
                Annotation[] annotations = method.getAnnotations();
                annotations.getClass();
                for (Annotation annotation : annotations) {
                    if ((annotation instanceof JsonKey) && ((JsonKey) annotation).value()) {
                        return method;
                    }
                }
            }
        }
        return null;
    }
}
