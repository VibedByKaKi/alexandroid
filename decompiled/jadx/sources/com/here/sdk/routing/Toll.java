package com.here.sdk.routing;

import androidx.annotation.NonNull;
import com.facebook.imageutils.JfifUtil;
import java.util.List;
import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
public final class Toll {

    @NonNull
    public String countryCode;

    @NonNull
    public List<TollFare> fares;

    @NonNull
    @Deprecated
    public String tollSystem;

    @NonNull
    public List<String> tollSystems;

    public Toll(@NonNull String str, @NonNull List<String> list, @NonNull List<TollFare> list2) {
        this.countryCode = str;
        this.tollSystem = "";
        this.tollSystems = list;
        this.fares = list2;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Toll)) {
            return false;
        }
        Toll toll = (Toll) obj;
        return Objects.equals(this.countryCode, toll.countryCode) && Objects.equals(this.tollSystem, toll.tollSystem) && Objects.equals(this.tollSystems, toll.tollSystems) && Objects.equals(this.fares, toll.fares);
    }

    public int hashCode() {
        String str = this.countryCode;
        int hashCode = (JfifUtil.MARKER_EOI + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.tollSystem;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        List<String> list = this.tollSystems;
        int hashCode3 = (hashCode2 + (list != null ? list.hashCode() : 0)) * 31;
        List<TollFare> list2 = this.fares;
        return hashCode3 + (list2 != null ? list2.hashCode() : 0);
    }

    public Toll(@NonNull String str, @NonNull List<String> list, @NonNull List<TollFare> list2, @NonNull @Deprecated String str2) {
        this.countryCode = str;
        this.tollSystems = list;
        this.fares = list2;
        this.tollSystem = str2;
    }
}
