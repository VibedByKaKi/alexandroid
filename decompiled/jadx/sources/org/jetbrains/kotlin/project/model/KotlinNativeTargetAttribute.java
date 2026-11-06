package org.jetbrains.kotlin.project.model;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lorg/jetbrains/kotlin/project/model/KotlinNativeTargetAttribute;", "Lorg/jetbrains/kotlin/project/model/KotlinAttributeKey;", "()V", "kotlin-project-model"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes11.dex */
public final class KotlinNativeTargetAttribute extends KotlinAttributeKey {

    @NotNull
    public static final KotlinNativeTargetAttribute INSTANCE = new KotlinNativeTargetAttribute();

    private KotlinNativeTargetAttribute() {
        super("org.jetbrains.kotlin.native.target");
    }
}
