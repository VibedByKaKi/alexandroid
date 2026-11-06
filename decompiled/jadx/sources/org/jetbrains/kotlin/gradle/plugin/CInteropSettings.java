package org.jetbrains.kotlin.gradle.plugin;

import com.amazon.alexa.ra.core.data.fragments.Content;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.gradle.api.Action;
import org.gradle.api.Named;
import org.gradle.api.file.FileCollection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.kotlin.konan.library.KonanLibraryKt;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001:\u0001!J!\u0010\b\u001a\u00020\t2\u0012\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00020\f0\u000b\"\u00020\fH&¢\u0006\u0002\u0010\rJ\u0016\u0010\b\u001a\u00020\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000eH&J\u0010\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u0011H&J!\u0010\u0012\u001a\u00020\t2\u0012\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00110\u000b\"\u00020\u0011H&¢\u0006\u0002\u0010\u0013J\u0016\u0010\u0012\u001a\u00020\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00110\u000eH&J\u0010\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J!\u0010\u0015\u001a\u00020\t2\u0012\u0010\u0016\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00110\u000b\"\u00020\u0011H&¢\u0006\u0002\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\u0003H&J!\u0010\u0017\u001a\u00020\t2\u0012\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00110\u000b\"\u00020\u0011H&¢\u0006\u0002\u0010\u0013J\u0016\u0010\u0017\u001a\u00020\t2\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019H&J!\u0010\u0017\u001a\u00020\t2\u0017\u0010\u001b\u001a\u0013\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\t0\u001c¢\u0006\u0002\b\u001dH&J!\u0010\u001e\u001a\u00020\t2\u0012\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00020\f0\u000b\"\u00020\fH&¢\u0006\u0002\u0010\rJ\u0016\u0010\u001e\u001a\u00020\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000eH&J\u0010\u0010\u001f\u001a\u00020\t2\u0006\u0010 \u001a\u00020\fH&R\u0018\u0010\u0002\u001a\u00020\u0003X¦\u000e¢\u0006\f\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007¨\u0006\""}, d2 = {"Lorg/jetbrains/kotlin/gradle/plugin/CInteropSettings;", "Lorg/gradle/api/Named;", "dependencyFiles", "Lorg/gradle/api/file/FileCollection;", "getDependencyFiles", "()Lorg/gradle/api/file/FileCollection;", "setDependencyFiles", "(Lorg/gradle/api/file/FileCollection;)V", "compilerOpts", "", "values", "", "", "([Ljava/lang/String;)V", "", "defFile", "file", "", "extraOpts", "([Ljava/lang/Object;)V", Content.HEADER, "headers", "files", "includeDirs", "action", "Lorg/gradle/api/Action;", "Lorg/jetbrains/kotlin/gradle/plugin/CInteropSettings$IncludeDirectories;", "configure", "Lkotlin/Function1;", "Lkotlin/ExtensionFunctionType;", KonanLibraryKt.KLIB_PROPERTY_LINKED_OPTS, "packageName", "value", "IncludeDirectories", "kotlin-gradle-plugin-api_common"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes11.dex */
public interface CInteropSettings extends Named {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    public static final class DefaultImpls {
        public static void header(@NotNull CInteropSettings cInteropSettings, @NotNull Object obj) {
            obj.getClass();
            cInteropSettings.headers(obj);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u001e\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J!\u0010\u0002\u001a\u00020\u00032\u0012\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u0005\"\u00020\u0001H&¢\u0006\u0002\u0010\u0006J\u0016\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0007H&J!\u0010\b\u001a\u00020\u00032\u0012\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u0005\"\u00020\u0001H&¢\u0006\u0002\u0010\u0006J\u0016\u0010\b\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0007H&¨\u0006\t"}, d2 = {"Lorg/jetbrains/kotlin/gradle/plugin/CInteropSettings$IncludeDirectories;", "", "allHeaders", "", "includeDirs", "", "([Ljava/lang/Object;)V", "", "headerFilterOnly", "kotlin-gradle-plugin-api_common"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public interface IncludeDirectories {
        void allHeaders(@NotNull Collection<? extends Object> includeDirs);

        void allHeaders(@NotNull Object... includeDirs);

        void headerFilterOnly(@NotNull Collection<? extends Object> includeDirs);

        void headerFilterOnly(@NotNull Object... includeDirs);
    }

    void compilerOpts(@NotNull List<String> values);

    void compilerOpts(@NotNull String... values);

    void defFile(@NotNull Object file);

    void extraOpts(@NotNull List<? extends Object> values);

    void extraOpts(@NotNull Object... values);

    @NotNull
    FileCollection getDependencyFiles();

    void header(@NotNull Object file);

    void headers(@NotNull FileCollection files);

    void headers(@NotNull Object... files);

    void includeDirs(@NotNull Function1<? super IncludeDirectories, Unit> configure);

    void includeDirs(@NotNull Action<IncludeDirectories> action);

    void includeDirs(@NotNull Object... values);

    void linkerOpts(@NotNull List<String> values);

    void linkerOpts(@NotNull String... values);

    void packageName(@NotNull String value);

    void setDependencyFiles(@NotNull FileCollection fileCollection);
}
