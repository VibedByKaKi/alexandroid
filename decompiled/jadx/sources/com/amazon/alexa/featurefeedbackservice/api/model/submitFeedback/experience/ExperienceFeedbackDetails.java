package com.amazon.alexa.featurefeedbackservice.api.model.submitFeedback.experience;

import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public final class ExperienceFeedbackDetails {
    private String experienceId;
    private ExperienceType experienceType;
    private List<Inquiry> inquiryList;

    public ExperienceFeedbackDetails(String str, ExperienceType experienceType, List<Inquiry> list) {
        this.experienceId = str;
        this.experienceType = experienceType;
        this.inquiryList = list == null ? ImmutableList.of() : ImmutableList.copyOf((Collection) list);
    }

    public static ExperienceFeedbackDetails deepCopy(ExperienceFeedbackDetails experienceFeedbackDetails) {
        if (experienceFeedbackDetails == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<Inquiry> it2 = experienceFeedbackDetails.getInquiryList().iterator();
        while (it2.hasNext()) {
            arrayList.add(Inquiry.deepCopy(it2.next()));
        }
        return new ExperienceFeedbackDetails(experienceFeedbackDetails.getExperienceId(), experienceFeedbackDetails.getExperienceType(), arrayList);
    }

    public String getExperienceId() {
        return this.experienceId;
    }

    public ExperienceType getExperienceType() {
        return this.experienceType;
    }

    public List<Inquiry> getInquiryList() {
        return ImmutableList.copyOf((Collection) this.inquiryList);
    }
}
