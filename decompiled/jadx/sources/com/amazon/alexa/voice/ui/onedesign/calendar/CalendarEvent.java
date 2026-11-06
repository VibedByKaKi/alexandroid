package com.amazon.alexa.voice.ui.onedesign.calendar;

import androidx.annotation.NonNull;
import com.amazon.alexa.metis.api.ChatData$$ExternalSyntheticOutline0;
import com.facebook.imageutils.JfifUtil;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public final class CalendarEvent implements CalendarEventModel {
    private final CharSequence dayOfMonth;
    private final CharSequence dayOfWeek;
    private final CharSequence id;
    private final CharSequence location;
    private final CharSequence month;
    private final CharSequence name;
    private final CharSequence provider;
    private final Object tag;
    private final CharSequence times;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class Builder {
        CharSequence dayOfMonth;
        CharSequence dayOfWeek;
        CharSequence id;
        CharSequence location;
        CharSequence month;
        CharSequence name;
        CharSequence provider;
        Object tag;
        CharSequence times;

        public CalendarEvent build() {
            if (this.tag == null) {
                Single$$ExternalSyntheticBUOutline0.m$3("tag == null");
                return null;
            }
            if (this.name != null) {
                return new CalendarEvent(this);
            }
            Single$$ExternalSyntheticBUOutline0.m$3("name == null");
            return null;
        }

        public Builder dayOfMonth(CharSequence charSequence) {
            this.dayOfMonth = charSequence;
            return this;
        }

        public Builder dayOfWeek(CharSequence charSequence) {
            this.dayOfWeek = charSequence;
            return this;
        }

        public Builder id(CharSequence charSequence) {
            this.id = charSequence;
            return this;
        }

        public Builder location(CharSequence charSequence) {
            this.location = charSequence;
            return this;
        }

        public Builder month(CharSequence charSequence) {
            this.month = charSequence;
            return this;
        }

        public Builder name(@NonNull CharSequence charSequence) {
            this.name = charSequence;
            return this;
        }

        public Builder provider(CharSequence charSequence) {
            this.provider = charSequence;
            return this;
        }

        public Builder tag(@NonNull Object obj) {
            this.tag = obj;
            return this;
        }

        public Builder times(CharSequence charSequence) {
            this.times = charSequence;
            return this;
        }
    }

    public CalendarEvent(Builder builder) {
        this.tag = builder.tag;
        this.name = builder.name;
        this.dayOfWeek = builder.dayOfWeek;
        this.dayOfMonth = builder.dayOfMonth;
        this.month = builder.month;
        this.location = builder.location;
        this.times = builder.times;
        this.id = builder.id;
        this.provider = builder.provider;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || CalendarEvent.class != obj.getClass()) {
            return false;
        }
        CalendarEvent calendarEvent = (CalendarEvent) obj;
        if (!this.tag.equals(calendarEvent.tag) || !this.name.equals(calendarEvent.name)) {
            return false;
        }
        CharSequence charSequence = this.dayOfWeek;
        CharSequence charSequence2 = calendarEvent.dayOfWeek;
        if (charSequence == null ? charSequence2 != null : !charSequence.equals(charSequence2)) {
            return false;
        }
        CharSequence charSequence3 = this.dayOfMonth;
        CharSequence charSequence4 = calendarEvent.dayOfMonth;
        if (charSequence3 == null ? charSequence4 != null : !charSequence3.equals(charSequence4)) {
            return false;
        }
        CharSequence charSequence5 = this.month;
        CharSequence charSequence6 = calendarEvent.month;
        if (charSequence5 == null ? charSequence6 != null : !charSequence5.equals(charSequence6)) {
            return false;
        }
        CharSequence charSequence7 = this.location;
        CharSequence charSequence8 = calendarEvent.location;
        if (charSequence7 == null ? charSequence8 != null : !charSequence7.equals(charSequence8)) {
            return false;
        }
        CharSequence charSequence9 = this.times;
        CharSequence charSequence10 = calendarEvent.times;
        if (charSequence9 == null ? charSequence10 != null : !charSequence9.equals(charSequence10)) {
            return false;
        }
        CharSequence charSequence11 = this.id;
        CharSequence charSequence12 = calendarEvent.id;
        if (charSequence11 == null ? charSequence12 != null : !charSequence11.equals(charSequence12)) {
            return false;
        }
        CharSequence charSequence13 = this.provider;
        CharSequence charSequence14 = calendarEvent.provider;
        return charSequence13 == null ? charSequence14 == null : charSequence13.equals(charSequence14);
    }

    @Override // com.amazon.alexa.voice.ui.onedesign.calendar.CalendarEventModel
    public CharSequence getDayOfMonth() {
        return this.dayOfMonth;
    }

    @Override // com.amazon.alexa.voice.ui.onedesign.calendar.CalendarEventModel
    public CharSequence getDayOfWeek() {
        return this.dayOfWeek;
    }

    @Override // com.amazon.alexa.voice.ui.onedesign.calendar.CalendarEventModel
    public CharSequence getId() {
        return this.id;
    }

    @Override // com.amazon.alexa.voice.ui.onedesign.calendar.CalendarEventModel
    public CharSequence getLocation() {
        return this.location;
    }

    @Override // com.amazon.alexa.voice.ui.onedesign.calendar.CalendarEventModel
    public CharSequence getMonth() {
        return this.month;
    }

    @Override // com.amazon.alexa.voice.ui.onedesign.calendar.CalendarEventModel
    public CharSequence getName() {
        return this.name;
    }

    @Override // com.amazon.alexa.voice.ui.onedesign.calendar.CalendarEventModel
    public CharSequence getProvider() {
        return this.provider;
    }

    @Override // com.amazon.alexa.voice.ui.onedesign.calendar.CalendarEventModel
    public Object getTag() {
        return this.tag;
    }

    @Override // com.amazon.alexa.voice.ui.onedesign.calendar.CalendarEventModel
    public CharSequence getTimes() {
        return this.times;
    }

    public int hashCode() {
        int m = ChatData$$ExternalSyntheticOutline0.m(this.name, (this.tag.hashCode() + JfifUtil.MARKER_EOI) * 31, 31);
        CharSequence charSequence = this.dayOfWeek;
        int hashCode = (m + (charSequence != null ? charSequence.hashCode() : 0)) * 31;
        CharSequence charSequence2 = this.dayOfMonth;
        int hashCode2 = (hashCode + (charSequence2 != null ? charSequence2.hashCode() : 0)) * 31;
        CharSequence charSequence3 = this.month;
        int hashCode3 = (hashCode2 + (charSequence3 != null ? charSequence3.hashCode() : 0)) * 31;
        CharSequence charSequence4 = this.location;
        int hashCode4 = (hashCode3 + (charSequence4 != null ? charSequence4.hashCode() : 0)) * 31;
        CharSequence charSequence5 = this.times;
        int hashCode5 = (hashCode4 + (charSequence5 != null ? charSequence5.hashCode() : 0)) * 31;
        CharSequence charSequence6 = this.id;
        int hashCode6 = (hashCode5 + (charSequence6 != null ? charSequence6.hashCode() : 0)) * 31;
        CharSequence charSequence7 = this.provider;
        return hashCode6 + (charSequence7 != null ? charSequence7.hashCode() : 0);
    }

    public String toString() {
        return "CalendarEvent{tag=" + this.tag + ", name=" + ((Object) this.name) + ", dayOfWeek=" + ((Object) this.dayOfWeek) + ", dayOfMonth=" + ((Object) this.dayOfMonth) + ", month=" + ((Object) this.month) + ", location=" + ((Object) this.location) + ", times=" + ((Object) this.times) + ", id=" + ((Object) this.id) + ", provider=" + ((Object) this.provider) + AbstractJsonLexerKt.END_OBJ;
    }
}
