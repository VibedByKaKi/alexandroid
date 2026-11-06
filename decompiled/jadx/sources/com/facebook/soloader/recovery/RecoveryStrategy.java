package com.facebook.soloader.recovery;

import com.facebook.soloader.SoSource;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes7.dex */
public interface RecoveryStrategy {
    public static final int FLAG_ENABLE_DSONOTFOUND_ERROR_RECOVERY_FOR_BACKUP_SO_SOURCE = 1;

    boolean recover(UnsatisfiedLinkError unsatisfiedLinkError, SoSource[] soSourceArr);
}
