package org.jetbrains.kotlin.project.model;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lorg/jetbrains/kotlin/project/model/KotlinPlatformTypeAttribute;", "Lorg/jetbrains/kotlin/project/model/KotlinAttributeKey;", "()V", "ANDROID_JVM", "", "JS", "JVM", "NATIVE", "kotlin-project-model"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes11.dex */
public final class KotlinPlatformTypeAttribute extends KotlinAttributeKey {

    @NotNull
    public static final String ANDROID_JVM = "androidJvm";

    @NotNull
    public static final KotlinPlatformTypeAttribute INSTANCE = new KotlinPlatformTypeAttribute();

    @NotNull
    public static final String JS = "js";

    @NotNull
    public static final String JVM = "jvm";

    @NotNull
    public static final String NATIVE = "native";

    private KotlinPlatformTypeAttribute() {
        super("org.jetbrains.kotlin.platform.type");
    }
}
