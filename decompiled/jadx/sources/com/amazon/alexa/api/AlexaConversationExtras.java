package com.amazon.alexa.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.amazon.alexa.client.annotations.Nullable;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
public class AlexaConversationExtras implements Parcelable {
    public static final Parcelable.Creator<AlexaConversationExtras> CREATOR = new Parcelable.Creator<AlexaConversationExtras>() { // from class: com.amazon.alexa.api.AlexaConversationExtras.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AlexaConversationExtras createFromParcel(Parcel parcel) {
            return new AlexaConversationExtras(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AlexaConversationExtras[] newArray(int i) {
            return new AlexaConversationExtras[i];
        }
    };
    private final List<String> excludes;

    @Nullable
    private final AlexaConversationsPaginationContext paginationContext;
    private final List<String> personIds;

    public AlexaConversationExtras(Parcel parcel) {
        this(parcel.createStringArrayList(), parcel.createStringArrayList(), (AlexaConversationsPaginationContext) parcel.readParcelable(AlexaConversationsPaginationContext.class.getClassLoader()));
    }

    public static Builder builder() {
        return new Builder();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public List<String> getExcludes() {
        return this.excludes;
    }

    @Nullable
    public AlexaConversationsPaginationContext getPaginationContext() {
        return this.paginationContext;
    }

    public List<String> getPersonIds() {
        return this.personIds;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeStringArray((String[]) getPersonIds().toArray(new String[0]));
        parcel.writeStringArray((String[]) getExcludes().toArray(new String[0]));
        parcel.writeParcelable(this.paginationContext, i);
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class Builder {
        private List<String> excludes;
        private AlexaConversationsPaginationContext paginationContext;
        private List<String> personIds;

        public AlexaConversationExtras build() {
            if (this.personIds == null) {
                this.personIds = new ArrayList();
            }
            if (this.excludes == null) {
                this.excludes = new ArrayList();
            }
            return new AlexaConversationExtras(this);
        }

        public Builder setAlexaConversationExtras(AlexaConversationExtras alexaConversationExtras) {
            this.personIds = alexaConversationExtras.personIds;
            this.excludes = alexaConversationExtras.excludes;
            this.paginationContext = alexaConversationExtras.paginationContext;
            return this;
        }

        public Builder setExcludes(List<String> list) {
            this.excludes = list;
            return this;
        }

        public Builder setPaginationContext(AlexaConversationsPaginationContext alexaConversationsPaginationContext) {
            this.paginationContext = alexaConversationsPaginationContext;
            return this;
        }

        public Builder setPersonIds(List<String> list) {
            this.personIds = list;
            return this;
        }

        private Builder() {
        }
    }

    public AlexaConversationExtras(Builder builder) {
        this(builder.personIds, builder.excludes, builder.paginationContext);
    }

    private AlexaConversationExtras(List<String> list, List<String> list2, AlexaConversationsPaginationContext alexaConversationsPaginationContext) {
        this.personIds = list;
        this.excludes = list2;
        this.paginationContext = alexaConversationsPaginationContext;
    }

    @Deprecated
    public AlexaConversationExtras(@Nullable String str) {
        this(new ArrayList(), new ArrayList(), null);
    }
}
