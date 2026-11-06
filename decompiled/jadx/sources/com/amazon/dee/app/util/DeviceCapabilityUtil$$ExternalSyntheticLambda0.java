package com.amazon.dee.app.util;

import com.amazon.alexa.accessory.frames.translation.audio.TranslationAudioPlayer;
import java.io.File;
import java.io.FileFilter;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public final /* synthetic */ class DeviceCapabilityUtil$$ExternalSyntheticLambda0 implements FileFilter {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ DeviceCapabilityUtil$$ExternalSyntheticLambda0(int i) {
        this.$r8$classId = i;
    }

    @Override // java.io.FileFilter
    public final boolean accept(File file) {
        boolean systemCpuCoreCount$lambda$3;
        switch (this.$r8$classId) {
            case 0:
                systemCpuCoreCount$lambda$3 = DeviceCapabilityUtil.getSystemCpuCoreCount$lambda$3(file);
                return systemCpuCoreCount$lambda$3;
            default:
                return TranslationAudioPlayer.cleanupOrphanedTempFiles$lambda$20(file);
        }
    }
}
