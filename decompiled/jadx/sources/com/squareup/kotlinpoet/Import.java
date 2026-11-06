package com.squareup.kotlinpoet;

import com.amazon.alexa.accessory.notificationpublisher.utils.NotificationConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u001b\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\u0011\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0000H\u0096\u0002J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u001f\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\f\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u000bHÖ\u0001J\b\u0010\u0014\u001a\u00020\u0003H\u0016R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u000e\u0010\b\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007¨\u0006\u0015"}, d2 = {"Lcom/squareup/kotlinpoet/Import;", "", "qualifiedName", "", NotificationConstants.ALIAS, "(Ljava/lang/String;Ljava/lang/String;)V", "getAlias", "()Ljava/lang/String;", "importString", "getQualifiedName", "compareTo", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "component1", "component2", "copy", "equals", "", "", "hashCode", "toString", "kotlinpoet"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class Import implements Comparable<Import> {

    @Nullable
    private final String alias;

    @NotNull
    private final String importString;

    @NotNull
    private final String qualifiedName;

    public Import(@NotNull String str, @Nullable String str2) {
        str.getClass();
        this.qualifiedName = str;
        this.alias = str2;
        StringBuilder sb = new StringBuilder();
        sb.append(UtilKt.escapeSegmentsIfNecessary$default(getQualifiedName(), (char) 0, 1, null));
        if (getAlias() != null) {
            sb.append(Intrinsics.stringPlus("·as·", UtilKt.escapeIfNecessary$default(getAlias(), false, 1, null)));
        }
        this.importString = sb.toString();
    }

    public static /* synthetic */ Import copy$default(Import r0, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = r0.qualifiedName;
        }
        if ((i & 2) != 0) {
            str2 = r0.alias;
        }
        return r0.copy(str, str2);
    }

    @Override // java.lang.Comparable
    public int compareTo(@NotNull Import other) {
        other.getClass();
        return this.importString.compareTo(other.importString);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getQualifiedName() {
        return this.qualifiedName;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final String getAlias() {
        return this.alias;
    }

    @NotNull
    public final Import copy(@NotNull String qualifiedName, @Nullable String alias) {
        qualifiedName.getClass();
        return new Import(qualifiedName, alias);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Import)) {
            return false;
        }
        Import r5 = (Import) other;
        return Intrinsics.areEqual(this.qualifiedName, r5.qualifiedName) && Intrinsics.areEqual(this.alias, r5.alias);
    }

    @Nullable
    public final String getAlias() {
        return this.alias;
    }

    @NotNull
    public final String getQualifiedName() {
        return this.qualifiedName;
    }

    public int hashCode() {
        int hashCode = this.qualifiedName.hashCode() * 31;
        String str = this.alias;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    @NotNull
    /* renamed from: toString, reason: from getter */
    public String getImportString() {
        return this.importString;
    }

    public /* synthetic */ Import(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : str2);
    }
}
