package com.bugsnag.android.performance.internal;

import androidx.annotation.RestrictTo;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001:\u0001\u0007J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0003H&¨\u0006\b"}, d2 = {"Lcom/bugsnag/android/performance/internal/Module;", "", "load", "", "instrumentedAppState", "Lcom/bugsnag/android/performance/internal/InstrumentedAppState;", "unload", "Loader", "bugsnag-android-performance_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* loaded from: classes6.dex */
public interface Module {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u00032\u0006\u0010\b\u001a\u00020\u0002H\u0096\u0002J\u0010\u0010\t\u001a\u0004\u0018\u00010\u00032\u0006\u0010\b\u001a\u00020\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/bugsnag/android/performance/internal/Module$Loader;", "Lkotlin/Function1;", "", "Lcom/bugsnag/android/performance/internal/Module;", "instrumentedAppState", "Lcom/bugsnag/android/performance/internal/InstrumentedAppState;", "(Lcom/bugsnag/android/performance/internal/InstrumentedAppState;)V", "invoke", "className", "loadModule", "bugsnag-android-performance_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Module.kt\ncom/bugsnag/android/performance/internal/Module$Loader\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,27:1\n1#2:28\n*E\n"})
    public static final class Loader implements Function1<String, Module> {

        @NotNull
        private final InstrumentedAppState instrumentedAppState;

        public Loader(@NotNull InstrumentedAppState instrumentedAppState) {
            instrumentedAppState.getClass();
            this.instrumentedAppState = instrumentedAppState;
        }

        @Override // kotlin.jvm.functions.Function1
        @Nullable
        public Module invoke(@NotNull String className) {
            className.getClass();
            return loadModule(className);
        }

        @Nullable
        public final Module loadModule(@NotNull String className) {
            className.getClass();
            try {
                Object newInstance = Class.forName(className).newInstance();
                newInstance.getClass();
                Module module = (Module) newInstance;
                module.load(this.instrumentedAppState);
                return module;
            } catch (Exception unused) {
                return null;
            }
        }
    }

    void load(@NotNull InstrumentedAppState instrumentedAppState);

    void unload();
}
