package com.amazonaws.mobileconnectors.amazonmobileanalytics.internal.validate;

import ai.onnxruntime.OnnxMap$$ExternalSyntheticBUOutline0;
import com.amazonaws.mobileconnectors.amazonmobileanalytics.internal.core.AnalyticsContext;
import com.amazonaws.mobileconnectors.amazonmobileanalytics.internal.core.system.FileManager;
import java.io.File;
import java.io.IOException;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Deprecated
/* loaded from: classes20.dex */
public class FileManagerValidator {
    public void validate(AnalyticsContext analyticsContext) {
        FileManager fileManager = analyticsContext.getSystem().getFileManager();
        try {
            File createFile = fileManager.createFile(new File(fileManager.getDirectory(""), "validatorFile"));
            if (createFile == null) {
                Single$$ExternalSyntheticBUOutline0.m("Encountered an error accessing the file system, could not create files");
            } else {
                if (fileManager.deleteFile(createFile)) {
                    return;
                }
                Single$$ExternalSyntheticBUOutline0.m("Encountered an error accessing the file system, could not delete files");
            }
        } catch (IOException e) {
            OnnxMap$$ExternalSyntheticBUOutline0.m("Encountered an error accessing the file system", e);
        }
    }
}
