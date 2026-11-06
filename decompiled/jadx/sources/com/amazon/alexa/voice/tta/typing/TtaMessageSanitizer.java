package com.amazon.alexa.voice.tta.typing;

import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public class TtaMessageSanitizer {
    private static final String ALEXA_PATTERN = "(?i)\\w*\\b(hi|hello|hey)\\p{Space}*\\p{Punct}*\\p{Space}*alexa\\p{Punct}*";
    private static final int ALLOWED_LENGTH = 1000;
    private static final String DATE_PATTERN = "\\?{4}\\d{4}";
    private static final String MESSAGE_SANITIZATION_PATTERN = "[^A-Za-zÀ-Ÿ0-9\\p{sc=Hiragana}\\p{InHiragana}\\p{sc=Katakana}\\p{InKatakana}\\p{sc=Han}\\p{InCJK_SYMBOLS_AND_PUNCTUATION}\\p{sc=Latin}\\p{sc=Devanagari}\\p{InArabic}\\p{sc=Arabic}\\p{Sc}\\p{gc=P}\\p{Punct}!\\\"#$%&'()*÷+,-.\\/:;<=>?@\\[\\\\\\]\\^_`{\\|}~\\p{Space}]+";
    private static final String RESPONSE_SANITIZATION_PATTERN = "[\\^\\_]+";
    private static final String SHORT_AUDIO_PATTERN = "\\w*\\<(S|s)hort\\p{Space}+(A|a)udio>";
    private static final String TAG = "TtaMessageSanitizer";

    private String getDaySuffix(int i) {
        if (i >= 11 && i <= 13) {
            return "th";
        }
        int i2 = i % 10;
        return i2 != 1 ? i2 != 2 ? i2 != 3 ? "th" : "rd" : "nd" : "st";
    }

    private String getMonth(int i, int i2) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MMMM", Locale.US);
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.set(2, i - 1);
        gregorianCalendar.set(5, i2);
        return simpleDateFormat.format(gregorianCalendar.getTime());
    }

    private String hackSanitizeForPhysicalShoppingResponse(String str) {
        Matcher matcher = Pattern.compile(DATE_PATTERN).matcher(str);
        if (!matcher.find()) {
            return str;
        }
        int end = matcher.end();
        int i = end - 2;
        int intValue = Integer.valueOf(str.substring(end - 4, i)).intValue();
        int intValue2 = Integer.valueOf(str.substring(i, end)).intValue();
        return hackSanitizeForPhysicalShoppingResponse(str.substring(0, end - 8) + getMonth(intValue, intValue2) + " " + intValue2 + getDaySuffix(intValue2) + str.substring(end));
    }

    private String prepareRequestForSending(String str) {
        Matcher matcher = Pattern.compile(ALEXA_PATTERN).matcher(str);
        if (!matcher.matches()) {
            return str;
        }
        String group = matcher.group(1);
        return str.substring(0, group.length() + matcher.start()).concat(str.substring(matcher.end()));
    }

    private String sanitizeMessage(String str) {
        String trim = Pattern.compile(MESSAGE_SANITIZATION_PATTERN).matcher(str).replaceAll("").trim();
        return trim.substring(0, Math.min(trim.length(), 1000));
    }

    public String sanitizeRequest(String str) {
        return prepareRequestForSending(sanitizeMessage(str));
    }

    public String sanitizeResponse(String str) {
        return hackSanitizeForPhysicalShoppingResponse(sanitizeMessage(str).trim().replaceAll(RESPONSE_SANITIZATION_PATTERN, "").replaceAll(SHORT_AUDIO_PATTERN, ""));
    }
}
