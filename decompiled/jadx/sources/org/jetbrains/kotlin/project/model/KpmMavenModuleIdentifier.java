package org.jetbrains.kotlin.project.model;

import androidx.compose.animation.core.ArcMode$$ExternalSyntheticOutline0;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J)\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\b\u0010\u0015\u001a\u00020\u0003H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0016"}, d2 = {"Lorg/jetbrains/kotlin/project/model/KpmMavenModuleIdentifier;", "Lorg/jetbrains/kotlin/project/model/KpmModuleIdentifier;", "group", "", "name", "moduleClassifier", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getGroup", "()Ljava/lang/String;", "getModuleClassifier", "getName", "component1", "component2", "component3", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "", "toString", "kotlin-project-model"}, k = 1, mv = {1, 5, 1}, xi = 48)
@SourceDebugExtension({"SMAP\nKpmModuleIdentifier.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KpmModuleIdentifier.kt\norg/jetbrains/kotlin/project/model/KpmMavenModuleIdentifier\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,34:1\n1#2:35\n*E\n"})
/* loaded from: classes11.dex */
public final /* data */ class KpmMavenModuleIdentifier extends KpmModuleIdentifier {

    @NotNull
    private final String group;

    @Nullable
    private final String moduleClassifier;

    @NotNull
    private final String name;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KpmMavenModuleIdentifier(@NotNull String str, @NotNull String str2, @Nullable String str3) {
        super(str3, null);
        str.getClass();
        str2.getClass();
        this.group = str;
        this.name = str2;
        this.moduleClassifier = str3;
    }

    public static /* synthetic */ KpmMavenModuleIdentifier copy$default(KpmMavenModuleIdentifier kpmMavenModuleIdentifier, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = kpmMavenModuleIdentifier.group;
        }
        if ((i & 2) != 0) {
            str2 = kpmMavenModuleIdentifier.name;
        }
        if ((i & 4) != 0) {
            str3 = kpmMavenModuleIdentifier.moduleClassifier;
        }
        return kpmMavenModuleIdentifier.copy(str, str2, str3);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getGroup() {
        return this.group;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final String getModuleClassifier() {
        return this.moduleClassifier;
    }

    @NotNull
    public final KpmMavenModuleIdentifier copy(@NotNull String group, @NotNull String name, @Nullable String moduleClassifier) {
        group.getClass();
        name.getClass();
        return new KpmMavenModuleIdentifier(group, name, moduleClassifier);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof KpmMavenModuleIdentifier)) {
            return false;
        }
        KpmMavenModuleIdentifier kpmMavenModuleIdentifier = (KpmMavenModuleIdentifier) other;
        return Intrinsics.areEqual(this.group, kpmMavenModuleIdentifier.group) && Intrinsics.areEqual(this.name, kpmMavenModuleIdentifier.name) && Intrinsics.areEqual(this.moduleClassifier, kpmMavenModuleIdentifier.moduleClassifier);
    }

    @NotNull
    public final String getGroup() {
        return this.group;
    }

    @Override // org.jetbrains.kotlin.project.model.KpmModuleIdentifier
    @Nullable
    public String getModuleClassifier() {
        return this.moduleClassifier;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        int m = ArcMode$$ExternalSyntheticOutline0.m(this.group.hashCode() * 31, 31, this.name);
        String str = this.moduleClassifier;
        return m + (str == null ? 0 : str.hashCode());
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.group);
        sb.append(AbstractJsonLexerKt.COLON);
        sb.append(this.name);
        String moduleClassifier = getModuleClassifier();
        String concat = moduleClassifier != null ? " / ".concat(moduleClassifier) : null;
        if (concat == null) {
            concat = "";
        }
        sb.append(concat);
        return sb.toString();
    }
}
