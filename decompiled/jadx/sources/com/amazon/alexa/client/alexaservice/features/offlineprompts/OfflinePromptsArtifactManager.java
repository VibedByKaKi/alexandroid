package com.amazon.alexa.client.alexaservice.features.offlineprompts;

import android.util.Log;
import androidx.room.util.TableInfo$$ExternalSyntheticOutline0;
import com.amazon.alexa.utils.ZipExtractor;
import com.google.common.base.Optional;
import defpackage.a$$ExternalSyntheticOutline0;
import java.io.File;
import java.io.FileFilter;
import java.io.IOException;
import org.apache.commons.io.FileUtils;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public class OfflinePromptsArtifactManager {
    private static final String EXT = "zip";
    private static final String OFFLINE_PROMPT_FILE_NAME_PREFIX = "offline_prompt_";
    private static final String TAG = "OfflinePromptsArtifactManager";

    private void cleanupFile(String str) {
        File file = new File(str);
        if (file.exists()) {
            file.delete();
        }
    }

    public boolean deleteUnusedLocaleDirectories(String str, final String str2, final String str3) {
        File file = new File(str);
        if (!file.exists()) {
            return true;
        }
        for (File file2 : file.listFiles(new FileFilter() { // from class: com.amazon.alexa.client.alexaservice.features.offlineprompts.OfflinePromptsArtifactManager.1
            @Override // java.io.FileFilter
            public boolean accept(File file3) {
                return file3.isDirectory() && !file3.getName().equals(str2);
            }
        })) {
            try {
                FileUtils.cleanDirectory(file2);
            } catch (IOException e) {
                Log.e(TAG, "failed to delete artifact files for directory " + file2.getName(), e);
                return false;
            }
        }
        for (File file3 : file.listFiles(new FileFilter() { // from class: com.amazon.alexa.client.alexaservice.features.offlineprompts.OfflinePromptsArtifactManager.2
            @Override // java.io.FileFilter
            public boolean accept(File file4) {
                String name = file4.getName();
                return !name.equals(str3 + ".zip");
            }
        })) {
            file3.delete();
        }
        return true;
    }

    public boolean extractArtifactBundle(File file, String str, String str2) {
        String m$1 = TableInfo$$ExternalSyntheticOutline0.m$1(file.getPath(), "/", str, ".zip");
        try {
            ZipExtractor.unzip(m$1, a$$ExternalSyntheticOutline0.m$1(file.getPath(), File.separator, str2), OFFLINE_PROMPT_FILE_NAME_PREFIX);
            return true;
        } catch (IOException e) {
            Log.e(TAG, String.format("Failure in extracting zip from %s location with error: %s", m$1, e));
            cleanupFile(m$1);
            return false;
        }
    }

    public Optional<File> findArtifactForLocale(File file, String str, String str2) {
        if (!file.exists()) {
            return Optional.absent();
        }
        File file2 = new File(file, str2);
        if (file2.exists() && file2.isDirectory()) {
            File file3 = new File(file2, str);
            if (file3.exists()) {
                return Optional.of(file3);
            }
        }
        return Optional.absent();
    }
}
