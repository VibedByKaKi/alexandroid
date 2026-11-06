package com.facebook.cache.disk;

import com.facebook.binaryresource.BinaryResource;
import com.facebook.cache.common.WriterCallback;
import com.facebook.infer.annotation.Nullsafe;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Nullsafe(Nullsafe.Mode.LOCAL)
/* loaded from: classes6.dex */
public interface DiskStorage {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class DiskDumpInfo {
        public List<DiskDumpInfoEntry> entries = new ArrayList();
        public Map<String, Integer> typeCounts = new HashMap();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class DiskDumpInfoEntry {
        public final String firstBits;
        public final String id;
        public final String path;
        public final float size;
        public final String type;

        public DiskDumpInfoEntry(String str, String str2, String str3, float f, String str4) {
            this.id = str;
            this.path = str2;
            this.type = str3;
            this.size = f;
            this.firstBits = str4;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface Entry {
        String getId();

        BinaryResource getResource();

        long getSize();

        long getTimestamp();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface Inserter {
        boolean cleanUp();

        BinaryResource commit(Object obj) throws IOException;

        BinaryResource commit(Object obj, long j) throws IOException;

        void writeData(WriterCallback writerCallback, Object obj) throws IOException;
    }

    void clearAll() throws IOException;

    boolean contains(String str, Object obj) throws IOException;

    DiskDumpInfo getDumpInfo() throws IOException;

    Collection<Entry> getEntries() throws IOException;

    @Nullable
    BinaryResource getResource(String str, Object obj) throws IOException;

    String getStorageName();

    Inserter insert(String str, Object obj) throws IOException;

    boolean isEnabled();

    boolean isExternal();

    void purgeUnexpectedResources();

    long remove(Entry entry) throws IOException;

    long remove(String str) throws IOException;

    boolean touch(String str, Object obj) throws IOException;
}
