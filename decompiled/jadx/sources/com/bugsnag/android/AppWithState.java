package com.bugsnag.android;

import com.bugsnag.android.internal.ImmutableConfig;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0004\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0013\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001Bi\b\u0010\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0002\u0010\u0010B}\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0002\u0010\u0014J\u0015\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$H\u0010¢\u0006\u0002\b%R\u001c\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001c\u0010\f\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0016\"\u0004\b\u001a\u0010\u0018R\u001e\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u001f\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u001e\u0010\u000f\u001a\u0004\u0018\u00010\u000eX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u001f\u001a\u0004\b\u000f\u0010\u001c\"\u0004\b \u0010\u001e¨\u0006&"}, d2 = {"Lcom/bugsnag/android/AppWithState;", "Lcom/bugsnag/android/App;", "config", "Lcom/bugsnag/android/internal/ImmutableConfig;", "binaryArch", "", "id", "releaseStage", "version", "codeBundleId", "duration", "", "durationInForeground", "inForeground", "", "isLaunching", "(Lcom/bugsnag/android/internal/ImmutableConfig;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Number;Ljava/lang/Number;Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "buildUuid", "type", "versionCode", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Number;Ljava/lang/Number;Ljava/lang/Number;Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "getDuration", "()Ljava/lang/Number;", "setDuration", "(Ljava/lang/Number;)V", "getDurationInForeground", "setDurationInForeground", "getInForeground", "()Ljava/lang/Boolean;", "setInForeground", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "setLaunching", "serialiseFields", "", "writer", "Lcom/bugsnag/android/JsonStream;", "serialiseFields$bugsnag_android_core_release", "bugsnag-android-core_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes6.dex */
public final class AppWithState extends App {

    @Nullable
    private Number duration;

    @Nullable
    private Number durationInForeground;

    @Nullable
    private Boolean inForeground;

    @Nullable
    private Boolean isLaunching;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AppWithState(@NotNull ImmutableConfig immutableConfig, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable Number number, @Nullable Number number2, @Nullable Boolean bool, @Nullable Boolean bool2) {
        this(str, str2, str3, str4, str5, immutableConfig.getBuildUuid(), immutableConfig.getAppType(), immutableConfig.getVersionCode(), number, number2, bool, bool2);
        immutableConfig.getClass();
    }

    @Nullable
    public final Number getDuration() {
        return this.duration;
    }

    @Nullable
    public final Number getDurationInForeground() {
        return this.durationInForeground;
    }

    @Nullable
    public final Boolean getInForeground() {
        return this.inForeground;
    }

    @Nullable
    /* renamed from: isLaunching, reason: from getter */
    public final Boolean getIsLaunching() {
        return this.isLaunching;
    }

    @Override // com.bugsnag.android.App
    public void serialiseFields$bugsnag_android_core_release(@NotNull JsonStream writer) {
        writer.getClass();
        super.serialiseFields$bugsnag_android_core_release(writer);
        writer.name("duration").value(this.duration);
        writer.name("durationInForeground").value(this.durationInForeground);
        writer.name("inForeground").value(this.inForeground);
        writer.name("isLaunching").value(this.isLaunching);
    }

    public final void setDuration(@Nullable Number number) {
        this.duration = number;
    }

    public final void setDurationInForeground(@Nullable Number number) {
        this.durationInForeground = number;
    }

    public final void setInForeground(@Nullable Boolean bool) {
        this.inForeground = bool;
    }

    public final void setLaunching(@Nullable Boolean bool) {
        this.isLaunching = bool;
    }

    public AppWithState(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable Number number, @Nullable Number number2, @Nullable Number number3, @Nullable Boolean bool, @Nullable Boolean bool2) {
        super(str, str2, str3, str4, str5, str6, str7, number);
        this.duration = number2;
        this.durationInForeground = number3;
        this.inForeground = bool;
        this.isLaunching = bool2;
    }
}
