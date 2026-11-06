package com.amazon.photos.uploader;

import android.content.Context;
import androidx.compose.animation.core.ArcMode$$ExternalSyntheticOutline0;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\nJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\tHÆ\u0003J=\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\t\u0010 \u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000eR\u0011\u0010\u0013\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000e¨\u0006!"}, d2 = {"Lcom/amazon/photos/uploader/UploadFrameworkContext;", "", "directedId", "", "applicationContext", "Landroid/content/Context;", "applicationId", "applicationName", "crashReporter", "Lcom/amazon/photos/uploader/CrashReporter;", "(Ljava/lang/String;Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Lcom/amazon/photos/uploader/CrashReporter;)V", "getApplicationContext", "()Landroid/content/Context;", "getApplicationId", "()Ljava/lang/String;", "getApplicationName", "getCrashReporter", "()Lcom/amazon/photos/uploader/CrashReporter;", "getDirectedId", "hashedDirectedId", "getHashedDirectedId", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "toString", "AndroidPhotosUploader_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class UploadFrameworkContext {

    @NotNull
    private final Context applicationContext;

    @NotNull
    private final String applicationId;

    @NotNull
    private final String applicationName;

    @Nullable
    private final CrashReporter crashReporter;

    @NotNull
    private final String directedId;

    @NotNull
    private final String hashedDirectedId;

    public UploadFrameworkContext(@NotNull String str, @NotNull Context context, @NotNull String str2, @NotNull String str3, @Nullable CrashReporter crashReporter) {
        str.getClass();
        context.getClass();
        str2.getClass();
        str3.getClass();
        this.directedId = str;
        this.applicationContext = context;
        this.applicationId = str2;
        this.applicationName = str3;
        this.crashReporter = crashReporter;
        this.hashedDirectedId = String.valueOf(str.hashCode());
    }

    public static /* synthetic */ UploadFrameworkContext copy$default(UploadFrameworkContext uploadFrameworkContext, String str, Context context, String str2, String str3, CrashReporter crashReporter, int i, Object obj) {
        if ((i & 1) != 0) {
            str = uploadFrameworkContext.directedId;
        }
        if ((i & 2) != 0) {
            context = uploadFrameworkContext.applicationContext;
        }
        if ((i & 4) != 0) {
            str2 = uploadFrameworkContext.applicationId;
        }
        if ((i & 8) != 0) {
            str3 = uploadFrameworkContext.applicationName;
        }
        if ((i & 16) != 0) {
            crashReporter = uploadFrameworkContext.crashReporter;
        }
        CrashReporter crashReporter2 = crashReporter;
        String str4 = str2;
        return uploadFrameworkContext.copy(str, context, str4, str3, crashReporter2);
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

    @Nullable
    /* renamed from: component5, reason: from getter */
    public final CrashReporter getCrashReporter() {
        return this.crashReporter;
    }

    @NotNull
    public final UploadFrameworkContext copy(@NotNull String directedId, @NotNull Context applicationContext, @NotNull String applicationId, @NotNull String applicationName, @Nullable CrashReporter crashReporter) {
        directedId.getClass();
        applicationContext.getClass();
        applicationId.getClass();
        applicationName.getClass();
        return new UploadFrameworkContext(directedId, applicationContext, applicationId, applicationName, crashReporter);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UploadFrameworkContext)) {
            return false;
        }
        UploadFrameworkContext uploadFrameworkContext = (UploadFrameworkContext) other;
        return Intrinsics.areEqual(this.directedId, uploadFrameworkContext.directedId) && Intrinsics.areEqual(this.applicationContext, uploadFrameworkContext.applicationContext) && Intrinsics.areEqual(this.applicationId, uploadFrameworkContext.applicationId) && Intrinsics.areEqual(this.applicationName, uploadFrameworkContext.applicationName) && Intrinsics.areEqual(this.crashReporter, uploadFrameworkContext.crashReporter);
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

    @Nullable
    public final CrashReporter getCrashReporter() {
        return this.crashReporter;
    }

    @NotNull
    public final String getDirectedId() {
        return this.directedId;
    }

    @NotNull
    public final String getHashedDirectedId() {
        return this.hashedDirectedId;
    }

    public int hashCode() {
        int m = ArcMode$$ExternalSyntheticOutline0.m(ArcMode$$ExternalSyntheticOutline0.m((this.applicationContext.hashCode() + (this.directedId.hashCode() * 31)) * 31, 31, this.applicationId), 31, this.applicationName);
        CrashReporter crashReporter = this.crashReporter;
        return m + (crashReporter == null ? 0 : crashReporter.hashCode());
    }

    @NotNull
    public String toString() {
        return "UploadFrameworkContext(directedId=" + this.directedId + ", applicationContext=" + this.applicationContext + ", applicationId=" + this.applicationId + ", applicationName=" + this.applicationName + ", crashReporter=" + this.crashReporter + ')';
    }

    public /* synthetic */ UploadFrameworkContext(String str, Context context, String str2, String str3, CrashReporter crashReporter, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, context, str2, str3, (i & 16) != 0 ? null : crashReporter);
    }
}
