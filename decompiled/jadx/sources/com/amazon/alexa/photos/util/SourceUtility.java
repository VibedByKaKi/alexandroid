package com.amazon.alexa.photos.util;

import android.os.Environment;
import androidx.annotation.VisibleForTesting;
import androidx.compose.runtime.BitVector$$ExternalSyntheticOutline0;
import com.amazon.photos.discovery.FolderPathsToScanProvider;
import defpackage.a$$ExternalSyntheticOutline0;
import java.io.File;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes18.dex */
public class SourceUtility {
    private final String cameraSourceTag;
    private String externalStorageCameraPath;
    private final Map<String, FolderPathsToScanProvider> scanFolderPathProviders;

    public SourceUtility(Map<String, FolderPathsToScanProvider> map, String str) {
        StringBuilder sb = new StringBuilder();
        String str2 = File.separator;
        sb.append(str2);
        this.externalStorageCameraPath = a$$ExternalSyntheticOutline0.m(sb, Environment.DIRECTORY_DCIM, str2);
        this.scanFolderPathProviders = map;
        this.cameraSourceTag = str;
    }

    public String getMediaSource(String str, Map<String, List<String>> map) {
        String str2 = File.separator;
        if (!str.endsWith(str2)) {
            str = BitVector$$ExternalSyntheticOutline0.m(str, str2);
        }
        for (Map.Entry<String, List<String>> entry : map.entrySet()) {
            Iterator<String> it2 = entry.getValue().iterator();
            while (it2.hasNext()) {
                if (str.contains(it2.next())) {
                    return entry.getKey();
                }
            }
        }
        return str.contains(this.externalStorageCameraPath) ? this.cameraSourceTag : "";
    }

    public Map<String, List<String>> getSourceConfig() {
        HashMap hashMap = new HashMap();
        for (Map.Entry<String, FolderPathsToScanProvider> entry : this.scanFolderPathProviders.entrySet()) {
            hashMap.put(entry.getKey(), entry.getValue().folderPathPrefixToScan());
        }
        return hashMap;
    }

    @VisibleForTesting
    public void setExternalStorageCameraPath(String str) {
        this.externalStorageCameraPath = str;
    }
}
