package com.amazon.alexa.featurefeedbackservice.api.model.submitFeedback.experience;

import androidx.annotation.NonNull;
import com.amazon.alexa.featurefeedbackservice.api.utils.Utils;
import com.amazon.alexa.featurefeedbackservice.constants.Constants;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public final class Inquiry {
    private String inquiryId;
    private String inquiryLocale;
    private String inquiryText;
    private List<Option> optionList;

    public Inquiry(String str, String str2, @NonNull String str3, List<Option> list) {
        Utils.validateNonEmptyString(Constants.SubmitFeedbackExperienceDetails.REQUEST_INQUIRY_TEXT, str3);
        this.inquiryId = str;
        this.inquiryLocale = str2;
        this.inquiryText = str3;
        this.optionList = list == null ? ImmutableList.of() : ImmutableList.copyOf((Collection) list);
    }

    public static Inquiry deepCopy(Inquiry inquiry) {
        if (inquiry == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Option option : inquiry.getOptionList()) {
            arrayList.add(new Option(option.getOptionId(), option.getOptionText(), option.isSelected()));
        }
        return new Inquiry(inquiry.getInquiryId(), inquiry.getInquiryLocale(), inquiry.getInquiryText(), arrayList);
    }

    public String getInquiryId() {
        return this.inquiryId;
    }

    public String getInquiryLocale() {
        return this.inquiryLocale;
    }

    public String getInquiryText() {
        return this.inquiryText;
    }

    public List<Option> getOptionList() {
        return ImmutableList.copyOf((Collection) this.optionList);
    }

    public Inquiry(String str, String str2, @NonNull String str3) {
        this(str, str2, str3, null);
    }
}
