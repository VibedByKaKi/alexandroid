package com.mrousavy.camera.core;

import defpackage.a$$ExternalSyntheticOutline0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\b&\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0014\u0010\u0005\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0011\u0010\r\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\n¨\u0006\u000f"}, d2 = {"Lcom/mrousavy/camera/core/CameraError;", "", "domain", "", "id", "message", "cause", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V", "getDomain", "()Ljava/lang/String;", "getId", "getMessage", "code", "getCode", "react-native-vision-camera_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public abstract class CameraError extends Throwable {

    @NotNull
    private final String domain;

    @NotNull
    private final String id;

    @NotNull
    private final String message;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public CameraError(@org.jetbrains.annotations.NotNull java.lang.String r4, @org.jetbrains.annotations.NotNull java.lang.String r5, @org.jetbrains.annotations.NotNull java.lang.String r6, @org.jetbrains.annotations.Nullable java.lang.Throwable r7) {
        /*
            r3 = this;
            r4.getClass()
            r5.getClass()
            r6.getClass()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "["
            r0.<init>(r1)
            r0.append(r4)
            java.lang.String r1 = "/"
            java.lang.String r2 = "] "
            java.lang.String r0 = androidx.collection.DoubleList$$ExternalSyntheticOutline0.m(r0, r1, r5, r2, r6)
            r3.<init>(r0, r7)
            r3.domain = r4
            r3.id = r5
            r3.message = r6
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mrousavy.camera.core.CameraError.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.Throwable):void");
    }

    @NotNull
    public final String getCode() {
        return a$$ExternalSyntheticOutline0.m$1(this.domain, "/", this.id);
    }

    @NotNull
    public final String getDomain() {
        return this.domain;
    }

    @NotNull
    public final String getId() {
        return this.id;
    }

    @Override // java.lang.Throwable
    @NotNull
    public String getMessage() {
        return this.message;
    }

    public /* synthetic */ CameraError(String str, String str2, String str3, Throwable th, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, (i & 8) != 0 ? null : th);
    }
}
