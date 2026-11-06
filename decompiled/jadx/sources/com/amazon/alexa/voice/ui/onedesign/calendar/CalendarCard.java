package com.amazon.alexa.voice.ui.onedesign.calendar;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.core.app.AppLaunchChecker$$ExternalSyntheticOutline0;
import com.amazon.alexa.metis.api.ChatData$$ExternalSyntheticOutline0;
import com.amazon.alexa.voice.ui.onedesign.calendar.CalendarCardModel;
import com.facebook.imageutils.JfifUtil;
import java.util.ArrayList;
import java.util.List;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public final class CalendarCard implements CalendarCardModel {
    public static final Parcelable.Creator<CalendarCard> CREATOR = new Parcelable.Creator<CalendarCard>() { // from class: com.amazon.alexa.voice.ui.onedesign.calendar.CalendarCard.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public CalendarCard createFromParcel(Parcel parcel) {
            return new CalendarCard(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public CalendarCard[] newArray(int i) {
            return new CalendarCard[i];
        }
    };
    private final List<? extends CalendarCardModel.EventModel> eventList;
    private final CharSequence title;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class Builder {
        List<? extends CalendarCardModel.EventModel> eventList = new ArrayList();
        CharSequence title;

        public CalendarCard build() {
            if (this.eventList != null) {
                return new CalendarCard(this);
            }
            Single$$ExternalSyntheticBUOutline0.m$3("eventList == null");
            return null;
        }

        public Builder eventList(@NonNull List<? extends CalendarCardModel.EventModel> list) {
            this.eventList = list;
            return this;
        }

        public Builder title(CharSequence charSequence) {
            this.title = charSequence;
            return this;
        }
    }

    public CalendarCard(Parcel parcel) {
        this.title = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.eventList = parcel.createTypedArrayList(Event.CREATOR);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || CalendarCard.class != obj.getClass()) {
            return false;
        }
        CalendarCard calendarCard = (CalendarCard) obj;
        CharSequence charSequence = this.title;
        CharSequence charSequence2 = calendarCard.title;
        if (charSequence == null ? charSequence2 == null : charSequence.equals(charSequence2)) {
            return this.eventList.equals(calendarCard.eventList);
        }
        return false;
    }

    @Override // com.amazon.alexa.voice.ui.onedesign.calendar.CalendarCardModel
    public List<? extends CalendarCardModel.EventModel> getEventList() {
        return this.eventList;
    }

    @Override // com.amazon.alexa.voice.ui.onedesign.calendar.CalendarCardModel
    public CharSequence getTitle() {
        return this.title;
    }

    public int hashCode() {
        CharSequence charSequence = this.title;
        return this.eventList.hashCode() + ((JfifUtil.MARKER_EOI + (charSequence != null ? charSequence.hashCode() : 0)) * 31);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("CalendarCard{title=");
        sb.append((Object) this.title);
        sb.append(", eventList=");
        return AppLaunchChecker$$ExternalSyntheticOutline0.m(sb, this.eventList, AbstractJsonLexerKt.END_OBJ);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        TextUtils.writeToParcel(this.title, parcel, i);
        parcel.writeTypedList(this.eventList);
    }

    public CalendarCard(Builder builder) {
        this.title = builder.title;
        this.eventList = builder.eventList;
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class Event implements CalendarCardModel.EventModel {
        public static final Parcelable.Creator<Event> CREATOR = new Parcelable.Creator<Event>() { // from class: com.amazon.alexa.voice.ui.onedesign.calendar.CalendarCard.Event.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public Event createFromParcel(Parcel parcel) {
                return new Event(parcel);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public Event[] newArray(int i) {
                return new Event[i];
            }
        };
        private final boolean allDay;
        private final long endTime;
        private final CharSequence id;
        private final CharSequence location;
        private final boolean multiDay;
        private final CharSequence name;
        private final CharSequence provider;
        private final long startTime;

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public static final class Builder {
            boolean allDay;
            long endTime;
            CharSequence id;
            CharSequence location;
            boolean multiDay;
            CharSequence name;
            CharSequence provider;
            long startTime;

            public Builder allDay(boolean z) {
                this.allDay = z;
                return this;
            }

            public Event build() {
                if (this.name != null) {
                    return new Event(this);
                }
                Single$$ExternalSyntheticBUOutline0.m$3("name == null");
                return null;
            }

            public Builder endTime(long j) {
                this.endTime = j;
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

            public Builder multiDay(boolean z) {
                this.multiDay = z;
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

            public Builder startTime(long j) {
                this.startTime = j;
                return this;
            }
        }

        public Event(Parcel parcel) {
            Parcelable.Creator creator = TextUtils.CHAR_SEQUENCE_CREATOR;
            this.name = (CharSequence) creator.createFromParcel(parcel);
            this.startTime = parcel.readLong();
            this.endTime = parcel.readLong();
            this.allDay = parcel.readByte() != 0;
            this.multiDay = parcel.readByte() != 0;
            this.location = (CharSequence) creator.createFromParcel(parcel);
            this.id = (CharSequence) creator.createFromParcel(parcel);
            this.provider = (CharSequence) creator.createFromParcel(parcel);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || Event.class != obj.getClass()) {
                return false;
            }
            Event event = (Event) obj;
            if (!this.name.equals(event.name) || this.startTime != event.startTime || this.endTime != event.endTime || this.allDay != event.allDay || this.multiDay != event.multiDay) {
                return false;
            }
            CharSequence charSequence = this.location;
            CharSequence charSequence2 = event.location;
            if (charSequence == null ? charSequence2 != null : !charSequence.equals(charSequence2)) {
                return false;
            }
            CharSequence charSequence3 = this.id;
            CharSequence charSequence4 = event.id;
            if (charSequence3 == null ? charSequence4 != null : !charSequence3.equals(charSequence4)) {
                return false;
            }
            CharSequence charSequence5 = this.provider;
            CharSequence charSequence6 = event.provider;
            return charSequence5 == null ? charSequence6 == null : charSequence5.equals(charSequence6);
        }

        @Override // com.amazon.alexa.voice.ui.onedesign.calendar.CalendarCardModel.EventModel
        public boolean getAllDay() {
            return this.allDay;
        }

        @Override // com.amazon.alexa.voice.ui.onedesign.calendar.CalendarCardModel.EventModel
        public long getEndTime() {
            return this.endTime;
        }

        @Override // com.amazon.alexa.voice.ui.onedesign.calendar.CalendarCardModel.EventModel
        public CharSequence getId() {
            return this.id;
        }

        @Override // com.amazon.alexa.voice.ui.onedesign.calendar.CalendarCardModel.EventModel
        public CharSequence getLocation() {
            return this.location;
        }

        @Override // com.amazon.alexa.voice.ui.onedesign.calendar.CalendarCardModel.EventModel
        public boolean getMultiDay() {
            return this.multiDay;
        }

        @Override // com.amazon.alexa.voice.ui.onedesign.calendar.CalendarCardModel.EventModel
        public CharSequence getName() {
            return this.name;
        }

        @Override // com.amazon.alexa.voice.ui.onedesign.calendar.CalendarCardModel.EventModel
        public CharSequence getProvider() {
            return this.provider;
        }

        @Override // com.amazon.alexa.voice.ui.onedesign.calendar.CalendarCardModel.EventModel
        public long getStartTime() {
            return this.startTime;
        }

        public int hashCode() {
            int m = ChatData$$ExternalSyntheticOutline0.m(this.name, JfifUtil.MARKER_EOI, 31);
            long j = this.startTime;
            int i = (m + ((int) (j ^ (j >>> 32)))) * 31;
            long j2 = this.endTime;
            int i2 = (((((i + ((int) (j2 ^ (j2 >>> 32)))) * 31) + (this.allDay ? 1 : 0)) * 31) + (this.multiDay ? 1 : 0)) * 31;
            CharSequence charSequence = this.location;
            int hashCode = (i2 + (charSequence != null ? charSequence.hashCode() : 0)) * 31;
            CharSequence charSequence2 = this.id;
            int hashCode2 = (hashCode + (charSequence2 != null ? charSequence2.hashCode() : 0)) * 31;
            CharSequence charSequence3 = this.provider;
            return hashCode2 + (charSequence3 != null ? charSequence3.hashCode() : 0);
        }

        public String toString() {
            return "Event{name=" + ((Object) this.name) + ", startTime=" + this.startTime + ", endTime=" + this.endTime + ", allDay=" + this.allDay + ", multiDay=" + this.multiDay + ", location=" + ((Object) this.location) + ", id=" + ((Object) this.id) + ", provider=" + ((Object) this.provider) + AbstractJsonLexerKt.END_OBJ;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            TextUtils.writeToParcel(this.name, parcel, i);
            parcel.writeLong(this.startTime);
            parcel.writeLong(this.endTime);
            parcel.writeByte(this.allDay ? (byte) 1 : (byte) 0);
            parcel.writeByte(this.multiDay ? (byte) 1 : (byte) 0);
            TextUtils.writeToParcel(this.location, parcel, i);
            TextUtils.writeToParcel(this.id, parcel, i);
            TextUtils.writeToParcel(this.provider, parcel, i);
        }

        public Event(Builder builder) {
            this.name = builder.name;
            this.startTime = builder.startTime;
            this.endTime = builder.endTime;
            this.allDay = builder.allDay;
            this.multiDay = builder.multiDay;
            this.location = builder.location;
            this.id = builder.id;
            this.provider = builder.provider;
        }
    }
}
