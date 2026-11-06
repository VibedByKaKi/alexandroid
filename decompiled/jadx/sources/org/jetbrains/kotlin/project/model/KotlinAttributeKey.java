package org.jetbrains.kotlin.project.model;

import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0016\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0013\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\n\u001a\u00020\u000bH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\f"}, d2 = {"Lorg/jetbrains/kotlin/project/model/KotlinAttributeKey;", "", "uniqueName", "", "(Ljava/lang/String;)V", "getUniqueName", "()Ljava/lang/String;", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "kotlin-project-model"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes11.dex */
public class KotlinAttributeKey {

    @NotNull
    private final String uniqueName;

    public KotlinAttributeKey(@NotNull String str) {
        str.getClass();
        this.uniqueName = str;
    }

    public boolean equals(@Nullable Object other) {
        return (other instanceof KotlinAttributeKey) && Intrinsics.areEqual(this.uniqueName, ((KotlinAttributeKey) other).uniqueName);
    }

    @NotNull
    public final String getUniqueName() {
        return this.uniqueName;
    }

    public int hashCode() {
        return this.uniqueName.hashCode();
    }
}
