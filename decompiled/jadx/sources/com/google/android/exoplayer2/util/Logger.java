package com.google.android.exoplayer2.util;

import java.util.Arrays;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes7.dex */
public class Logger {
    private static final int[] enabledModules;
    private int mModule;
    private String mTag;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum Module {
        Unknown,
        AudioVideoCommon,
        Audio,
        Video,
        AudioVideo,
        Text,
        Source,
        Manifest,
        Player,
        All
    }

    static {
        int[] iArr = new int[Module.All.ordinal()];
        enabledModules = iArr;
        Arrays.fill(iArr, 4);
    }

    public Logger(Module module, String str) {
        this.mTag = "UNKNOWN";
        this.mModule = Module.Unknown.ordinal();
        if (str == null) {
            Single$$ExternalSyntheticBUOutline0.m$3("Null Tag");
            throw null;
        }
        this.mTag = str;
        this.mModule = module.ordinal();
    }

    public static void setLogLevel(Module module, int i) {
        if (module.compareTo(Module.All) == 0) {
            Arrays.fill(enabledModules, i);
        } else {
            enabledModules[module.ordinal()] = i;
        }
        Module module2 = Module.Audio;
        if (module.compareTo(module2) >= 0 && module.compareTo(Module.AudioVideo) <= 0) {
            enabledModules[Module.AudioVideoCommon.ordinal()] = i;
        }
        if (module.compareTo(Module.AudioVideo) == 0) {
            int[] iArr = enabledModules;
            iArr[module2.ordinal()] = i;
            iArr[Module.Video.ordinal()] = i;
        }
    }

    public boolean allowDebug() {
        return enabledModules[this.mModule] <= 3;
    }

    public boolean allowVerbose() {
        return enabledModules[this.mModule] == 2;
    }

    public void d(String str) {
        int i = enabledModules[this.mModule];
    }

    public void e(String str) {
        android.util.Log.e(this.mTag, str);
    }

    public void i(String str) {
        android.util.Log.i(this.mTag, str);
    }

    public void setModule(Module module) {
        this.mModule = module.ordinal();
    }

    public void setTAG(String str) {
        if (str != null) {
            this.mTag = str;
        } else {
            Single$$ExternalSyntheticBUOutline0.m$3("Null Tag");
        }
    }

    public void v(String str) {
        int i = enabledModules[this.mModule];
    }

    public void w(String str) {
        android.util.Log.w(this.mTag, str);
    }

    public void e(String str, Throwable th) {
        android.util.Log.e(this.mTag, str, th);
    }
}
