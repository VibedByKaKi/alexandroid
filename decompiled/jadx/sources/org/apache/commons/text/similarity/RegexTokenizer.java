package org.apache.commons.text.similarity;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.Validate;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
final class RegexTokenizer implements CharSequenceTokenizer<CharSequence> {
    private static final Pattern PATTERN = Pattern.compile("(\\w)+");
    static final RegexTokenizer INSTANCE = new RegexTokenizer();

    @Override // java.util.function.Function
    public CharSequence[] apply(CharSequence charSequence) {
        Validate.isTrue(StringUtils.isNotBlank(charSequence), "Invalid text", new Object[0]);
        Matcher matcher = PATTERN.matcher(charSequence);
        ArrayList arrayList = new ArrayList();
        while (matcher.find()) {
            arrayList.add(matcher.group(0));
        }
        return (CharSequence[]) arrayList.toArray(ArrayUtils.EMPTY_STRING_ARRAY);
    }
}
