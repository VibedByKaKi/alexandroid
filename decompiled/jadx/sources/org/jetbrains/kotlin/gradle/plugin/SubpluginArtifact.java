package org.jetbrains.kotlin.gradle.plugin;

import com.amazon.alexa.ra.core.data.fragments.FragmentMetaData;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0016\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0006R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u000b"}, d2 = {"Lorg/jetbrains/kotlin/gradle/plugin/SubpluginArtifact;", "", FragmentMetaData.GROUP_ID, "", "artifactId", "version", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getArtifactId", "()Ljava/lang/String;", "getGroupId", "getVersion", "kotlin-gradle-plugin-api_common"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes11.dex */
public class SubpluginArtifact {

    @NotNull
    private final String artifactId;

    @NotNull
    private final String groupId;

    @Nullable
    private final String version;

    public SubpluginArtifact(@NotNull String str, @NotNull String str2, @Nullable String str3) {
        str.getClass();
        str2.getClass();
        this.groupId = str;
        this.artifactId = str2;
        this.version = str3;
    }

    @NotNull
    public final String getArtifactId() {
        return this.artifactId;
    }

    @NotNull
    public final String getGroupId() {
        return this.groupId;
    }

    @Nullable
    public final String getVersion() {
        return this.version;
    }

    public /* synthetic */ SubpluginArtifact(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i & 4) != 0 ? null : str3);
    }
}
