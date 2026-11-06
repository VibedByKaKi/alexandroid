package com.amazon.alexa.benefits.models.getAllBenefits;

import com.amazon.alexa.benefits.util.TextUtils;
import java.util.Arrays;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public class GetAllBenefitsResponse {
    private Benefit[] benefitList;

    public Benefit[] getBenefitList() {
        return this.benefitList;
    }

    public String toString() {
        return "class GetAllBenefitsResponse {\n    benefitList: " + TextUtils.toIndentedString(Arrays.toString(this.benefitList)) + "\n}";
    }
}
