package com.amazon.alexa.sharing.api.models;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import defpackage.a$$ExternalSyntheticOutline0;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.regex.Pattern;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public final class Payload {
    public static final String SERIALIZED_NAME_ATTACHMENTS = "attachments";
    public static final String SERIALIZED_NAME_TEXT = "text";
    public static final String SERIALIZED_NAME_TYPE = "type";

    @SerializedName(SERIALIZED_NAME_ATTACHMENTS)
    private List<PayloadAttachment> attachments;

    @SerializedName("text")
    private String text;

    @SerializedName("type")
    private TypeEnum type;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class Builder {
        public static final String DETECTION_URL_REGEX = "((https?|ftp)://|(www|ftp)\\.)?[a-z0-9-]+(\\.[a-z0-9-]+)+([/?].*)?";
        private final List<PayloadAttachment> attachments = new ArrayList(1);
        private String type = "";
        private String textFallback = "";

        private boolean deepLinkDetectedInText(String str) {
            return str.contains("://");
        }

        private boolean urlDetectedInText(String str) {
            return Pattern.compile(DETECTION_URL_REGEX).matcher(str).find();
        }

        public Builder addAttachment(PayloadAttachment payloadAttachment) {
            this.attachments.add(payloadAttachment);
            return this;
        }

        public Payload build() {
            String str = this.textFallback;
            if (str == null || str.length() == 0) {
                Single$$ExternalSyntheticBUOutline0.m$3("Cannot build a payload without text.");
                return null;
            }
            int i = 0;
            if (this.attachments.size() == 0) {
                this.type = textContainsUrl(this.textFallback) ? "url" : "text";
            } else {
                int size = this.attachments.size();
                List<PayloadAttachment> list = this.attachments;
                if (size == 1) {
                    this.type = list.get(0).getType();
                } else {
                    this.type = list.get(0).getType();
                }
            }
            return new Payload(this.type, this.attachments, this.textFallback, i);
        }

        public Builder setTextFallback(String str) {
            this.textFallback = str;
            return this;
        }

        @VisibleForTesting
        public boolean textContainsUrl(String str) {
            return urlDetectedInText(str) || deepLinkDetectedInText(str);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @JsonAdapter(Adapter.class)
    public enum TypeEnum {
        URL("url"),
        EMOJI(PayloadAttachmentEmoji.TYPE),
        TEXT("text"),
        MULTI_PART("multi-part"),
        _DOMAIN_ATTACHMENT_("<domain-attachment>");

        private final String value;

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public static class Adapter extends TypeAdapter<TypeEnum> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.google.gson.TypeAdapter
            public TypeEnum read(JsonReader jsonReader) throws IOException {
                return TypeEnum.fromValue(jsonReader.nextString());
            }

            @Override // com.google.gson.TypeAdapter
            public void write(JsonWriter jsonWriter, TypeEnum typeEnum) throws IOException {
                jsonWriter.value(typeEnum.getValue());
            }
        }

        TypeEnum(String str) {
            this.value = str;
        }

        public static TypeEnum fromValue(String str) {
            for (TypeEnum typeEnum : values()) {
                if (typeEnum.value.equals(str)) {
                    return typeEnum;
                }
            }
            Single$$ExternalSyntheticBUOutline0.m$3(a$$ExternalSyntheticOutline0.m("Unexpected value '", str, "'"));
            return null;
        }

        public String getValue() {
            return this.value;
        }

        @Override // java.lang.Enum
        public String toString() {
            return String.valueOf(this.value);
        }
    }

    private Payload(String str, List<PayloadAttachment> list, String str2) {
        this.attachments = list;
        this.text = str2;
        this.type = TypeEnum.fromValue(str);
    }

    private String toIndentedString(Object obj) {
        return obj == null ? "null" : obj.toString().replace("\n", "\n    ");
    }

    public Payload addAttachmentsItem(PayloadAttachment payloadAttachment) {
        if (this.attachments == null) {
            this.attachments = new ArrayList();
        }
        this.attachments.add(payloadAttachment);
        return this;
    }

    public Payload attachments(List<PayloadAttachment> list) {
        this.attachments = list;
        return this;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && Payload.class == obj.getClass()) {
            Payload payload = (Payload) obj;
            if (Objects.equals(this.type, payload.type) && Objects.equals(this.text, payload.text) && Objects.equals(this.attachments, payload.attachments)) {
                return true;
            }
        }
        return false;
    }

    @Nullable
    public List<PayloadAttachment> getAttachments() {
        return this.attachments;
    }

    @NonNull
    public String getText() {
        return this.text;
    }

    @NonNull
    public TypeEnum getType() {
        return this.type;
    }

    public int hashCode() {
        return Objects.hash(this.type, this.text, this.attachments);
    }

    public void setAttachments(List<PayloadAttachment> list) {
        this.attachments = list;
    }

    public void setText(String str) {
        this.text = str;
    }

    public void setType(TypeEnum typeEnum) {
        this.type = typeEnum;
    }

    public Payload text(String str) {
        this.text = str;
        return this;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("class Payload {\n    type: ");
        sb.append(toIndentedString(this.type));
        sb.append("\n    text: ");
        sb.append(toIndentedString(this.text));
        sb.append("\n    attachments: ");
        return a$$ExternalSyntheticOutline0.m(sb, toIndentedString(this.attachments), "\n}");
    }

    public Payload type(TypeEnum typeEnum) {
        this.type = typeEnum;
        return this;
    }

    public /* synthetic */ Payload(String str, List list, String str2, int i) {
        this(str, list, str2);
    }
}
