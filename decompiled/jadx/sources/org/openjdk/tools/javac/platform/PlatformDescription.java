package org.openjdk.tools.javac.platform;

import java.io.Closeable;
import java.io.IOException;
import java.nio.file.Path;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import org.openjdk.javax.annotation.processing.Processor;
import org.openjdk.source.util.Plugin;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes12.dex */
public interface PlatformDescription extends Closeable {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface PluginInfo<T> {
        String getName();

        Map<String, String> getOptions();

        T getPlugin();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close() throws IOException;

    List<String> getAdditionalOptions();

    List<PluginInfo<Processor>> getAnnotationProcessors();

    Collection<Path> getPlatformPath();

    List<PluginInfo<Plugin>> getPlugins();

    String getSourceVersion();

    String getTargetVersion();
}
