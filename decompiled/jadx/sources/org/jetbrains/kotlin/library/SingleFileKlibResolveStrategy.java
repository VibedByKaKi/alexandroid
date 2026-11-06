package org.jetbrains.kotlin.library;

import com.amazon.alexa.presence.utils.MetricsUtil;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.kotlin.konan.file.File;
import org.jetbrains.kotlin.util.Logger;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&¨\u0006\bÀ\u0006\u0003"}, d2 = {"Lorg/jetbrains/kotlin/library/SingleFileKlibResolveStrategy;", "", MetricsUtil.MetricsId.RESOLVE, "Lorg/jetbrains/kotlin/library/KotlinLibrary;", "libraryFile", "Lorg/jetbrains/kotlin/konan/file/File;", "logger", "Lorg/jetbrains/kotlin/util/Logger;", "kotlin-util-klib"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes11.dex */
public interface SingleFileKlibResolveStrategy {
    @NotNull
    KotlinLibrary resolve(@NotNull File libraryFile, @NotNull Logger logger);
}
