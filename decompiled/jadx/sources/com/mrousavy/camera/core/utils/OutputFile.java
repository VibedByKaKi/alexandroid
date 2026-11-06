package com.mrousavy.camera.core.utils;

import android.content.Context;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import defpackage.a$$ExternalSyntheticOutline0;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0007HÆ\u0003J'\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u0007HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0019\u0010\u0010\u001a\n \u0011*\u0004\u0018\u00010\u00050\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\r¨\u0006\u001d"}, d2 = {"Lcom/mrousavy/camera/core/utils/OutputFile;", "", "context", "Landroid/content/Context;", "directory", "Ljava/io/File;", "extension", "", "<init>", "(Landroid/content/Context;Ljava/io/File;Ljava/lang/String;)V", "getContext", "()Landroid/content/Context;", "getDirectory", "()Ljava/io/File;", "getExtension", "()Ljava/lang/String;", "file", "kotlin.jvm.PlatformType", "getFile", "component1", "component2", "component3", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "toString", "react-native-vision-camera_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class OutputFile {

    @NotNull
    private final Context context;

    @NotNull
    private final File directory;

    @NotNull
    private final String extension;
    private final File file;

    public OutputFile(@NotNull Context context, @NotNull File file, @NotNull String str) {
        boolean contains$default;
        context.getClass();
        file.getClass();
        str.getClass();
        this.context = context;
        this.directory = file;
        this.extension = str;
        File createTempFile = File.createTempFile("mrousavy", str, file);
        this.file = createTempFile;
        String absolutePath = file.getAbsolutePath();
        absolutePath.getClass();
        String absolutePath2 = context.getCacheDir().getAbsolutePath();
        absolutePath2.getClass();
        contains$default = StringsKt__StringsKt.contains$default(absolutePath, absolutePath2, false, 2, (Object) null);
        if (contains$default) {
            createTempFile.deleteOnExit();
        }
    }

    public static /* synthetic */ OutputFile copy$default(OutputFile outputFile, Context context, File file, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            context = outputFile.context;
        }
        if ((i & 2) != 0) {
            file = outputFile.directory;
        }
        if ((i & 4) != 0) {
            str = outputFile.extension;
        }
        return outputFile.copy(context, file, str);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final Context getContext() {
        return this.context;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final File getDirectory() {
        return this.directory;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getExtension() {
        return this.extension;
    }

    @NotNull
    public final OutputFile copy(@NotNull Context context, @NotNull File directory, @NotNull String extension) {
        context.getClass();
        directory.getClass();
        extension.getClass();
        return new OutputFile(context, directory, extension);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OutputFile)) {
            return false;
        }
        OutputFile outputFile = (OutputFile) other;
        return Intrinsics.areEqual(this.context, outputFile.context) && Intrinsics.areEqual(this.directory, outputFile.directory) && Intrinsics.areEqual(this.extension, outputFile.extension);
    }

    @NotNull
    public final Context getContext() {
        return this.context;
    }

    @NotNull
    public final File getDirectory() {
        return this.directory;
    }

    @NotNull
    public final String getExtension() {
        return this.extension;
    }

    public final File getFile() {
        return this.file;
    }

    public int hashCode() {
        return this.extension.hashCode() + ((this.directory.hashCode() + (this.context.hashCode() * 31)) * 31);
    }

    @NotNull
    public String toString() {
        Context context = this.context;
        File file = this.directory;
        String str = this.extension;
        StringBuilder sb = new StringBuilder("OutputFile(context=");
        sb.append(context);
        sb.append(", directory=");
        sb.append(file);
        sb.append(", extension=");
        return a$$ExternalSyntheticOutline0.m(sb, str, MarkdownConstants.RIGHT_PARENTHESIS);
    }
}
