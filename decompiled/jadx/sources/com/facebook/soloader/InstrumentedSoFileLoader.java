package com.facebook.soloader;

import android.annotation.SuppressLint;
import com.facebook.soloader.observer.ObserverHolder;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes7.dex */
public class InstrumentedSoFileLoader implements SoFileLoader {
    private final SoFileLoader mDelegate;

    public InstrumentedSoFileLoader(SoFileLoader soFileLoader) {
        this.mDelegate = soFileLoader;
    }

    @Override // com.facebook.soloader.SoFileLoader
    @SuppressLint({"CatchGeneralException", "EmptyCatchBlock"})
    public void load(String str, int i) {
        ObserverHolder.onSoFileLoaderLoadStart(this.mDelegate, "load", i);
        try {
            this.mDelegate.load(str, i);
            ObserverHolder.onSoFileLoaderLoadEnd(null);
        } finally {
        }
    }

    @Override // com.facebook.soloader.SoFileLoader
    @SuppressLint({"CatchGeneralException", "EmptyCatchBlock"})
    public void loadBytes(String str, ElfByteChannel elfByteChannel, int i) {
        ObserverHolder.onSoFileLoaderLoadStart(this.mDelegate, "loadBytes", i);
        try {
            this.mDelegate.loadBytes(str, elfByteChannel, i);
            ObserverHolder.onSoFileLoaderLoadEnd(null);
        } finally {
        }
    }
}
