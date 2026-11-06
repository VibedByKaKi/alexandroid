package com.amazonaws.services.s3.internal;

import com.amazonaws.services.s3.OnFileDelete;
import java.io.File;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class PartCreationEvent {
    private final OnFileDelete fileDeleteObserver;
    private final boolean isLastPart;
    private final File part;
    private final int partNumber;

    public PartCreationEvent(File file, int i, boolean z, OnFileDelete onFileDelete) {
        if (file == null) {
            Single$$ExternalSyntheticBUOutline0.m$3("part must not be specified");
            throw null;
        }
        this.part = file;
        this.partNumber = i;
        this.isLastPart = z;
        this.fileDeleteObserver = onFileDelete;
    }

    public OnFileDelete getFileDeleteObserver() {
        return this.fileDeleteObserver;
    }

    public File getPart() {
        return this.part;
    }

    public int getPartNumber() {
        return this.partNumber;
    }

    public boolean isLastPart() {
        return this.isLastPart;
    }
}
