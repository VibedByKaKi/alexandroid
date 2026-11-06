package com.amazon.alexa.accessory.frames.msp.models;

import com.amazon.alexa.accessory.frames.msp.models.AutoValue_SkillDisplayMetadata;
import com.google.auto.value.AutoValue;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@AutoValue
/* loaded from: classes15.dex */
public abstract class SkillDisplayMetadata {
    public static SkillDisplayMetadata create(String str, String str2, String str3, List<DisplayImage> list) {
        return new AutoValue_SkillDisplayMetadata(str, str2, str3, list);
    }

    public static TypeAdapter<SkillDisplayMetadata> typeAdapter(Gson gson) {
        return new AutoValue_SkillDisplayMetadata.GsonTypeAdapter(gson);
    }

    public abstract List<DisplayImage> getImages();

    public abstract String getName();

    public abstract String getSkillId();

    public abstract String getStage();
}
