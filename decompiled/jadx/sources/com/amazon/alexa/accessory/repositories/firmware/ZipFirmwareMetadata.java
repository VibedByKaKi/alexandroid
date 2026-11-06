package com.amazon.alexa.accessory.repositories.firmware;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.amazon.alexa.accessory.internal.util.Preconditions;
import com.amazon.alexa.accessory.io.Source;
import java.io.File;
import java.io.IOException;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
public final class ZipFirmwareMetadata implements FirmwareMetadata {
    private final File file;
    private final String reference;

    public ZipFirmwareMetadata(File file, String str) {
        Preconditions.notNull(file, "file");
        Preconditions.notNull(str, TypedValues.Custom.S_REFERENCE);
        this.file = file;
        this.reference = str;
    }

    @Override // com.amazon.alexa.accessory.repositories.firmware.FirmwareMetadata
    public Source open() throws IOException {
        return new ZipEntrySource(this.file, this.reference);
    }
}
