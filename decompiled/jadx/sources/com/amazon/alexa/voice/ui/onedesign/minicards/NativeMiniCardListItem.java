package com.amazon.alexa.voice.ui.onedesign.minicards;

import com.amazon.alexa.voice.ui.onedesign.minicards.AutoValue_NativeMiniCardListItem;
import com.amazon.alexa.voice.ui.onedesign.util.JSONUtils;
import com.google.auto.value.AutoValue;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import javax.annotation.Nullable;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@AutoValue
/* loaded from: classes20.dex */
public abstract class NativeMiniCardListItem {
    private static final String ATTRIBUTION = "attribution";
    private static final String DOCUMENT = "document";
    private static final String ID = "id";
    private static final String IMAGE_ASPECT_RATIO = "imageAspectRatio";
    private static final String IMAGE_SHAPE = "imageShape";
    private static final String IMAGE_URL = "imageUrl";
    private static final String PRIMARY_ACTION = "primaryAction";
    private static final String PRIMARY_TEXT = "primaryText";
    private static final String SECONDARY_TEXT = "secondaryText";
    private static final String TERTIARY_TEXT = "tertiaryText";
    private static final String TRAILING_TEXT = "trailingText";

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @AutoValue.Builder
    public static abstract class Builder {
        public abstract Builder attribution(String str);

        public abstract NativeMiniCardListItem build();

        public abstract Builder document(String str);

        public abstract Builder id(String str);

        public abstract Builder imageAspectRatio(Double d);

        public abstract Builder imageShape(NativeMiniCardImageShape nativeMiniCardImageShape);

        public abstract Builder imageUrl(String str);

        public abstract Builder primaryAction(NativeMiniCardAction nativeMiniCardAction);

        public abstract Builder primaryText(String str);

        public abstract Builder secondaryText(String str);

        public abstract Builder tertiaryText(String str);

        public abstract Builder trailingText(String str);
    }

    public static NativeMiniCardListItem from(@Nullable JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        return new AutoValue_NativeMiniCardListItem.Builder().id(JSONUtils.optionalString(jSONObject, "id", UUID.randomUUID().toString())).primaryText(NativeMiniCard.optionalStringFromHtml(jSONObject, "primaryText")).secondaryText(NativeMiniCard.optionalStringFromHtml(jSONObject, "secondaryText")).tertiaryText(NativeMiniCard.optionalStringFromHtml(jSONObject, TERTIARY_TEXT)).trailingText(NativeMiniCard.optionalStringFromHtml(jSONObject, TRAILING_TEXT)).imageUrl(JSONUtils.optionalString(jSONObject, "imageUrl")).imageAspectRatio(Double.valueOf(jSONObject.optDouble(IMAGE_ASPECT_RATIO))).imageShape(NativeMiniCardImageShape.from(JSONUtils.optionalString(jSONObject, IMAGE_SHAPE))).attribution(NativeMiniCard.optionalStringFromHtml(jSONObject, "attribution")).primaryAction(NativeMiniCardAction.from(jSONObject.optJSONObject("primaryAction"))).document(JSONUtils.optionalString(jSONObject, "document")).build();
    }

    @Nullable
    public abstract String getAttribution();

    @Nullable
    public abstract String getDocument();

    public abstract String getId();

    @Nullable
    public abstract Double getImageAspectRatio();

    @Nullable
    public abstract NativeMiniCardImageShape getImageShape();

    @Nullable
    public abstract String getImageUrl();

    @Nullable
    public abstract NativeMiniCardAction getPrimaryAction();

    @Nullable
    public abstract String getPrimaryText();

    @Nullable
    public abstract String getSecondaryText();

    @Nullable
    public abstract String getTertiaryText();

    @Nullable
    public abstract String getTrailingText();

    public static List<NativeMiniCardListItem> from(@Nullable JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        if (jSONArray != null) {
            for (int i = 0; i < jSONArray.length(); i++) {
                arrayList.add(from(jSONArray.optJSONObject(i)));
            }
        }
        return arrayList;
    }
}
