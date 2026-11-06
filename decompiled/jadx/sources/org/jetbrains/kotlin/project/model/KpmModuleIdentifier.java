package org.jetbrains.kotlin.project.model;

import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001B\u0011\b\u0004\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004R\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\u0002\u0007\b¨\u0006\t"}, d2 = {"Lorg/jetbrains/kotlin/project/model/KpmModuleIdentifier;", "Ljava/io/Serializable;", "moduleClassifier", "", "(Ljava/lang/String;)V", "getModuleClassifier", "()Ljava/lang/String;", "Lorg/jetbrains/kotlin/project/model/KpmLocalModuleIdentifier;", "Lorg/jetbrains/kotlin/project/model/KpmMavenModuleIdentifier;", "kotlin-project-model"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes11.dex */
public abstract class KpmModuleIdentifier implements Serializable {

    @Nullable
    private final String moduleClassifier;

    private KpmModuleIdentifier(String str) {
        this.moduleClassifier = str;
    }

    @Nullable
    public String getModuleClassifier() {
        return this.moduleClassifier;
    }

    public /* synthetic */ KpmModuleIdentifier(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }
}
