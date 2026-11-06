package com.amazon.alexa.ra.core.features.personality;

import com.dee.app.metrics.MetricsConstants;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0012\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J'\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004H&¢\u0006\u0004\b\u0007\u0010\bJ/\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\f\u001a\u0004\u0018\u00010\u0004H&¢\u0006\u0004\b\r\u0010\u000eJ\"\u0010\u000f\u001a\u00020\u00102\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\u0006\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0004H&J\b\u0010\u0011\u001a\u00020\u0012H&J\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0005\u001a\u00020\u0004H&J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0005\u001a\u00020\u0004H&¨\u0006\u0016À\u0006\u0003"}, d2 = {"Lcom/amazon/alexa/ra/core/features/personality/PersonalityAssetDiskDataSource;", "", MetricsConstants.Method.CACHE_GET, "Lkotlin/Result;", "", "uri", "expectedChecksum", "get-gIAlu-s", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Object;", "save", "bytes", "", "checksum", "save-0E7RQCE", "([BLjava/lang/String;Ljava/lang/String;)Ljava/lang/Object;", "validateChecksum", "Lcom/amazon/alexa/ra/core/features/personality/ChecksumValidationResult;", "clearCache", "", "exists", "", "readBytes", "ui-chrome_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes18.dex */
public interface PersonalityAssetDiskDataSource {
    void clearCache();

    boolean exists(@NotNull String uri);

    @NotNull
    /* renamed from: get-gIAlu-s */
    Object mo17795getgIAlus(@NotNull String uri, @Nullable String expectedChecksum);

    @Nullable
    byte[] readBytes(@NotNull String uri);

    @NotNull
    /* renamed from: save-0E7RQCE */
    Object mo17796save0E7RQCE(@NotNull byte[] bytes, @NotNull String uri, @Nullable String checksum);

    @NotNull
    ChecksumValidationResult validateChecksum(@NotNull byte[] bytes, @Nullable String expectedChecksum, @NotNull String uri);
}
