package com.bugsnag.android;

import com.bugsnag.android.JsonStream;
import com.bugsnag.android.internal.ImmutableConfig;
import java.io.IOException;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u0004\n\u0002\b\u0016\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001BA\b\u0010\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\nBW\b\u0000\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\u0002\u0010\u000fJ\u0015\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020'H\u0010¢\u0006\u0002\b(J\u0010\u0010)\u001a\u00020%2\u0006\u0010&\u001a\u00020'H\u0016R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0011\"\u0004\b\u0015\u0010\u0013R\u001c\u0010\t\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0011\"\u0004\b\u0017\u0010\u0013R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0011\"\u0004\b\u0019\u0010\u0013R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0011\"\u0004\b\u001b\u0010\u0013R\u001c\u0010\f\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0011\"\u0004\b\u001d\u0010\u0013R\u001c\u0010\b\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u0011\"\u0004\b\u001f\u0010\u0013R\u001c\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#¨\u0006*"}, d2 = {"Lcom/bugsnag/android/App;", "Lcom/bugsnag/android/JsonStream$Streamable;", "config", "Lcom/bugsnag/android/internal/ImmutableConfig;", "binaryArch", "", "id", "releaseStage", "version", "codeBundleId", "(Lcom/bugsnag/android/internal/ImmutableConfig;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "buildUuid", "type", "versionCode", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Number;)V", "getBinaryArch", "()Ljava/lang/String;", "setBinaryArch", "(Ljava/lang/String;)V", "getBuildUuid", "setBuildUuid", "getCodeBundleId", "setCodeBundleId", "getId", "setId", "getReleaseStage", "setReleaseStage", "getType", "setType", "getVersion", "setVersion", "getVersionCode", "()Ljava/lang/Number;", "setVersionCode", "(Ljava/lang/Number;)V", "serialiseFields", "", "writer", "Lcom/bugsnag/android/JsonStream;", "serialiseFields$bugsnag_android_core_release", "toStream", "bugsnag-android-core_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes6.dex */
public class App implements JsonStream.Streamable {

    @Nullable
    private String binaryArch;

    @Nullable
    private String buildUuid;

    @Nullable
    private String codeBundleId;

    @Nullable
    private String id;

    @Nullable
    private String releaseStage;

    @Nullable
    private String type;

    @Nullable
    private String version;

    @Nullable
    private Number versionCode;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public App(@NotNull ImmutableConfig immutableConfig, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5) {
        this(str, str2, str3, str4, str5, immutableConfig.getBuildUuid(), immutableConfig.getAppType(), immutableConfig.getVersionCode());
        immutableConfig.getClass();
    }

    @Nullable
    public final String getBinaryArch() {
        return this.binaryArch;
    }

    @Nullable
    public final String getBuildUuid() {
        return this.buildUuid;
    }

    @Nullable
    public final String getCodeBundleId() {
        return this.codeBundleId;
    }

    @Nullable
    public final String getId() {
        return this.id;
    }

    @Nullable
    public final String getReleaseStage() {
        return this.releaseStage;
    }

    @Nullable
    public final String getType() {
        return this.type;
    }

    @Nullable
    public final String getVersion() {
        return this.version;
    }

    @Nullable
    public final Number getVersionCode() {
        return this.versionCode;
    }

    public void serialiseFields$bugsnag_android_core_release(@NotNull JsonStream writer) {
        writer.getClass();
        writer.name("binaryArch").value(this.binaryArch);
        writer.name("buildUUID").value(this.buildUuid);
        writer.name("codeBundleId").value(this.codeBundleId);
        writer.name("id").value(this.id);
        writer.name("releaseStage").value(this.releaseStage);
        writer.name("type").value(this.type);
        writer.name("version").value(this.version);
        writer.name("versionCode").value(this.versionCode);
    }

    public final void setBinaryArch(@Nullable String str) {
        this.binaryArch = str;
    }

    public final void setBuildUuid(@Nullable String str) {
        this.buildUuid = str;
    }

    public final void setCodeBundleId(@Nullable String str) {
        this.codeBundleId = str;
    }

    public final void setId(@Nullable String str) {
        this.id = str;
    }

    public final void setReleaseStage(@Nullable String str) {
        this.releaseStage = str;
    }

    public final void setType(@Nullable String str) {
        this.type = str;
    }

    public final void setVersion(@Nullable String str) {
        this.version = str;
    }

    public final void setVersionCode(@Nullable Number number) {
        this.versionCode = number;
    }

    @Override // com.bugsnag.android.JsonStream.Streamable
    public void toStream(@NotNull JsonStream writer) throws IOException {
        writer.getClass();
        writer.beginObject();
        serialiseFields$bugsnag_android_core_release(writer);
        writer.endObject();
    }

    public App(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable Number number) {
        this.binaryArch = str;
        this.id = str2;
        this.releaseStage = str3;
        this.version = str4;
        this.codeBundleId = str5;
        this.buildUuid = str6;
        this.type = str7;
        this.versionCode = number;
    }
}
