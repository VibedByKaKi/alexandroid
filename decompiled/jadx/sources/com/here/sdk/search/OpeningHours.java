package com.here.sdk.search;

import androidx.annotation.NonNull;
import com.facebook.imageutils.JfifUtil;
import java.util.List;
import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
public final class OpeningHours {

    @NonNull
    public List<PlaceCategory> categories;
    public boolean isOpen;

    @NonNull
    public List<ScheduleDetails> scheduleDetailsList;

    @NonNull
    public List<String> text;

    public OpeningHours(@NonNull List<String> list, boolean z, @NonNull List<ScheduleDetails> list2, @NonNull List<PlaceCategory> list3) {
        this.text = list;
        this.isOpen = z;
        this.scheduleDetailsList = list2;
        this.categories = list3;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof OpeningHours)) {
            return false;
        }
        OpeningHours openingHours = (OpeningHours) obj;
        return Objects.equals(this.text, openingHours.text) && this.isOpen == openingHours.isOpen && Objects.equals(this.scheduleDetailsList, openingHours.scheduleDetailsList) && Objects.equals(this.categories, openingHours.categories);
    }

    public int hashCode() {
        List<String> list = this.text;
        int hashCode = (((JfifUtil.MARKER_EOI + (list != null ? list.hashCode() : 0)) * 31) + (this.isOpen ? 79 : 97)) * 31;
        List<ScheduleDetails> list2 = this.scheduleDetailsList;
        int hashCode2 = (hashCode + (list2 != null ? list2.hashCode() : 0)) * 31;
        List<PlaceCategory> list3 = this.categories;
        return hashCode2 + (list3 != null ? list3.hashCode() : 0);
    }
}
