package com.amazon.photos.autosave;

import android.content.Context;
import androidx.compose.animation.core.ArcMode$$ExternalSyntheticOutline0;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0002\u0010\bJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J1\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0014\u0010\u000f\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\f¨\u0006\u001c"}, d2 = {"Lcom/amazon/photos/autosave/AutosaveFrameworkContext;", "", "directedId", "", "applicationContext", "Landroid/content/Context;", "applicationId", "applicationName", "(Ljava/lang/String;Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V", "getApplicationContext", "()Landroid/content/Context;", "getApplicationId", "()Ljava/lang/String;", "getApplicationName", "getDirectedId", "hashedDirectedId", "getHashedDirectedId$AndroidPhotosAutosave_release", "component1", "component2", "component3", "component4", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "toString", "AndroidPhotosAutosave_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class AutosaveFrameworkContext {

    @NotNull
    private final Context applicationContext;

    @NotNull
    private final String applicationId;

    @NotNull
    private final String applicationName;

    @NotNull
    private final String directedId;

    @NotNull
    private final String hashedDirectedId;

    public AutosaveFrameworkContext(@NotNull String str, @NotNull Context context, @NotNull String str2, @NotNull String str3) {
        str.getClass();
        context.getClass();
        str2.getClass();
        str3.getClass();
        this.directedId = str;
        this.applicationContext = context;
        this.applicationId = str2;
        this.applicationName = str3;
        this.hashedDirectedId = String.valueOf(str.hashCode());
    }

    public static /* synthetic */ AutosaveFrameworkContext copy$default(AutosaveFrameworkContext autosaveFrameworkContext, String str, Context context, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = autosaveFrameworkContext.directedId;
        }
        if ((i & 2) != 0) {
            context = autosaveFrameworkContext.applicationContext;
        }
        if ((i & 4) != 0) {
            str2 = autosaveFrameworkContext.applicationId;
        }
        if ((i & 8) != 0) {
            str3 = autosaveFrameworkContext.applicationName;
        }
        return autosaveFrameworkContext.copy(str, context, str2, str3);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getDirectedId() {
        return this.directedId;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final Context getApplicationContext() {
        return this.applicationContext;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getApplicationId() {
        return this.applicationId;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final String getApplicationName() {
        return this.applicationName;
    }

    @NotNull
    public final AutosaveFrameworkContext copy(@NotNull String directedId, @NotNull Context applicationContext, @NotNull String applicationId, @NotNull String applicationName) {
        directedId.getClass();
        applicationContext.getClass();
        applicationId.getClass();
        applicationName.getClass();
        return new AutosaveFrameworkContext(directedId, applicationContext, applicationId, applicationName);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AutosaveFrameworkContext)) {
            return false;
        }
        AutosaveFrameworkContext autosaveFrameworkContext = (AutosaveFrameworkContext) other;
        return Intrinsics.areEqual(this.directedId, autosaveFrameworkContext.directedId) && Intrinsics.areEqual(this.applicationContext, autosaveFrameworkContext.applicationContext) && Intrinsics.areEqual(this.applicationId, autosaveFrameworkContext.applicationId) && Intrinsics.areEqual(this.applicationName, autosaveFrameworkContext.applicationName);
    }

    @NotNull
    public final Context getApplicationContext() {
        return this.applicationContext;
    }

    @NotNull
    public final String getApplicationId() {
        return this.applicationId;
    }

    @NotNull
    public final String getApplicationName() {
        return this.applicationName;
    }

    @NotNull
    public final String getDirectedId() {
        return this.directedId;
    }

    @NotNull
    /* renamed from: getHashedDirectedId$AndroidPhotosAutosave_release, reason: from getter */
    public final String getHashedDirectedId() {
        return this.hashedDirectedId;
    }

    public int hashCode() {
        return this.applicationName.hashCode() + ArcMode$$ExternalSyntheticOutline0.m((this.applicationContext.hashCode() + (this.directedId.hashCode() * 31)) * 31, 31, this.applicationId);
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("AutosaveFrameworkContext(directedId=");
        sb.append(this.directedId);
        sb.append(", applicationContext=");
        sb.append(this.applicationContext);
        sb.append(", applicationId=");
        sb.append(this.applicationId);
        sb.append(", applicationName=");
        return ArcMode$$ExternalSyntheticOutline0.m(')', this.applicationName, sb);
    }
}
