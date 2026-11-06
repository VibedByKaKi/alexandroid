package com.amazon.alexa.sharing.media.picker.util;

import com.amazon.alexa.sharing.util.DeviceInfoUtil;
import com.amazon.alexa.sharing.util.FileUtil;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes19.dex */
public final class ExifExtractor_Factory implements Factory<ExifExtractor> {
    private final Provider<DeviceInfoUtil> deviceInfoUtilProvider;
    private final Provider<FileUtil> fileUtilProvider;

    public ExifExtractor_Factory(Provider<FileUtil> provider, Provider<DeviceInfoUtil> provider2) {
        this.fileUtilProvider = provider;
        this.deviceInfoUtilProvider = provider2;
    }

    public static ExifExtractor_Factory create(Provider<FileUtil> provider, Provider<DeviceInfoUtil> provider2) {
        return new ExifExtractor_Factory(provider, provider2);
    }

    public static ExifExtractor newInstance(FileUtil fileUtil, DeviceInfoUtil deviceInfoUtil) {
        return new ExifExtractor(fileUtil, deviceInfoUtil);
    }

    @Override // javax.inject.Provider
    public ExifExtractor get() {
        return newInstance(this.fileUtilProvider.get(), this.deviceInfoUtilProvider.get());
    }
}
