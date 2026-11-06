package com.amazon.alexa.wakeword.davs;

import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0010 \n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u0007R$\u0010\r\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u000f0\u000eX¤\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/amazon/alexa/wakeword/davs/ArtifactInfo;", "", "artifactType", "", "artifactKey", "(Ljava/lang/String;Ljava/lang/String;)V", "getArtifactKey", "()Ljava/lang/String;", "artifactRequest", "Lcom/amazon/alexa/wakeword/davs/ArtifactRequest;", "getArtifactRequest", "()Lcom/amazon/alexa/wakeword/davs/ArtifactRequest;", "getArtifactType", "davsFilters", "", "", "getDavsFilters", "()Ljava/util/Map;", "AVSAndroidClient-pryonprovider_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes20.dex */
public abstract class ArtifactInfo {

    @NotNull
    private final String artifactKey;

    @NotNull
    private final String artifactType;

    public ArtifactInfo(@NotNull String str, @NotNull String str2) {
        str.getClass();
        str2.getClass();
        this.artifactType = str;
        this.artifactKey = str2;
    }

    @NotNull
    public final String getArtifactKey() {
        return this.artifactKey;
    }

    @NotNull
    public final ArtifactRequest getArtifactRequest() {
        ArtifactRequest build = ArtifactRequest.builder().setArtifactType(this.artifactType).setArtifactKey(this.artifactKey).setFilters(getDavsFilters()).build();
        build.getClass();
        return build;
    }

    @NotNull
    public final String getArtifactType() {
        return this.artifactType;
    }

    @NotNull
    public abstract Map<String, List<String>> getDavsFilters();
}
