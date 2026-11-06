package com.here.sdk.routing;

import androidx.annotation.NonNull;
import com.facebook.imageutils.JfifUtil;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
public final class EVMobilityServiceProviderPreferences {

    @NonNull
    public List<String> high = new ArrayList();

    @NonNull
    public List<String> medium = new ArrayList();

    @NonNull
    public List<String> low = new ArrayList();

    @NonNull
    public List<String> exclude = new ArrayList();

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof EVMobilityServiceProviderPreferences)) {
            return false;
        }
        EVMobilityServiceProviderPreferences eVMobilityServiceProviderPreferences = (EVMobilityServiceProviderPreferences) obj;
        return Objects.equals(this.high, eVMobilityServiceProviderPreferences.high) && Objects.equals(this.medium, eVMobilityServiceProviderPreferences.medium) && Objects.equals(this.low, eVMobilityServiceProviderPreferences.low) && Objects.equals(this.exclude, eVMobilityServiceProviderPreferences.exclude);
    }

    public int hashCode() {
        List<String> list = this.high;
        int hashCode = (JfifUtil.MARKER_EOI + (list != null ? list.hashCode() : 0)) * 31;
        List<String> list2 = this.medium;
        int hashCode2 = (hashCode + (list2 != null ? list2.hashCode() : 0)) * 31;
        List<String> list3 = this.low;
        int hashCode3 = (hashCode2 + (list3 != null ? list3.hashCode() : 0)) * 31;
        List<String> list4 = this.exclude;
        return hashCode3 + (list4 != null ? list4.hashCode() : 0);
    }
}
