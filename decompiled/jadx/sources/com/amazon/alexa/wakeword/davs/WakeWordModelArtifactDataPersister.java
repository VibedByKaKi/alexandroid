package com.amazon.alexa.wakeword.davs;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\f\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0007H&J\b\u0010\b\u001a\u00020\u0007H&J\b\u0010\t\u001a\u00020\u0007H&J\b\u0010\n\u001a\u00020\u0007H&J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0003H&J\u0010\u0010\u000e\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u0005H&J\u0010\u0010\u0010\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u0007H&J\u0010\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u0007H&J\u0010\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\u0007H&J\u0010\u0010\u0016\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\u0007H&¨\u0006\u0018"}, d2 = {"Lcom/amazon/alexa/wakeword/davs/WakeWordModelArtifactDataPersister;", "", "getArtifactData", "Lcom/amazon/alexa/wakeword/davs/ArtifactData;", "getArtifactDownloadTime", "", "getArtifactEcid", "", "getArtifactId", "getArtifactLocale", "getWakeWords", "setArtifactData", "", "artifactData", "setArtifactDownloadTime", "ts", "setArtifactEcid", "ecid", "setArtifactId", "id", "setArtifactLocale", "locale", "setWakeWords", "serializedWakeWords", "AVSAndroidClient-pryonprovider_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes20.dex */
public interface WakeWordModelArtifactDataPersister {
    @NotNull
    ArtifactData getArtifactData();

    long getArtifactDownloadTime();

    @NotNull
    String getArtifactEcid();

    @NotNull
    String getArtifactId();

    @NotNull
    String getArtifactLocale();

    @NotNull
    String getWakeWords();

    void setArtifactData(@NotNull ArtifactData artifactData);

    void setArtifactDownloadTime(long ts);

    void setArtifactEcid(@NotNull String ecid);

    void setArtifactId(@NotNull String id);

    void setArtifactLocale(@NotNull String locale);

    void setWakeWords(@NotNull String serializedWakeWords);
}
