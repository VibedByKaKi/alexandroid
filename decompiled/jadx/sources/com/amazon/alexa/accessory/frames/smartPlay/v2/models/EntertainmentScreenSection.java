package com.amazon.alexa.accessory.frames.smartPlay.v2.models;

import com.amazon.alexa.accessory.frames.smartPlay.v2.models.AutoValue_EntertainmentScreenSection;
import com.google.auto.value.AutoValue;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.SerializedName;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@AutoValue
/* loaded from: classes15.dex */
public abstract class EntertainmentScreenSection {
    public static EntertainmentScreenSection create(String str, String str2, EntertainmentScreenMediaCollection entertainmentScreenMediaCollection) {
        return new AutoValue_EntertainmentScreenSection(str, str2, entertainmentScreenMediaCollection);
    }

    public static TypeAdapter<EntertainmentScreenSection> typeAdapter(Gson gson) {
        return new AutoValue_EntertainmentScreenSection.GsonTypeAdapter(gson);
    }

    @SerializedName("id")
    public abstract String getId();

    @SerializedName("mediaCollection")
    public abstract EntertainmentScreenMediaCollection getMediaCollection();

    @SerializedName("title")
    public abstract String getTitle();
}
