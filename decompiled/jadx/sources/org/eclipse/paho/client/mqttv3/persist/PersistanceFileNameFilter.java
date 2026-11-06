package org.eclipse.paho.client.mqttv3.persist;

import java.io.File;
import java.io.FilenameFilter;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public class PersistanceFileNameFilter implements FilenameFilter {
    private final String fileExtension;

    public PersistanceFileNameFilter(String str) {
        this.fileExtension = str;
    }

    @Override // java.io.FilenameFilter
    public boolean accept(File file, String str) {
        return str.endsWith(this.fileExtension);
    }
}
