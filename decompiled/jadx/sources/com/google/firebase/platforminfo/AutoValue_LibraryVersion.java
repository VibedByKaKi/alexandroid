package com.google.firebase.platforminfo;

import defpackage.a$$ExternalSyntheticOutline0;
import javax.annotation.Nonnull;
import org.apache.commons.text.StringSubstitutor;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
final class AutoValue_LibraryVersion extends LibraryVersion {
    private final String libraryName;
    private final String version;

    public AutoValue_LibraryVersion(String str, String str2) {
        if (str == null) {
            Single$$ExternalSyntheticBUOutline0.m$1("Null libraryName");
            throw null;
        }
        this.libraryName = str;
        if (str2 != null) {
            this.version = str2;
        } else {
            Single$$ExternalSyntheticBUOutline0.m$1("Null version");
            throw null;
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof LibraryVersion) {
            LibraryVersion libraryVersion = (LibraryVersion) obj;
            if (this.libraryName.equals(libraryVersion.getLibraryName()) && this.version.equals(libraryVersion.getVersion())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.firebase.platforminfo.LibraryVersion
    @Nonnull
    public String getLibraryName() {
        return this.libraryName;
    }

    @Override // com.google.firebase.platforminfo.LibraryVersion
    @Nonnull
    public String getVersion() {
        return this.version;
    }

    public int hashCode() {
        return this.version.hashCode() ^ ((this.libraryName.hashCode() ^ 1000003) * 1000003);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("LibraryVersion{libraryName=");
        sb.append(this.libraryName);
        sb.append(", version=");
        return a$$ExternalSyntheticOutline0.m(sb, this.version, StringSubstitutor.DEFAULT_VAR_END);
    }
}
